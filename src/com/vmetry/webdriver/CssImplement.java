package com.vmetry.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Sanjay");

	}

}
