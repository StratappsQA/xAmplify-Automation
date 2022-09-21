package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PartnerManageSurveyCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\RedistributionCampaign.properties");
	final Logger logger = LogManager.getLogger(PartnerManageSurveyCampaign.class);
	
	
	@Test
	
	public void manage_redsurveycamp() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 50); // Wait till the element is not visible
		WebElement s_element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("re_Surveycampaignhover"))));
		s_element.click(); // hover the Campaign
		logger.info("Hover the campaign module");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("click_resurvey_manage_camp"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("resurvey_click_survey_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_dropdownarrow"))).click();
		Thread.sleep(3000);
		logger.info("click on Edit");
		driver.findElement(By.xpath(properties.getProperty("click_rs_edit"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_edit_update"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_close"))).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("click_dropdownarrow"))).click();
		Thread.sleep(3000);
		logger.info("click on Preview");
		driver.findElement(By.xpath(properties.getProperty("click_rs_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_cross"))).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("click_dropdownarrow"))).click();
		Thread.sleep(3000);
		logger.info("click on Archieve");
		driver.findElement(By.xpath(properties.getProperty("click_rs_archieve"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_archievedcampaigns"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("drdwn_archd_camp"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_unarchieve"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_active_campaigns"))).click();
		Thread.sleep(3000);
		
		
		
		
		
	}
	
}
