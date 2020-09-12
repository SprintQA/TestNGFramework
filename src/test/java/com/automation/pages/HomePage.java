package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utility.CommonMethods;
import com.automation.utility.DriverUtils;

public class HomePage extends BasePage {

	@FindBy(xpath = "//img[@alt='OrangeHRM']")
	WebElement logo;

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminMenu;

	@FindBy(id = "menu_admin_UserManagement")
	WebElement userManagementMenu;

	@FindBy(id = "menu_admin_viewSystemUsers")
	WebElement usersMenu;
	
	@FindBy(id="menu_admin_Job")
	WebElement jobMenu;
	
	@FindBy(id="menu_admin_employmentStatus")
	WebElement employmentStatusMenu;
	
	@FindBy(id="menu_admin_viewJobTitleList")
	WebElement jobTitleMenu;

	public HomePage() {
		this.driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void verifyLogo() {
		CommonMethods.waitForElementToBePresent(logo);
		Assert.assertTrue("Logo is not displayed on home page", CommonMethods.isDisplayed(logo));
	}

	public void clickOnUserLink() {
		Actions action = new Actions(driver);
		action.click(logo).moveToElement(logo).click(logo).build().perform();
	}

	public void userClickUsersTab() {
		CommonMethods.waitForElementToBeClickable(adminMenu);
		Actions action = new Actions(driver);
		action.moveToElement(adminMenu).moveToElement(userManagementMenu).pause(2000).click(usersMenu).build()
				.perform();
	}

	public void clickEmploymentStatusMenu() {
		CommonMethods.waitForElementToBeClickable(adminMenu);
		Actions action = new Actions(driver);
		action.moveToElement(adminMenu).moveToElement(jobMenu).pause(2000).click(employmentStatusMenu).build()
				.perform();
	}

	public void clickOnJobTitle() {
		CommonMethods.waitForElementToBeClickable(adminMenu);
		Actions action = new Actions(driver);
		action.moveToElement(adminMenu).moveToElement(jobMenu).pause(2000).click(jobTitleMenu).build()
				.perform();
	}


}
