package com.vmetry.webdriver;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CropScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		File screenshot;
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		Dimension dim = new Dimension(1200, 800);
		driver.manage().window().setSize(dim);
		Thread.sleep(2000);
		screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("F:\\Java Files\\Source code\\Selinium Java\\SceenShot\\BingHome.png"));
		
		BufferedImage srcImg = ImageIO.read(screenshot);
		WebElement logo = driver.findElement(By.cssSelector(".hp_sw_logo.hpcLogoWhite"));
		Point pt;
		pt = logo.getLocation();
		int xAxis, yAxis, width, height;
		xAxis = pt.getX();
		yAxis = pt.y;
		width = logo.getSize().width;
		height = logo.getSize().getHeight();
		BufferedImage destImg;
		destImg = srcImg.getSubimage(xAxis, yAxis, width, height);
		ImageIO.write(destImg, "png", screenshot);
		FileUtils.copyFile(screenshot, new File("F:\\Java Files\\Source code\\Selinium Java\\ScreenShot\\BingLogo.png"));

	}

}
