package com.vmetry.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DymanicWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension dim = new Dimension(1000, 800);
		driver.manage().window().setSize(dim);
		String gender = "Male";
		WebElement custgender = driver.findElement(By.xpath(getGenderLocator(gender)));
		if (custgender.isDisplayed()) {
			if (custgender.isEnabled()) {
				if (!custgender.isSelected()) {
					custgender.click();
				}
			}
		}

	}
	
	public static String getGenderLocator(String gen) {
		String loc ;
		loc = "//label[text()='" +gen+"']/preceding-sibling::input[@type='radio']";
		System.out.println(loc);
		return loc;
		
	}

}
