package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static utility.BrowserDriver.driver;

public class LoginPage {
    public static String username_xpath = "//input[@name=\"loginname\"]";
    public static String password_xpath = "//input[@name=\"password\"]";
    public static String login_btn_xpath = "//button[@type=\"submit\" and @title=\"Login\"]";
    public static String ver_my_AccountTitle = "(//span[normalize-space(text())='My Account'])[1]";

    public void LoginAction()
    {
        driver.findElement(By.xpath(username_xpath)).sendKeys("automationdemo");
        driver.findElement(By.xpath(password_xpath)).sendKeys("automationdemo");
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }

    public void MyAccountVerify(){
        String title1 = driver.findElement(By.xpath(ver_my_AccountTitle)).getText();
        Assert.assertEquals(title1, "MY ACCOUNT");
    }
}
