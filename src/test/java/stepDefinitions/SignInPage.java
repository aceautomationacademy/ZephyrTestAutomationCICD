package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static pages.SignInPage.*;

public class SignInPage {

    @When("^User successfully enters the log in details$")
    public void user_logsin_to_login_page(){
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }

    @When("^User successfully lands on SignInPage$")
    public void userSuccessfullyLandsOnSignInPage() {


    }

    @Then("^User should be able to view the username and password text fields on SignInPage$")
    public void userShouldBeAbleToViewTheUsernameAndPasswordTextFieldsOnSignInPage() throws InterruptedException {
       boolean actual_usernametext = visibility_username_text_path();
       assertEquals(true, actual_usernametext);

       boolean actual_passwordtext = visibility_password_text_path();
       assertEquals(true,actual_passwordtext);
    }

    @Then("^User should be able to view the Login and New User buttons on SignInPage$")
    public void userShouldBeAbleToViewTheLoginAndNewUserButtonsOnSignInPage() throws InterruptedException {
        boolean actual_loginbutton = visibility_login_button();
        assertEquals(true, actual_loginbutton);

        boolean actual_newuserbutton = visibility_newuser_button();
        assertEquals(true, actual_newuserbutton);
    }
}