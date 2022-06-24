package com.bookingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SuperBookingPage {
protected WebDriver driver;
public SuperBookingPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
}
