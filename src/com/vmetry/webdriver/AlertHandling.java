package com.vmetry.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-g   enerated method stub
		System.setProperty("webdriver.gecko.driver",
				"F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		Dimension dim = new Dimension(1000, 800);
		driver.manage().window().setSize(dim);
		WebElement alertArea, sAlert, cAlert, pAlert;
		alertArea = driver.findElement(By.xpath(".//*[@id='content']/h2"));
		sAlert = driver.findElement(By.xpath(".//*[@id='content']/p[4]/button"));
		cAlert = driver.findElement(By.xpath(".//*[@id='content']/p[8]/button"));
		pAlert = driver.findElement(By.xpath(".//*[@id='content']/p[11]/button"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", alertArea);

		sAlert.click();
		Alert alrt;
		alrt = driver.switchTo().alert();
		Thread.sleep(2000);
		alrt.accept();

		cAlert.click();
		alrt = driver.switchTo().alert();
		Thread.sleep(2000);
		alrt.dismiss();

		pAlert.click();
		alrt = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alrt.getText());
		alrt.sendKeys("Never Ever Give Up");
		alrt.accept();

	}

}
