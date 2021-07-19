package serenity.custom.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static ui.com.gmail_automation.send_email.user_interface.SendingAnEmail_UI.MESSAGE_SENT_POPUP;

public class EmailSentPopup {

public static Question<String> hasText(){
    return  actor -> MESSAGE_SENT_POPUP.resolveFor(actor).getText();
}


}

