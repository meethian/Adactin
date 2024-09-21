package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceValues.LoginPageElementsInterface;
import com.helper.ConfigReader;
public class AdactinSearchHotelsPOM extends BaseClass implements LoginPageElementsInterface {
	static WebDriver driver;	
public AdactinSearchHotelsPOM(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);}
@FindBy(id=location)
private WebElement place;
//public WebElement getplace() {
//	return place;}
@FindBy(name=Hotels)
private WebElement hotel;
//public WebElement gethotel() {
//return hotel;}
@FindBy(xpath=RoomType)
private WebElement TypeofRoom;
//public WebElement getTypeofRoom() {
//return TypeofRoom;}
@FindBy(id=NoofRooms)
private WebElement numofRooms;
//public WebElement getnumofRooms() {
//return numofRooms;}
@FindBy(id=Chkin)
private WebElement checkin;
//public WebElement getcheckin() {
//return checkin;}
@FindBy(name=Chkout)
private WebElement checkout;
//public WebElement getcheckout() {
//return checkout;}
@FindBy(id=Adultsperroom)
private WebElement adultrooms;
//public WebElement getadultrooms() {
//return adultrooms;}
@FindBy(id=Childrenperroom)
private WebElement childperroom;
//public WebElement getchildperroom() {
//return childperroom;}
@FindBy(id=Search)
private WebElement Searchbtn;
//public WebElement getSearchbtn() {
//return Searchbtn;}
public void getDatas() throws Throwable {
	ConfigReader cr=new ConfigReader();
	inputValues(driver,place,cr.getlocation());
	inputValues(driver,hotel,cr.gethotels());
	inputValues(driver,TypeofRoom,cr.getroomtype());
	inputValues(driver,numofRooms,cr.getnumofrooms());
	inputValues(driver,checkin,cr.getcheckin());
	inputValues(driver,checkout,cr.getcheckout());
	inputValues(driver,adultrooms,cr.getadultroom());
	inputValues(driver,childperroom,cr.getchildroom());
	clickElement(driver,Searchbtn);
}











}

