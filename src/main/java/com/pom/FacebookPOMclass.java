package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
public class FacebookPOMclass extends BaseClass {
	static WebDriver driver;	
@FindBy(id="email")
private WebElement email;

public WebElement getEmail() {
	return email;
}
public void setEmail(WebElement email) {
	this.email = email;
}
public WebElement getPassword() {
	return password;
}
public void setPassword(WebElement password) {
	this.password = password;
}
public WebElement getLoginbtn() {
	return loginbtn;
}
public void setLoginbtn(WebElement loginbtn) {
	this.loginbtn = loginbtn;
}

public WebElement getForgottenpassword() {
	return forgottenpassword;
}

public void setForgottenpassword(WebElement forgottenpassword) {
	this.forgottenpassword = forgottenpassword;
}

public WebElement getCreateaccount() {
	return Createaccount;
}

public void setCreateaccount(WebElement createaccount) {
	Createaccount = createaccount;
}

@FindBy(name="pass")
private WebElement password;

@FindBy(id="login")
private WebElement loginbtn;

@FindBy(xpath="//a[text()='Forgotten password?']")
private WebElement forgottenpassword;

@FindBy(xpath="//a[@role='role']")
private WebElement Createaccount;

public FacebookPOMclass (WebDriver driver) {
	this.driver=driver; //constructor
	PageFactory.initElements(driver, this);}


/*public WebElement getmail() {
	return email;}
	
public WebElement getpassword() {
	return password;}

public WebElement getloginbutton() {
		return loginbtn;}*/
		


}
