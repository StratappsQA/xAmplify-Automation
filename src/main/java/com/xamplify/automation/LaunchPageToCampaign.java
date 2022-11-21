package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LaunchPageToCampaign extends ExtentReportsClass {
	
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplifyproject\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");// properties file
final Logger logger = LogManager.getLogger(LaunchPageToCampaign.class);

	@Test
	public void page_to_launch() throws InterruptedException, SQLException {
		Thread.sleep(6000);
		PageToCampaign pc2 = new PageToCampaign();
	     pc2.page_to_campaign();
	     Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("page_To_now"))).click();// click on now
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("page_To_nowlaunch"))).click(); // click on launch
		Thread.sleep(6000);
		String p_to_camp_launch = driver.findElement(By.xpath(properties.getProperty("page_To_response_msg"))).getText(); // response message
		//System.out.println(p_launch);
		
		
		
		String expectedtitle ="Campaign launched successfully";
		
		if(expectedtitle.equals(p_to_camp_launch))
		{
			System.out.println(" Page To Campaign launched successfully");
		}
		else {
			System.out.println(" Page To Campaign failed");
		}
		Thread.sleep(9000);
		
logger.info("Page To Campaign Launched Successfully");
		
		
		
	}

}
