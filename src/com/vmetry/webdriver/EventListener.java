package com.vmetry.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class EventListener {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension dim = new Dimension(1200, 800);
		driver.manage().window().setSize(dim);
		// Creating the instance for Listener Class
		CustomListener lstn = new CustomListener();
		//creating the instance for EventFiringWebDriver and pass Webdriver object as parameter
		
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
		//register the listener class with Event Firing Webdriver
		
		efwd.register(lstn);
		efwd.get("https://www.bing.com/");
		WebElement srchBox , SrchGo , footer;
		srchBox = efwd.findElement(By.id("sb_form_q"));
		srchBox.sendKeys("Sanjay Presanatation");
		SrchGo = efwd.findElement(By.id("sb_form_go"));
		SrchGo.click();
		Thread.sleep(1500);
		efwd.navigate().refresh();
		Thread.sleep(1500);
		efwd.navigate().back();
		Thread.sleep(1500);
		efwd.navigate().forward();
		footer = efwd.findElement(By.id("b_footer"));
		JavascriptExecutor jse=(JavascriptExecutor)efwd ;
		jse.executeScript("arguments[0].scrollIntoView();", footer);
		efwd.unregister(lstn);
		Thread.sleep(1500);
		efwd.navigate().refresh();
		Thread.sleep(1500);
		efwd.navigate().back();
		Thread.sleep(1500);
		efwd.navigate().forward();			
		

	}

}
