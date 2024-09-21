package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceValues.LoginPageElementsInterface;
import com.helper.ConfigReader;

public class BookHotel extends BaseClass implements LoginPageElementsInterface {	
 static WebDriver driver;	
public BookHotel(WebDriver driver)throws Throwable {
			this.driver=driver;
			PageFactory.initElements(driver, this);}

@FindBy(id=Firstname)
private WebElement Frstm;
@FindBy(id=Lastname)
private WebElement lstnm;
@FindBy(id=BillingAddress)
private WebElement BlngAdd;
@FindBy(id=CreditCardNum)
private WebElement Ccn;
@FindBy(id=CreditCardType)
private WebElement Cct;
@FindBy(name=ExpiryMonth)
private WebElement Em;
@FindBy(id=ExpiryYear)
private WebElement Ey;
@FindBy(id=CvvNumber)
private WebElement Cvvnum;
@FindBy(id=BookNow)
private WebElement Bknow;
public void getWebDatas() throws Throwable {
	ConfigReader cr=new ConfigReader();
	inputValues(driver,Frstm,cr.getFirstName());
	inputValues(driver,lstnm,cr.getlastname());
	inputValues(driver,BlngAdd,cr.getBillingAddress());
	inputValues(driver,Ccn,cr.getCreditNumber());
	inputValues(driver,Cct,cr.getCreditType());
	inputValues(driver,Em,cr.getMonthExpiry());
	inputValues(driver,Ey,cr.getYearExpiry());
	inputValues(driver,Cvvnum,cr.getCvvNumber());
	Bknow.click();;
}}

