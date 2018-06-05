package com.jenkins.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	
	public WebDriver driver;
	public File f;
	public static Properties Repository=new Properties();
	public FileInputStream fis;
	
	
	
	
	public void init() throws IOException
	{
		
		loadPropertiesFile();
		selectBrowser(Repository.getProperty("browser"));
		driver.get(Repository.getProperty("url"));
	}
	
	public void loadPropertiesFile() throws IOException
	{
		f=new File(System.getProperty("user.dir")+"//src//main//java//com//jenkins//config//config.properties");
		fis=new FileInputStream(f);
		Repository.load(fis);
		
	}

	
	//The below method selects the browser 
	public WebDriver selectBrowser(String browser)
	{
		if(browser.equals("firefox")||browser.equals("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver","\\BlindGame\\Jenkins\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
			
			
		}
		else if(browser.equals("chrome")||browser.equals("CHROME"))
		{
			System.out.println("Test");
			System.setProperty("webdriver.chrome.driver","\\BlindGame\\Jenkins\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
			
		}
		return null;
		
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	

}
