package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CartPage {

    pages.CartPage cartpage = new pages.CartPage();

    @And("the user navigates to the cart")
    public void user_navigates_to_cart(){
        cartpage.go_to_cart();
    }

    @Then("the user verifies the items in the cart along with the retrieved details")
    public void user_verifies_details(){
        cartpage.verify_product();
    }
}
