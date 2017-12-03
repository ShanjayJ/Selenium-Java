package com.vmetry.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		String title = "Automation Tester";
		List<WebElement> profession = driver.findElements(By.name("profession"));
		for (WebElement prof : profession) {
			if (prof.getAttribute("value").trim().equalsIgnoreCase(title)) {
				if (prof.isDisplayed()) {
					if (prof.isEnabled()) {
						if (!prof.isSelected()) {
							prof.click();
							break;
						}
					}
				}
			}
		}

	}

}
