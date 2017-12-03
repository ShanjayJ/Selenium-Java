package com.vmetry.webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Dimension dim = new Dimension(1800, 1000);
		driver.manage().window().setSize(dim);
		System.out.println("Title:" + driver.getTitle());
		System.out.println("Page Source:" + driver.getPageSource());
		System.out.println("URL: " +driver.getCurrentUrl());
	}

}
