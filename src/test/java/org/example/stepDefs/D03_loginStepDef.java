package org.example.stepDefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_login;

public class D03_loginStepDef extends P03_login {

    @When("user enter username {string}")
    public void userEnterValidUsername(String name) {
        enter_your_name(name);
    }
    @When("user enter password {string}")
    public void enter_password(String pass) {
        enter_your_pass(pass);
    }

    @Then("Validate that the user logged in successfully.")
    public void validate_that_the_user_logged_in_successfully() {
        validate_login();
    }
}
