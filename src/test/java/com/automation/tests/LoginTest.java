package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.utility.PropertyReader;

public class LoginTest extends BaseTest {

	@Test(groups = { "smoke", "wip", "login" }, enabled = false)
	public void verifyLoginSuccessfulForValidCrd() {
		ornageLogin.doLogin(PropertyReader.getProperty("loginUsername"), PropertyReader.getProperty("loginPassword"));
		orangeHome.verifyLogo();
	}
	
	@Test
	public void verifyLoginScreen() {
		ornageLogin.verifyLoginPageDisplayed();
	}
	
}
