package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "@target/rerun.txt", 
				glue = "com.automation.stepdef",
				monochrome = true,
				strict = true,
				plugin = {"html:report", "json:target/cucumber.json"}
		)

public class Test2ReRunner {

}
