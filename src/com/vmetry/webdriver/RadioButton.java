package com.vmetry.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		String expr = "4";
		List<WebElement> experience = driver.findElements(By.name("exp"));
		for (WebElement exp : experience) {
			if (exp.getAttribute("value").trim().equalsIgnoreCase(expr)) {
				if (exp.isDisplayed()) {
					if (exp.isEnabled()) {
						if (!exp.isSelected()) {
							exp.click();
							break;
						}
					}
				}
			}
		}

	}

}
