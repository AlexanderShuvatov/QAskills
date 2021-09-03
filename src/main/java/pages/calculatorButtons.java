package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class calculatorButtons {

    @FindBy(css = "#search div [jsname='j93WEe']")
    public WebElement buttonLeftParenthesis;

    @FindBy(css = "#search div [jsname='N10B9']")
    public WebElement buttonOne;

    @FindBy(css = "#search div [jsname='XSr6wc']")
    public WebElement buttonPlus;

    @FindBy(css = "#search div [jsname='lVjWed']")
    public WebElement buttonTwo;

    @FindBy(css = "#search div [jsname='qCp9A']")
    public WebElement buttonRightParenthesis;

    @FindBy(css = "#search div [jsname='YovRWb']")
    public WebElement buttonMultiply;

    @FindBy(css = "#search div [jsname='KN1kY']")
    public WebElement buttonThree;

    @FindBy(css = "#search div [jsname='pPHzQc']")
    public WebElement buttonMinus;

    @FindBy(css = "#search div [jsname='xAP7E']")
    public WebElement buttonFour;

    @FindBy(css = "#search div [jsname='bkEvMb']")
    public WebElement buttonZero;

    @FindBy(css = "#search div [jsname='WxTTNd']")
    public WebElement buttonDivide;

    @FindBy(css = "#search div [jsname='Ax5wH']")
    public WebElement buttonFive;

    @FindBy(css = "#search div [jsname='Pt8tGc']")
    public WebElement buttonEquals;

    @FindBy(css = "#search div [jsname='abcgof']")
    public WebElement buttonSix;

    @FindBy(css = "#search div [jsname='aN1RFf']")
    public WebElement buttonSin;

    public calculatorButtons(WebDriver driver) {
        initElements(driver, this);
    }

}

