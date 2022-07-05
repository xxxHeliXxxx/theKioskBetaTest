package base;

import homePage.HomePageLogic;
import io.qameta.allure.Step;
import myAccountPage.MyAccountPageLogic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constants.TimeoutVariable.EXPLICIT_WAIT;

public class BaseLogic extends BaseElements {

    protected WebDriver driver;

    public BaseLogic(WebDriver driver) {

        this.driver = driver;
    }

    @Step("Open URL")
    public void open(String url) {
        driver.get(url);
    }

    public WebElement waitElementVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    @Step("Click on My Account button")
    public MyAccountPageLogic clickOnMyAccountBtn() {
        driver.findElement(myAccountBtn).click();
        return new MyAccountPageLogic(driver);
    }

    @Step("Click on header logo button")
    public HomePageLogic clickOnHeaderLogoBtn() {
        driver.findElement(headerLogoBtn).click();
        return new HomePageLogic(driver);
    }

    @Step("Click on sidebar menu button")
    public void clickOnSideBarMenuBtn() {
        driver.findElement(sideBarMenuBtn).click();
    }

    @Step("Get text from the header")
    public String statusText() {
        return driver.findElement(statusTextFromHeader).getText();
    }


}
