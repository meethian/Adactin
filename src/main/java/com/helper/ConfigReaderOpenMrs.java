package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderOpenMrs {
	FileInputStream fis;
	public Properties ConfigFile() {
	File f =new File("C:\\Users\\HAII\\eclipse-workspace\\maven_testing\\src\\main\\java\\ConfigProperties\\Data.properties");
	try {
	fis=new FileInputStream(f);
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}
		Properties p=new  Properties();
	try {
	p.load(fis);
	}catch(IOException e) {
		e.printStackTrace();
	}
	return p;
    }
	public String getBrowser() throws Throwable {
		
		   String browser=ConfigFile().getProperty("browser");
		   return browser;
	       }	
	public String getUrl() {
		
		   String url=ConfigFile().getProperty("url");
		   return url;
	       }
	public String getUsername()	{
		
		   String username=ConfigFile().getProperty("username");
		   return username;
	       }
	public String getPassword() {
		
	       String password =ConfigFile().getProperty("password");
	       return password;
	       }
	public String getTitle()	{
		
		   String title=ConfigFile().getProperty("title");
		   return title;
	       }
}
