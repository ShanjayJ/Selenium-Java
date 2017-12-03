package com.vmetry.webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Close {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://omayo.blogspot.in/");
		driver.manage().window().maximize();
	//	WebElement link = driver.findElement(By.linkText("SeleniumTutorial"));
	//	Actions act = new Actions(driver);
	//	act.moveToElement(link).click().build().perform();
		driver.findElement(By.linkText("SeleniumTutorial")).click();
		System.out.println("Parent URL:" + driver.getCurrentUrl());
		List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		for (String str : windows) {
			System.out.println(str);
		}
		driver.switchTo().window(windows.get(windows.size() - 1));
		Thread.sleep(5000);
		System.out.println("Child Window" + driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(windows.get(0));
		System.out.println("Parent Url" + driver.getCurrentUrl());

	}

}