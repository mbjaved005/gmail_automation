package ui.com.gmail_automation.send_email.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.com.gmail_automation.send_email.user_interface.SendingAnEmail_UI.*;
import static ui.com.gmail_automation.send_email.user_interface.SendingAnEmail_UI.EMAIL_BODY_FIELD;

public class FillstheEmailFields {
    public static Task with(List<List<String>> emailComposingfields){
        String recipient_email = "";
        String subject = "";
        String body_text = "";

        for(List<String> columns:emailComposingfields){
            recipient_email = columns.get(0);
            subject = columns.get(1);
            body_text = columns.get(2);
        }



        return Task.where( "{0} fills in the fields",
                WaitUntil.the(SEND_BUTTON, isVisible()),
                Click.on(TO_FIELD),
                Enter.keyValues(recipient_email).into(TO_FIELD).thenHit(Keys.ENTER),
                Click.on(SUBJECT_FIELD),
                Enter.keyValues(subject).into(SUBJECT_FIELD),
                Click.on(EMAIL_BODY_FIELD),
                Enter.keyValues(body_text).into(EMAIL_BODY_FIELD)
        );
    }

}
