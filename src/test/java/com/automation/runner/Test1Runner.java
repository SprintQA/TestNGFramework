package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src\\test\\resources\\features", 
				glue = "com.automation.stepdef",
				tags = "@Chirag",
				monochrome = true,
				strict = true,
				plugin = {"html:report", "json:target/cucumber.json", "rerun:target/rerun.txt"}
		)

public class Test1Runner {

}
