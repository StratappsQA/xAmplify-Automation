package com.xamplify.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Instance {

	public static WebDriver driver;

	  public static WebDriver getInstance() 	  {
		  if (driver == null) 
		   {
			  
			WebDriverManager.chromedriver().setup();  
		   	ChromeOptions options = new ChromeOptions();
		   	options.addArguments("incognito");
		   	options.addArguments("use-fake-ui-for-media-stream"); 
		   	driver = new ChromeDriver(options);
		   }
		   return driver;
		 }
}

