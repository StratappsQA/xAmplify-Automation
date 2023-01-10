package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class LaunchRedistributionSurveyCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile

			.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\RedistributionCampaign.properties");


	final Logger logger = LogManager.getLogger(LaunchRedistributionSurveyCampaign.class);

	@Test (priority = 248, enabled = true)

	public void re_surveylaunch() throws InterruptedException, SQLException {
		Thread.sleep(3000);
		RedistributeSurveyCampaign rs1 = new RedistributeSurveyCampaign();
		rs1.redistribute_scampaign();
		Thread.sleep(3000);

//		AutoResponses_RedistributionSurveyCampaign ar_s = new AutoResponses_RedistributionSurveyCampaign();
//		ar_s.autoResponses_redistributionSurvey(); //Auto Responses

		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("resurvey_click_now"))).click(); // NOw
		Thread.sleep(5000);
		logger.info("Click on Launch");
		driver.findElement(By.xpath(properties.getProperty("resurvey_click_launch"))).click(); // Launch
		Thread.sleep(4000);

		String rs_launch = driver.findElement(By.xpath(properties.getProperty("rs_response_msg"))).getText(); // response
																												// message
		logger.info("Survey Campaign Redistributed Successfully");

		String Result = "Campaign launched successfully";

		if (Result.equals(rs_launch)) {
			// Thread.sleep(2000);
			System.out.println("Survey Campaign Redistributed Successfully");
		} else {
			Thread.sleep(2000);

			System.out.println("Survey Campaign Redistribution failed");
		}

	Thread.sleep(6000);


	}

}
