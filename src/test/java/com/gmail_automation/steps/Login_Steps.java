package com.gmail_automation.steps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static ui.com.gmail_automation.login.user_interface.SignInForm_UI.MAIN_MENU_BUTTON;

import ui.com.gmail_automation.login.tasks.Verify;

public class Login_Steps {
    @Given("user is at the login page of gmail")
    public void userIsAtTheLoginPageOfGmail() {
//        theActorInTheSpotlight().attemptsTo(Navigate.to("login.page"));
    }

    @When("user tries to Log In using")
    public void userTriesToLogInUsing(DataTable table) {
//    theActorInTheSpotlight().attemptsTo(SignIn.using(table));

    }

    @Then("user should be logged in")
    public void userShouldBeLoggedIn() {
        theActorInTheSpotlight().attemptsTo(Verify.userIsLoggedIn());
        theActorInTheSpotlight().attemptsTo(Ensure.that(MAIN_MENU_BUTTON).isDisplayed());

    }


}
