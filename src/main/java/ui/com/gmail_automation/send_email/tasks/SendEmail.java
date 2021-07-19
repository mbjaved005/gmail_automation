package ui.com.gmail_automation.send_email.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static ui.com.gmail_automation.send_email.user_interface.SendingAnEmail_UI.*;

public class SendEmail {

    public static Task using(DataTable dataTable){
        List<List<String>> emailComposingFields = dataTable.asLists(String.class);

        return Task.where("{0} sends an email",
        Click.on(COMPOSE_BUTTON),
        FillstheEmailFields.with(emailComposingFields),
        Click.on(SEND_BUTTON),
        WaitUntil.the(MESSAGE_SENT_POPUP, isPresent())

        );

    }

}
