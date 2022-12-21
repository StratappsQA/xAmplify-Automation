package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PartnerLogout {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\PartnerLogout.properties");
	final Logger logger = LogManager.getLogger(PartnerLogout.class);
	
	@Test(priority=1,enabled=true)


	public void PartnerLogoutprocess() throws InterruptedException, SQLException {

		logger.info("Partner Logging out to the application");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_userprofile_dropdown"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_logout_button"))).click();
		Thread.sleep(6000);
		logger.info("Successfully Partner Logout to the application");
		
	}
}
