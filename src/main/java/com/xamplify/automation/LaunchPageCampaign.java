package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchPageCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplifyproject\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");// properties file
final Logger logger = LogManager.getLogger(LaunchPageCampaign.class);

	@Test
	public void page_launch() throws InterruptedException, SQLException {
		Thread.sleep(6000);
		PageCampaign pc1 = new PageCampaign();
	     pc1.pcampaign();
		driver.findElement(By.xpath(properties.getProperty("p_now"))).click();// click on now
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("p_nowlaunch"))).click(); // click on launch
		Thread.sleep(6000);
		String p_launch = driver.findElement(By.xpath(properties.getProperty("p_response_msg"))).getText(); // response message
		//System.out.println(p_launch);
		
		
		
		String expectedtitle ="Campaign launched successfully";
		
		if(expectedtitle.equals(p_launch))
		{
			System.out.println(" Page Campaign launched successfully");
		}
		else {
			System.out.println(" Page Campaign failed");
		}
		Thread.sleep(7000);
		
logger.info("Page Campaign Launched Successfully");
		
		
		
	}

}