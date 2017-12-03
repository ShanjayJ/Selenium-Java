package com.vmetry.testng;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestCase {
	WebDriver driver;
	
	@Test
	public void launch() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Dimension dim = new Dimension(1800, 1200);
        driver.manage().window().setSize(dim);  
        driver.quit();
	}

}
