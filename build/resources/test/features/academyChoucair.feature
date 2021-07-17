#lan:en
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
@scenario1
  Scenario: Search for a automation course
   Given  than Brandon wants to learn automation at he academy Choucair
     |strUsr    |strPassword  |
     |1056710114|Choucair2021*|
    When he search for the course Recursos Automatización Bancolombia on the Choucair academy platform
      |strCourse              |
      |Metodologia Bancolombia|

    Then he finds the course called
      |strCourse         |
      |Foundation Express|



