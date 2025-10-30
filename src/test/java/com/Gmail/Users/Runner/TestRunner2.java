package com.Gmail.Users.Runner;  

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".\\src\\test\\java\\com\\Gmail\\Users\\Features\\NewTours.feature",
		glue = "com.Gmail.Users.StepDef",
		tags = "@sce1",
		plugin = {"pretty", "html:Reports/cucumber-reports.html","json:Reports/cucumber-report.json",
				"junit:Reports/cucumber-report.xml"}
		)
public class TestRunner2 extends AbstractTestNGCucumberTests{

}
