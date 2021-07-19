package ui.com.gmail_automation.send_email.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class SendingAnEmail_UI {
    public static final Target INBOX_BUTTON = Target.the("Inbox Button")
            .locatedBy("//div[@class = 'nU n1']");
    public static final Target SENT_EMAIL_BUTTON = Target.the("Sent Email Button")
            .locatedBy("//div[@class='aio UKr6le'][.='Sent']");
    public static final Target COMPOSE_BUTTON = Target.the("Compose Button")
            .locatedBy("//div[@class = 'T-I T-I-KE L3']");
    public static final Target TO_FIELD = Target.the("To field selected")
            .locatedBy("//*[@name='to']");
    public static final Target SUBJECT_FIELD = Target.the("Subject field")
            .locatedBy("//*[@name='subjectbox']");
    public static final Target EMAIL_BODY_FIELD = Target.the("Email body field")
            .locatedBy("//div[@class = 'Am Al editable LW-avf tS-tW']");
    public static final Target SEND_BUTTON = Target.the("Send Button")
            .locatedBy("//div[@class = 'T-I J-J5-Ji aoO v7 T-I-atl L3']");
    public static final Target MESSAGE_SENT_POPUP = Target.the("Email Sent Confirmation")
            .locatedBy("//div[@class='vh']//span[.=\"Message sent.\"]");


}
