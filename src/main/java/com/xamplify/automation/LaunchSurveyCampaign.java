package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LaunchSurveyCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");

	final Logger logger = LogManager.getLogger(LaunchSurveyCampaign.class);

	@Test

	public void slaunch() throws InterruptedException, SQLException

	{
		Thread.sleep(4000);
		SurveyCampaign s1 = new SurveyCampaign();
		s1.scampaign();
		Thread.sleep(5000);

		// AutoResponsesSurveyCampaign ar_s=new AutoResponsesSurveyCampaign();
		// ar_s.autoResponsesSurvey();

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("s_now"))).click(); // Click Now
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		logger.info("Click on Launch");
		driver.findElement(By.xpath(properties.getProperty("s_launch"))).click(); // Click Launch
		Thread.sleep(5000);

		String s_launch = driver.findElement(By.xpath(properties.getProperty("s_response_msg"))).getText(); // response
																											// message
		logger.info("Survey Campaign Launched Successfully");
		String Result = "The campaign was successfully deployed. Please wait until the campaign is processed and launched. We will send you email updates in timely manner.";

		if (Result.equals(s_launch)) {
			// Thread.sleep(2000);
			System.out.println("Survey Campaign Launched Successfully");
		} else {
			Thread.sleep(2000);

			System.out.println("Survey Campaign Launched failed");
		}

		Thread.sleep(10000);
	}

}
