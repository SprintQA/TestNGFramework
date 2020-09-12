package com.automation.stepdef;

import java.util.List;
import java.util.Map;

import com.automation.pages.UserListingPage;

import io.cucumber.datatable.DataTable;
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
	
	@Then("verify user data on user listing pages without header")
	public void verify_user_data_on_user_listing_page(DataTable dataTable) {
		List<List<String>> listOfData = dataTable.asLists();
		userListingPage.verifyUsersData(listOfData);
	}
	
	@Then("verify user data on user listing pages with header")
	public void verify_user_data_on_user_listing_page_with_header(DataTable dataTable) {
		 List<Map<String, String>> listOfData = dataTable.asMaps();
		userListingPage.verifyUserDataUsingHeader(listOfData);
	}

	

}
