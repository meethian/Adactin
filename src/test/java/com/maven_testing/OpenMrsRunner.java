package com.maven_testing;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.OpenMrsPom.Frm;
import com.OpenMrsPom.LoginPageOpenMrs;
import com.Utility1.ExtentReport_Test;
import com.Utility1.ITest_ListenerClass;

@Listeners(ITest_ListenerClass.class)
public class OpenMrsRunner extends BaseClass {
@BeforeTest
public static void setUp() throws Throwable {
browserLaunch(Frm.getInstancefrm().getInstanceConfigReaderOpenMrs().getBrowser());
}
@Test
public void validLoginTest() throws Throwable {
ExtentReport_Test.extenttest=extentReports.createTest("Login Test"+"+"+Thread
		.currentThread().getStackTrace()[1].getMethodName().toString()).info("Valid Email Id and Valid Password");
LoginPageOpenMrs lp=new LoginPageOpenMrs();
Assert.assertFalse(lp.validLogin(ExtentReport_Test.extenttest));
}
@AfterTest
public static void termination() {
	browserTerminate();
}
@BeforeSuite
private void extendStartup() {
extentReportStart("C:\\Users\\HAII\\eclipse-workspace\\maven_testing\\Reports");	
}
@AfterSuite
private void ExtendReportEnd() throws IOException {
extentReportTearDown("C:\\\\Users\\\\HAII\\\\eclipse-workspace\\\\maven_testing\\Reports//index.html");
}







}
