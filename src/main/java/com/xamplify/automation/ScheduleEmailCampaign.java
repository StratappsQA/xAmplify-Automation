package com.xamplify.automation;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.TimeZone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//public class ScheduleEmailCampaign extends EmailCampaign {
import org.testng.annotations.Test;

public class ScheduleEmailCampaign{
	
	//@AfterMethod 
	//[for auto responses...comment @AfterTest annotation and use @Aftermethod , extends AutoResponsesEmail]

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");
	
	
final Logger logger = LogManager.getLogger(ScheduleEmailCampaign.class);
	
	
	@Test
	public void eschedule() throws InterruptedException, SQLException
	{
		Thread.sleep(5000);
		
		 EmailCampaign e12=new EmailCampaign(); 
		 e12.ecampaign(); 
		  Thread.sleep(5000);
		 
		  
		 AutoResponseEmailcampaign ar_e12=new AutoResponseEmailcampaign();
		  ar_e12.autoResponsesEmail();
		  
		  
		 //Thread.sleep(3000);
		

		driver.findElement(By.xpath(properties.getProperty("email_schedule_click"))).click();
		Thread.sleep(9000);
		
		
		
	        WebElement dateTable = driver.findElement(By.xpath(properties.getProperty("eselect_date")));
	        dateTable.click();
			Thread.sleep(9000);
	        driver.findElement(By.xpath(properties.getProperty("evsch_date_click"))).click();
			Thread.sleep(5000);
			
			/*Date gd =	Calendar.getInstance().getTime();
			
			String newString = new SimpleDateFormat("H:mm").format(gd);
			System.out.println(newString);*/
			
			Calendar calendar = Calendar.getInstance();
			
			int hours = calendar.get(Calendar.HOUR_OF_DAY);
			int minutes = calendar.get(Calendar.MINUTE);
			System.out.println(hours);
			System.out.println(minutes);
	    	
			if(hours < 12  )
				
			
			{
	    	driver.findElement(By.xpath(properties.getProperty("evsh_date_hour"))).sendKeys("1");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("evsh_date_min"))).sendKeys("11");
			Thread.sleep(5000);
			}
			else
			{
				driver.findElement(By.xpath(properties.getProperty("evsh_date_hour"))).sendKeys("11");
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("evsh_date_min"))).sendKeys("59");
				Thread.sleep(5000);
			}
			
	    	
		WebElement country_drpdwn=driver.findElement(By.xpath(properties.getProperty("eselect_country")));
		Select country1=new Select(country_drpdwn);
		Thread.sleep(5000);
		country1.selectByValue("103");
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("email_schedulelast"))).click();
		Thread.sleep(8000);
		
		String e_schedule = driver.findElement(By.xpath(properties.getProperty("e_response_msg"))).getText(); // response
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

	Thread.sleep(10000);
logger.info("Email Campaign Scheduled Successfully");
			
		}
	
	
}
