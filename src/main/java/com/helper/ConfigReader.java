package com.helper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	FileInputStream fis;
	Properties pro;
	
private Properties getConfigFileValues() {
	File file =new File("C:\\Users\\HAII\\eclipse-workspace\\maven_testing\\src\\main\\java\\ConfigProperties\\Config.properties ");
		try {
		fis=new FileInputStream(file);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			pro=new  Properties();
		try {
		pro.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return pro;
        }

public String getbrowserName() throws Throwable {
	
	   String browserName=getConfigFileValues().getProperty("browser");
	   return browserName;
       }	
public String getUrl() {
	
	   String url=getConfigFileValues().getProperty("url");
	   return url;
       }
public String getUserName()	{
	
	   String username=getConfigFileValues().getProperty("username");
	   return username;
       }
public String getpasword() {
	
       String password =getConfigFileValues().getProperty("Password");
       return password;
       }
public String getlocation()	{
	
	   String place=getConfigFileValues().getProperty("location");
	   return place;
       }
public String gethotels()	{
	
	   String hotel =getConfigFileValues().getProperty("Hotels");
	   return hotel;
       }
public String getroomtype()	{
	
	   String typeofroom=getConfigFileValues().getProperty("RoomType");
	   return typeofroom;
       }
public String getnumofrooms() {
	   String numofroom=getConfigFileValues().getProperty("NoofRoom");
	   return numofroom;
       }
public String getcheckin()	{
	
	   String entry=getConfigFileValues().getProperty("Chekin");
	   return entry;
       }
public String getcheckout()	{
	
	   String Adultroom=getConfigFileValues().getProperty("Adultsperroom");
	   return Adultroom;
       }
public String getadultroom() {
	   String Adultroom=getConfigFileValues().getProperty("Adultsperroom");
	   return Adultroom;
       }
public String getchildroom()	{
	   String childrenroom=getConfigFileValues().getProperty("Childrenroom");
	   return childrenroom;
       }
public String getFirstName() {
	  String firstname=getConfigFileValues().getProperty("FirstName");
	  return firstname;
      }
public String getlastname() {
	  String lastname=getConfigFileValues().getProperty("LastName");
	  return lastname;
      }
public String getBillingAddress() {
	  String Address=getConfigFileValues().getProperty("BillingAddress");
	  return Address;
      }
public String getCreditNumber() {
	  String CNumber=getConfigFileValues().getProperty("CreditCardNo");
	  return CNumber;
     }
public String getCreditType() {
	  String CardType=getConfigFileValues().getProperty("CreditCardType");
	  return CardType;
      }
public String getMonthExpiry() {
	 String Mexpiry=getConfigFileValues().getProperty("ExpiryMonth");
	 return Mexpiry;
     }
public String getYearExpiry() {
	 String YExpiry=getConfigFileValues().getProperty("ExpiryYear");
	 return YExpiry;
     }
public String getCvvNumber() {
	 String NumberofCVV=getConfigFileValues().getProperty("CvvNumber");
	 return NumberofCVV;
     }

}




