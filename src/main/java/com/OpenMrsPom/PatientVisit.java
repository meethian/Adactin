package com.OpenMrsPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceValues.OpenMrsInterface;

public class PatientVisit extends BaseClass implements OpenMrsInterface{
	public PatientVisit() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=startvisit_xpath)
	private WebElement startVisit;
	
	@FindBy(xpath=confirm_xpath)
	private WebElement confirm;
	
	@FindBy(xpath=attachments_xpath)
	private WebElement attachments;
	
	@FindBy(xpath=click_xpath)
	private WebElement click;
	
	@FindBy(xpath=textarea_xpath)
	private WebElement textArea;
	
	@FindBy(xpath=upload_xpath)
	private WebElement upload;
	
	@FindBy(xpath=patient_xpath)
	private WebElement patient;
	
	@FindBy(xpath=attachment_xpath)
	private WebElement attachment;
	
	@FindBy(xpath=recentdate_xpath)
	private WebElement date;
	
	@FindBy(xpath=recenttag_xpath)
	private WebElement tag;	
	
	@FindBy(xpath=endvisit_xpath)
	private WebElement endVisit;	
	
	@FindBy(xpath=yes_xpath)
	private WebElement yes;	
	
	public void startVisit() {
		implicitWait(driver);
		clickElement(driver, startVisit);
		clickElement(driver, confirm);
		clickElement(driver, attachments);
		clickElement(driver, click);
		robotKeys(driver,"delay");
		stringSelection("C:\\Users\\tmsma\\OneDrive\\Documents\\Maven POM");
		robotKeys(driver,"ControlVP");
		robotKeys(driver,"ControlVR");
		robotKeys(driver,"EnterP");
		robotKeys(driver,"EnterR");
		inputData(driver, textArea, Frm.getInstancefrm().getInstanceConfigReader().getTextArea());
		explicitWait(driver, upload);
		clickElement(driver, upload);
		clickElement(driver, patient);
		validation(attachment, Frm.getInstancefrm().getInstanceConfigReader().getAttachment());
		validation(date, Frm.getInstancefrm().getInstanceConfigReader().getRecentDate());
		validation(tag, Frm.getInstancefrm().getInstanceConfigReader().getRecentTag());
		explicitWait(driver, endVisit);
		clickElement(driver, endVisit);
		clickElement(driver, yes);
	}
	
}


