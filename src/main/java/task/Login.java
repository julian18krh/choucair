package task;

import cucumber.api.java.vi.Cho;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairLoginPage;

public class Login implements Task {
    public static Login onThePage(String strUsr, String strPassword) {
        return Tasks.instrumented(Login.class,strUsr,strPassword);
    }
    private String strUsr;

    public Login(String strUsr, String strPassword) {
        this.strUsr = strUsr;
        this.strPassword = strPassword;
    }

    private String strPassword;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                (Click.on(ChoucairLoginPage.LOGIN_BUTTON)),
                Enter.theValue(strUsr).into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );
    }
}
