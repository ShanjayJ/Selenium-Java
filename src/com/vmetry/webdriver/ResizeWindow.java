package com.vmetry.webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.in/");
		System.out.println(driver.manage().window().getSize().width);
		System.out.println(driver.manage().window().getSize().height);
		Dimension dim = new Dimension(700, 400);
		driver.manage().window().setSize(dim);

	}

}
