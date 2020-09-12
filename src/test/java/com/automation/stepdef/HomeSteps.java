package com.automation.stepdef;

import com.automation.pages.HomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

	HomePage homePage = new HomePage();

	@Then("verify user is on homepage")
	public void verify_user_is_on_homepage() {
		homePage.verifyLogo();
	}

	@When("user clicks on User tab under admin and user management menu")
	public void user_clicks_on_User_tab_under_admin_and_user_management_menu() {
		homePage.userClickUsersTab();
	}
	
	@When("user clicks on Employee status tab under admin and job menu")
	public void user_clicks_on_Employee_status_tab_under_admin_and_job_menu() {
		homePage.clickEmploymentStatusMenu();
	}
	
	
	@When("user clicks on Job title tab under admin and job menu")
	public void clickOnJobTitle() {
		homePage.clickOnJobTitle();
	}

}
