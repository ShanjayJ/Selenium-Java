package com.vmetry.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;

public class UntrustedSites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FirefoxProfile profile = new FirefoxProfile(); //this is how we handle in older version of Firefox
//		profile.setAcceptUntrustedCertificates(true);
//		WebDriver driver = new FirefoxDriver(profile);
		
//		DesiredCapabilities capability = DesiredCapabilities.chrome();  // this is commom for all the browsers Chrome , IE and Firefox
//		capability.setCapability("ACCEPT_SSL_CERT", true);
//		WebDriver driver = new ChromeDriver(capability);
		
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cacert.org/");
		Dimension dim = new Dimension(1800, 1000);
		driver.manage().window().setSize(dim);
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(3, TimeUnit.SECONDS).withTimeout(10, TimeUnit.SECONDS);

	}

}
