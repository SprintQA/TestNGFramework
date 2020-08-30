package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.pages.SwagHomePage;
import com.automation.pages.SwagLoginPage;
import com.automation.pages.SwagPdpPage;

public class SwagLabsTest extends BaseTest {

	@Test
	public void verifyProductDetailPage() {
		loginPage.doLogin("standard_user", "secret_sauce");
		homePage.verifyLogo();
		homePage.selectItem();
		pdpPage.verifyPrice();
	}

}
