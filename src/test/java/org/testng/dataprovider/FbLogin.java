package org.testng.dataprovider;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FbLogin {
	@BeforeClass
	private void beforeClass() {
		LibGlobal l = new LibGlobal();
		l.webDriverManager();
	}

	@Test(dataProvider = "vicky")
	private void tc(String s1, String s2) {
		LibGlobal l = new LibGlobal();
		PojoLogin pl = new PojoLogin();

		WebElement txtuser = pl.getTxtuser();
		l.insert(txtuser, s1);
		WebElement txtpass = pl.getTxtpass();
		l.insert(txtpass, s2);
		WebElement btnlog = pl.getBtnlog();
		l.btnClick(btnlog);

	}

	@DataProvider(name = "vicky")
	private Object[][] tc1() {
		Object obj[][] = new Object[][] { { "vicky", "vicky@123" }, { "maaja", "maja@123" }, { "chida", "chida@123" } };
		return obj;
	}

}
