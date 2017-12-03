package com.vmetry.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement droppableMnu = driver.findElement(By.linkText("Droppable"));
		droppableMnu.click();
		WebElement src, dest, frame;
		frame = driver.findElement(By.className("demo-frame"));
		Thread.sleep(10000);
		driver.switchTo().frame(frame);
		src = driver.findElement(By.id("draggable"));
		dest = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
	//	act.clickAndHold(src).moveToElement(dest).release(dest).build().perform();
		act.dragAndDrop(src, dest).build().perform();

	}

}
