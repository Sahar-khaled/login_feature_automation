package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;

public class D02_loginStepDef extends P02_login {
    @When("user enter name {string}")
    public void userEnterValidUsername(String name) {
        enter_name(name);
    }

    @When("user enter pass {string}")
    public void enter_password(String pass) {
        enter_pass(pass);
    }
    @Then("Validate that user locked out displayed successfully.")

    public void validate_that_the_user_logged_out_successfully() {
        validate_message();
    }


}
