package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceValues.LoginPageElementsInterface;
import com.helper.ConfigReader;

public class SelectHotel extends BaseClass implements LoginPageElementsInterface {
	
	static WebDriver driver;
	
	public SelectHotel(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);}
	
	@FindBy(xpath=radiobutton)
	private WebElement radiobtn;

	@FindBy(id=Continue)
	private WebElement Continuebtn;

public void getValue()	{
	clickElement(driver,radiobtn);
	clickElement(driver,Continuebtn);
}
}
