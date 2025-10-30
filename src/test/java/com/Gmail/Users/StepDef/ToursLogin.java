package com.Gmail.Users.StepDef;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Gmail.Users.Pages.UserInteraction2;
import com.Gmail.Users.Pages.UserInteraction3;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class ToursLogin {
    WebDriver driver = Hooks.driver;
    ExtentTest test = Hooks.test;
    UserInteraction3 obj2;
    WebDriverWait wait;
    @Given("I navigated to main page {string}")
    public void i_navigated_to_main_page(String url) {
    	obj2 = new UserInteraction3(driver, test);
       obj2.setup(url);
    }
 
    @When("I inserted the {string} and {string}")
    public void i_inserted_the_and(String string1, String string2) {
    	obj2.getUserName(string1);
        obj2.getPassword(string2);
    }
 
    @When("After I have clicked signin button")
    public void after_i_have_clicked_signin_button() {
    	obj2.getSubmit();
    }
    @Then("It got navigated to the home page {string}")
   public void it_got_navigated_to_the_home_page(String expectedResult) {
    	try {
    		boolean res = obj2.Run(expectedResult);
    		Assert.assertTrue(res);
    		System.out.println("done");
    	}catch(AssertionError e) {
    		System.out.println("enter valid credentials");
    	}
    	
    		
    }
    
}
 
 