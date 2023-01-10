package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LaunchSurveyToCampaign {
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");

	final Logger logger = LogManager.getLogger(LaunchSurveyToCampaign.class);
 
	@Test (priority=175,enabled=true)

	public void s_to_camp_launch() throws InterruptedException, SQLException

	{
		Thread.sleep(4000);
		SurveyToCampaign s1 = new SurveyToCampaign();
		s1.scampaign();
		Thread.sleep(5000);

//		AutoResponsesSurveyCampaign ar_s = new AutoResponsesSurveyCampaign();
//		ar_s.autoResponsesSurvey(); //Auto Responses

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("s_to_camp_now"))).click(); // Click Now
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		logger.info("Click on Launch");
		driver.findElement(By.xpath(properties.getProperty("s_to_camp_launch"))).click(); // Click Launch
		Thread.sleep(5000);

		String s_launch = driver.findElement(By.xpath(properties.getProperty("s_to_camp_response_msg"))).getText(); // response
		// message
		logger.info("Survey Campaign Launched Successfully");
		String Result1 = "Campaign launched successfully";

		if (Result1.equals(s_launch)) {
			// Thread.sleep(2000);
			System.out.println("Survey To Campaign Launched Successfully");
		} else {
			Thread.sleep(2000);

			System.out.println("Survey To Campaign Launched failed");
		}
		Thread.sleep(7000);
	}

}

