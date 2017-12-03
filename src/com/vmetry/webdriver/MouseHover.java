package com.vmetry.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.vmetry.com/");
		Dimension dim = new Dimension(1800, 1000);
		driver.manage().window().setSize(dim);
		Actions act = new Actions(driver);
		WebElement course = driver.findElement(By.xpath("//li/a/span[text()='Courses']"));
		act.moveToElement(course).build().perform();
		Thread.sleep(3000);
		WebElement mnu = driver.findElement(By.xpath("//li//a[text()='Testing']"));
		act.moveToElement(mnu).click().build().perform();

	}

}
