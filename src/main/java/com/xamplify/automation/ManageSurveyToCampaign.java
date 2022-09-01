package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ManageSurveyToCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\ManageCampaigns.properties");
	final Logger logger = LogManager.getLogger(SurveyCampaign.class);
	
@Test

	public void manage_surveyTocampaign() throws InterruptedException, SQLException {
		
	WebDriverWait wait = new WebDriverWait(driver, 50);  // Wait till the element is not visible

	WebElement mscamp = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("campaignhover"))));
	mscamp.click(); // hover on campaign
	
	Actions mcamp_action = new Actions(driver);
	mcamp_action.moveToElement(mscamp).perform();
	Thread.sleep(5000);
	WebElement manage_campele = driver.findElement(By.xpath(properties.getProperty("managecampaigns"))); //click on manage campaign
	mcamp_action.moveToElement(manage_campele);
	mcamp_action.click();
	mcamp_action.perform();

	Thread.sleep(4000);

	
	driver.findElement(By.xpath(properties.getProperty("survey_tab"))).click(); //Click on Survey Tab
	Thread.sleep(5000);
logger.info("Clicked on the Survey tab");
	
//	driver.findElement(By.xpath(properties.getProperty("tocamp_gearicon"))).click(); 
//	Thread.sleep(3000);
//	driver.findElement(By.xpath(properties.getProperty("Click_edit"))).click();
//	Thread.sleep(3000);
//	WebDriverWait folder_dropdown = new WebDriverWait(driver, 50);
//	WebElement f_dropdown = folder_dropdown
//			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("s_select_folder_dropdown"))));  //select folder dropdown
//	Thread.sleep(2000);
//	
// 	Select fdropdown = new Select(f_dropdown); 
// 	fdropdown.selectByValue("1106");  //select by value
// 	
// 	Thread.sleep(4000);
// 	driver.findElement(By.xpath(properties.getProperty("update_button"))).click();//click on update
// 	Thread.sleep(2000);
// 	driver.findElement(By.xpath(properties.getProperty("click_close"))).click();//click on close button
// 	Thread.sleep(4000);
// 	
// logger.info("click on Gear icon");
// 	driver.findElement(By.xpath(properties.getProperty("tocamp_gearicon"))).click();  	
// 	Thread.sleep(3000);
// 	driver.findElement(By.xpath(properties.getProperty("click_copy_campaign"))).click();
// 	Thread.sleep(3000);
// 	driver.findElement(By.xpath(properties.getProperty("click_save_changes"))).click();//click on Save Changes.
//	Thread.sleep(2000);
//logger.info("campaign copied successfully");
//	
	
logger.info("click on Gear icon");	
	driver.findElement(By.xpath(properties.getProperty("tocamp_gearicon1"))).click();  	
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("click_Preview"))).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath(properties.getProperty("click_close_preview"))).click();
	Thread.sleep(5000);
	
	
logger.info("click on Gear icon");
	driver.findElement(By.xpath(properties.getProperty("tocamp_gearicon1"))).click();  	
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("click_archieve_camp"))).click();  	
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("click_archieved_campaigns"))).click();  	
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("t_gearicon"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("click_unarchieve_camp"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("click_active_campaigns"))).click();
	Thread.sleep(3000);
	
	
		}

}
