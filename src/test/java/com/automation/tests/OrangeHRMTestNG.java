package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.pages.ForgetPasswordPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;

public class OrangeHRMTestNG extends BaseTest {

	@Test(groups = { "smoke", "wip", "login" })
	public void verifyLoginSuccessfulForValidCrd() {
		ornageLogin.doLogin("Admin", "admin123");
		orangeHome.verifyLogo();
	}

	@Test(groups = "regression")
	public void verifyLoginUnsuccessfulForInvalidCrd() {
		ornageLogin.doLogin("Admin", "admin123@");
		ornageLogin.verifyInvalidCredErrorMsg();
	}

	@Test(groups = "regression")
	public void verifyUsernameFieldOnForgotPasswordPage() {
		ornageLogin.clickOnForgetPasswordLink();
		fpp.verifyUsernameField();

	}

}
