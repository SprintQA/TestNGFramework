package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.utility.CommonMethods;
import com.automation.utility.DriverUtils;

public class LoginPage extends BasePage {

	@FindBy(id = "txtUsername")
	WebElement userNameInput;

	@FindBy(id = "txtPassword")
	WebElement passwordInput;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	@FindBy(css = "#forgotPasswordLink a")
	WebElement forgetPassLink;

	@FindBy(css = "#spanMessage")
	WebElement invalidCredWarningMsg;

	public LoginPage() {
		this.driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void doLogin(String usernmae, String password) {
		userNameInput.sendKeys(usernmae);
		passwordInput.sendKeys(password);
		loginBtn.click();
	}

	public void clickOnForgetPasswordLink() {
		forgetPassLink.click();
	}

	public void verifyInvalidCredErrorMsg() {
		CommonMethods.waitForElementToBePresent(invalidCredWarningMsg);
		System.out.println(invalidCredWarningMsg.isDisplayed());
	}

}
