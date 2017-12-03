package com.vmetry.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com");
		Dimension dim = new Dimension(1800, 1000);
		driver.manage().window().setSize(dim);
		driver.findElement(By.xpath(".//*[@id='sidebar']/aside[2]/ul/li[2]/a")). click();
		WebElement frame ;
		frame = driver.findElement(By.className("demo-frame"));
		Thread.sleep(5000);
		driver.switchTo().frame(frame);
		driver.findElement(By.id("tags")).sendKeys("E");
		Thread.sleep(3000);
		List<WebElement> autoCpltOpt = driver.findElements(By.className("ui-menu-item"));
		for (WebElement opt : autoCpltOpt) {
			if (opt.getText().trim().equalsIgnoreCase("Haskell")) {
				opt.click();
				break;
			}
		}
		Thread.sleep(2000);
	//	driver.quit();

	}

}
