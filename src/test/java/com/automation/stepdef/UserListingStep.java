package com.automation.stepdef;

import com.automation.pages.UserListingPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserListingStep {

	UserListingPage userListingPage = new UserListingPage();

	@Then("verify user is on user listing page")
	public void verify_user_is_on_system_users_page() {
		userListingPage.verifyUserListingPage();
	}

	@When("user clicks on add button")
	public void user_clicks_on_add_button() {
		userListingPage.clickOnAddBtn();
	}

	@Then("verify success message is displayed")
	public void verify_success_message_is_displayed() {
		userListingPage.verifySuccessMsg();
	}

}
