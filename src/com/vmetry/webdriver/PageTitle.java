package com.vmetry.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricinfo.com");
		driver.manage().window().maximize();
		System.out.println("Page Title" + driver.getTitle());
		System.out.println("Page URL" + driver.getCurrentUrl());

	}

}
