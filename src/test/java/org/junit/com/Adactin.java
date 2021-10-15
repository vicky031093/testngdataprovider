package org.junit.com;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Adactin {
	/*static LibGlobal l;
	static LoginPojo lp;
	static SelectHotelPojo sh;
	static BookConfirmPojo bc;*/
	
	@BeforeClass
	public static void beforeClass() {
		LibGlobal l = new LibGlobal();
		l.launchBrowser();
		l.launchUrl("https://adactinhotelapp.com/");
		String url = l.getCurrentUrl();
		boolean b = url.contains("ada");
		Assert.assertTrue(b);

	}

	@Test
	public void tc1() throws IOException, InterruptedException {
		LibGlobal l = new LibGlobal();

		LoginPojo lp = new LoginPojo();
		l.insert(lp.getTstuser(), l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 1, 0));
		l.insert(lp.getTstpass(), l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 1, 1));
		l.btnClick(lp.getBtnlog());

		SearchPojo sp = new SearchPojo();
		l.selectValueByVisibleText(sp.getLoc(),
				l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 5, 2));

		sp.selectValueByVisibleText(sp.getHotl(),
				l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 1, 3));

		sp.selectValueByVisibleText(sp.getRoom(),
				l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 4, 4));

		sp.selectValueByVisibleText(sp.getRnum(),
				l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 1, 5));

		sp.insert(sp.getCdate(), l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 1, 6));

		sp.insert(sp.getOdate(), l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 1, 7));

		sp.selectValueByVisibleText(sp.getAdult(),
				l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 2, 8));

		sp.selectValueByVisibleText(sp.getChild(),
				l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 1, 9));

		sp.btnClick(sp.getSbtn());

		SelectHotelPojo sh = new SelectHotelPojo();
		sh.getRbtn().click();

		l.btnClick(sh.getCbtn());

		BookingPojo bp = new BookingPojo();

		WebElement fname = bp.getFname();
		l.insert(fname, l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 1, 10));

		WebElement lname = bp.getLname();
		l.insert(lname, l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 1, 11));

		WebElement adrs = bp.getAdrs();
		l.insert(adrs, l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 2, 12));

		WebElement cc = bp.getCc();
		l.insert(cc, l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 1, 13));

		WebElement ctype = bp.getCtype();
		l.selectValueByValue(ctype,
				l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 2, 14));

		WebElement expmon = bp.getExpmon();
		l.selectValueByValue(expmon,
				l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 12, 15));

		WebElement expyr = bp.getExpyr();
		l.selectValueByValue(expyr,
				l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 12, 16));

		WebElement cvv = bp.getCvv();
		l.insert(cvv, l.getExcelData("E:\\Eclipse\\DataDriven\\ExcelData\\AdactinData.xlsx", "Data", 1, 17));

		l.btnClick(bp.getBkclk());

		Thread.sleep(5000);
		BookConfirmPojo bc = new BookConfirmPojo();
		l.jsScrollDown(bc.getScrl());

		File ss = l.getScreenShotAs();
		System.out.println("Screenshot Path: " + ss);

		WebElement ordid = bc.getOrdid();
		String svalue = l.getAttribute(ordid, "value");
		System.out.println("ORDER ID: " + svalue);
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Task Completed");

	}

	@Before
	public void before() {
		Date d = new Date();
		System.out.println("BeforeTime: " + d);

	}
	@After
	public void after() {
		Date d = new Date();
		System.out.println("AfterTime: " + d);

	}

}
