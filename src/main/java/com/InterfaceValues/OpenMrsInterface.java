package com.InterfaceValues;

public interface OpenMrsInterface {
	    //login
	   String username_id="username";
	   String password_id="password";
	   String location_xpath="//li[text()='Inpatient Ward']";
	   String login_id="loginButton";

		
		//Register a Patient
		//Demographics
		String register_xpath= "//a[normalize-space()='Register a patient']";
		String given_name= "givenName";
		String family_name= "familyName";
		String next_Btn= "button#next-button";
		String gender_name= "gender";
		String day_name= "birthdateDay";
		String month_name= "birthdateMonth";
		String year_name= "birthdateYear";
		//Contact Info
		String address1_id= "address1";
		String address2_id= "address2";
		String city_id= "cityVillage";
		String state_id= "stateProvince";
		String country_id= "country";
		String postal_id= "postalCode";
		String phone_name= "phoneNumber";
		//Relationship
		String reltype_id= "select#relationship_type";
		String person_xpath= "//input[@placeholder='Person Name']";
		//Verification at Confirm page
		String name_xpath= "//p[contains(text(),'Meethian')]";
		String gender_xpath= "//p[text()='Male']";
		String birthdate_xpath= "//p[contains(text(),'02')]";
		String address_xpath= "//p[contains(text(),'1/76 fifth Street')]";
		String phone_xpath= "//p[text()=9952783828]";
		String confirm_id= "submit";
		String age_xpath= "//*[contains(text(),'34 year')]";
		
		//Visit
		String startvisit_xpath="//div[normalize-space()='Start Visit']";
		String confirm_xpath= "//button[@id='start-visit-with-visittype-confirm']";
		String attachments_xpath= "//a[@id='attachments.attachments.visitActions.default']";
		String click_xpath= "//div[contains(text(),'Click or drop')]";
		String textarea_xpath= "//textarea[@placeholder='Enter a caption']";
		String upload_xpath= "//button[text()='Upload file']";
		String toaster_xpath= "//div[@class='toast-container toast-position-top-right']";
		String patient_xpath= "//a[normalize-space()='Meethian Meethi']";
		String attachment_xpath= "//p[text()='Test Attachment']";
		String recentdate_xpath= "//a[@class='ng-binding']";
		String recenttag_xpath= "//div[@class='tag ng-binding ng-scope']";
		String endvisit_xpath= "(//div[@class='col-11 col-lg-10'])[6]";
		String yes_xpath= "(//button[text()='Yes'])[2]";
		
		//VisitAgain
		String capturevitals_xpath= "//a[normalize-space()='Capture Vitals']";
		String height_xpath= "//input[@class='number numeric-range focused']";
		String weight_id= "w10";
		String next_btn1= "//button[@id='next-button']";
		String bmi_xpath= "//*[@id='calculated-bmi']";
		String saveform_xpath= "//a[@id='save-form']";
		String save_btn= "//button[normalize-space()='Save']";
		String endvisit1_xpath= "//a[normalize-space()='End Visit']";
		String yes1_xpath= "(//button[text()='Yes'])[3]";
		String given_xpath= "//a[normalize-space()='Meethian Meethi']";
		
		
		
		
		
		
		
		
		
		
		
	}



