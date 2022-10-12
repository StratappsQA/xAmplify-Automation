package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SaveToeventcampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\git\\xAmplify-Automation\\src\\main\\resources\\EventCampaign.properties");

	final Logger logger = LogManager.getLogger(SaveToeventcampaign.class);
	
	

	@Test
	public void event_to_save() throws InterruptedException, SQLException {
		Thread.sleep(4000);

		EventToCampagin eve12 = new EventToCampagin();
		eve12.event_Tocampaign();
		Thread.sleep(5000);

		/*
		 * AutoResponsesEventcampaign ar_eve12 = new AutoResponsesEventcampaign(); //method call for autoresponses
		 *  ar_eve12.autoResponsesevent();
		 */

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("eve_save"))).click();// click on save
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("eve_saved"))).click(); // click on save last button
		Thread.sleep(6000);
		String ev_save = driver.findElement(By.xpath(properties.getProperty("eve_save_response_msg"))).getText(); // response
		// message

		String expectedtitle = "Campaign saved successfully";

		if (expectedtitle.equals(ev_save)) {
			System.out.println(" Event Campaign saved successfully");
		} else {
			System.out.println(" Event Campaign failed");
		}

		logger.info("Event Campaign saved successfully");

	}

	
	
}
