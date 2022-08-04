package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ManageSurveyCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\ManageCampaigns.properties");
final Logger logger = LogManager.getLogger(SurveyCampaign.class);
	
@Test

	public void manage_scampaign() throws InterruptedException, SQLException {
		
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

	
//	driver.findElement(By.xpath(properties.getProperty("survey_tab"))).click(); //Click on Survey Tab
//	Thread.sleep(3000);
logger.info("Clicked on the Survey tab");
	driver.findElement(By.xpath(properties.getProperty("gear_icon"))).click(); //Click on gear icon
	Thread.sleep(3000);
logger.info("Click on the Gear icon");
	driver.findElement(By.xpath(properties.getProperty("edit"))).click();
	Thread.sleep(3000);
logger.info("Click on the Edit Icon");
 	WebDriverWait folder_dropdown = new WebDriverWait(driver, 50);
	WebElement f_dropdown = folder_dropdown
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("s_select_folder_dropdown"))));  //select folder dropdown
	Thread.sleep(2000);
	
 	Select fdropdown = new Select(f_dropdown); 
 	fdropdown.selectByValue("1106");  //select by value
 	
 	Thread.sleep(4000);
 	driver.findElement(By.xpath(properties.getProperty("update_button"))).click();//click on update
 	Thread.sleep(2000);
 	driver.findElement(By.xpath(properties.getProperty("click_close"))).click();//click on close button
 	Thread.sleep(4000);
 logger.info("click on Gear icon");
 	driver.findElement(By.xpath(properties.getProperty("gear_icon"))).click(); //Click on gear icon
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("copy_campaign"))).click();//Click on Copy Campaign
	Thread.sleep(2000);
	driver.findElement(By.xpath(properties.getProperty("click_save_changes"))).click();//click on Save Changes.
	Thread.sleep(2000);
logger.info("campaign copied successfully");

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("gear_icon_t"))).click(); //Click on gear icon
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("update_end_date"))).click(); //click on update end date
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("campaign_end_date"))).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath(properties.getProperty("select_date"))).click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("save_changes"))).click();
	Thread.sleep(3000);
	

	driver.findElement(By.xpath(properties.getProperty("gear_icon_t"))).click(); //Click on gear icon
	Thread.sleep(3000);
	//driver.findElement(By.xpath(properties.getProperty("preview&delete_partner"))).click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("preview"))).click();
	Thread.sleep(5000);
//	JavascriptExecutor js1 = (JavascriptExecutor) driver;
//	js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("preview_close"))).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("gear_icon_t"))).click(); //Click on gear icon
	Thread.sleep(3000);
	driver.findElement(By.cssSelector(properties.getProperty("archieve_campaign"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("archieved_campaign_button"))).click();//click on archieved campaigns button
	Thread.sleep(4000);
	driver.findElement(By.xpath(properties.getProperty("archieved_gear_icon"))).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector(properties.getProperty("unarchieved_option"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("active_campaigns_botton"))).click();//click on active campaigns button
	Thread.sleep(4000);
	
	
	driver.findElement(By.xpath(properties.getProperty("grid_view"))).click();// click on grid view
	Thread.sleep(4000);
	driver.findElement(By.xpath(properties.getProperty("folder_grid_view"))).click(); //click on folder grid view
	Thread.sleep(4000);
	driver.findElement(By.xpath(properties.getProperty("fgv_search"))).sendKeys("automatedvendor"); // click on search bar under folder grid view
	Thread.sleep(4000);
	driver.findElement(By.xpath(properties.getProperty("search_click"))).click();// click on search icon
	Thread.sleep(4000);
	
	
}


}
