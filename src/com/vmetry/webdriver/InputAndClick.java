package com.vmetry.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputAndClick {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		WebElement userId, login;
		userId = driver.findElement(By.xpath("//input[@name='j_username']"));
		userId.sendKeys("Sanjay");
		driver.findElement(By.xpath(".//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[2]/td[2]/input")).sendKeys("Sanjay@123");
		login = driver.findElement(By.id("loginbutton"));
		login.click();
		
	}

}

