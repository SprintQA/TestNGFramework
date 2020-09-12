package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src\\test\\resources\\features", 
				glue = "com.automation.stepdef",
				monochrome = true,
				strict = true,
				tags = "@Smoke1",
				plugin = {"html:report", "json:target/cucumber.json", "rerun:target/rerun.txt"}
		)

public class Test1Runner {

}
