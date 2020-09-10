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

	@When("user login with username {string} and password {string}")
	public void user_login_with_username_and_password(String usernameKey, String passwordKey) {
		System.out.println("*********" + usernameKey);
		login.doLogin(PropertyReader.getProperty(usernameKey), PropertyReader.getProperty(passwordKey));
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
