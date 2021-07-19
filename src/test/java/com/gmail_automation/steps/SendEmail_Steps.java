package com.gmail_automation.steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacadeWait;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.Wait;
import serenity.custom.questions.EmailSentPopup;
import ui.com.gmail_automation.login.tasks.Verify;
import ui.com.gmail_automation.send_email.tasks.SendEmail;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.hasValue;
import static net.thucydides.core.matchers.BeanMatchers.the;
import static org.hamcrest.Matchers.equalTo;
import static ui.com.gmail_automation.login.user_interface.SignInForm_UI.MAIN_MENU_BUTTON;
import static ui.com.gmail_automation.send_email.user_interface.SendingAnEmail_UI.MESSAGE_SENT_POPUP;

public class SendEmail_Steps  {

        @Given("user is on the inbox page")
         public void userIsAtTheInboxPage() {
            theActorInTheSpotlight().attemptsTo(Verify.userIsLoggedIn());
        }

        @When("user sends an email using")
        public void clickingTheComposeButton(DataTable table) {
            theActorInTheSpotlight().attemptsTo(SendEmail.using(table));
        }

        @Then("the email should be sent")
        public void verifyEmailIsSent() {
            theActorInTheSpotlight().should(seeThat(EmailSentPopup.hasText(), equalTo("Message sent.")));
        }
    }

