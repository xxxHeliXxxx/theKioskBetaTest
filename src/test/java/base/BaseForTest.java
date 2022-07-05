package tests.base;

import base.BaseLogic;
import common.CommonActions;
import homePage.HomePageLogic;
import landingPage.LandingPageLogic;
import myAccountPage.MyAccountPageLogic;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tncPage.TermsAndConditionsPageLogic;

import java.io.File;
import java.time.LocalTime;
import java.util.Objects;

import static common.Config.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@ExtendWith(tests.base.Listener.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BaseForTest {
    protected WebDriver driver = CommonActions.createMobileDriver();
    protected HomePageLogic homePageLogic = new HomePageLogic(driver);
    protected LandingPageLogic landingPageLogic = new LandingPageLogic(driver);
    protected TermsAndConditionsPageLogic termsAndConditionsPageLogic = new TermsAndConditionsPageLogic(driver);
    protected BaseLogic baseLogic = new BaseLogic(driver);
    protected MyAccountPageLogic myAccountPageLogic = new MyAccountPageLogic(driver);
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseForTest.class);


//    static {
//        LOGGER.info("START TIME" + LocalTime.now());
//        LOGGER.info("Start clear reports dir: build/reports ...");
//        File allureResults = new File("allure-results");
//        if (allureResults.isDirectory()) {
//            for (File item : Objects.requireNonNull(allureResults.listFiles()))
//                item.delete();
//        }
//        if (CLEAR_REPORTS_DIR) {
//            File allureScreenshots = new File("build/reports/tests");
//            for (File item : Objects.requireNonNull(allureScreenshots.listFiles()))
//                item.delete();
//        }
//    }


    @AfterEach
    void tearDown() {
        driver.close();
    }






}
