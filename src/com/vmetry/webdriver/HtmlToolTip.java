package com.vmetry.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com");
		Dimension dim = new Dimension(1800, 1000);
		driver.manage().window().setSize(dim);
		WebElement HtmlToolTip = driver.findElement(By.cssSelector(".logo>a"));
		System.out.println("HTML Tool Tip :" + HtmlToolTip.getAttribute("title"));
		driver.quit();

	}

}
