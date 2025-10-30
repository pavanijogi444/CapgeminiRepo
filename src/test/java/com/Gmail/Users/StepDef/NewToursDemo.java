package com.Gmail.Users.StepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewToursDemo {
	WebDriver driver;
	@Given("I am on the login page")
	public void I_am_on_the_login_page() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		
	}
	
//	//When I entered "admin1" and "pass1"
//	@When("I entered {string} and {string}")
//	public void I_entered_and(String unm, String pwd) {
//		driver.findElement(By.name("userName")).sendKeys(unm);
//		driver.findElement(By.name("password")).sendKeys(pwd);
//		
//	}
	
	@When("I entered following details")
	public void I_entered_following_details(DataTable dataTable) {
		List<List<String>> ele = dataTable.cells();
//		driver.findElement(By.name("userName")).sendKeys(ele.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(ele.get(0).get(1));
//		driver.findElement(By.name("userName")).sendKeys(ele.get(1).get(0));
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ele.get(1).get(1));
		
		for(int i=0;i<dataTable.cells().size();i++) {
			for(int j=0;j<dataTable.cells().size();j++) {
				
			}
			
			driver.findElement(By.name("userName")).sendKeys(dataTable.cells().get(i).get(j));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataTable.cells().get(i).get(j));
			
			driver.findElement(By.name("submit")).click();
			
		}
		
		
		
	}
	    
	@And("I click on login button")
	public void I_click_on_login_button() {
		driver.findElement(By.name("submit")).click();
		
		
	  
	}
	@Then("I navigated to the home page")
	public void I_navigated_to_the_home_page() {
		WebElement login = driver.findElement(By.xpath("//h3[contains(text(),'Login Successfully')]"));
		Assert.assertTrue(login.isDisplayed());
		System.out.println("login successfully");
	  
	}
	
	@Then("I navigated to the error page")
	public void I_navigated_to_the_error_page() {
		WebElement login = driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
		Assert.assertTrue(login.isDisplayed());
		System.out.println("login unsuccessful");
	  
	}
 

}
