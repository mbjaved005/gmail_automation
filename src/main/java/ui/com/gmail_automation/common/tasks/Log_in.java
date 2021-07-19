package ui.com.gmail_automation.common.tasks;


import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.com.gmail_automation.login.user_interface.SignInForm_UI.*;

public class Log_in {

        public static Task toTheEmailAccount() {
                return Task.where("{0} tries to Sign In",
                        Enter.keyValues(EMAIL).into(EMAIL_FIELD).thenHit(Keys.ENTER),
                        WaitUntil.the(PASSWORD_FIELD, isVisible()),
                        Enter.keyValues(PASSWORD).into(PASSWORD_FIELD).thenHit(Keys.ENTER)
                );
        }

}
