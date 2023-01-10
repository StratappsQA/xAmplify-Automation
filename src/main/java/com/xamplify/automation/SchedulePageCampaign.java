package com.xamplify.automation;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SchedulePageCampaign extends ExtentReportsClass{

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");// properties file

final Logger logger = LogManager.getLogger(SchedulePageCampaign.class);
	 
	@Test (priority=157,enabled=false)

	public void schedule() throws InterruptedException, SQLException {

		Thread.sleep(4000);

		PageCampaign psch1 = new PageCampaign();
		psch1.pcampaign();
		Thread.sleep(4000);
		System.out.println(1);
		driver.findElement(By.xpath(properties.getProperty("p_schedule"))).click();// click on schedule
		Thread.sleep(8000);
		
		driver.findElement(By.xpath(properties.getProperty("psch_click"))).click();// click on schedule button
		Thread.sleep(2000);
		  driver.findElement(By.xpath(properties.getProperty("psch_date_click1"))).
		  click(); Thread.sleep(5000);
		 
		logger.info("Click on the date");
		
		Calendar calendar = Calendar.getInstance();
		int hours = calendar.get(Calendar.HOUR_OF_DAY);

		System.out.println(hours);
		if(hours < 12  )
			
			
		{
		driver.findElement(By.xpath(properties.getProperty("psch_date_hour"))).sendKeys("1");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("psch_date_min"))).sendKeys("11");
		Thread.sleep(5000);
		}
		else
		{
			driver.findElement(By.xpath(properties.getProperty("psch_date_hour"))).sendKeys("11");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("psch_date_min"))).sendKeys("59");
			Thread.sleep(5000);
		}


		WebElement pcountry_drpdwn=driver.findElement(By.xpath(properties.getProperty("pselect_country")));//select country
		Select pcountry1=new Select(pcountry_drpdwn);
		Thread.sleep(5000);
		pcountry1.selectByValue("103");
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("p_schedulelast"))).click();//schedule
		Thread.sleep(5000);

		String page_schedule=driver.findElement(By.xpath(properties.getProperty("p_response_msg"))).getText();  //response message
		System.out.println(page_schedule);
		String expectedtitle = "Campaign scheduled successfully";
		
		if (expectedtitle.equals(page_schedule)) {
			Thread.sleep(2000);

			System.out.println(" Page Campaign scheduled successfully");
		} else {
			Thread.sleep(2000);

			System.out.println(" Page Campaign schedule failed");
		}
		
		
logger.info("Page Campaign Scheduled Successfully");
		
		Thread.sleep(10000);
		

	}

}