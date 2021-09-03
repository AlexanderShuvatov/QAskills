package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test1 {

    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximize");
        driver = new ChromeDriver(options);
    }

    @Test
    public void test() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname='j93WEe']")).click();
        driver.findElement(By.cssSelector("div [jsname='N10B9']")).click();
        driver.findElement(By.cssSelector("div [jsname='XSr6wc']")).click();
        driver.findElement(By.cssSelector("div [jsname='lVjWed']")).click();
        driver.findElement(By.cssSelector("div [jsname='qCp9A']")).click();
        driver.findElement(By.cssSelector("div [jsname='YovRWb']")).click();
        driver.findElement(By.cssSelector("div [jsname='KN1kY']")).click();
        driver.findElement(By.cssSelector("div [jsname='pPHzQc']")).click();
        driver.findElement(By.cssSelector("div [jsname='xAP7E']")).click();
        driver.findElement(By.cssSelector("div [jsname='bkEvMb']")).click();
        driver.findElement(By.cssSelector("div [jsname='WxTTNd']")).click();
        driver.findElement(By.cssSelector("div [jsname='Ax5wH']")).click();
        driver.findElement(By.cssSelector("div [jsname='Pt8tGc']")).click();
        assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", driver.findElement(By.cssSelector("div [jsname='ubtiRe']")).getText());
        assertEquals("1", driver.findElement(By.cssSelector("div [jsname='VssY5c']")).getText());
    }

    @Test
    public void test2() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname='abcgof']")).click();
        driver.findElement(By.cssSelector("div [jsname='WxTTNd']")).click();
        driver.findElement(By.cssSelector("div [jsname='bkEvMb']")).click();
        driver.findElement(By.cssSelector("div [jsname='Pt8tGc']")).click();
        assertEquals("6 ÷ 0 =", driver.findElement(By.cssSelector("div [jsname='ubtiRe']")).getText());
        assertEquals("Infinity", driver.findElement(By.cssSelector("div [jsname='VssY5c']")).getText());
    }

    @Test
    public void test3() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname='aN1RFf']")).click();
        driver.findElement(By.cssSelector("div [jsname='Pt8tGc']")).click();
        assertEquals("sin() =", driver.findElement(By.cssSelector("div [jsname='ubtiRe']")).getText());
        assertEquals("Error", driver.findElement(By.cssSelector("div [jsname='VssY5c']")).getText());
    }

    @AfterAll
    public static void quit() {
        driver.quit();
    }

}