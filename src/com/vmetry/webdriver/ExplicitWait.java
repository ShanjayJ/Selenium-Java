package com.vmetry.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("http://jqueryui.com");
		Dimension dim = new Dimension(1800, 1000);
		driver.manage().window().setSize(dim);
		driver.findElement(By.xpath(".//*[@id='sidebar']/aside[2]/ul/li[2]/a")).click();
		wait.until(ExpectedConditions.titleContains("Autocomplete"));

		WebElement frame;
		frame = driver.findElement(By.className("demo-frame"));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));

		driver.findElement(By.id("tags")).sendKeys("E");
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ui-menu-item")));

		List<WebElement> autoCpltOpt = driver.findElements(By.className("ui-menu-item"));
		for (WebElement opt : autoCpltOpt) {
			if (opt.getText().trim().equalsIgnoreCase("Haskell")) {
				opt.click();
				break;
			}
		}
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.quit();

	}

}
