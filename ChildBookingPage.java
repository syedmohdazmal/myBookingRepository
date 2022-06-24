package com.bookingPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ChildBookingPage extends SuperBookingPage {
	
	@FindBy(xpath="(//span[@class='bui-button__text'])[4]")
	private WebElement btnRegister;
	
	@FindBy(xpath="//input[@class='scjp7zBZ585APybl866U']")
	private WebElement txtEmail;
	
	@FindBy(xpath="//button[@class='Wm0cMj3qmJ6uOrvNJ_gL vG6MwHiG5509Ezzvohc7 AAQpVL26KBUYrogb1HSX TCYNuP4sieBwLMStmx7l Eb2yn3kPWTu8vaNwgxqw YbrPaJ5QL1sl414mFY64']")
	private WebElement btnContinue;
	
	@FindBy(xpath="//input[@id='new_password']")
	private WebElement txtNewPassword;
	
	@FindBy(xpath="//input[@id='confirmed_password']")
	private WebElement txtConfirmPassword;
	
	@FindBy(xpath="//button[@class='Wm0cMj3qmJ6uOrvNJ_gL vG6MwHiG5509Ezzvohc7 AAQpVL26KBUYrogb1HSX TCYNuP4sieBwLMStmx7l Eb2yn3kPWTu8vaNwgxqw YbrPaJ5QL1sl414mFY64']")
	private WebElement btnCreateAccount;
	
	@FindBy(xpath="//div[@class='bui-spacer--large bui-u-margin-top--24']")
	private WebElement btnClickAndHold;
	
	@FindBy(xpath="//input[@class='c-autocomplete__input sb-searchbox__input sb-destination__input']")
	private WebElement searchPlaceField;
	
	@FindBy(xpath="(//button[@class='d47738b911 fb1847d86a'])[1]")
	private WebElement btnCheckinDate;
	public ChildBookingPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickRegister()
	{
		btnRegister.click();
	}
	
	public void txtEmailField(String email)throws Exception
	{
		Thread.sleep(2000);
		txtEmail.sendKeys(email);
	}
	public void btnContinueEmail()
	{
		btnContinue.click();
	}
	public void txtNewPassword(String password)
	{
		txtNewPassword.sendKeys(password);
	}
	public void txtConfirmPasswordField(String confirmPassword)
	{
		txtConfirmPassword.sendKeys(confirmPassword);
	}
	public void btnCreateNewAccount()
	{
		btnCreateAccount.click();
	}
	public void clickAndHoldRobo()throws Exception {
		Actions actions = new Actions(driver); 
		actions.moveToElement(btnClickAndHold).perform();
		((Actions) btnClickAndHold).clickAndHold();
		Thread.sleep(5000);
		
	}
	/*public void txtSearchPlace()
	{
		searchPlaceField.sendKeys("Hyderabad",Keys.ENTER);
	}
	public void checkInDate()
	{
		btnCheckinDate.click();
	}*/

}
