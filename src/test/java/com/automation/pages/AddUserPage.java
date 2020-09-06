package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utility.CommonMethods;
import com.automation.utility.DriverUtils;

public class AddUserPage extends BasePage {

	@FindBy(id = "UserHeading")
	WebElement addUserPageHeading;

	@FindBy(id = "btnSave")
	WebElement saveBtn;

	@FindBy(id = "systemUser_employeeName_empName")
	WebElement employeeNameInput;

	@FindBy(id = "systemUser_userName")
	WebElement userNameInput;

	@FindBy(id = "systemUser_password")
	WebElement passwordInput;

	@FindBy(id = "systemUser_confirmPassword")
	WebElement confirmPasswordInput;

	@FindBy(xpath = "//span[@for='systemUser_userName']")
	WebElement invalidUsernameError;

	public AddUserPage() {
		this.driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void verifyAddUserPage() {
		CommonMethods.waitForElementToBePresent(addUserPageHeading);
		Assert.assertTrue("Add User page is not loaded", CommonMethods.isDisplayed(addUserPageHeading));
	}

	public void fillDetails() {
		employeeNameInput.sendKeys("John Smith");
		userNameInput.sendKeys("Test9772323");
		passwordInput.sendKeys("Test@123");
		confirmPasswordInput.sendKeys("Test@123");
	}

	public void clickOnSaveBtn() {
		CommonMethods.waitForElementToBeClickable(saveBtn);
		saveBtn.click();
	}

	public void enterUsernameLessthanFiveChar() {
		userNameInput.sendKeys("Test");
	}

	public void validateInvalidUsernameError() {
		Assert.assertTrue("Invalid username erorr message is not displayed",
				CommonMethods.isDisplayed(invalidUsernameError));
	}

}
