package com.automation.stepdef;

import com.automation.pages.AddUserPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUserSteps {

	AddUserPage addUserPage = new AddUserPage();

	@Then("verify add user page is displayed")
	public void verify_add_user_page_is_displayed() {
		addUserPage.verifyAddUserPage();
	}

	@When("user fill required details")
	public void user_fill_required_details() {
		addUserPage.fillDetails();
	}

	@When("click on save button")
	public void click_on_save_button() {
		addUserPage.clickOnSaveBtn();
	}
	
	@When("user enter username less than five char")
	public void enterUsernameLessthanFiveChar() {
		addUserPage.enterUsernameLessthanFiveChar();
	}
	
	@When("verify invalid user error message is dispalyed")
	public void validateInvalidUsernameError() {
		addUserPage.validateInvalidUsernameError();
	}

}
