package com.Gmail.Users.StepDef;
 
import org.openqa.selenium.WebDriver;

import com.Gmail.Users.Pages.UserInteraction;
import com.Gmail.Users.Pages.UserInteraction2;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class Login2Demo {
	WebDriver driver = Hooks.driver;
	ExtentTest test = Hooks.test;
	UserInteraction demo;
	UserInteraction2 user;
	
//	Base base;
//	public Login2Demo() {
//		
//	}
//	public Login2Demo(Base base) {
//		this.base = base;
//		driver = base.driver;
//	}
//	UserInteraction demo;
//	WebDriver driver ;
//@Given("I navigate to Browser")
//public void i_navigate_to_browser() {
//    driver = new ChromeDriver();
//    demo = new UserInteraction(driver,test); 
//}

@Given("I navigate {string}")
public void i_navigate_to_url(String url) {
    driver.get(url);
    demo = new UserInteraction(driver,test);
    user = new UserInteraction2(driver, test);
}

@When("I insert {string} and {string}")
public void I_Insert_userName(String un, String pwrd) {
    demo.getUserName(un);
    demo.getPassWord(pwrd);
    System.out.println(un + " " + pwrd);
}

@And("I clicked the signin button")
public void I_Clicked_Login() {
    demo.getSubmit();
}
@Then("Its navigates the UI")
public void its_navigated_to_the_home_page() {
			demo.LoginSuccess();
}
@Then("Its not navigates the UI")
public void its_not_navigates_the_ui() {
	demo.LoginFail();
	}		
@Then("Its navigated to the {string}")
public void its_navigated_to_the(String expectedResult) {
    demo.Result(expectedResult);
}
}
 