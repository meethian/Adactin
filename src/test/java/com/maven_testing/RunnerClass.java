package com.maven_testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Manager.PageObjectManager_1;
import com.helper.ConfigReader;
import com.pom.AdactinLoginPagePOM;
import com.pom.AdactinSearchHotelsPOM;
import com.pom.AmazLogin;
import com.pom.BookHotel;
import com.pom.BookingConfirmation;
import com.pom.SelectHotel;

public class RunnerClass extends BaseClass {
//public static void main(String[] args) throws Throwable {
//browserLaunch("chrome");
/*urlLaunch("https://www.amazon.in/");	
takeScreenshot(driver, "screenshot_1", "png");
navigateTo("https://www.amazon.in/");	
navigateMethods("Back");
isDisplayed(driver, null)	;
isSelected(driver, null);*/
	
	@BeforeTest
	public void setUp() {
		browserLaunch("chrome");
	}
	@Test
	public static void validLoginTest() throws Throwable {
		AmazLogin az=new AmazLogin(driver);
		//az.validLogin();
		//az.InvalidEmail();
		//az.emailEmpty();
		//az.passwordError();
		az.passwordEmpty();
	}
	
}
	/*PageObjectManager_1 pom =new PageObjectManager_1();
	
	browserLaunch(pom.getConfigpagemanager().getbrowserName());
	urlLaunch(driver, pom.getConfigpagemanager().getUrl());
	
	pom.getAdactinpagemanager().getElementValues();
	pom.getAdactinSearchpagemanager().getDatas();
	pom.getSelectpagemanager().getValue();
	pom.getBookhotelpagemanager().getWebDatas();
	pom.getConfirmationpagemanager().getInformation();*/
	
//ConfigReader cr=new ConfigReader();
/*AdactinLoginPagePOM a1=new AdactinLoginPagePOM(driver);
a1.getElementValues();
AdactinSearchHotelsPOM a2=new AdactinSearchHotelsPOM(driver);
a2.getDatas();
SelectHotel sh=new SelectHotel(driver);
sh.getValue();
BookHotel bh=new BookHotel(driver);
bh.getWebDatas();
BookingConfirmation bc=new BookingConfirmation(driver);
bc.getInformation();*/




/*inputValues(driver,a1.getuid(),cr.getUserName());
inputValues(driver,a1.getpsswrd(),cr.getpasword());
clickElement(driver,a1.getloginbtn());
inputValues(driver,a2.getplace(),cr.getlocation());
inputValues(driver,a2.gethotel(),cr.gethotels());
inputValues(driver,a2.getTypeofRoom(),cr.gethotels());
inputValues(driver,a2.getnumofRooms(),cr.getnumofrooms());
inputValues(driver,a2.getcheckin(),cr.getcheckin());
inputValues(driver,a2.getcheckout(),cr.getcheckout());
inputValues(driver,a2.getadultrooms(),cr.getadultroom());
inputValues(driver,a2.getchildperroom(),cr.getchildroom());
clickElement(driver,a2.getSearchbtn());*/
//}}

