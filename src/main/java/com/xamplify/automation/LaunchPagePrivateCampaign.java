package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LaunchPagePrivateCampaign extends ExtentReportsClass{

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");// properties file
final Logger logger = LogManager.getLogger(LaunchPageCampaign.class);

	@Test
	public void page_launch() throws InterruptedException, SQLException {
		Thread.sleep(6000);
		PagePrivateCampaign pc1 = new PagePrivateCampaign();
	     pc1.page_privatecampaign();
	     Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("page_private_now"))).click();// click on now
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("page_private_nowlaunch"))).click(); // click on launch
		Thread.sleep(6000);
		String p_launch = driver.findElement(By.xpath(properties.getProperty("page_private_response_msg"))).getText(); // response message
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
