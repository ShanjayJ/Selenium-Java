package com.vmetry.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean found = false;
		System.setProperty("webdriver.gecko.driver", "F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Dimension dim = new Dimension(1800, 1000);
		driver.manage().window().setSize(dim);
		WebElement tbl = driver.findElement(By.id("customers"));
		List<WebElement> rows = tbl.findElements(By.tagName("tr"));
		List<WebElement> cols;
		for (WebElement row : rows) {
			cols = row.findElements(By.tagName("td"));
			for (WebElement col : cols) {
				if (col.getText().trim().equalsIgnoreCase("Germany")) {
					found =true;
					break;
				}
			}
		}
		if (found) {
			System.out.println("Contact Found");
		}else {
			System.out.println("Contact Not Found");
		}
		
		driver.quit();

	}

}
