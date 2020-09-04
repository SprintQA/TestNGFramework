package com.automation.pages;

import org.junit.Assert;
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

	@FindBy(id = "divLogo")
	WebElement loginPageLogo;

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
		Assert.assertTrue("Invalid login error message is not dispalyed",
				CommonMethods.isDisplayed(invalidCredWarningMsg));
	}

	public void verifyLoginPageDisplayed() {

		Assert.assertTrue("Logo on login page is not displayed", CommonMethods.isDisplayed(loginPageLogo));

		Assert.assertTrue("login button on login page is not displayed", CommonMethods.isDisplayed(loginBtn));

		Assert.assertTrue("username on login page is not displayed", CommonMethods.isDisplayed(userNameInput));

		Assert.assertTrue("password on login page is not displayed", CommonMethods.isDisplayed(passwordInput));
	}

}
