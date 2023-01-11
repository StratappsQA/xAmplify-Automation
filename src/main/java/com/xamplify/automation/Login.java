package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Login extends ExtentReportsClass{
	
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\Login.properties");
	final Logger logger = LogManager.getLogger(Login.class);
	
	

@Test(priority=1,enabled=true)
public void Openingthebrowser() throws InterruptedException {
	
logger.info("Opening the WebApplication");
Thread.sleep(3000);
driver.get(properties.getProperty("baseUrl"));
driver.manage().window().maximize();
Thread.sleep(3000);
logger.info("Successfully Opened the Web Application");

}

@Test(priority=2,enabled=true)


public void Signinprocess() throws InterruptedException, SQLException {

	logger.info("Signing up to the application");
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("email"))).sendKeys(properties.getProperty("user.name"));
	driver.findElement(By.xpath(properties.getProperty("password"))).sendKeys(properties.getProperty("user.password"));
	driver.findElement(By.xpath(properties.getProperty("signin"))).click();
	Thread.sleep(6000);
	logger.info("Successfully Signedup to the application");
	
}

}
