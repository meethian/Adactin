package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.IDynamicGraph.Status;

import com.Base.BaseClass;
import com.aventstack.extentreports.ExtentTest;

public class AmazLogin extends BaseClass {
	public WebDriver driver;
	
public AmazLogin(WebDriver driver) {
	    this.driver=driver;
		PageFactory.initElements(driver, this);}
	
@FindBy (id="nav-link-accountList")
private WebElement signinbtn;

@FindBy(xpath="//input[@type='email']")
private WebElement emailid;

@FindBy(xpath="//input[@type='submit']")
private WebElement continueBtn;

@FindBy(xpath="//input[@type='password']")
private WebElement password;

@FindBy(id="signInSubmit")
private WebElement signinbtn1;

@FindBy(xpath="//div[contains(text(),'Enter a valid email address or phone number')]")
private WebElement emailError;

@FindBy(xpath="//div[contains(text(),'  Enter your email or mobile phone number')]")
private WebElement emptyEmail;

@FindBy(xpath="//*[contains(text(),'Your password is incorrect')]")
private WebElement passwordError;

@FindBy(xpath="//div[contains(text(),'Enter your']")
private WebElement emilPassword;

public boolean validLogin(ExtentTest extenttest) throws Throwable {
    
		try {
			urlLaunch(driver,"https://www.amazon.in/");
			clickElement(driver,signinbtn);
			inputValues(driver,emailid,"pradeep21.05.1996@gmail.com");
			clickElement(driver,continueBtn);
			inputValues(driver,password,"Pradeep@123");
			clickElement(driver,signinbtn1);
			String title=driver.getTitle();
			Assert.assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
			extenttest.log(com.aventstack.extentreports.Status.PASS,"Login Sucessfull");
		} catch (Throwable e) {
			extenttest.log(com.aventstack.extentreports.Status.FAIL,"Login failed :"+e.getMessage());
			return false;
		}
		return true;
}	

public void InvalidEmail() throws Throwable {
	urlLaunch(driver,"https://www.amazon.in/");
    clickElement(driver,signinbtn);
    inputValues(driver,emailid,"pradeep21.05.1996@gmail");
    clickElement(driver,continueBtn);
	String actual=emailError.getText();
	Assert.assertEquals(actual,"Enter a valid email address or phone number");
}
public void emailEmpty() throws Throwable {
	urlLaunch(driver,"https://www.amazon.in/");
    clickElement(driver,signinbtn);
    inputValues(driver,emailid,"");
    clickElement(driver,continueBtn);
    String emlEmpty=emptyEmail.getText();
    Assert.assertEquals(emlEmpty,"Enter your email or mobile phone number");
}
public void passwordError() throws Throwable {
	urlLaunch(driver,"https://www.amazon.in/");
    clickElement(driver,signinbtn);
    inputValues(driver,emailid,"pradeep21.05.1996@gmail.com");
    clickElement(driver,continueBtn);
    inputValues(driver,password,"fjthkkiutdfvvh");
    clickElement(driver,signinbtn1);
    String pwdError=passwordError.getText();
    Assert.assertEquals(pwdError,"Your password is incorrect");
}
public void passwordEmpty() throws Throwable {
	urlLaunch(driver,"https://www.amazon.in/");
    clickElement(driver,signinbtn);
    inputValues(driver,emailid,"pradeep21.05.1996@gmail.com");
    clickElement(driver,continueBtn);
    inputValues(driver,password,"");
    clickElement(driver,signinbtn1);
    String pwdEmpty=passwordError.getText();
    Assert.assertEquals(pwdEmpty,"Enter your password");
}







}