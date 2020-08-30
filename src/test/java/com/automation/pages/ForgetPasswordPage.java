package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.utility.DriverUtils;

public class ForgetPasswordPage extends BasePage {

	@FindBy(css = "#securityAuthentication_userName")
	WebElement forgetPassUsernameField;

	public ForgetPasswordPage() {
		this.driver = DriverUtils.getDriver();;
		PageFactory.initElements(driver, this);
	}

	public void verifyUsernameField() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(forgetPassUsernameField));
		System.out.println(forgetPassUsernameField.isDisplayed());
	}
}
