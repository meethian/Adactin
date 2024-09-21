package com.Utility1;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

import com.Base.BaseClass;
import com.aventstack.extentreports.ExtentTest;

public class ExtentReport_Test {
	public static ExtentTest extenttest;
	public void extentReportstartUp() {
		BaseClass base =new BaseClass();
		base.extentReportStart(null);
		}
@AfterSuite
public void extentReportEnd()throws IOException {
	BaseClass base=new BaseClass();
	base.extentReportTearDown(null);
}

}
