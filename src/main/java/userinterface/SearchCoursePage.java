package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {

    public static final Target  BUTTON_UC= Target.the("Active the Tbx for course UC")
            .located(By.id("certificaciones"));
    public static final Target INPUT_COURSE = Target.the("write Search the course in UC")
            .located(By.xpath("//*[@id=\"coursesearchbox\"]"));
    public static final Target BUTTON_GO = Target.the("Go to Search the course in UC")
            .located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));

    public static final Target BOTON_INICIO = Target.the("Vuelve al inicio")
            .located(By.xpath("//*[@id=\"page-wrapper\"]/nav/a"));

    public static final Target SELECT_COURSE = Target.the("Selecciona el curso")
            .located(By.xpath("//*[@id=\"category-course-list\"]/div/div[2]/div/div[1]/div"));

    public static final Target NAME_COURSE = Target.the("Nombre del curso")
            .located(By.xpath("//*[@id=\"region-main\"]/div/div[1]/div/div[1]/h3/a"));
}
