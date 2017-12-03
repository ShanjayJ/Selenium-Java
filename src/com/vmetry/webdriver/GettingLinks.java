package com.vmetry.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GettingLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com");
		driver.manage().window().maximize();
		WebElement demos = driver.findElement(By.linkText("Demos"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.click(demos).build().perform();
		List<WebElement> links = driver.findElements(By.cssSelector("#content>ul>li>a"));
		System.out.println("Total Links" + links.size());
		for (WebElement link : links) {
			System.out.println("Link Text : " + link.getText());
			System.out.println("Link URL : " + link.getAttribute("href"));
			System.out.println("------------------------");
			System.out.println("");
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
