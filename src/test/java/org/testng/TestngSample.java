package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngSample {
	WebDriver driver;

	@Parameters({"tstuser","tstpass"})
	@Test
	private void tc1(@Optional("vicky")String uv,String pv) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	   
		WebElement tstuser = driver.findElement(By.id("username"));
		tstuser.sendKeys(uv);
		WebElement tstpass = driver.findElement(By.id("password"));
		tstpass.sendKeys(pv);
		WebElement btnlog = driver.findElement(By.id("login"));
		btnlog.click();

	}

}

