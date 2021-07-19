package com.gmail_automation.tests;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/sending_email.feature", glue= "com.gmail_automation", tags = "@sending_email")
public class Send_EmailGmailTest {
}
