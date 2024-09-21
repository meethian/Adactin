package com.maven_testing;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Base.BaseClass;
import com.Utility1.ExtentReport_Test;
import com.Utility1.ITest_ListenerClass;
import com.pom.AmazLogin;

@Listeners(ITest_ListenerClass.class)
public class AmazonRunnerClass extends BaseClass {
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		browserLaunch("chrome");
	}
	@Test(priority=-2)
	public static void validLoginTest() throws Throwable {
		ExtentReport_Test.extenttest=extentReports.createTest("Login Test"+":"+Thread
				.currentThread().getStackTrace()[1].getMethodName().toString()).info("Valid Email Id and Valid Password");
		
		AmazLogin az=new AmazLogin(driver);
		//az.validLogin();
		Assert.assertTrue(az.validLogin(ExtentReport_Test.extenttest));
	}
@Test(priority=-3)
public static void InvalidMail() throws Throwable {
	ExtentReport_Test.extenttest=extentReports.createTest("Login Test"+":"+Thread
			.currentThread().getStackTrace()[1].getMethodName().toString()).info("Invalid Email Id");
	
	AmazLogin az=new AmazLogin(driver);
	az.InvalidEmail();
}
@AfterTest
public static void termination() {
	browserTerminate();
}
@BeforeSuite
private void extendStartup() {
	extentReportStart("Users\\HAII\\eclipse-workspace\\maven_testing\\Reports");
}

@AfterSuite
private void ExtendReportEnd() throws IOException{
	try {
		extentReportTearDown("Users\\HAII\\eclipse-workspace\\maven_testing\\Reports");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}
}
