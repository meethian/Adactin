package com.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceValues.LoginPageElementsInterface;
import com.helper.ConfigReader;

public class BookingConfirmation extends BaseClass implements LoginPageElementsInterface {
	static WebDriver driver;
	
	public BookingConfirmation (WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);}
	
	@FindBy(xpath=Itinerary)
	private WebElement register;
	
	@FindBy(xpath=Logout)
	private WebElement logout;

public void getInformation() {
	//ConfigReader cr=new ConfigReader();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//register.click();
	logout.click();
}
}
