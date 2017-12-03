package com.vmetry.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		System.out.println(driver.manage().window().getSize().width);
		System.out.println(driver.manage().window().getSize().height);
		Dimension dim = new Dimension(1800, 1000);
		driver.manage().window().setSize(dim);
		WebElement button = driver.findElement(By.xpath(".//*[@id='submit']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", button);
		Thread.sleep(3000);
		driver.quit();
		

	}

}
