package com.automation.stepdef;

import com.automation.pages.LoginPage;
import com.automation.utility.PropertyReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage login = new LoginPage();

	@Then("user opens the website")
	public void open_website() {
		login.openWebsite();
	}

	@Then("user login with valid credential")
	public void user_login_with_valid_credential() {
		login.doLogin(PropertyReader.getProperty("loginUsername"), PropertyReader.getProperty("loginPassword"));
	}

	@When("user login with invalid credential")
	public void login_with_invalid_cred() {
		login.doLogin("invalid", "invalid");
	}

	@When("verify invalid login error message is displayed")
	public void verifyInvalidLoginErrorMsg() {
		login.verifyInvalidCredErrorMsg();
	}
	
	@When("fail me")
	public void fail_me() {
		login.fail();
	}

}
