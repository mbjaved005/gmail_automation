package ui.com.gmail_automation.login.tasks;


import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static ui.com.gmail_automation.login.user_interface.SignInForm_UI.MAIN_MENU_BUTTON;

public class Verify {
    public static Task userIsLoggedIn(){

        return Task.where("{0} verifies they are logged in",
                WaitUntil.the(MAIN_MENU_BUTTON, isVisible()),
                Ensure.that(MAIN_MENU_BUTTON).isDisplayed()
        );
    }

}
