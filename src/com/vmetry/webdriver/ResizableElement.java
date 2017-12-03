package com.vmetry.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Resizable")).click();
		WebElement frame , resizeCtrl , resizeHndl;
		frame = driver.findElement(By.className("demo-frame"));
		Thread.sleep(5000);
		driver.switchTo().frame(frame);
		resizeCtrl = driver.findElement(By.id("resizable"));
		resizeHndl = driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		int height , width;
		height = resizeCtrl.getSize().height;
		width = resizeHndl.getSize().width;
		System.out.println("height:" + height);
		System.out.println("Width:" + width);
		Actions act  = new Actions(driver);
		act.clickAndHold(resizeHndl).moveByOffset(width + 100, 0).release(resizeHndl).build().perform();
		
}

}
