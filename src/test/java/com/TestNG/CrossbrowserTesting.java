package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Base.BaseClass;

public class CrossbrowserTesting extends BaseClass {

	@Test(priority=0)
	private void chrome() {
		browserLaunch("chrome");
		urlLaunch(driver,"https:///www.google.com");
		int i=10;
		//System.out.println(i/0);
		System.out.println(Thread.currentThread().getId());
	}
	@Test(priority=-2)
	private void fireFox() {
		browserLaunch("Edge");
		urlLaunch(driver,"https:///www.google.com");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void softAssert() {
		String act="raja";
		String exp="ravi";
		SoftAssert as=new SoftAssert();
		as.assertEquals(act, exp);
		System.out.println("verified");
		
	}
	

}
