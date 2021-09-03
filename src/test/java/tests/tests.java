package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.calculatorButtons;
import pages.searchPage;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class tests {

    private static WebDriver driver;
    private static searchPage searchPage;
    private static calculatorButtons calculatorButtons;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new searchPage(driver);
        calculatorButtons = new calculatorButtons(driver);
    }

    @BeforeEach
    public void setup() {
        driver.get("http://google.com");
    }

    @Test
    @DisplayName("Кейс 1. Проверка операций с целыми числами")
    public void test1() {
        searchPage.search("Калькулятор");
        calculatorButtons.buttonLeftParenthesis.click();
        calculatorButtons.buttonOne.click();
        calculatorButtons.buttonPlus.click();
        calculatorButtons.buttonTwo.click();
        calculatorButtons.buttonRightParenthesis.click();
        calculatorButtons.buttonMultiply.click();
        calculatorButtons.buttonThree.click();
        calculatorButtons.buttonMinus.click();
        calculatorButtons.buttonFour.click();
        calculatorButtons.buttonZero.click();
        calculatorButtons.buttonDivide.click();
        calculatorButtons.buttonFive.click();
        calculatorButtons.buttonEquals.click();
        assertAll(
                () -> assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", searchPage.inputFormula.getText()),
                () -> assertEquals("1", searchPage.result.getText())
        );
    }

    @Test
    @DisplayName("Кейс 2. Проверка деления на ноль")
    public void test2() {
        searchPage.search("Калькулятор");
        calculatorButtons.buttonSix.click();
        calculatorButtons.buttonDivide.click();
        calculatorButtons.buttonZero.click();
        calculatorButtons.buttonEquals.click();
        assertAll(
                () -> assertEquals("6 ÷ 0 =", searchPage.inputFormula.getText()),
                () -> assertEquals("Infinity", searchPage.result.getText())
        );
    }

    @Test
    @DisplayName("Кейс 3. Проверка ошибки при отсутствии значения")
    public void test3() {
        searchPage.search("Калькулятор");
        calculatorButtons.buttonSin.click();
        calculatorButtons.buttonEquals.click();
        assertAll(
                () -> assertEquals("sin() =", searchPage.inputFormula.getText()),
                () -> assertEquals("Error", searchPage.result.getText())
        );
    }

    @AfterAll
    public static void quit() {
        driver.quit();
    }
}