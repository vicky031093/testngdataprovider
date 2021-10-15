package org.adactin;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAdacId {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\DataDriven\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		String Curl = driver.getCurrentUrl();
		boolean b = Curl.contains("ada");
		Assert.assertTrue("Verify URL", b);
		driver.manage().window().maximize();

		WebElement tstuser = driver.findElement(By.id("username"));
		tstuser.sendKeys("vickyvicky");
		WebElement tstpass = driver.findElement(By.id("password"));
		tstpass.sendKeys("03G408");
		WebElement btnlog = driver.findElement(By.id("login"));
		btnlog.click();

		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByVisibleText("London");

		WebElement hotl = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotl);
		s1.selectByVisibleText("Hotel Creek");

		WebElement room = driver.findElement(By.id("room_type"));
		Select s2 = new Select(room);
		s2.selectByVisibleText("Super Deluxe");

		WebElement rnum = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(rnum);
		s3.selectByVisibleText("1 - One");

		WebElement cdate = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		cdate.sendKeys("08/10/2021");

		WebElement odate = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		odate.sendKeys("10/10/2021");

		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adult);
		s4.selectByVisibleText("2 - Two");

		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByVisibleText("0 - None");

		WebElement sbtn = driver.findElement(By.id("Submit"));
		sbtn.click();

		WebElement rbtn = driver.findElement(By.xpath("//input[@type='radio']"));
		rbtn.click();

		WebElement cbtn = driver.findElement(By.id("continue"));
		cbtn.click();

		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys("vignesh");

		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("pasupathy");

		WebElement adrs = driver.findElement(By.id("address"));
		adrs.sendKeys("Chennai");

		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("1234567890123456");

		WebElement ctype = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(ctype);
		s6.selectByValue("VISA");

		WebElement expmon = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(expmon);
		s7.selectByValue("3");

		WebElement expyr = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(expyr);
		s8.selectByValue("2022");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");

		WebElement bkclk = driver.findElement(By.id("book_now"));
		bkclk.click();

		Thread.sleep(5000);
		WebElement scrl = driver.findElement(By.id("search_hotel"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true)", scrl);

		WebElement ordid = driver.findElement(By.id("order_no"));
		String svalue = ordid.getAttribute("value");
		System.out.println("ORDER ID: " + svalue);

	}


}
