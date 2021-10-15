package org.data.driven;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngClas {
	WebDriver driver;
	LibGlobal libGlobal = new LibGlobal();;
	
	
	@BeforeClass
	private void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Eclipse\\MavenSampleProject\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	private void tc0() {
		
		WebElement txtusr = driver.findElement(By.id("email"));
		txtusr.sendKeys("vignesh");
		WebElement txtpas = driver.findElement(By.id("pass"));
		txtpas.sendKeys("9890068589");
		WebElement btnlog = driver.findElement(By.name("login"));
		libGlobal.btnClick(btnlog);
		//btnlog.click();
	}
	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@AfterClass
	private void quitBrowser() {
		driver.close();

	}

}


