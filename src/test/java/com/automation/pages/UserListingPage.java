package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utility.CommonMethods;
import com.automation.utility.DriverUtils;

public class UserListingPage extends BasePage {
	@FindBy(id = "searchBtn")
	WebElement searchBtn;

	@FindBy(id = "btnAdd")
	WebElement addBtn;

	@FindBy(xpath = "//div[@class='message success fadable']")
	WebElement successMsg;

	public UserListingPage() {
		this.driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void verifyUserListingPage() {
		CommonMethods.waitForElementToBePresent(searchBtn);
		Assert.assertTrue("User Listing page is not loaded", CommonMethods.isDisplayed(searchBtn));
		Assert.assertTrue("Add button is missing ono user listing page", CommonMethods.isDisplayed(addBtn));
	}

	public void clickOnAddBtn() {
		addBtn.click();
	}

	public void verifySuccessMsg() {
		Assert.assertTrue("Success message is missing on user listing page", CommonMethods.isDisplayed(successMsg));
	}
}
