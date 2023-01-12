package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LaunchVideoToCampaign extends ExtentReportsClass {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");

	final Logger logger = LogManager.getLogger(LaunchVideoToCampaign.class);

	@Test (priority=143,enabled=true)

	public void v_to_launch() throws InterruptedException, SQLException {
		Thread.sleep(5000);
		VideoToCampaign v2c = new VideoToCampaign();
		v2c.vde_to_campaign();
		Thread.sleep(4000);
//		AutoresponsesVideoCampaign arv = new AutoresponsesVideoCampaign();
//		arv.autoResponsesVideo();
//		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("video_to_camp_now"))).click(); // click NOW
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("video_to_camp_launch"))).click(); // click LAUNCH

		Thread.sleep(6000);

		logger.info("launch button Clicked");
		String v_launch = driver.findElement(By.xpath(properties.getProperty("video_to_camp_response_msg"))).getText(); // response
																											// message

		String expectedtitle = "Campaign launched successfully";

		if (expectedtitle.equals(v_launch)) {
			System.out.println(" Video Campaign launched successfully");
		} else {
			System.out.println(" Video Campaign failed");
		}

		Thread.sleep(8000);
		logger.info("Video Campaign launched Successfully");

	}

}
