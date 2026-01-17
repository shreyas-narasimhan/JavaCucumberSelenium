package stepDefinition;

import pages.LoginPage;


public class Login {

    LoginPage loginPage = new LoginPage();

    public void login() throws Throwable{
        loginPage.LoginAction();
        loginPage.MyAccountVerify();
    }
}
