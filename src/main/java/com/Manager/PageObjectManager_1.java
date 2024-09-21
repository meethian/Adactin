package com.Manager;

import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;
import com.helper.ConfigReader;
import com.pom.AdactinLoginPagePOM;
import com.pom.AdactinSearchHotelsPOM;
import com.pom.BookHotel;
import com.pom.BookingConfirmation;
import com.pom.SelectHotel;

public class PageObjectManager_1 extends BaseClass {
	
 private AdactinLoginPagePOM login;
 private AdactinSearchHotelsPOM searchHotel;
 private SelectHotel HotelSearch;
 private BookHotel HotelBook;
 private BookingConfirmation Confirmation;
 private ConfigReader config;
 
public AdactinLoginPagePOM getAdactinpagemanager(){
	if (login==null) {
		login=new AdactinLoginPagePOM(driver);
	}
	return login;
	}
public AdactinSearchHotelsPOM getAdactinSearchpagemanager() {
	if (searchHotel==null) {
		searchHotel=new AdactinSearchHotelsPOM(driver);
	}
	return searchHotel;
    }
public SelectHotel getSelectpagemanager() {
	if(HotelSearch==null) {
		HotelSearch=new SelectHotel(driver);
	}
	return HotelSearch;
    }
public BookHotel getBookhotelpagemanager() throws Throwable {
	if(HotelBook==null)
		try {
			{
				HotelBook=new BookHotel(driver);
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	return HotelBook;
    }
public BookingConfirmation getConfirmationpagemanager() {
	if(Confirmation==null) {
		Confirmation=new BookingConfirmation(driver);
	}
	return Confirmation;
    }
public ConfigReader getConfigpagemanager() {
	if(config==null) {
		config=new ConfigReader();
	}
	return config;
}
}













