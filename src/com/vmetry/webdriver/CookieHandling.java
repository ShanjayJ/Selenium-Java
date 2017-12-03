package com.vmetry.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.manage().window().getSize().width);
		System.out.println(driver.manage().window().getSize().height);
		Dimension dim = new Dimension(700, 400);
		driver.manage().window().setSize(dim);
//		System.out.println(driver.manage().getCookies());   // to get display all the cookies
		Set<Cookie> ck = driver.manage().getCookies();      // to get the cookies in the readable format
		Iterator<Cookie> itr = ck.iterator();
		while (itr.hasNext()) {
			Cookie cke = (Cookie) itr.next();
			System.out.println("Name:" + cke.getName());
			System.out.println("Domain:" + cke.getDomain());
			System.out.println("Path:" + cke.getPath());
			System.out.println("Expiry Date:" + cke.getExpiry());
			System.out.println("--------------------------------------");

		}
		Thread.sleep(3000);
		driver.quit();

	}

}
