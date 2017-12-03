package com.vmetry.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalFileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.vmetry.com/Upload.aspx");
		Dimension dim = new Dimension(1800, 1000);
		driver.manage().window().setSize(dim);
		WebElement upload = driver.findElement(By.className("fileUpload"));
		upload.sendKeys("C:\\Users\\shanj\\Desktop\\Shanjay\\Laptop_bios_page.jpg");
//		WebElement upld = driver.findElement(By.cssSelector("input[type='file']"));
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].scrollIntoView();", upload);
		Thread.sleep(2000);
		driver.quit();
		

	}

}
