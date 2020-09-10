package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src\\test\\resources\\features\\Login.feature", 
				glue = "com.automation.stepdef",
				monochrome = true,
				tags = "@Smoke",
				strict = true,
				plugin = {"html:report", "json:target/cucumber.json", "rerun:target/rerun.txt"}
		)

public class Test1Runner {

}
