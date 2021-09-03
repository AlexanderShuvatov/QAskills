package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class tests {

    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @BeforeEach
    public void setup() {
        driver.get("http://google.com");
    }

    @Test
    @DisplayName("Кейс 1. Проверка операций с целыми числами")
    public void test1() {
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("#search div [jsname='j93WEe']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='N10B9']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='XSr6wc']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='lVjWed']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='qCp9A']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='YovRWb']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='KN1kY']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='pPHzQc']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='xAP7E']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='bkEvMb']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='WxTTNd']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='Ax5wH']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='Pt8tGc']")).click();
        assertAll(
                () -> assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", driver.findElement(By.cssSelector("#search div [jsname='ubtiRe']")).getText()),
                () -> assertEquals("1", driver.findElement(By.cssSelector("#search div [jsname='VssY5c']")).getText())
        );
    }

    @Test
    @DisplayName("Кейс 2. Проверка деления на ноль")
    public void test2() {
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("#search div [jsname='abcgof']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='WxTTNd']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='bkEvMb']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='Pt8tGc']")).click();
        assertAll(
                () -> assertEquals("6 ÷ 0 =", driver.findElement(By.cssSelector("#search div [jsname='ubtiRe']")).getText()),
                () -> assertEquals("Infinity", driver.findElement(By.cssSelector("#search div [jsname='VssY5c']")).getText())
        );
    }

    @Test
    @DisplayName("Кейс 3. Проверка ошибки при отсутствии значения")
    public void test3() {
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("#search div [jsname='aN1RFf']")).click();
        driver.findElement(By.cssSelector("#search div [jsname='Pt8tGc']")).click();
        assertAll(
                () -> assertEquals("sin() =", driver.findElement(By.cssSelector("#search div [jsname='ubtiRe']")).getText()),
                () -> assertEquals("Error", driver.findElement(By.cssSelector("#search div [jsname='VssY5c']")).getText())
        );
    }

    @AfterAll
    public static void quit() {
        driver.quit();
    }
}