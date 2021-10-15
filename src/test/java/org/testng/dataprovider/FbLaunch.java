package org.testng.dataprovider;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FbLaunch {
	@BeforeClass
	private void beforeClass() {
		LibGlobal l = new LibGlobal();
		l.webDriverManager();
	}

	@Test(dataProvider = "vicky", dataProviderClass = FbLogin.class)
	private void tc2(String s1, String s2) {
		LibGlobal l = new LibGlobal();
		PojoLogin pl = new PojoLogin();

		l.insert(pl.getTxtuser(), s1);

		l.insert(pl.getTxtpass(), s2);

		l.btnClick(pl.getBtnlog());

	}
}
