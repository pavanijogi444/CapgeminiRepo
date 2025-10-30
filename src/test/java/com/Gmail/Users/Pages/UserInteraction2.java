package com.Gmail.Users.Pages;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 
import com.aventstack.extentreports.ExtentTest;
 
public class UserInteraction2 {
    private WebDriver driver;
    private ExtentTest test;
    public UserInteraction2(WebDriver driver,ExtentTest test) {
    	this.test=test;
    	this.driver=driver;
  	   PageFactory.initElements(driver,this);//this
 
    }
   
    
    @FindBy(name="userName")
    private WebElement username;
    
    @FindBy(name="password")
    private WebElement Password;
    
    @FindBy(how = How.XPATH,using = "//input[@name='submit']")
    private WebElement SubmitButton;
    
    public void setup(String url) {    	
  	  driver.get(url);
  	
  }
  
  public void getUserName(String unm) {
  	username.sendKeys(unm);
  }
  
  public void getPassword(String pwd) {
  	Password.sendKeys(pwd);
  }
  
  public void getSubmit() {
  	SubmitButton.click();
 
  }
  
  public String getTitle() {
  	String str = driver.getTitle();
  	return str;
  }
  
  public WebElement getlocator(String path) {
  	WebElement d;
  	d = driver.findElement(By.xpath(path));
  	return d;
  }
}
    
    
 
 