package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Buton show login form")
            .located(By.xpath("//*[@id=\"nav-menu\"]/ul[2]/li/a"));
    public static final Target INPUT_USER = Target.the("Were do we write the user")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("Were do we write the user")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Buton to acces platform")
            .located(By.xpath("//*[@id=\"Ingresar\"]/div/div/div[2]/div[2]/form/div[3]/button") );

}


