package com.booking.automation.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.bookingPage.ChildBookingPage;

public class ChildBookingTest extends BaseSuperTest {
	
	ChildBookingPage childPage=null;
	
	@BeforeClass
	public void initMethod()throws Exception
	{
	    driver=getWebDriver();
		childPage=new ChildBookingPage(driver);
	}
	
	@Test(priority=1)
	public void newRegistration()
	{
		childPage.clickRegister();
	}
	@Parameters({"email"})
	@Test(priority=2)
	public void enterEmail(String email) throws Exception
	{
		Thread.sleep(2000);
		childPage.txtEmailField(email);
	}
	@Test(priority=3)
	public void btnContinueWithEmail()
	{
		childPage.btnContinueEmail();
	}
	
	@Parameters({"password"})
	@Test(priority=4)
	public void txtNewPasswordRegistration(String password) throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		childPage.txtNewPassword(password);
	}
	
	@Parameters({"confirmPassword"})
	@Test(priority=5)
	public void txtConfirmPasswordRegistration(String confirmPassword)throws Exception
	{
		Thread.sleep(2000);
		childPage.txtConfirmPasswordField(confirmPassword);
	}
	
	@Test(priority=6)
	public void CreateNewAccount()
	{
		childPage.btnCreateNewAccount();
	}
	
	@Test(priority=7)
	public void ClickAndHoldConfirm() throws Exception
	{
		childPage.clickAndHoldRobo();
	}
	/*@Test(priority=1)
	public void searchPlaceToBook()
	{
		childPage.txtSearchPlace();
	}
	
	@Test(priority=2)
	public void checkBookInDate() throws Exception
	{
		Thread.sleep(2000);
		childPage.checkInDate();
	}*/
	

}
