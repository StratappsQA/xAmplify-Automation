package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ScheduleRedistributionSurveyCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\RedistributionCampaign.properties");
	final Logger logger = LogManager.getLogger(ScheduleRedistributionSurveyCampaign.class);

	@Test

	public void re_surveyschedule() throws InterruptedException, SQLException {
		Thread.sleep(3000);
		RedistributeSurveyCampaign rs1 = new RedistributeSurveyCampaign();
		rs1.redistribute_scampaign(); //Method Calling
		Thread.sleep(3000);

		logger.info("Click on Schedule");
		driver.findElement(By.xpath(properties.getProperty("click_on_schedule"))).click(); // Schedule
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_date_schedule"))).click(); // Select date
		Thread.sleep(3000);

		WebElement select_schd_re_survey_date = driver
				.findElement(By.xpath(properties.getProperty("click_toselect_schedule_re_survey_camp")));
		select_schd_re_survey_date.click();

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);

		Calendar calendar = Calendar.getInstance();

		int hours = calendar.get(Calendar.HOUR_OF_DAY);
		int minutes = calendar.get(Calendar.MINUTE);
		System.out.println(hours);
		System.out.println(minutes);

		if (hours < 12) {
			driver.findElement(By.xpath(properties.getProperty("rs_date_hour_select"))).sendKeys("1");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("rs_date_minute_select"))).sendKeys("11");
			Thread.sleep(5000);
		} else {
			driver.findElement(By.xpath(properties.getProperty("rs_date_hour_select"))).sendKeys("11");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("rs_date_minute_select"))).sendKeys("59");
			Thread.sleep(5000);
		}

		WebElement country_drpdwn = driver.findElement(By.xpath(properties.getProperty("rs_country")));
		Select country1 = new Select(country_drpdwn);
		Thread.sleep(5000);
		country1.selectByVisibleText("India");// Select India
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("rs_schedule_click"))).click();
		Thread.sleep(8000);

		String rs_schedule = driver.findElement(By.xpath(properties.getProperty("rs_response_msg"))).getText(); // response
		// message

		Thread.sleep(5000);

		logger.info("Survey Redistribution Campaign Scheduled Successfully");

		String Result1 = "Campaign scheduled successfully";

		if (Result1.equals(rs_schedule)) {
			// Thread.sleep(2000);
			System.out.println("Survey Redistribution Campaign Scheduled Successfully");
		} else {
			Thread.sleep(2000);

			System.out.println("Survey Redistribution Campaign Scheduled failed");
		}

	}
}
