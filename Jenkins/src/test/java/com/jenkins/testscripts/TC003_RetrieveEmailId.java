package com.jenkins.testscripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jenkins.pagelibrary.SignIn;
import com.jenkins.testbase.TestBase;

public class TC003_RetrieveEmailId extends TestBase {
	
	SignIn signin;
	
	@BeforeClass
	public void setUp() throws IOException
	{
		init();
	}
	@Test
	public void retrieveEmailId() throws InterruptedException
	{
		
		System.out.println("Retrieve Email  Login Started ");
		signin=new SignIn(driver);
		signin.clickOnSignIn();
		
		signin.clickOnForgotEmailIdLink();
		signin.enterEmainIdToRetrievePassword("kranjitreddy@gmail.com");
		signin.clickOnRetrieveButton();
		Thread.sleep(5000);
		
		if(!signin.errorMessageToRetriveEmailId())
		{
			System.out.println("Retrieve Email id is not successful");
			signin.confirmationMessageText();
		}
		else
		{
		signin.confirmationMessageText();
		}
		
		System.out.println("Retrieve Email Ended ");
		
	}
	
	@AfterClass
	public void quitBrowser()
	{
		closeBrowser();
		
	}
	

}
