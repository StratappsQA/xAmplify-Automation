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

public class AutoResponsesEventcampaign {

	
	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\EventCampaign.properties");
	
	final Logger logger = LogManager.getLogger(AutoResponsesEventcampaign.class);

	@Test
	public void autoResponsesevent() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("eveautoresponse1"))).click(); // auto responses
		Thread.sleep(4000);
			
	}
	
	
}
