package com.automation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	static WebDriver driver;

	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khima\\java-learning\\SeleniumAutomation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	public static void quitDriver() {
		driver.quit();
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
