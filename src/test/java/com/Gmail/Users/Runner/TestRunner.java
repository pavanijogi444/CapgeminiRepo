package com.Gmail.Users.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\test\\java\\com\\Gmail\\Users\\Features\\NewTours.feature",
		glue = "com.Gmail.Users.StepDef",
		tags = "@sce1",
		plugin = {"pretty", "html:Reports/cucumber-reports.html","json:Reports/cucumber-report.json",
				"junit:Reports/cucumber-report.xml"}
		)
public class TestRunner {

}
