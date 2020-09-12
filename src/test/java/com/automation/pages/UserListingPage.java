package com.automation.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
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

	@FindBy(xpath = "//table[@id='resultTable']//tbody//tr")
	List<WebElement> listOfUsers;

	@FindBy(xpath = "//table[@id='resultTable']/thead/tr/th[@class='header']")
	List<WebElement> listOfColumn;

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

	public void verifyUserData() {

	}

	public void verifyUsersData(List<List<String>> listOfData) {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue("Number of exp user and actual user doesn't match", listOfUsers.size() == listOfData.size());

		for (int i = 0; i < listOfData.size(); i++) {

			List<WebElement> listOfDataInRow = driver
					.findElements(By.xpath("//table[@id='resultTable']//tbody//tr[" + (i + 1) + "]/td[@class='left']"));

			for (int j = 0; j < listOfDataInRow.size(); j++) {

				WebElement data = driver.findElement(By.xpath(
						"//table[@id='resultTable']//tbody//tr[" + (i + 1) + "]/td[@class='left'][+" + (j + 1) + "+]"));

				String expData = listOfData.get(i).get(j); // From feature file
				String actData = data.getText(); // From web site

				Assert.assertTrue("Expected was - " + expData + " and Actual is -" + actData,
						expData.equalsIgnoreCase(actData));
			}
			System.out.println();
		}
	}

	public void verifyUserDataUsingHeader(List<Map<String, String>> listOfData) {
		
		
		for (int i = 0; i < listOfData.size(); i++) {
			List<WebElement> elemments = driver
					.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[@class='left']"));
//			Assert.assertTrue("Username doesn't match with UI", map.get("Username").equals(elemments.get(0).getText()));
//			Assert.assertTrue("UserRole doesn't match with UI", map.get("UserRole").equals(elemments.get(1).getText()));
//			Assert.assertTrue("Emp Name doesn't match with UI",map.get("EmployeeName").equals(elemments.get(2).getText()));
//			Assert.assertTrue("Status doesn't match with UI", map.get("Status").equals(elemments.get(3).getText()));

			Set<String> setOfKey = listOfData.get(i).keySet();
			List<String> listOfKeys = new ArrayList<String>(setOfKey);

			for (int j = 0; j < listOfKeys.size(); j++) {
				String expData = listOfData.get(i).get(listOfKeys.get(j));
				System.out.println(expData);
				String actData = elemments.get(j).getText();
				System.out.println(actData);
				Assert.assertTrue("Expected was - " + expData + " and Actual is -" + actData,
						expData.equalsIgnoreCase(actData));
			}
		}
	}

}
