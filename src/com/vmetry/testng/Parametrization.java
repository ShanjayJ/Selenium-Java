package com.vmetry.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	WebDriver driver;
	Dimension dim;
	WebDriverWait wait;

	@Test(priority = 0)
	@Parameters({ "browser", "url" })
	public void launch(String browser, String aut) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get(aut);
		dim = new Dimension(1800, 1000);
		driver.manage().window().setSize(dim);
		driver.findElement(By.xpath(".//*[@id='sidebar']/aside[2]/ul/li[2]/a")).click();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Autocomplete"));

	}

	@Test(priority = 1)
	@Parameters({ "searchKey" })
	public void inputNoiceWord(String srchBy) {
		WebElement frame;
		frame = driver.findElement(By.className("demo-frame"));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));

		driver.findElement(By.id("tags")).sendKeys(srchBy);
	}

	@Test(priority = 2)
	@Parameters({ "searchWord" })
	public void selectSrchKey(String srchFor) {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ui-menu-item")));

		List<WebElement> autoCpltOpt = driver.findElements(By.className("ui-menu-item"));
		for (WebElement opt : autoCpltOpt) {
			if (opt.getText().trim().equalsIgnoreCase(srchFor)) {
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
