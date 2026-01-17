package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import static utility.BrowserDriver.driver;

public class CartPage {

    public static String cart_dropdown = "(//select[@class=\"form-control\"])[1]";
    public static String cart_icon = "//*[@id=\"topnav\"]/select/option[6]";
    public static String verify_product_one_name = "//*[@id=\"cart\"]/div/div[1]/table/tbody/tr[2]/td[2]/a";
    public static String verify_second_product_name = "//*[@id=\"cart\"]/div/div[1]/table/tbody/tr[3]/td[2]/a";

    public void go_to_cart() {
        driver.findElement(By.xpath(cart_dropdown)).click();
        driver.findElement(By.xpath(cart_icon)).click();
    }
    public void verify_product() {
        String productOne = driver.findElement(By.xpath(verify_product_one_name)).getText();
        Assert.assertTrue(productOne.equalsIgnoreCase(AddingProduct.ProductName1));
        String productTwo = driver.findElement(By.xpath(verify_second_product_name)).getText();
        Assert.assertTrue(productTwo.equalsIgnoreCase(AddingProduct.ProductName2));
    }
}
