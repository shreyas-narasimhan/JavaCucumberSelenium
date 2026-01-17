package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static utility.BrowserDriver.driver;

public class AddingProduct {

    public static String select_product_category = "//*[@id=\"categorymenu\"]/nav/ul/li[8]/a";
    public static String ret_product_retname = "//*[@id=\"maincontainer\"]/div/div/div/div/div[3]/div[4]/div[1]/div/a";
    public static String add_product_to_cart = "(//a[@data-id = \"114\" and @title=\"Add to Cart\"])[1]";
    public static String searchbar = "//input[@placeholder=\"Search Keywords\"]";
    public static String search_new_product = "//div[@title=\"Go\"]";
    public static String retrieve_second_product = "//a[@title=\"Skinsheen Bronzer Stick\"]";
    public static String add_2ndproduct_to_cart = "(//a[@data-id = \"50\" and @title=\"Add to Cart\"])[1]";
    public static String ProductName1;
    public static String ProductName2;

    public void Navigate_to_BooksPage()
    {
        driver.findElement(By.xpath(select_product_category)).click();
    }

    public void add_Book_to_cart(){
        ProductName1 = driver.findElement(By.xpath(ret_product_retname)).getText();
        driver.findElement(By.xpath(add_product_to_cart)).click();
    }

    public void check_Name_first_Product()
    {
        Assert.assertEquals(ProductName1,"ALLEGIANT BY VERONICA ROTH");
    }

    public void Navigate_to_second_product()
    {
        driver.findElement(By.xpath(searchbar)).sendKeys("Makeup");
        driver.findElement(By.xpath(search_new_product)).click();
    }

    public void add_second_product_to_cart(){
        ProductName2 = driver.findElement(By.xpath(retrieve_second_product)).getText();
        driver.findElement(By.xpath(add_2ndproduct_to_cart)).click();
    }

    public void check_Name_second_Product()
    {
        Assert.assertEquals(ProductName2,"SKINSHEEN BRONZER STICK");
    }
}
