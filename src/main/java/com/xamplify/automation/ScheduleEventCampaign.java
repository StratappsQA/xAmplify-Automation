package com.xamplify.automation;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ScheduleEventCampaign {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\git\\xAmplify-Automation\\xAmplify-Automation\\src\\main\\resources\\EventCampaign.properties");

	final Logger logger = LogManager.getLogger(ScheduleEventCampaign.class);

	@Test

	public void event_schedule() throws InterruptedException, SQLException {

		Thread.sleep(4000);

		EventCampaign eve1 = new EventCampaign();
		eve1.event_campaign();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("eve_schedule"))).click();
		Thread.sleep(7000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");// scroll down
		Thread.sleep(5000);

		WebElement dateTable = driver.findElement(By.xpath(properties.getProperty("eve_sch_click")));
		dateTable.click();

		Thread.sleep(8000);
		
		

		logger.info("Clicked the date");

		
		
		
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date dt = new Date();

		Calendar cl = Calendar.getInstance();
		cl.setTime(dt);;
		cl.add(Calendar.DAY_OF_YEAR, 2);
		dt=cl.getTime();

		String str = df.format(dt);

		System.out.println("the date today is "+ str);
		WebElement el = driver.findElement(By.xpath("//div[@class='dayContainer']"));
		System.out.println("ag");
		el.sendKeys(str);
		
		
		
		
		
		
		
		
		
			Thread.sleep(9000);

		  
		  
		  
		  
		
		WebElement pcountry_drpdwn = driver.findElement(By.xpath(properties.getProperty("eve_sch_select_country")));// select
																													// country
		Select pcountry1 = new Select(pcountry_drpdwn);
		Thread.sleep(5000);
		pcountry1.selectByValue("103");
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("eve_schedulelast"))).click();// schedule
		Thread.sleep(5000);

		String s = driver.findElement(By.xpath(properties.getProperty("eve_sch_response_msg"))).getText(); // response
																											// message
		System.out.println(s);

		logger.info("Event Campaign Scheduled Successfully");

	}

}
