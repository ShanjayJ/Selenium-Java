package com.vmetry.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Dimension dim = new Dimension(1800, 1000);
		driver.manage().window().setSize(dim);
		driver.findElement(By.xpath(".//*[@id='sidebar']/aside[2]/ul/li[2]/a")).click();
		WebElement frame;
		frame = driver.findElement(By.className("demo-frame"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(frame);
		driver.findElement(By.id("tags")).sendKeys("E");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
