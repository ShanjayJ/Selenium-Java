package com.vmetry.testng;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTestMethod {
	WebDriver driver;
	Dimension dim;
	
	@Test
	public void lauchGoogle() {
		System.setProperty("webdriver.chrome.driver","F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		dim = new Dimension(1800, 1200);
		driver.manage().window().setSize(dim);
	}
	
	@Test
	public void lauchFacebook() {
		System.setProperty("webdriver.gecko.driver", "F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		dim = new Dimension(1800, 1200);
		driver.manage().window().setSize(dim);
	}
	
	@Test
	public void lauchBing() {
		System.setProperty("webdriver.gecko.driver", "F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.bing.com/");
		dim = new Dimension(1800, 1200);
		driver.manage().window().setSize(dim);
	}

}
