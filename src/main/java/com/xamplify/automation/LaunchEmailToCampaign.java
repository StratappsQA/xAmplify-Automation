package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LaunchEmailToCampaign {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");

	final Logger logger = LogManager.getLogger(LaunchEmailToCampaign.class);

	@Test

	public void e_to_launch() throws InterruptedException, SQLException

	{
		Thread.sleep(4000);
		EmailToCampaign e1 = new EmailToCampaign();
		e1.email_to_campaign();
		Thread.sleep(5000);

//		AutoResponseEmailcampaign ar_e = new AutoResponseEmailcampaign();
//		ar_e.autoResponsesEmail();

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("now_emailcampaign"))).click(); // click NOW
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("now_emaillaunch"))).click(); // click LAUNCH

		Thread.sleep(8000);

		String e_launch = driver.findElement(By.xpath(properties.getProperty("e_response_msg"))).getText(); // response
		// message

		Thread.sleep(5000);

		String expectedtitle = "Campaign launched successfully";

		if (expectedtitle.equals(e_launch)) {
			Thread.sleep(2000);

			System.out.println(" Email Campaign launched successfully");
		} else {
			Thread.sleep(2000);

			System.out.println(" Email Campaign launch failed");
		}

		logger.info("Email Campaign Launched Successfully");

	}
}
