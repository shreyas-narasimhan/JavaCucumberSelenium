package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static utility.BrowserDriver.driver;

public class CheckoutPage {

    public static String cart_dropdown = "(//select[@class=\"form-control\"])[1]";
    public static String cart_icon = "//*[@id=\"topnav\"]/select/option[6]";
    public static String checkout_btn = "//a[@title='Checkout' and @id = \"cart_checkout1\"]";
    public static String product_one = "//*[@id=\"maincontainer\"]/div/div[1]/div/div[2]/table[3]/tbody/tr[1]/td[2]/a";
    public static String product_two = "//*[@id=\"maincontainer\"]/div/div[1]/div/div[2]/table[3]/tbody/tr[2]/td[2]/a";
    public static String checkout_button = "//button[@id=\"checkout_btn\"]";
    //public static String ver_order_placed = "//*[@id=\"maincontainer\"]/div/div/div/h1/span[1]";// Your Order Has Been Processed!
//    public static String account_btn = "//span[normalize-space(text())='Account']";
//    public static String logout_btn = "//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[9]/a";
//    public static String ver_logout = "//*[@id=\"maincontainer\"]/div/div/div/h1/span[1]/text()";// Account Logout


    public void click_go_to_checkout(){
        driver.findElement(By.xpath(cart_dropdown)).click();
        driver.findElement(By.xpath(cart_icon)).click();
        driver.findElement(By.xpath(checkout_btn)).click();
    }

    public void verify_product_in_checkout (){
        String product1 = driver.findElement(By.xpath(product_one)).getText();
        Assert.assertTrue(product1.equalsIgnoreCase(AddingProduct.ProductName1));
        String product2 = driver.findElement(By.xpath(product_two)).getText();
        Assert.assertTrue(product2.equalsIgnoreCase(AddingProduct.ProductName2));
    }

    public void click_checkout_btn(){
        driver.findElement(By.xpath(checkout_button)).click();
   }

//    public void verify_order_placed(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ver_order_placed)));
//        String orderplaced = driver.findElement(By.xpath(ver_order_placed)).getText();
//        Assert.assertEquals(orderplaced, "Your Order Has Been Processed!");
//    }

//    public void logout_session(){
//        driver.findElement(By.xpath(account_btn)).click();
//        driver.findElement(By.xpath(logout_btn)).click();
//        String logout_msg = driver.findElement(By.xpath(ver_logout)).getText();
//        Assert.assertEquals(logout_msg, "Account Logout");
//    }
}