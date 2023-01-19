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

public class SchedulePageToCampaign extends ExtentReportsClass {
	
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("src/main/resources/Campaign.properties");// properties file

final Logger logger = LogManager.getLogger(SchedulePageToCampaign.class);
	 
	@Test (priority=166,enabled=false)

	public void page_to_campschedule() throws InterruptedException, SQLException {

		Thread.sleep(4000);

		PageToCampaign psch1 = new PageToCampaign();
		psch1.page_to_campaign();
		Thread.sleep(4000);
		System.out.println(1);
		driver.findElement(By.xpath(properties.getProperty("page_To_schedule"))).click();// click on schedule
		Thread.sleep(8000);
		
		driver.findElement(By.xpath(properties.getProperty("page_To_sch_click"))).click();// click on schedule button
		Thread.sleep(2000);
		  driver.findElement(By.xpath(properties.getProperty("page_To_sch_date_click1"))).
		  click(); Thread.sleep(9000);
		 
		logger.info("Click on the date");
		
		Calendar calendar = Calendar.getInstance();
		int hours = calendar.get(Calendar.HOUR_OF_DAY);

		System.out.println(hours);
		if(hours < 12  )
			
			
		{
		driver.findElement(By.xpath(properties.getProperty("page_To_sch_date_hour"))).sendKeys("1");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("page_To_sch_date_min"))).sendKeys("11");
		Thread.sleep(5000);
		}
		else
		{
			driver.findElement(By.xpath(properties.getProperty("page_To_sch_date_hour"))).sendKeys("11");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("page_To_sch_date_min"))).sendKeys("59");
			Thread.sleep(5000);
		}


		WebElement pcountry_drpdwn=driver.findElement(By.xpath(properties.getProperty("page_To_select_country")));//select country
		Select pcountry1=new Select(pcountry_drpdwn);
		Thread.sleep(5000);
		pcountry1.selectByValue("103");
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("page_To_schedulelast"))).click();//schedule
		Thread.sleep(5000);

		String page_to_schedule=driver.findElement(By.xpath(properties.getProperty("page_To_response_msg"))).getText();  //response message
		System.out.println(page_to_schedule);
		
		String expectedtitle = "Campaign scheduled successfully";

		if (expectedtitle.equals(page_to_schedule)) {
			Thread.sleep(2000);

			System.out.println(" Page To Campaign scheduled successfully");
		} else {
			Thread.sleep(2000);

			System.out.println(" Page To Campaign schedule failed");
		}

		
		
logger.info("Page To Campaign Scheduled Successfully");
		
		Thread.sleep(10000);
		

}
}
