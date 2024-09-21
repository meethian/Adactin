package com.InterfaceValues;
public interface LoginPageElementsInterface {
String user_id="username";
String passcode="password";
String loginbotton="//input[@class='login_button']";//ElementValues

String location="location";
String Hotels="hotels";
String RoomType="(//select[@class='search_combobox'])[3]";
String NoofRooms="room_nos";
String Chkin="datepick_in";
String Chkout="datepick_out";
String Adultsperroom="adult_room";
String Childrenperroom="(//select[@class='search_combobox'])[6]";
String Search="Submit";

String radiobutton ="//input[@type='radio']";
String Continue ="continue";

String Firstname="first_name";
String Lastname="last_name";
String BillingAddress="address";
String CreditCardNum="cc_num";
String CreditCardType="cc_type";
String ExpiryMonth="cc_exp_month";
String ExpiryYear="cc_exp_year";
String CvvNumber="cc_cvv";
String BookNow="book_now";
String Itinerary="(//a[text()='Booked Itinerary'])";
String Logout="(//input[@class='reg_button'])[3]";
}
