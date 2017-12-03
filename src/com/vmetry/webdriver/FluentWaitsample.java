package com.vmetry.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cacert.org/");
		Dimension dim = new Dimension(1800, 1000);
		driver.manage().window().setSize(dim);
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(3, TimeUnit.SECONDS).withTimeout(10, TimeUnit.SECONDS);
		driver.quit();

	}

}
