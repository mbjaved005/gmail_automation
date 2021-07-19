package ui.com.gmail_automation.login.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class SignInForm_UI {
    public static final String EMAIL = "j.kelly1786@gmail.com";
    public static final String PASSWORD = "Apassword123!";
    public static final Target EMAIL_FIELD = Target.the("Email field")
            .locatedBy("//*[@id=\"identifierId\"]");

    public static final Target EMAIL_NEXT_BUTTON = Target.the("Email Next Button")
            .locatedBy("//*[@id=\"identifierNext\"]");

    public static final Target PASSWORD_FIELD = Target.the("Password field")
            .locatedBy("[name= 'password']");

    public static final Target PASSWORD_NEXT_BUTTON = Target.the("Password Next Button")
            .locatedBy("//*[@id=\"password\"]/div[1]/div/div[1]/input");

    public static final String GMAIL_SIGN_IN_URL = "https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

    public static final Target MAIN_MENU_BUTTON  = Target.the("Main Menu Button")
            .locatedBy("//div[@class = 'gb_uc']");
}
