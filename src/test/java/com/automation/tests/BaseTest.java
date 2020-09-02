package com.automation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.pages.ForgetPasswordPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utility.DriverUtils;
import com.automation.utility.PropertyReader;

public class BaseTest {

	LoginPage ornageLogin;
	HomePage orangeHome;
	ForgetPasswordPage fpp;

	@BeforeMethod
	public void setUp() {
		PropertyReader.initProperties();
		DriverUtils.createDriver();
		ornageLogin = new LoginPage();
		orangeHome = new HomePage();
		fpp = new ForgetPasswordPage();
	}

	@AfterMethod
	public void cleanUp() {
		DriverUtils.quitDriver();
	}
}
