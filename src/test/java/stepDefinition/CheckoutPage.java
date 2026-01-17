package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckoutPage {

    pages.CheckoutPage checkoutpage = new pages.CheckoutPage();

    @And("the user navigates to checkout")
    public void proceed_to_checkout(){
        checkoutpage.click_go_to_checkout();
    }

    @And("the user verifies the products again on the checkout page")
    public void user_verifies_at_checkout() {
        checkoutpage.verify_product_in_checkout();
    }

    @Then("the user proceeds with placing the order")
    public void user_proceeds_to_placing_order() {
        checkoutpage.click_checkout_btn();
    }
}
