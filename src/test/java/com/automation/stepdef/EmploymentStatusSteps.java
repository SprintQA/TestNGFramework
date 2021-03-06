package com.automation.stepdef;

import java.util.List;
import java.util.Map;

import com.automation.pages.EmploymentStatusPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class EmploymentStatusSteps {

	EmploymentStatusPage employmentPage = new EmploymentStatusPage();

	@Then("verify user is on employee status page")
	public void verify_user_is_on_employee_status_page() {
		employmentPage.verifyEmployeeStatusPage();
	}

	@Then("verify employee status data")
	public void verify_employee_status_data(DataTable dataTable) {
		List<String> data = dataTable.asList();
		employmentPage.verifyEmployeeStatusData(data);
	}
	
	@Then("verify employee status data using header")
	public void verify_employee_status_data_with_header(DataTable dataTable) {
		 List<Map<String, String>> data = dataTable.asMaps();
		employmentPage.verifyEmployeeStatusDataUsingHeader(data);
	}
}
