package com.xamplify.automation;

import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EventCampaign {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\xAmplify-Automation\\src\\main\\resources\\EventCampaign.properties");
	
final Logger logger = LogManager.getLogger(EventCampaign.class);
	
	
@Test
public void event_campaign() throws InterruptedException, SQLException {
	
	WebDriverWait wait = new WebDriverWait(driver, 50); // Wait till the element is not visible

	WebElement eve_campele = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("event_campaignhover"))));
	eve_campele.click(); // hover on campaign

	Actions camp_action = new Actions(driver);
	camp_action.moveToElement(eve_campele).perform();
	Thread.sleep(5000);
	WebElement create_campele = driver.findElement(By.xpath(properties.getProperty("event_createcampaign"))); //click on create campaign
	camp_action.moveToElement(create_campele);
	camp_action.click();
	camp_action.perform();
	Thread.sleep(5000);
	WebDriverWait waitc = new WebDriverWait(driver, 40);
	WebElement opencamp = waitc.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("event_opencampaign")))); //select event campaign
	opencamp.click();
	
	logger.info("Selected the Event campaign");
	Thread.sleep(5000);

	WebElement eve_campaignName = 	driver.findElement(By.id(properties.getProperty("event_tittle")));
	eve_campaignName.sendKeys("Eventcampaign");
	Thread.sleep(3000);

	
	driver.findElement(By.xpath(properties.getProperty("eve_subjectline"))).sendKeys("subjectLine_eve");    //subjectline 
	Thread.sleep(3000);

	
	WebDriverWait wait3 = new WebDriverWait(driver, 50);
	WebElement w3 = wait3
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("eve_through"))));		//notify me email is opened
	
	w3.click();
	
	
	driver.findElement(By.xpath(properties.getProperty("eve_selectdate"))).click();   //select calendar
	Thread.sleep(3000);
	
	
	
	
	List<WebElement> dates= driver.findElements(By.className("flatpickr-day"));
	//select common attribute // list and iterate
	int count=driver.findElements(By.className("flatpickr-day")).size();
	for(int i=0; i<count; i++)
	{
		String text=driver.findElements(By.className("flatpickr-day")).get(i).getText();
		if(text.equalsIgnoreCase("4"))
		{
		driver.findElements(By.className("flatpickr-day")).get(i).click();
		break;
		}
	}
	
	Thread.sleep(3000);
	driver.findElement(By.id("allDay")).click();
	
	Thread.sleep(3000);
	
		
}
	
	
}
