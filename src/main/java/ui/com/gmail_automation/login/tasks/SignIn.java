package ui.com.gmail_automation.login.tasks;


import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static ui.com.gmail_automation.login.user_interface.SignInForm_UI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class SignIn {
    public static Task using(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String email = "";
        String password = "";
        for(List<String> columns: data){
             email = columns.get(0);
             password = columns.get(1);
        }

        return Task.where("{0} tries to Sign In",
                Enter.keyValues(email).into(EMAIL_FIELD).thenHit(Keys.ENTER),
                WaitUntil.the(PASSWORD_FIELD, isVisible()),
                Enter.keyValues(password).into(PASSWORD_FIELD).thenHit(Keys.ENTER)
        );

    }
}
