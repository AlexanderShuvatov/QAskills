package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class searchPage {

    @FindBy(css = "input.gLFyf.gsfi")
    private WebElement input;

    @FindBy(css = "#search div [jsname='ubtiRe']")
    public WebElement inputFormula;

    @FindBy(css = "#search div [jsname='VssY5c']")
    public WebElement result;

    public searchPage(WebDriver driver) {
        initElements(driver, this);

    }

    public void search(String text) {
        input.sendKeys(text, Keys.ENTER);
    }
}
