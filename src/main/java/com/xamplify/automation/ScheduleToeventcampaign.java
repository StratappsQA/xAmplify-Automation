package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ScheduleToeventcampaign {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\EventCampaign.properties");

	final Logger logger = LogManager.getLogger(ScheduleToeventcampaign.class);

	@Test

	public void event_To_schedule() throws InterruptedException, SQLException {

		Thread.sleep(4000);

		EventToCampagin evesch_to = new EventToCampagin();
		evesch_to.event_Tocampaign();
		
		Thread.sleep(4000);
		
		/*
		 * AutoResponsesEventcampaign ar_eve123 = new AutoResponsesEventcampaign();
		 * //method call for autoresponses ar_eve123.autoResponsesevent();
		 * 
		 * Thread.sleep(4000);
		 */
		driver.findElement(By.xpath(properties.getProperty("eve_schedule"))).click(); //click on the schedule button
		Thread.sleep(7000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");// scroll down
		Thread.sleep(5000);

		WebElement dateTable = driver.findElement(By.xpath(properties.getProperty("eve_sch_click"))); // click on the
																										// calendar
		dateTable.click();

		Thread.sleep(7000);

		logger.info("Clicked the date section");

		driver.findElement(By.xpath(properties.getProperty("eve_sch_date_click"))).click(); // clicked the date
		Thread.sleep(7000);
		logger.info("selected the date");
		WebElement pcountry_drpdwn = driver.findElement(By.xpath(properties.getProperty("eve_sch_select_country")));// select
																													// country
		Select pcountry1 = new Select(pcountry_drpdwn);
		Thread.sleep(5000);
		pcountry1.selectByValue("103");
		Thread.sleep(9000);
		driver.findElement(By.xpath(properties.getProperty("eve_schedulelast"))).click();// schedule
		Thread.sleep(5000);

		String s = driver.findElement(By.xpath(properties.getProperty("eve_sch_response_msg"))).getText(); // response
		
		String expectedtitle = "Campaign Scheduled successfully";
		Thread.sleep(5000);
		if (expectedtitle.equals(s)) {
			System.out.println(" Event Campaign Scheduled successfully");
		} else {
			System.out.println(" Event Campaign failed");
		}
		
		logger.info("Event Campaign Scheduled Successfully");

	}
}
