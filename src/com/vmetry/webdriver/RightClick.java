package com.vmetry.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://jqueryui.com");
			Dimension dim = new Dimension(1800, 1000);
			driver.manage().window().setSize(dim);
			WebElement autoCptlink = driver.findElement(By.linkText("Autocomplete"));
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			act.contextClick(autoCptlink).build().perform();
	

	}

}
