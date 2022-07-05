package homePage;

import base.BaseLogic;
import io.qameta.allure.Step;
import myAccountPage.MyAccountPageLogic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static homePage.HomePageElements.closeCookiesBtn;

public class HomePageLogic extends BaseLogic {

    public HomePageLogic(WebDriver driver) {
        super(driver);
    }

    @Step("Close the cookies pop-up")
    public HomePageLogic closeCookies() {
        driver.findElement(closeCookiesBtn).click();
        return this;
    }


}
