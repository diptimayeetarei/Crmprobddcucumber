Feature: Klick on contacts page
  Scenario Outline: FreeCrm create contact test case
  Given User is present in login page
  When title of login page is free crm
 Then user enters "<username>" and user enters "<password>"
 And user click login page
 Then user is on home page
 Then user moves to new contact page
 Then user enters "<firstname>" and user enters "<lastname>" and "<posistion>" 
 Then click on save
 Then close the browser
 
 Examples:
 | username | password | firstname | lastname | posistion|
 | diptimayeetarei | Twinkle@Tarei | dipt | tare | qe |
  | diptimayeetarei | Twinkle@Tarei | dipto | tareo | qe0 |
 