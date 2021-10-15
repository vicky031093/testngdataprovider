package org.junit.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPojo extends LibGlobal {
	public SelectHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='radio']")
	private WebElement rbtn;
	@FindBy(id="continue")
	private WebElement cbtn;
	public WebElement getRbtn() {
		return rbtn;
	}
	public WebElement getCbtn() {
		return cbtn;
	}

}
