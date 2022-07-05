package tncPage;

import base.BaseLogic;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static tncPage.TermsAndConditionsPageElements.zeroParagraph;

public class TermsAndConditionsPageLogic extends BaseLogic {


    public TermsAndConditionsPageLogic(WebDriver driver) {
        super(driver);
    }

    @Step("Get text from 0 paragraph from TnC page")
    public String getTextFromZeroParagraph() {
        return driver.findElement(zeroParagraph).getText();
    }
}
