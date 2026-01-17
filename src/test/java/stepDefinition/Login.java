package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;


public class Login {

    LoginPage loginPage = new LoginPage();

    @Given("the user is able to login")
    public void login() throws Throwable{
        loginPage.LoginAction();
    }

    @Then("the user is able to verify the account")
    public void ver_account_page(){
        loginPage.MyAccountVerify();
    }
}
