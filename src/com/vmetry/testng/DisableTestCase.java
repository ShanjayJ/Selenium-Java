package com.vmetry.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DisableTestCase {
	WebDriver driver;
	Dimension dim;
	WebDriverWait wait;

	@BeforeTest
	public void intialize() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		dim = new Dimension(1800, 1000);
	}

	@Test(priority = 0)
	public void launch() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver.get("http://jqueryui.com");
		driver.manage().window().setSize(dim);
		driver.findElement(By.xpath(".//*[@id='sidebar']/aside[2]/ul/li[2]/a")).click();
		wait.until(ExpectedConditions.titleContains("Autocomplete"));

	}

	@Test(priority = 1)
	public void inputNoiceWord() {
		WebElement frame;
		frame = driver.findElement(By.className("demo-frame"));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));

		driver.findElement(By.id("tags")).sendKeys("E");
	}

	@Test(priority = 2, enabled = false)
	public void selectSrchKey() {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ui-menu-item")));

		List<WebElement> autoCpltOpt = driver.findElements(By.className("ui-menu-item"));
		for (WebElement opt : autoCpltOpt) {
			if (opt.getText().trim().equalsIgnoreCase("Haskell")) {
				opt.click();
				break;
			}
		}
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
