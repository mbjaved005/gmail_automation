package ui.com.gmail_automation.send_email.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static ui.com.gmail_automation.send_email.user_interface.SendingAnEmail_UI.SENT_EMAIL_BUTTON;

public class VerifySentEmail {

    public static Task bySubject{

        return Task.where("{0} verifies sent email from the Sent Box"),
        Click.on(SENT_EMAIL_BUTTON),
    

    }
}
