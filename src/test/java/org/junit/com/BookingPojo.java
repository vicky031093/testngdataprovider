package org.junit.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPojo extends LibGlobal{
	public BookingPojo() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAdrs() {
		return adrs;
	}
	public WebElement getCc() {
		return cc;
	}
	public WebElement getCtype() {
		return ctype;
	}
	public WebElement getExpmon() {
		return expmon;
	}
	public WebElement getExpyr() {
		return expyr;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBkclk() {
		return bkclk;
	}
	@FindBy(id="first_name")
	private WebElement fname;
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement adrs;
	@FindBy(id="cc_num")
	private WebElement cc;
	@FindBy(id="cc_type")
	private WebElement ctype;
	@FindBy(id="cc_exp_month")
	private WebElement expmon;
	@FindBy(id="cc_exp_year")
	private WebElement expyr;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement bkclk;
	

}
