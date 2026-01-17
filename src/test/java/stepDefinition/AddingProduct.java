package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddingProduct {

    pages.AddingProduct productadd = new pages.AddingProduct();

    @Given("the user navigates to the Books page")
    public void user_navigates_to_books() {
        productadd.Navigate_to_BooksPage();
    }

    @And("the user selects a book and adds it to the cart")
    public void  user_selects_book(){
        productadd.add_Book_to_cart();
        productadd.check_Name_first_Product();
    }

    @And("the user searches for a product using the search bar")
    public void user_search_other_product(){
        productadd.Navigate_to_second_product();
    }

    @Then("the user retrieves the product details and adds it to the cart")
    public void user_adds_other_product(){
        productadd.add_second_product_to_cart();
        productadd.check_Name_second_Product();
    }
}
