package com.vmetry.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryToolTip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/tooltip/");
		Dimension dim = new Dimension(1800, 1000);
		driver.manage().window().setSize(dim);
		WebElement HtmlToolTip = driver.findElement(By.cssSelector(".logo>a"));
		System.out.println("HTML Tool Tip :" + HtmlToolTip.getAttribute("title"));
		Actions act = new Actions(driver);
		WebElement frame ;
		frame = driver.findElement(By.className("demo-frame"));
		Thread.sleep(5000);
		driver.switchTo().frame(frame);
		WebElement ageTxtBox = driver.findElement(By.cssSelector("#age"));
		act.moveToElement(ageTxtBox).build().perform();
		Thread.sleep(3000);
		WebElement jToolTip = driver.findElement(By.cssSelector("div[class$='-content']"));
		System.out.println("JQuery ToolTip:" + jToolTip.getText());
		Thread.sleep(3000);
		driver.quit();

	}

}
