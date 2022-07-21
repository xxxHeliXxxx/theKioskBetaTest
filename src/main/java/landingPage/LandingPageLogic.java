package landingPage;

import homePage.HomePageLogic;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import tncPage.TermsAndConditionsPageLogic;

public class LandingPageLogic extends LandingPageElements {
    WebDriver driver;
    WebDriverWait wait;

    public LandingPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Click on subscribe button on the Landing Page")
    public HomePageLogic clickOnSubscribeBtn() {
        driver.findElement(subscribeBtn).click();
        driver.findElement(subscribeBtn).click();
        return new HomePageLogic(driver);


    }

    @Step("Click on the TNC button on landing page")
    public TermsAndConditionsPageLogic clickOnTncBtn() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(termsAndConditionsBtn).click();
        return new TermsAndConditionsPageLogic(driver);
    }

    @Step("Check the banner on Landing page is displayed")
    public boolean checkTheBannerOnLP() {
        WebElement imageFile = driver.findElement(LandingPageElements.bannerOnLandingPage);

        Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", imageFile);
        if (!ImagePresent) {
            return false;
        } else {
            return true;
        }
    }

    @Step("Take the text from 'Offer short' div with price and period on the top of the Landing page")
    public String takeTextWithPriceAndPeriodTop() {
        return driver.findElement(offerShortPriceAndPeriodText).getText();

    }


}

