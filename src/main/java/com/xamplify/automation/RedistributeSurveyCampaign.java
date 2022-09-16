package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RedistributeSurveyCampaign {
	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\RedistributionCampaign.properties");

	final Logger logger = LogManager.getLogger(RedistributeSurveyCampaign.class);

	@Test

	public void redistribute_scampaign() throws InterruptedException, SQLException {

		WebDriverWait wait = new WebDriverWait(driver, 50); // Wait till the element is not visible
		WebElement s_element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("re_Surveycampaignhover"))));
		s_element.click(); // hover the Campaign
		logger.info("Hover the campaign module");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("click_redstribute_campaign"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_survey_tab"))).click();
		Thread.sleep(3000);
		logger.info("Click on Preview Icon");
		driver.findElement(By.xpath(properties.getProperty("re_survey_preview_icon"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("re_survey_preview_close"))).click();
		Thread.sleep(3000);
		logger.info("click on Redistribute campaign icon");
		WebElement redistribute_camp = driver.findElement(By.xpath(properties.getProperty("red_survey_camp_icon")));
		redistribute_camp.click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("re_survey_campaigntitle")))
		.sendKeys(properties.getProperty("re_survey_campaignname") + "_" + System.currentTimeMillis());
		
		Thread.sleep(3000);
		
		logger.info("click on Subject line");
		
		driver.findElement(By.xpath(properties.getProperty("re_survey_subline"))).sendKeys("subject for redistributed survey campaign-");
		Thread.sleep(3000);
		
		

	}
}