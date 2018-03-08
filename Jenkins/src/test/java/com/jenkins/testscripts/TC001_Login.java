package com.jenkins.testscripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jenkins.pagelibrary.SignIn;
import com.jenkins.testbase.TestBase;

public class TC001_Login extends TestBase

{
	
	SignIn signin;
	
	@BeforeClass
	public void setUp() throws IOException
	{
		init();
		
	}
	
	@Test
	public void testLogin() throws InterruptedException
	{
		signin=new SignIn(driver);	
		signin.clickOnSignIn();
		signin.enterAlreadyRegisteredUserEmail("kranjitreddy@gmail.com");
		signin.enterAllreadyRegisteredPassword("avanthi123");
		signin.clickOnAllSignIntoAccount();
		Thread.sleep(3000);
		
	}
	
	@AfterClass
	public void quitBrowser()
	{
		closeBrowser();
		
	}
	
	

}
