Feature: FreeCrm Login Test feature
#Without example keyword
 # Scenario: FreeCrm Login Test case
 #   Given User is present in login page
 #   When title of login page is free crm
 #   Then user enters "diptimayeetarei" and user enters "Twinkle@Tarei"
 #   And user click login page
 
 
 
 
  Scenario Outline: FreeCrm Login Test case
  Given User is present in login page
  When title of login page is free crm
 Then user enters "<username>" and user enters "<password>"
 And user click login page
 
Then close the browser
 Examples:
 | username | password |
 | diptimayeetarei | Twinkle@Tarei |
 |tom| tyuio|
 
 #whenever we are using Examples keyword that time we have to use Scenamrio outline
 # line no 15 is parametrised that means in step defination that function will execute two times with two set up data
 #two times browser will open and two times it will run because of my user id and tom
 
    
   



 