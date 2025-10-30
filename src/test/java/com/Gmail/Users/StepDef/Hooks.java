package com.Gmail.Users.StepDef;

import com.Gmail.Users.Config.Base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks extends Base{
//	WebDriver driver;
//	Base base;
//	public Hooks(Base base) { //constructor ---- base class reference
//		this.base = base;
		
//	}
	public static ExtentSparkReporter spark;
	public static ExtentReports extReports;
	public static ExtentTest test;
	@BeforeAll
	public static void beforeAll() {
		spark = new ExtentSparkReporter(".\\Reports\\ExtentReport.html");
        extReports = new ExtentReports();
        extReports.attachReporter(spark);
	}
//	@Before
//	public void setup() {
//		System.out.println("browser opened");
//		base.driver = new ChromeDriver();//driver Intialization
//		driver = new ChromeDriver();
//		
//	}
//	
//	@After
//	public void tearDown() {
//		System.out.println("Browser closed");
//		//base.driver.close();  
//		
//	}
	@Before
    public void beforeScenario(Scenario scenario) {
          test = extReports.createTest(scenario.getName());
       launchBrowser();
    }
      
 
    @After
    public void afterScenario() {
        
//        sleep(4000);
//        driver.quit();
    }
	@AfterAll
	public static void afterAll() {
		extReports.flush();
	}
	
		
	

}
