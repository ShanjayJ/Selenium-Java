package com.vmetry.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchMicrosoftEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","F:\\Java Files\\Browser Drivers\\Microsoft Edge Driver\\MicrosoftWebDriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login/");

	}

}
