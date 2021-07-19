package com.gmail_automation.parameters;

import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

public class Parameters {

    @ParameterType(".*")
    public static Actor actor(String actor) {
        return OnStage.theActorCalled(actor);
    }





}
