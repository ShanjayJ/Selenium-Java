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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependencySoftAssertion {
	WebDriver driver;
	Dimension dim;
	WebDriverWait wait;
	SoftAssert s_assert;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		s_assert = new SoftAssert();

	}

	@Test(priority = 0, description = "Launching Application")
	public void launch() {
		driver.get("http://jqueryui.com/autocomplete/");
		dim = new Dimension(1800, 1000);
		driver.manage().window().setSize(dim);
		Assert.assertEquals(driver.getCurrentUrl(), "http://jqueryui.com/autocomplete/", "URL Validation Failure :");
	}

	@Test(priority = 1, description = "Check AutoComplete", dependsOnMethods = { "launch" })
	@Parameters({ "noiseWrd", "srchValue" })
	public void doAutoComplete(String srchKey, String srchFor) {
		Assert.assertEquals(driver.getTitle(), "Autocomplete | jQuery UI", "Page Title Validation Failure");
		WebElement frame, srchBox;
		frame = driver.findElement(By.className("demo-frame"));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));

		srchBox = driver.findElement(By.id("tags"));
		srchBox.sendKeys(srchKey);
		s_assert.assertEquals(srchBox.getAttribute("value"), srchKey);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ui-menu-item")));

		List<WebElement> autoCpltOpt = driver.findElements(By.className("ui-menu-item"));
		for (WebElement opt : autoCpltOpt) {
			if (opt.getText().trim().equalsIgnoreCase(srchFor)) {
				opt.click();
				break;
			}
		}
		s_assert.assertEquals(srchBox.getAttribute("value"), srchFor);
		s_assert.assertAll();
	}

	@AfterTest
	public void teardown() throws InterruptedException {
		if (!(driver == null)) {
			Thread.sleep(3000);
			driver.quit();
		}
	}
}
