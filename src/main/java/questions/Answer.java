package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SearchCoursePage;

public class Answer implements Question<Boolean> {
    private String question;
    public Answer (String question){
        this.question = question;
    }
    public static Question<Boolean> toThe(String question){
    return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
      boolean result;
      String namecourse= Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if(question.equals(namecourse)){
        result = true;
        }
        else
        {
            result = false;
        }
        return result;
}
}