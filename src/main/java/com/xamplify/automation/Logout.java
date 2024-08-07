package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Logout {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Logout.properties");
	final Logger logger = LogManager.getLogger(Login.class);
	
	

//@Test(priority=1,enabled=true)
//public void Openingthebrowser() throws InterruptedException {
//	
//logger.info("Opening the WebApplication");
//Thread.sleep(3000);
//driver.get(properties.getProperty("baseUrl"));
//driver.manage().window().maximize();
//Thread.sleep(3000);
//logger.info("Successfully Opened the Web Application");
//
//}

@Test(priority=1,enabled=true)


public void Logoutprocess() throws InterruptedException, SQLException {

	logger.info("Logging out to the application");
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("click_userprofile_dropdown"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("click_logout_button"))).click();
	Thread.sleep(6000);
	logger.info("Successfully Logout to the application");
	
}

}


