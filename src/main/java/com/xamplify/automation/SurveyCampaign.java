package com.xamplify.automation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SurveyCampaign {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");
	
final Logger logger = LogManager.getLogger(SurveyCampaign.class);
	
@Test

public void scampaign() throws InterruptedException, SQLException {
	
	WebDriverWait wait = new WebDriverWait(driver, 50);

	// Wait till the element is not visible

	WebElement campele = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("survey_campaignhover"))));
	campele.click(); // hover on campaign
	Actions camp_action = new Actions(driver);
	camp_action.moveToElement(campele).perform();
	Thread.sleep(5000);
	WebElement create_campele = driver.findElement(By.xpath(properties.getProperty("survey_createcampaign"))); //click on create campaign
	camp_action.moveToElement(create_campele);
	camp_action.click();
	camp_action.perform();
	
	Thread.sleep(5000);
	
	WebDriverWait waitc = new WebDriverWait(driver, 40);
	
	WebElement openscamp = waitc.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("survey_opencampaign")))); //select survey campaign
	openscamp.click();
logger.info("Opened the Survey Campaign");
	List<String> campaignNames = new ArrayList<String>();
	String query = properties.getProperty("query.getCampaignNamesByOrganizationId").replaceAll(":emailId",
			properties.getProperty("user.name"));
	ResultSet resultSet = DatabaseConnection.getResultSet(query);
	while (resultSet.next()) {
		campaignNames.add(resultSet.getString("Scampaign_name").toLowerCase());			//query,if campaign name already exists checking 
	}
	String campaignNameFromProp = properties.getProperty("write_Scampaigname").toLowerCase();
	
	driver.findElement(By.id(properties.getProperty("ScampaignName")))
	.sendKeys(properties.getProperty("write_Scampaigname"));
Thread.sleep(5000);

	
	
	
}
	
}

