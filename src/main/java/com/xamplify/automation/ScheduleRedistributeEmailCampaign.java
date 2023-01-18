package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ScheduleRedistributeEmailCampaign extends ExtentReportsClass{
	
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\RedistributionCampaign.properties");// properties
																											// file
	final Logger logger = LogManager.getLogger(ScheduleRedistributeEmailCampaign.class);


	@Test (priority = 242, enabled = false)
	public void schedule_email_Redistributecampaign() throws InterruptedException {
	
		Thread.sleep(7000);

		RedistributeEmailCampaign schedule_rec=new RedistributeEmailCampaign();
		schedule_rec.hoverRedistributecampaigns_email();
		Thread.sleep(4000);

		
		driver.findElement(By.xpath(properties.getProperty("redis_ecamp_schedule"))).click(); // click on the schedule
		// button
Thread.sleep(7000);

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");// scroll down
Thread.sleep(5000);

WebElement dateTable = driver.findElement(By.xpath(properties.getProperty("redis_eml_sch_click"))); // click on
					// the
// calendar
dateTable.click();

Thread.sleep(8000);

logger.info("Clicked the date section");


  driver.findElement(By.xpath(properties.getProperty("redis_eml_sch_date_click"))).click(); // clicked the date Thread.sleep(7000);
  logger.info("selected the date");
 


WebElement pcountry_drpdwn = driver
.findElement(By.xpath(properties.getProperty("redis_eml_sch_select_country")));// select
// country
Select pcountry1 = new Select(pcountry_drpdwn);
Thread.sleep(5000);
pcountry1.selectByValue("103");
Thread.sleep(9000);
driver.findElement(By.xpath(properties.getProperty("redis_eml_schedulelast"))).click();// schedule
Thread.sleep(5000);

String s = driver.findElement(By.xpath(properties.getProperty("redis_eml_sch_response_msg"))).getText(); // response

String expectedtitle = "Campaign scheduled successfully";
Thread.sleep(5000);
if (expectedtitle.equals(s)) {
System.out.println(" Redistribution Email Campaign Scheduled successfully");
} else {
System.out.println(" Redistribution Email Campaign failed");
}

logger.info("Redistribution Email Campaign Scheduled Successfully");
	
	}
}