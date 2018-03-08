package com.jenkins.pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.log4testng.Logger;

public class SignIn {
	
	WebDriver driver;
	

	
	//All the WebElements or Objects of the Sing In Page 
	
	//WebElement signIn=driver.findElement(By.xpath(""));
	
	By forgotEmailId=By.xpath("//*[@id='login_form']/div/p[1]/a");
	By enterEmainIdToRetrieve=By.xpath("//*[@id='email']");
	By retrieveEmailIdButton=By.xpath("//*[@id='form_forgotpassword']/fieldset/p/button/span");
	By confirmationMessage=By.xpath("//*[@id='center_column']/div/p");
	By errorMessageToRetriveEmailId=By.xpath("//*[@id='center_column']/div/div");
	
	By signIn= By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
	By allReadyRegemailAddress=By.xpath("//*[@id='email']");
	By allReadyRegpassword=By.xpath("//*[@id='passwd']");
	By submitButton= By.xpath("//*[@id='SubmitLogin']");
	By errorAlertMessage=By.xpath("//*[@id='center_column']/div[1]");
	
//	WebElement allReadyRegemailAddress=driver.findElement(By.xpath("//*[@id='email']"));
	//WebElement allReadyRegpassword=driver.findElement(By.xpath("//*[@id='passwd']"));
//	WebElement createAnAccount=driver.findElement(By.xpath("//*[@id='SubmitCreate']/span"));
//	WebElement createAccEmailAddress=driver.findElement(By.xpath("//*[@id='email_create']"));
//	WebElement submitButton=driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
	

	public void clickOnForgotEmailIdLink()
	{
		driver.findElement(forgotEmailId).click();
	}
	public void enterEmainIdToRetrievePassword(String retrieveEmailId)
	{
		driver.findElement(enterEmainIdToRetrieve).sendKeys(retrieveEmailId);
	}
	public void clickOnRetrieveButton()
	{
		driver.findElement(retrieveEmailIdButton).click();
	}
	
	public void errorMessageDisplay()
	{
		System.out.println(driver.findElement(errorMessageToRetriveEmailId).getText());
	}
	
	public boolean errorMessageToRetriveEmailId()
	{
		try{
			if(driver.findElement(enterEmainIdToRetrieve).isDisplayed())
				return true;
		}
		catch(Exception e)
		{
			return false;

		}
		return false;
	}
	
	public void confirmationMessageText()
	{
		System.out.println(driver.findElement(confirmationMessage).getText());
	}
	
	public boolean checkForInvalidLogin()
	{
		 return driver.findElement(errorAlertMessage).isDisplayed();
	}
		
	public void getTheErrorMessage()
	{
		System.out.println(driver.findElement(errorAlertMessage).getText());
	}
	//All the WebElements or Objects of the Sing In Page
	
	public SignIn(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void clickOnSignIn()
	{
		driver.findElement(signIn).click();
		
	}
/*	public void eneterEmailAddressToCreateAnAccount(String emailAddress)
	{
		createAccEmailAddress.sendKeys(emailAddress);
	}*/
		
	public void enterAlreadyRegisteredUserEmail(String emailAddress)
	{
		
		driver.findElement(allReadyRegemailAddress).sendKeys(emailAddress);
	}
	
	public void clickOnAllSignIntoAccount()
	{
		driver.findElement(submitButton).click();
	}
	
	public void enterAllreadyRegisteredPassword(String password)
	{
		driver.findElement(allReadyRegpassword).sendKeys(password);
	}
	
}

