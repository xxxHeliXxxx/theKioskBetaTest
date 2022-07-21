package myAccountPage;

import base.BaseLogic;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static myAccountPage.MyAccountPageElements.*;

public class MyAccountPageLogic extends BaseLogic {

    public MyAccountPageLogic(WebDriver driver) {
        super(driver);
    }


    @Step("Click on unsubscribe button")
    public MyAccountPageLogic clickUnsubscribeBtn() {
        driver.findElement(unsubscribeBtn).click();
        return this;
    }

    @Step("Click 'No' in confirmation unsubscribe box")
    public MyAccountPageLogic clickNoConfirmationBox() {
        WebElement box = driver.findElement(areYouSureBox);
        waitElementVisible(box);
        driver.findElement(noConfirmationBtn).click();
        return this;
    }

    @Step("Click 'Yes' in confirmation unsubscribe box")
    public MyAccountPageLogic clickYesConfirmationBox() {
        WebElement box = driver.findElement(areYouSureBox);
        waitElementVisible(box);
        driver.findElement(yesConfirmationBtn).click();
        return this;
    }

    @Step("Check the subscribe status from My Account")
    public MyAccountPageLogic checkSubscribeStatus() {
        String actualText = driver.findElement(subConfirmationText).getText();
        return this;
    }

    @Step("Click close button after confirmation unsubscribe process")
    public MyAccountPageLogic clickCloseBtnAfterConfirmUnsub() throws InterruptedException {
        driver.findElement(closeBtnOnBox).click();
        return this;
    }

}
