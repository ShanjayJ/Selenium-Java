package com.vmetry.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Slid")).click();
		WebElement frame , sliderHandler, sliderScale;;
		frame = driver.findElement(By.className("demo-frame"));
		Thread.sleep(10000);
		driver.switchTo().frame(frame);
		sliderHandler = driver.findElement(By.xpath(".//*[@id='slider']/span"));
		sliderScale = driver.findElement(By.id("slider"));
		int sliderWidth = sliderScale.getSize().width;
		int moveTo = 495;
		if (moveTo<=sliderWidth) {
			Actions act = new Actions(driver);
			act.clickAndHold(sliderHandler).moveByOffset(moveTo, 0).release().build()
					.perform();
		}

	}

}
