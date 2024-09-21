package com.Base;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.codec.net.BCodec;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	public static WebDriver driver;
	public static File file;
    static	FileInputStream fis;
    static	Properties pro;
    public static ExtentReports extentReports;
    
protected static void browserLaunch(String browserName)	{//1

	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--ignore-certificate-errors");
	opt.addArguments("chrome.switches", "--disable-extensions");
	opt.addArguments("--disable-notifications");
	opt.addArguments("enable-automation");
	opt.addArguments("--start-maximized");//chrome option methods
	opt.addArguments("--disable-extensions");
	opt.addArguments("--disable--popup-blocking");
	try {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		} else { System.out.println("invalid");}
		    driver.manage().window().maximize();
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

protected static void urlLaunch(WebDriver driver,String url) {//2
	    try {
	    	
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
protected static void browserTerminate() {//3
	try {
		driver.quit();
	} catch (Exception e) {
		e.printStackTrace();
	}
}                                                         //4
protected static void inputValues(WebDriver driver,WebElement element,String value)throws Throwable{
	try {element.sendKeys(value);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
protected static void clickElement(WebDriver driver,WebElement element) {//5
	element.click();
}                                                             //6
protected static void takeScreenshotNew(WebDriver driver,String fileName,String format)throws Throwable{
	try {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination =new File 
		("C:\\Users\\HAII\\eclipse-workspace\\maven_testing\\screenshot"+"\\"+fileName+"."+format);
        FileHandler.copy(source, destination);
	} catch (WebDriverException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}}
protected static void navigateTo(WebDriver driver,String navigateUrl) {  //7
	driver.navigate().to(navigateUrl);
    }
protected static void navigateBack() {     //8
	driver.navigate().back();
    }
protected static void navigateMethods(WebDriver driver,String navigateMethod) {//9
	try {
		if (navigateMethod.equalsIgnoreCase("Back")) {
		driver.navigate().back();
		}else if (navigateMethod.equalsIgnoreCase("Forward")) {
		driver.navigate().forward();
		}else if (navigateMethod.equalsIgnoreCase("refresh")) {
		driver.navigate().refresh();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
protected static void implicitWait(WebDriver driver)	{//10
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
protected static void explicitWait(WebDriver driver,WebElement element) {//11
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}}  
protected static void getTitle(WebDriver driver) {//12
	String title =driver.getTitle();
	System.out.println("Title is:"+title);
    }
protected static void getText(WebDriver driver, WebElement element) {//13
	String text=element.getText();
	System.out.println(text);
   }
protected static void alert(WebDriver driver,String type) {//14
try {
	driver.switchTo().alert();
	if(type.equalsIgnoreCase("accept")) {
		driver.switchTo().alert().accept();
	}else if(type.equalsIgnoreCase("dismiss")) {
		driver.switchTo().alert().dismiss();
	}
    } catch (Exception e) {
	e.printStackTrace();
    }}

protected static void isEnabled(WebDriver driver,WebElement element){//15
	try {
		if(element.isEnabled()) {
			System.out.println("enabled");}
			else {System.out.println("not enabled");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}}
protected static void isDisplayed(WebDriver driver, WebElement element)	{//16
	try {
		if(element.isDisplayed()) {
			System.out.println("displayed");}
			else {System.out.println("not displayed");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}}
   
protected static void isSelected(WebDriver driver, WebElement element)	{//17
	try {
		if(element.isSelected())           {
			System.out.println("selected");}
			else {System.out.println("not selected");
		         }
	    } catch (Exception e) {
		e.printStackTrace();
	}	}

protected static void dropDown(WebDriver driver,WebElement element,String value,String options,int index) {//18
try {
	Select select =new Select(element);
	if (options.equalsIgnoreCase("value")) {
		select.selectByValue(value);
	}else if(options.equalsIgnoreCase("index")) {
		select.selectByIndex(index);
	}else if(options.equalsIgnoreCase("text"));{
		select.selectByVisibleText(value);}
} catch (Exception e) {
	e.printStackTrace();
}}                                                                                        //19
protected static void executeScript(WebDriver driver,String actionType, By elementLocator, String ...Value) {
try {
	JavascriptExecutor jsExecutor=(JavascriptExecutor)	driver;
	WebElement element =null;
	if (elementLocator.equals(jsExecutor)) {
		element =driver.findElement(elementLocator);}
	else if (elementLocator.equals(jsExecutor)) {
		element=driver.findElement(elementLocator);
	}
    } catch (Exception e) {
	e.printStackTrace();
    }}                                                     //20
/*protected static void keyBoard(WebDriver driver,String type) {
	Robot r=(Robot) driver;
	if (type.equalsIgnoreCase("pressEnterKey")) {
		r.keyPress(KeyEvent.VK_ENTER);
	}
	else if (type.equalsIgnoreCase("pressUpKey")) {
		r.keyPress(KeyEvent.VK_ENTER);
	}
	else if(type.equalsIgnoreCase("delay")) {
		r.delay(2000);
	}
	else if (type.equalsIgnoreCase("pressDownKey")) {
		r.keyPress(KeyEvent.VK_ENTER);
	}}*/

public static void stringSelection(String path) {
	StringSelection ss=new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
}


public static void robotKeys(WebDriver driver,String options) {
	try {
		Robot r=new Robot();
		if(options.equalsIgnoreCase("delay")) {
			r.delay(2000);
		}else if(options.equalsIgnoreCase("ControlVP")) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
		}else if(options.equalsIgnoreCase("ControlVR")) {
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
		}else if(options.equalsIgnoreCase("EnterP")) {
			r.keyPress(KeyEvent.VK_ENTER);
		}else if(options.equalsIgnoreCase("EnterR")) {
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		
	} catch (AWTException e) {
		e.printStackTrace();
	}
}

	
protected static void action (WebElement element,String type,String value) {//21
	try {
		    Actions ac=new Actions(driver);
		if (type.equalsIgnoreCase("contextClick")) {
			ac.contextClick(element).build().perform();
		}else if (type.equalsIgnoreCase("doubleClick")) {
			ac.doubleClick(element).build().perform();
		}else if (type.equalsIgnoreCase("moveToElement")) {
		    ac.moveToElement(element).build().perform();
	    }else if (type.equalsIgnoreCase("clickAndHold")) {
			ac.clickAndHold(element).build().perform();
		}
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}}                                                //22
protected void dragAndDrop(WebElement sourceElement, WebElement placedElement) {
	try {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(sourceElement, placedElement);
	} catch (Exception e) {

		e.printStackTrace();
	}
}
protected static void browserClose(WebDriver driver) {//23
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	}

protected static void windowsHandling(WebDriver driver,String wId) {//24
	try {
		Set<String> AllId = driver.getWindowHandles();
		for (String id : AllId) {
			{
				if (!(id == wId))
					driver.switchTo().window(id); 
				// Switch to the desired window first and then execute commands using
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}	
protected static void switchToDefault(WebDriver driver) {//25

	try {
		driver.switchTo().defaultContent();
	} catch (Exception e) {
		e.printStackTrace();
	}
}	
protected static void switchToFrameUsingElement(WebDriver driver,String option, WebElement element) {//26

	try {
		if (option.equals("element")) {
			driver.switchTo().frame(element);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}}
protected static void switchToFrameUsingName(WebDriver driver,String option, String Framename) {//27

	try {
		if (option.equals("name")) {
			driver.switchTo().frame(Framename);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}}
protected static void switchToFrameUsingId(WebDriver driver, String option, int index) {//28

	try {
		if (option.equals("id")) {
			driver.switchTo().frame(index);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}}
protected void confirmAlert(WebDriver driver,WebElement element, String condition) {//29
	try {
		Alert confirmAlert = driver.switchTo().alert();
		if (condition.equalsIgnoreCase("accept")) {
			confirmAlert.accept();
			driver.switchTo().defaultContent();
		} else if (condition.equalsIgnoreCase("dismiss")) {
			confirmAlert.dismiss();
			driver.switchTo().defaultContent();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}}
protected void simpleAlert(WebDriver driver,WebElement element) {//30
	try {
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		driver.switchTo().defaultContent();
	} catch (Exception e) {

		e.printStackTrace();
	}}
protected  void scrollToTopOfThePage(WebDriver driver) {//31
	try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	} catch (Exception e) {

		e.printStackTrace();
		throw new RuntimeException();
	}}
protected void scrollToBottomOfthePage(WebDriver driver) {  //32
	try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	} catch (Exception e) {

		e.printStackTrace();
	}}
protected void scrollUsingElement(WebDriver driver,WebElement element, String option) { //33
	try {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0], scrollIntoView();", element);
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
	}}
protected void scrollDown(WebDriver driver) { //34
	try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
protected static String CurrentURL(WebDriver driver) { //35
			String url = driver.getCurrentUrl();
			System.out.println(url);
			return url;
		}
protected static Properties readPropertyFile(WebDriver driver,String Location) { //36
			try {
				fis = new FileInputStream(Location);
				pro = new Properties();
				pro.load(fis);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return pro;
             }
public static void extentReportStart(String location) { //37
	try {
		extentReports= new ExtentReports();
		file=new File(location);
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		extentReports.setSystemInfo("OS", System.getProperty("OS.name"));
		extentReports.setSystemInfo("Java Version",System.getProperty("jaya.version"));
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
public static void extentReportTearDown(String location) throws IOException { //38
	try {
		extentReports.flush();
		file=new File(location);
		Desktop.getDesktop().browse((file).toURI());
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public String takeScreenshot() throws IOException {
	TakesScreenshot screenshot = (TakesScreenshot) driver;
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
	File destfile = new File("Screenshort\\.png" + "_" + timeStamp + ".png");
	FileUtils.copyFile(scrfile, destfile);
	return destfile.getAbsolutePath();
}
/*public String takeScreenshot () throws IOException { //39
	TakesScreenshot screenshot=(TakesScreenshot) driver;
	String timeStamp =new SimpleDateFormat ("yyyyMMdd_HHmmss").format(new Date());
	File source=screenshot.getScreenshotAs(OutputType.FILE);
	File destination =new File("Screenshort\\.png"+"_"+timeStamp+".png");
	FileUtils.copyFile(source, destination);
	return destination.getAbsolutePath();
	
}*/
public static void validation(WebDriver act,String ect) {  //40
	Assert.assertEquals(act.getTitle(),ect);
}


}

	
	





