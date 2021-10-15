package org.testng.dataprovider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoLogin extends LibGlobal {
	public PojoLogin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	private WebElement txtuser;
	@FindBy(name = "pass")
	private WebElement txtpass;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnlog;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlog() {
		return btnlog;
	}

}
