package org.junit.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends LibGlobal{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement tstuser;
	@FindBy(id="password")
	private WebElement tstpass;
	@FindBy(id="login")
	private WebElement btnlog;
	public WebElement getTstuser() {
		return tstuser;
	}
	public WebElement getTstpass() {
		return tstpass;
	}
	public WebElement getBtnlog() {
		return btnlog;
	}

}
