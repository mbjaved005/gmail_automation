package com.gmail_automation.hooks;


import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnlineCast;
import serenity.custom.tasks.Navigate;
import ui.com.gmail_automation.common.tasks.Log_in;

import static com.gmail_automation.parameters.Parameters.actor;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AuthenticationHooks {
    public static Actor actor;


    @Before(order = 1)
    public void set_the_stage() {
        setTheStage(new OnlineCast());
        actor = actor("John");
        theActorInTheSpotlight().attemptsTo(Navigate.to("login.page"));
        theActorInTheSpotlight().attemptsTo(Log_in.toTheEmailAccount());
    }




}