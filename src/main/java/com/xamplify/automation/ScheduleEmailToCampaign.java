package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ScheduleEmailToCampaign extends ExtentReportsClass{

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile
			.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");

	final Logger logger = LogManager.getLogger(ScheduleEmailToCampaign.class);

	@Test (priority=153,enabled=false)
	public void e_to_schedule() throws InterruptedException, SQLException {
		Thread.sleep(5000);

		EmailToCampaign e12 = new EmailToCampaign();
		e12.email_to_campaign();
		Thread.sleep(5000);

//		 AutoResponseEmailcampaign ar_e12=new AutoResponseEmailcampaign();
//		  ar_e12.autoResponsesEmail();
//		  

		// Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("e_to_schedule_click"))).click();
		Thread.sleep(9000);

		WebElement dateTable = driver.findElement(By.xpath(properties.getProperty("e_to_select_date")));
		dateTable.click();
		Thread.sleep(9000);
		driver.findElement(By.xpath(properties.getProperty("e_to_sch_date_click"))).click();
		Thread.sleep(5000);

		Calendar calendar = Calendar.getInstance();

		int hours = calendar.get(Calendar.HOUR_OF_DAY);
		int minutes = calendar.get(Calendar.MINUTE);
		System.out.println(hours);
		System.out.println(minutes);

		if (hours < 12)

		{
			driver.findElement(By.xpath(properties.getProperty("e_to_sh_date_hour"))).sendKeys("1");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("e_to_sh_date_min"))).sendKeys("11");
			Thread.sleep(5000);
		} else {
			driver.findElement(By.xpath(properties.getProperty("e_to_sh_date_hour"))).sendKeys("11");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("e_to_sh_date_min"))).sendKeys("59");
			Thread.sleep(5000);
		}

		WebElement country_drpdwn = driver.findElement(By.xpath(properties.getProperty("e_to_select_country")));
		Select country1 = new Select(country_drpdwn);
		Thread.sleep(5000);
		country1.selectByValue("103");
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("e_to_schedulelast"))).click();
		Thread.sleep(8000);

		String e_schedule = driver.findElement(By.xpath(properties.getProperty("e_to_response_msg"))).getText(); // response
		// message

		Thread.sleep(5000);

		String expectedtitle = "Campaign scheduled successfully";

		if (expectedtitle.equals(e_schedule)) {
			Thread.sleep(2000);

			System.out.println(" Email Campaign scheduled successfully");
		} else {
			Thread.sleep(2000);

			System.out.println(" Email Campaign schedule failed");
		}

		Thread.sleep(9000);
		logger.info("Email Campaign Scheduled Successfully");

	}
}
