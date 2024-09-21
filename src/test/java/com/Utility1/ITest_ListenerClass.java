package com.Utility1;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.Base.BaseClass;
import com.aventstack.extentreports.MediaEntityBuilder;

public class ITest_ListenerClass extends BaseClass implements ITestListener {
	
	public String testName;
	public String methodName;
	
	
	        @Override
			public void onTestStart(ITestResult result) {
			
			}

			@Override
			public void onTestSuccess(ITestResult result) {
				try {
					ExtentReport_Test.extenttest.pass(result.getMethod() + " : " + "Test Pass",
							MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			
		    }
			@Override
			public void onTestFailure(ITestResult result) {
				try {
					ExtentReport_Test.extenttest.fail(result.getMethod() + " : " + "Test Fail",
							MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
				} catch (IOException e) {
					e.printStackTrace();
				}
				}

			@Override
			public void onTestSkipped(ITestResult result) {
			}

			@Override
			public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			}

			@Override
			public void onStart(ITestContext context) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onFinish(ITestContext context) {
				// TODO Auto-generated method stub
				
			}

}