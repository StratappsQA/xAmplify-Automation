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

//public class LaunchVideoCampaign extends VideoCampaign {

public class LaunchVideoCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");

	final Logger logger = LogManager.getLogger(LaunchVideoCampaign.class);

	@Test

	public void vlaunch() throws InterruptedException, SQLException {
		Thread.sleep(5000);
		VideoCampaign vc = new VideoCampaign();
		vc.vdecampaign();
		Thread.sleep(4000);
//		AutoresponsesVideoCampaign arv=new AutoresponsesVideoCampaign();
//		arv.autoResponsesVideo();
//		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("video_now"))).click(); // click NOW
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("video_launch"))).click(); // click LAUNCH

		Thread.sleep(6000);

		logger.info("launch button Clicked");
		String v_launch = driver.findElement(By.xpath(properties.getProperty("v_response_msg"))).getText(); // response
																											// message

		String expectedtitle = "Campaign launched successfully";

		if (expectedtitle.equals(v_launch)) {
			System.out.println(" Video Campaign launched successfully");
		} else {
			System.out.println(" Video Campaign failed");
		}

		logger.info("Video Campaign launched Successfully");

		Thread.sleep(8000);
	}
	
}