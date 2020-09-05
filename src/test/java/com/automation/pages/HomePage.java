package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utility.DriverUtils;

public class HomePage extends BasePage {

	@FindBy(xpath = "//img[@alt='OrangeHRM']")
	WebElement logo;

	public HomePage() {
		this.driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void verifyLogo() {
		DriverUtils.quitDriver();
		
	}
	
	public void clickOnUserLink() {
		Actions action = new Actions(driver);
		action.click(logo).moveToElement(logo).click(logo).build().perform();
	}

}
