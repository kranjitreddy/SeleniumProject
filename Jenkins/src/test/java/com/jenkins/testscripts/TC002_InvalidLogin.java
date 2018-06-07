package com.jenkins.testscripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jenkins.pagelibrary.SignIn;
import com.jenkins.testbase.TestBase;

public class TC002_InvalidLogin extends TestBase {
	
	SignIn signin;
	
	
	@BeforeClass
	
	public void setUP() throws IOException
	{
		init();
	}
	
	@Test
	public void invalidLogin() throws InterruptedException
	{
		
		System.out.println("Invali Login Started ");
		signin=new SignIn(driver);
		signin.clickOnSignIn();
		
		signin.enterAlreadyRegisteredUserEmail("kranjitreddy@gmail.com");
		signin.enterAllreadyRegisteredPassword("sfssfsfs");
		signin.clickOnAllSignIntoAccount();
		Thread.sleep(5000);
		
		if((boolean)signin.checkForInvalidLogin())
		{
			System.out.println(" Invalid Credentials ");
			signin.getTheErrorMessage();
				
		}
		else
		{
			System.out.println(" Valid Credentials ");
		}
		
		System.out.println("Invalid Login Ended ");
		
	}
	
	
	@AfterClass
	
	public void quitBrowser()
	{
		closeBrowser();
		
	}
	

}
