package com.automation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.pages.ForgetPasswordPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.SwagHomePage;
import com.automation.pages.SwagLoginPage;
import com.automation.pages.SwagPdpPage;
import com.automation.utility.DriverUtils;

public class BaseTest {

	SwagLoginPage loginPage = new SwagLoginPage();
	SwagHomePage homePage = new SwagHomePage();
	SwagPdpPage pdpPage = new SwagPdpPage();

	LoginPage ornageLogin = new LoginPage();
	HomePage orangeHome = new HomePage();
	ForgetPasswordPage fpp = new ForgetPasswordPage();

	@BeforeMethod
	public void setUp() {
		DriverUtils.createDriver();
	}

	@AfterMethod
	public void cleanUp() {
		DriverUtils.quitDriver();
	}
}
