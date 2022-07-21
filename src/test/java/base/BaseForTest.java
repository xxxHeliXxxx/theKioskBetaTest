package tests.base;

import base.BaseLogic;
import common.CommonActions;
import homePage.HomePageLogic;
import landingPage.LandingPageLogic;
import myAccountPage.MyAccountPageLogic;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tncPage.TermsAndConditionsPageLogic;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BaseForTest {
    protected WebDriver driver = CommonActions.createMobileDriver();
    protected HomePageLogic homePageLogic = new HomePageLogic(driver);
    protected LandingPageLogic landingPageLogic = new LandingPageLogic(driver);
    protected TermsAndConditionsPageLogic termsAndConditionsPageLogic = new TermsAndConditionsPageLogic(driver);
    protected BaseLogic baseLogic = new BaseLogic(driver);
    protected MyAccountPageLogic myAccountPageLogic = new MyAccountPageLogic(driver);
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseForTest.class);


    @AfterEach
    void tearDown() {
        driver.close();
    }


}
