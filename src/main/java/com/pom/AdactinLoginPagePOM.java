package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceValues.LoginPageElementsInterface;
import com.helper.ConfigReader;

public class AdactinLoginPagePOM extends BaseClass implements LoginPageElementsInterface {
	static WebDriver driver;
	
public AdactinLoginPagePOM(WebDriver driver) {
    this.driver=driver;
	PageFactory.initElements(driver, this);}
		
@FindBy(id=user_id)
    private WebElement uid;
   // public WebElement getuid() {
	//return uid;}
@FindBy(name=passcode)
    private WebElement psswrd;
   // public WebElement getpsswrd() {
	//return psswrd;}
@FindBy(xpath=loginbotton)
    private WebElement loginbtn;
   // public WebElement getloginbtn() {
  //  return loginbtn;}
public void getElementValues() throws Throwable {
	ConfigReader cr=new ConfigReader();
	inputValues(driver,uid,cr.getUserName());
	inputValues(driver,psswrd,cr.getpasword());
	clickElement(driver,loginbtn);
}
}

