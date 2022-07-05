package myAccountPage;

import org.openqa.selenium.By;

public class MyAccountPageElements {


    /**
     * Confirmation box elements
     */

    public static By areYouSureBox = By.xpath("//div[@class= \"fc-content fancybox-content\"]");
    public static By yesConfirmationBtn = By.xpath("//button[@data-value='1']");
    public static By noConfirmationBtn = By.xpath("//a[@data-value = '0']");


    public static By closeBtnOnBox = By.xpath("//a[@class = 'button-main button-popup button-confirm']");


    public static By unsubscribeBtn = By.xpath("//a[@href='#']");


    public static By subConfirmationText = By.xpath("//div[@class = 'text-center mb-3 pl-2 pr-2']/span");


}
