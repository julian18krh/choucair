package stepdefinitios;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.E;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import task.Login;
import task.OpenUp;
import task.Search;

import java.util.List;
import java.util.Map;


public class ChoucairAcademyStepDefinitios {
    @Before
        public void setStage (){ OnStage.setTheStage(new OnlineCast());  }

    @Given("^than Brandon wants to learn automation at he academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtHeAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(Login.onThePage(academyChoucairData.get(0).getStrUsr(),academyChoucairData.get(0).getStrPassword())));
    }
    @When("^he search for the course Recursos Automatización Bancolombia on the Choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));

    }

    @Then("^he finds the course called$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }






}
