package com.automation.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utility.CommonMethods;
import com.automation.utility.DriverUtils;

public class EmploymentStatusPage extends BasePage {

	@FindBy(xpath = "//div[@id='search-results']//h1")
	WebElement pageTitle;

	@FindBy(xpath = "//table[@id='resultTable']//tbody/tr//a")
	List<WebElement> employeeStatusEleList;

	public EmploymentStatusPage() {
		this.driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void verifyEmployeeStatusPage() {
		CommonMethods.waitForElementToBePresent(pageTitle);
		Assert.assertTrue("Employement status page is not dispalyed", CommonMethods.isDisplayed(pageTitle));
	}

	public void verifyEmployeeStatusData(List<String> dataList) {
		Assert.assertTrue("Expecated data and actual data doesn't match",
				dataList.size() == employeeStatusEleList.size());

		for (int i = 0; i < dataList.size(); i++) {

			String expData = dataList.get(i); // From feature file
			String actData = employeeStatusEleList.get(i).getText(); // From web site

			Assert.assertTrue("Expected was - " + expData + " and Actual is -" + actData,
					expData.equalsIgnoreCase(actData));

		}
	}

}
