package com.automation.utility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mysql.cj.protocol.Resultset;

// Helper, WebElementUtils
public class CommonMethods {

	static WebDriver driver = DriverUtils.getDriver();

	static WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(),
			Long.parseLong(PropertyReader.getProperty("timeout")));

	public static void waitForElementToBePresent(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForElementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public static void switchToNewWindow() {
		String currentWindow = driver.getWindowHandle();
		Set<String> listOfWindow = driver.getWindowHandles();

		for (String window : listOfWindow) {
			if (!window.equals(currentWindow)) {
				driver.switchTo().window(window);
			}
		}
	}

	public static void selectDropdownText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void verifyTableData(String loc, List<Map<String, String>> data) {
		for (int i = 0; i < data.size(); i++) {
			loc = String.format(loc, i + 1);
			List<WebElement> dataInEachRow = driver.findElements(By.xpath(loc));

			Set<String> setOfKey = data.get(i).keySet();
			List<String> listOfKey = new ArrayList<String>(setOfKey);

			for (int j = 0; j < listOfKey.size(); j++) {
				String expData = data.get(i).get(listOfKey.get(j));
				String actData = dataInEachRow.get(j).getText();
				System.out.println(expData);
				System.out.println(actData);
			}
		}
	}

	public static void verifyDataBaseData(String query, List<Map<String, String>> data) throws SQLException {
		DataBaseUtils.connectDataBase();
		ResultSet result = DataBaseUtils.getData(query);
		
		for (int i = 0; i < data.size(); i++) {

			Set<String> setOfKey = data.get(i).keySet();
			List<String> listOfKey = new ArrayList<String>(setOfKey);

			for (int j = 0; j < listOfKey.size(); j++) {
				String expData = data.get(i).get(listOfKey.get(j));
				String actData = result.getString(listOfKey.get(j));
				Assert.assertTrue("", expData.equalsIgnoreCase(actData));
			}
		}
		
	}

}
