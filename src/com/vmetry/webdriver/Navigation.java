package com.vmetry.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.bing.com/");
		Dimension dim = new Dimension(1200, 800);
		driver.manage().window().setSize(dim);
		Thread.sleep(2000);
		WebElement srchBox = driver.findElement(By.id("sb_form_q"));
		srchBox.sendKeys("Sanjay Presentation");
		srchBox.submit();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.quit();

		// Thread.sleep(2500);
		// srchBox.sendKeys(Keys.F5);
		// Thread.sleep(2500);
		// srchBox.sendKeys(Keys.BACK_SPACE);
		// Thread.sleep(2500);
		// driver.quit();

	}

}
