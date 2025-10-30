package com.Gmail.Users.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.Gmail.Users.Config.Base;
import com.aventstack.extentreports.ExtentTest;

public class UserInteraction {
	
	private WebDriver driver;
	private ExtentTest test;
	//parameterized constructors
	public UserInteraction(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		
//		driver = base.driver;
		
	}
	public void getUrl(String url) {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
	}
	public void getUserName(String unm) {
		WebElement un1= driver.findElement(By.xpath("//input[@name='userName']"));
		un1.sendKeys(unm);
	}
	
	public void getPassWord(String pwrd) {
		WebElement pwrd1=driver.findElement(By.xpath("//input[@name='password']"));
		pwrd1.sendKeys(pwrd);
	}
	
	public void getSubmit() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	
	public WebElement LoginSuccess() {
		WebElement target = driver.findElement(By.xpath("//h3[contains(text(),'Login')]"));
        Assert.assertTrue(target.isDisplayed());
        System.out.println("Login SucessFully.");
		return target;
	}
	public WebElement LoginFail() {
		WebElement target1 = driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
        Assert.assertTrue(target1.isDisplayed());
        System.out.println("Login Failed....");
		return target1;
	}
	public void Result(String expectedResult) {
		if (expectedResult.equals("Login Successfully")) {
			WebElement success = driver.findElement(By.xpath("//h3[contains(text(),'Login')]"));
			Assert.assertEquals(success.getText(), "Login Successfully");
			System.out.println("Navigated to HomePage");

		} else if (expectedResult.equals("Enter your userName and password correct")) {
			WebElement errorMsg = driver
					.findElement(By.xpath("//h3[contains(text(),'Login')]"));
			Assert.assertEquals(errorMsg.getText(), "Enter your userName and password correct");
			System.out.println("Error message appeared");
		}
	}
	

}
