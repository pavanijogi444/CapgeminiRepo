package com.Gmail.Users.StepDef;
 
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

 
public class LoginDemo {
	@Given("I navigate to login page")
	public void i_navigate_to_login_page() {
	System.out.println("Page opened");	
	}
 
	@And("I entered username and password")
	public void i_entered_username_and_password() {
		System.out.println("credentials entered");		
	}
 
	@And("I clicked signin button")
	public void i_clicked_signin_button() {
		System.out.println("Button clicked");
	}
 
	@Then("Its navigated to the HomePage")
	public void its_navigated_to_the_home_page() {
		System.out.println("Homepage launched successfully");
	}
	
	@And("I entered correct username")
	public void I_entered_correct_username() {
		System.out.println("correct username");
	}
	
	@But("Invalid pwd")
	public void Invalid_pwd() {
		System.out.println("wrong Pwd entered");
	}
	@Then("Its navigated to the error msg")
	public void Its_navigated_to_the_error_msg() {
		System.out.println("login failed..");
	Assert.assertEquals("aaa", "aaa");
	
	}
}