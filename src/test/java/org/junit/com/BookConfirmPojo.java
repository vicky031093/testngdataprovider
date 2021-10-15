package org.junit.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConfirmPojo extends LibGlobal {
	public BookConfirmPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="search_hotel")
	private WebElement scrl;
	@FindBy(id="order_no")
	private WebElement ordid;
	public WebElement getScrl() {
		return scrl;
	}
	public WebElement getOrdid() {
		return ordid;
	}
	

}
