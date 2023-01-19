package com.xamplify.automation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageCampaign extends ExtentReportsClass{
	

	 WebDriver driver = Instance.getInstance();
	 Properties properties = PropertiesFile.readPropertyFile("src/main/resources/Campaign.properties");//properties file
	 
final Logger logger = LogManager.getLogger(PageCampaign.class);
	 

	 //@Test (priority=155,enabled=true)
       @Test
	public void pcampaign() throws InterruptedException, SQLException {
		

		WebDriverWait wait = new WebDriverWait(driver, 90);// Wait till the element is not visible
		
		logger.info("Mouse over the Page campaign");
		WebElement pcampele = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("page_campaignhover"))));
		pcampele.click(); // hover on campaign

		Actions pcamp_action = new Actions(driver);
		pcamp_action.moveToElement(pcampele).perform();
		Thread.sleep(8000);
		WebElement create_pcampele = driver.findElement(By.xpath(properties.getProperty("page_createcampaign"))); //click on create campaign
		pcamp_action.moveToElement(create_pcampele);
		pcamp_action.click();
		pcamp_action.perform();
		Thread.sleep(5000);
		WebDriverWait waitc1= new WebDriverWait(driver, 40);
		WebElement popncamp = waitc1.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("page_opencampaign")))); //select page campaign
		popncamp.click();
logger.info("click on the page campaign");
		List<String> campaignNames = new ArrayList<String>();
		String query = properties.getProperty("query.getCampaignNamesByOrganizationId").replaceAll(":emailId",
				properties.getProperty("user.name"));
		ResultSet resultSet = DatabaseConnection.getResultSet(query);
		while (resultSet.next()) {
			campaignNames.add(resultSet.getString("campaign_name").toLowerCase());			//query,if campaign name already exists checking 
		}
		String campaignNameFromProp = properties.getProperty("pwrite_campaigname").toLowerCase();

		driver.findElement(By.id(properties.getProperty("pcampaignName")))
				.sendKeys(properties.getProperty("pwrite_campaigname"));
		Thread.sleep(5000);
		if (campaignNames.indexOf(campaignNameFromProp) > -1) {
			driver.findElement(By.id(properties.getProperty("pcampaignName"))).clear();
			driver.findElement(By.id(properties.getProperty("pcampaignName")))
					.sendKeys(properties.getProperty("pwrite_campaigname") + "_" + System.currentTimeMillis());
		}
		
		
		 	driver.findElement(By.xpath(properties.getProperty("p_through_campaign"))).click();//through campaign
		 	Thread.sleep(2000);
		    

		    driver.findElement(By.xpath(properties.getProperty("p_subject"))).sendKeys("subject for page");//send data to the subject field 
		 	Thread.sleep(2000);

		    driver.findElement(By.xpath(properties.getProperty("p_preheader"))).sendKeys("page-preheader");//send data to pre header
		 	Thread.sleep(2000);

		    driver.findElement(By.xpath(properties.getProperty("p_Notify_Me_emailon"))).click();//notify me when email on
		 	Thread.sleep(2000);
		 	
		    
		    driver.findElement(By.xpath(properties.getProperty("p_Notify_Me_link_opened"))).click();//notify me when link opened
		 	Thread.sleep(2000);
logger.info("Given all the data in Campaign details page");

		 	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(document.body.scrollHeight,0)");//to scroll down the page
		 	
		 	driver.findElement(By.xpath(properties.getProperty("p_next1"))).click();//next page 
		 	
	 	
		 	Thread.sleep(5000);
		 	
			

		    driver.findElement(By.xpath(properties.getProperty("p_gototop"))).click();
		 	
		 	
		 	WebDriverWait wait_dropdown = new WebDriverWait(driver, 50);
			WebElement w_dropdown = wait_dropdown
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("p_select_dropdown"))));  //select dropdown
			Thread.sleep(2000);
			
		 	Select pdropdown = new Select(w_dropdown); 
		 	pdropdown.selectByVisibleText("Count(DESC)");  //select count desc
		 	
		 	Thread.sleep(4000);
		 	
		    driver.findElement(By.xpath(properties.getProperty("p_select_partnerlist"))).click();//select partner list
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_select_partnerlist_preview"))).click();//preview of the partner list
		 	Thread.sleep(5000);

		    driver.findElement(By.xpath(properties.getProperty("p_select_partnerlist_preview_close"))).click();//close the preview of partner list
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_next2"))).click();//next page
		 	Thread.sleep(5000);
logger.info("Selected the Partner List");
		 	
		 	 WebElement p_search=driver.findElement(By.xpath(properties.getProperty("p_search_template")));//search bar
		 	 p_search.sendKeys("Manual");
			 p_search.sendKeys(Keys.ENTER);
			 	Thread.sleep(4000);

			
		    driver.findElement(By.xpath(properties.getProperty("p_select_template"))).click();//to select template
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_select_template_preview"))).click();//preview of the template
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_select_template_preview_close"))).click();//close the preview of the template
		 	Thread.sleep(4000);


		    driver.findElement(By.xpath(properties.getProperty("p_next3"))).click();   //click on the next button
		 	Thread.sleep(4000);
logger.info("Selected the Template");

		   
}
}