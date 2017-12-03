package com.vmetry.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProviderParametrization {
	WebDriver driver;
	Dimension dim;
	WebDriverWait wait;
	SoftAssert s_assert;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		dim = new Dimension(1800, 1800);
		s_assert = new SoftAssert();
	}

	@Test(dataProvider = "TestCase Data", dataProviderClass = TestDataProvider.class ,description = "Autocomplete Launch")
	public void autoComplete(String noiseWrd, String srchWrd) {
		driver.get("http://jqueryui.com/autocomplete/");
		Assert.assertEquals(driver.getTitle(), "Autocomplete | jQuery UI", "Page Title Validation Failure");
		WebElement frame, srchBox;
		frame = driver.findElement(By.className("demo-frame"));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));

		srchBox = driver.findElement(By.id("tags"));
		srchBox.sendKeys(noiseWrd);
		s_assert.assertEquals(srchBox.getAttribute("value"), noiseWrd);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ui-menu-item")));

		List<WebElement> autoCpltOpt = driver.findElements(By.className("ui-menu-item"));
		for (WebElement opt : autoCpltOpt) {
			if (opt.getText().trim().equalsIgnoreCase(srchWrd)) {
				opt.click();
				break;
			}
		}
		s_assert.assertEquals(srchBox.getAttribute("value"), srchWrd);
		s_assert.assertAll();
	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		if (!(driver == null)) {
			Thread.sleep(3000);
			driver.quit();
		}
	}

}
