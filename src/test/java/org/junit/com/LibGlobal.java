package org.junit.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	static WebDriver driver;

	public WebDriver launchBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\DataDriven\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return driver;
	}

	public void launchUrl(String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void insert(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void btnClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String pageUrl() {
		String url = null;
		try {
			url = driver.getCurrentUrl();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return url;
	}

	public String pageTitle() {
		String title = null;
		try {
			title = driver.getTitle();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return title;
	}

	public String getAttribute(WebElement element, String value) {
		String attribute = value;
		try {
			attribute = element.getAttribute(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return attribute;
	}

	public String getTextValue(WebElement element, String txt) {
		String text = null;
		try {
			text = element.getText();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return text;
	}

	public void selectValueByIndex(WebElement element, int index) {
		try {
			Select s = new Select(element);
			s.selectByIndex(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String selectValueByValue(WebElement element, String sv) {
		try {
			Select s = new Select(element);
			s.selectByValue(sv);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sv;
	}

	public String selectValueByVisibleText(WebElement element, String svv) {
		try {
			Select s = new Select(element);
			s.selectByVisibleText(svv);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return svv;
	}

	public String selectGetOptions(WebElement element, String value) {
		String Stxt = null;
		try {
			Select s = new Select(element);
			List<WebElement> lselm = s.getOptions();
			for (int i = 0; i < lselm.size(); i++) {
				WebElement stgelm = lselm.get(i);
				Stxt = stgelm.getText();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Stxt;
	}

	public String selectAllSelectedOptions(WebElement element, String value) {
		String Stxt = null;
		try {
			Select s = new Select(element);
			List<WebElement> lsallelm = s.getAllSelectedOptions();
			for (int i = 0; i < lsallelm.size(); i++) {
				WebElement stgelm = lsallelm.get(i);
				Stxt = stgelm.getText();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Stxt;
	}

	public String selectFirstSelectedOptions(WebElement element, String value) {
		String text = null;
		try {
			Select s = new Select(element);
			WebElement fselect = s.getFirstSelectedOption();
			text = fselect.getText();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return text;

	}

	public boolean selectIsMultiple(WebElement element, boolean bo) {
		boolean b = false;
		try {
			Select s = new Select(element);
			b = s.isMultiple();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return b;
	}

	public void actionsMoveToElement(WebElement target) {
		try {
			Actions a = new Actions(driver);
			a.moveToElement(target).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void actionsDragAndDrop(WebElement src, WebElement tar) {
		try {
			Actions a = new Actions(driver);
			a.dragAndDrop(src, tar).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void actionDoubleClick(WebElement target) {
		try {
			Actions a = new Actions(driver);
			a.doubleClick(target).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void actionContextClick(WebElement target) {
		try {
			Actions a = new Actions(driver);
			a.contextClick(target).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void alertAccept() {
		try {
			Alert a = driver.switchTo().alert();
			a.accept();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void alertDismiss() {
		try {
			Alert a = driver.switchTo().alert();
			a.dismiss();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public File getScreenShotAs() {
		File screenshotAs = null;
		try {
			TakesScreenshot tk = (TakesScreenshot) driver;
			screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return screenshotAs;
	}

	public void jsInsert(String value, WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value'.'" + value + "')", element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void jsClick(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String jsGetAttribute(WebElement element) {
		String st = null;
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element);
			st = (String) executeScript;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return st;
	}

	public void jsScrollDown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void jsScrollUp(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)", element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getWindowHandle() {
		String parwin = null;
		try {
			parwin = driver.getWindowHandle();
			Set<String> allwin = driver.getWindowHandles();
			for (String x : allwin) {
				if (!parwin.equals(x)) {
					driver.switchTo().window(x);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return parwin;
	}

	public String getExcelData(String excelloc, String sname, int rNo, int cNo) throws IOException {
		String sValue = null;
		File f = new File(excelloc);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet(sname);
		Row r = s.getRow(rNo);
		Cell c = r.getCell(cNo);
		int type = c.getCellType();
		if (type == 1) {
			sValue = c.getStringCellValue();
		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
				sValue = sdf.format(date);
			} else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				sValue = String.valueOf(l);
			}
		}
		return sValue;

	}

	public String getCurrentUrl() {

		String url;
		url = driver.getCurrentUrl();
		return url;

	}

}
