package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utility.DriverUtils;

public class SwagPdpPage extends BasePage {

	@FindBy(css = ".inventory_details_price")
	WebElement price;

	public SwagPdpPage() {
		this.driver = DriverUtils.getDriver();;
		PageFactory.initElements(driver, this);
	}

	public void verifyPrice() {
		System.out.println(price.getText());
	}
}
