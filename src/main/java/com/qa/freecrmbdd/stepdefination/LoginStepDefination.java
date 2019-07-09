package com.qa.freecrmbdd.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
	WebDriver driver;

	@Given("^User is present in login page$")
	public void user_is_present_in_login_page() {
	    System.setProperty("webdriver.chrome.driver", "F:/naveenAuto/freecrmbddcucumberframework/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
	}

	@When("^title of login page is free crm$")
	public void title_of_login_page_is_free_crm() {
	    String title=driver.getTitle();
	    System.out.println(title);
	    //Assert.assertEquals(title, "");
	}

	/*@Then("^user enters username and user enters password$")
	public void user_enters_username_and_user_enters_password() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("diptimayeetarei");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Twinkle@Tarei");
		
	}*/
	
//	@Then("^user enters \"(.*)\" and user enters \"(.*)\" $")
//	public void user_enters_username_and_user_enters_password(String username ,String password) {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//		
//	}
	
	@Then("user enters {string} and user enters {string}")
	public void user_enters_and_user_enters(String username, String password) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@Then("^user click login page$")
	public void user_click_login_page() {
		//driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
		WebElement loginbtn=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginbtn);
			
	}
	

	@Then("user is on home page")
	public void user_is_on_home_page() {
		driver.getTitle();
	    
	}

	@Then("user moves to new contact page")
	public void user_moves_to_new_contact_page() {
		driver.switchTo().frame("mainpanel");
		Actions action= new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();;
		
	    
	}

	@Then("user enters {string} and user enters {string} and {string}")
	public void user_enters_and_user_enters_and(String firstname, String lastname, String profession) {
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='surname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='company_position']")).sendKeys(profession);
		
	   
	}

	@Then("click on save")
	public void click_on_save() {
	    driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	}
	
	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	    
	}
}
