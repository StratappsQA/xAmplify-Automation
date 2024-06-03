package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


//public class SaveVideoCampaign extends VideoCampaign {

public class SaveVideoCampaign  {
	 WebDriver driver = Instance.getInstance();
	 Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");


final Logger logger = LogManager.getLogger(SaveVideoCampaign.class);

		@Test
		public void vsave() throws InterruptedException, SQLException
		{
						
						Thread.sleep(5000);
						VideoCampaign vs= new VideoCampaign();
						vs.vdecampaign();
						
						Thread.sleep(4000);
						/*
						 * AutoresponsesVideo arv2=new AutoresponsesVideo(); arv2.autoResponsesVideo();
						 * Thread.sleep(4000);
						 */

						
						
			driver.findElement(By.xpath(properties.getProperty("v_testmail"))).click();//click on send test mail
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(properties.getProperty("v_mailid"))).sendKeys("chmounika2630@gmail.com");
			//send data in the test mail field
			Thread.sleep(2000);
			driver.findElement(By.xpath(properties.getProperty("v_subject_field"))).sendKeys("Please Have a Look");
			Thread.sleep(2000);
			driver.findElement(By.xpath(properties.getProperty("v_sendtestemail_button"))).click();//click submit
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("vok"))).click();//click ok
			Thread.sleep(5000);
logger.info("Sended Test mail");			
			
/*
 * driver.findElement(By.xpath(properties.getProperty("vsave1"))).click();//
 * click save Thread.sleep(5000);
 */
			driver.findElement(By.xpath(properties.getProperty("vsave_spamcheck"))).click();//click spam check
			Thread.sleep(5000);
		
			driver.findElement(By.xpath(properties.getProperty("vsave_insidespamcheck"))).click();//click again spam check
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("vsave_inside_refresh"))).click();//click refresh 
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("vsave_spam_close"))).click();//close spam check
			Thread.sleep(5000);
			
logger.info("Spam Check");	
			
			driver.findElement(By.xpath(properties.getProperty("vsave1"))).click();//click on save 
			Thread.sleep(5000);
			String v_save = driver.findElement(By.xpath(properties.getProperty("v_save_response_msg"))).getText(); // response
			// message

			Thread.sleep(5000);

		String expectedtitle = "Campaign saved successfully";
		Thread.sleep(5000);

		if (expectedtitle.equals(v_save)) {
		System.out.println(" video  Campaign saved successfully");
		Thread.sleep(5000);

		} else {
		System.out.println(" video Campaign failed");
		}
			
		
		Thread.sleep(8000);
logger.info("Video Campaign Saved Successfully");				
		}

		
	
}
