package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {

	@BeforeSuite
	private void propertySetting() {
		System.out.println("Property Setting");
	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser launch");
	}
	@BeforeClass
	private void urlLaunch() {
	System.out.println("Url launch");	
	}
	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}
@Test
	private void men () {
		System.out.println("men");
	}
	@Test
	private void women () {
		System.out.println("women");
	}
	@Test
	private void child() {
		System.out.println("child");
	}
	@AfterMethod
	
	private void logout() {
		System.out.println("logout");
	}
	@AfterClass
	private void screenShot() {
		System.out.println("screen");
	}
	@AfterTest
	private void close() {
		System.out.println("close");
	}
@AfterSuite
private void terminate() {
	System.out.println("terminate");
}
	
}
