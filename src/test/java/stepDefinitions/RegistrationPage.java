package stepDefinitions;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SignInPage;


import static org.junit.Assert.assertEquals;
import static pages.ProductCategoryPage.*;
import static pages.RegistrationPage.*;
import static pages.SignInPage.click_newregistration_btn;
import static pages.SignInPage.visibility_newuser_button;

public class RegistrationPage {

    @When("User clicks on new Registration button")
    public void user_clicks_on_new_registration_button() {
        click_newregistration_btn();
    }

    @Then("^User should be able to view the Registration page heading$")
    public void user_should_be_able_to_view_the_registration_page() throws InterruptedException {
        String actualRegistrtationPageheading = visiblity_registrationheading();
        assertEquals(actualRegistrtationPageheading, "User Registration Page");
    }

    @When("^User successfully lands on RegistrationPage$")
    public void userSuccessfullyLandsOnRegistrationPage() {
        SignInPage.click_newregistration_btn();
    }

    @Then("^User should be able to enter the details of registration and submit registration$")
    public void userShouldBeAbleToEnterTheDetailsOfRegistrationAndSubmitRegistration() throws InterruptedException {
        sendkeys_firstname();
        sendkeys_lastname();
        sendkeys_contactnumber();
        sendkeys_emailid();
        sendkeys_username();
        sendkeys_password();
        click_submit();
        String actualRegistrationMessage = visiblity_registrationsuccess();
        assertEquals(actualRegistrationMessage, "User Registered Successfully !!!");
    }
}