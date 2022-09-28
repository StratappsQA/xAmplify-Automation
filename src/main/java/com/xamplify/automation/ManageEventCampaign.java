package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ManageEventCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\ManageEventCampaign.properties");
final Logger logger = LogManager.getLogger(ManageEventCampaign.class);
	
@Test
public void manage_event_editdelete() throws InterruptedException, SQLException {

	WebDriverWait wait = new WebDriverWait(driver, 50);// Wait till the element is not visible

	WebElement mevecam = wait
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("manage_eve_campaignhover"))));
	mevecam.click(); // hover on campaign
	Actions mevecamp_action = new Actions(driver);
	mevecamp_action.moveToElement(mevecam).perform();
	Thread.sleep(5000);

	WebElement manage_eve_cam = driver.findElement(By.xpath(properties.getProperty("manage_eventcampaign"))); // manage campaign
	mevecamp_action.moveToElement(manage_eve_cam);
	mevecamp_action.click();
	mevecamp_action.perform();
	Thread.sleep(5000);

	driver.findElement(By.xpath(properties.getProperty("manage_event_tab"))).click();// eventtab
	Thread.sleep(3000);

	driver.findElement(By.xpath(properties.getProperty("meve_gear_icon"))).click(); //gear icon

	Thread.sleep(3000);
	
	
	
	
	
	
	

	driver.findElement(By.xpath(properties.getProperty("meve_copycampaign"))).click(); //copy campaign icon

	Thread.sleep(3000);

	driver.findElement(By.xpath(properties.getProperty("meve_copy_saveas"))).click(); //save the copycampaign

	Thread.sleep(3000);

	driver.findElement(By.xpath(properties.getProperty("meve_gear_icon2"))).click(); //gear  icon

	Thread.sleep(3000);
	
	driver.findElement(By.xpath(properties.getProperty("meve_delete"))).click(); //delete  icon

	Thread.sleep(3000);
	
	driver.findElement(By.xpath(properties.getProperty("meve_delete_yes"))).click(); //yes delete  icon

	Thread.sleep(3000);
	
	
	
	
}


}
