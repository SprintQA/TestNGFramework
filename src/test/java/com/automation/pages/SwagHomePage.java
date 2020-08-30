package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utility.DriverUtils;

public class SwagHomePage extends BasePage {

	@FindBy(className = "app_logo")
	WebElement logo;

	@FindBy(xpath = "//div[@class='inventory_item_name']")
	WebElement item;

	public SwagHomePage() {
		this.driver = DriverUtils.getDriver();;
		PageFactory.initElements(driver, this);
	}

	public void verifyLogo() {
		System.out.println(logo.isDisplayed());
	}

	public void selectItem() {
		item.click();
	}
}
