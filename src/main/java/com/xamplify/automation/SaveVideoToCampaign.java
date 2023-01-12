package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SaveVideoToCampaign extends ExtentReportsClass {

	WebDriver driver = Instance.getInstance();
	 Properties properties = PropertiesFile.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");


final Logger logger = LogManager.getLogger(SaveVideoToCampaign.class);

		@Test (priority=145,enabled=true)
		public void v_to_save() throws InterruptedException, SQLException
		{
						
						Thread.sleep(5000);
						VideoToCampaign v2cam = new VideoToCampaign();
						v2cam.vde_to_campaign();
						
						Thread.sleep(4000);
						
						//AutoResponsesVideoToCampaign arv2=new AutoResponsesVideoToCampaign(); 
						 //arv2.autoResponsesVideo2camp();
						 //Thread.sleep(4000);
					

						
						
			driver.findElement(By.xpath(properties.getProperty("video_to_camp_testmail"))).click();//click on send test mail
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(properties.getProperty("video_to_camp_mailid"))).sendKeys("chmounika@stratapps.com");//send data in the test mail field
			driver.findElement(By.xpath(properties.getProperty("video_to_camp_submit"))).click();//click submit
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("video_to_camp_ok"))).click();//click ok
			Thread.sleep(5000);
logger.info("Sended Test mail");			
			
			driver.findElement(By.xpath(properties.getProperty("video_to_camp_save1"))).click();//click save
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(properties.getProperty("video_to_camp_save_spamcheck"))).click();//click spam check
			Thread.sleep(5000);
		
			driver.findElement(By.xpath(properties.getProperty("video_to_camp_save_insidespamcheck"))).click();//click again spam check
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("video_to_camp_save_inside_refresh"))).click();//click refresh 
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("video_to_camp_save_spam_close"))).click();//close spam check
			Thread.sleep(5000);
			
logger.info("Spam Check");	
			
			driver.findElement(By.xpath(properties.getProperty("video_to_camp_saved"))).click();//click on save 
			Thread.sleep(5000);
			String v_save = driver.findElement(By.xpath(properties.getProperty("video_to_camp_response_msg"))).getText(); // response
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
			Thread.sleep(10000);
logger.info("Video Campaign Saved Successfully");				
		}

		
	

}
