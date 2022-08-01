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

public class ManageSurveyCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\ManageCampaigns.properties");
final Logger logger = LogManager.getLogger(SurveyCampaign.class);
	
@Test

	public void manage_scampaign() throws InterruptedException, SQLException {
		
	WebDriverWait wait = new WebDriverWait(driver, 50);  // Wait till the element is not visible

	WebElement scamp = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("campaignhover"))));
	scamp.click(); // hover on campaign

}
}
