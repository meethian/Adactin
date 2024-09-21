package com.OpenMrsPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceValues.OpenMrsInterface;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginPageOpenMrs extends BaseClass implements OpenMrsInterface {
	@FindBy(id =username_id)
	private WebElement username;
	
	@FindBy (id=password_id)
	private WebElement password;
	
	@FindBy (xpath=location_xpath)
	private WebElement location;
	
	@FindBy (id=login_id)
	private WebElement login;
	
	public LoginPageOpenMrs() {
		PageFactory.initElements(driver,this);
	}
public boolean validLogin(ExtentTest extenttest) throws Throwable {
	try {
		urlLaunch(driver,Frm.getInstancefrm().getInstanceConfigReaderOpenMrs().getUrl());
		inputValues(driver,username,Frm.getInstancefrm().getInstanceConfigReaderOpenMrs().getUsername());
		inputValues(driver,password,Frm.getInstancefrm().getInstanceConfigReaderOpenMrs().getPassword());
		clickElement(driver,location);
		clickElement(driver,login);
		validation(driver,Frm.getInstancefrm().getInstanceConfigReaderOpenMrs().getTitle());
		extenttest.log(Status.PASS,"Login Sucessful");
		extenttest.log(Status.FAIL,"Login Failed");
		 return false;
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
return true;
	
}
	
	
	
	
	
}
