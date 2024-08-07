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

public class PageCampaign {
	

	 WebDriver driver = Instance.getInstance();
	 Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");//properties file
	 
final Logger logger = LogManager.getLogger(PageCampaign.class);
	 

	 @Test
	public void pcampaign() throws InterruptedException, SQLException {
		

		WebDriverWait waitp = new WebDriverWait(driver, 60);// Wait till the element is not visible
		
		logger.info("Mouse over the Page campaign");
		WebElement pcampele = waitp.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("page_campaignhover"))));
		pcampele.click(); // hover on campaign

		Actions pcamp_action = new Actions(driver);
		pcamp_action.moveToElement(pcampele).perform();
		Thread.sleep(5000);
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
		
		
		 	driver.findElement(By.xpath(properties.getProperty("p_public_campaign"))).click();//through campaign
		 	Thread.sleep(2000);
		    

		    driver.findElement(By.xpath(properties.getProperty("p_subject"))).sendKeys("subject for page");//send data to the subject field 
		 	Thread.sleep(2000);

		    driver.findElement(By.xpath(properties.getProperty("p_preheader"))).sendKeys("page-preheader");//send data to pre header
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath(properties.getProperty("p_co_logo_ON"))).
			click();
		 	Thread.sleep(2000);
		
logger.info("Given all the data in Campaign details page");

		 	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(document.body.scrollHeight,0)");//to scroll down the page
		 	
		 	
		 	WebDriverWait wait_dropdown = new WebDriverWait(driver, 50);
			WebElement w_dropdown = wait_dropdown
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("p_select_dropdown"))));  //select dropdown
			Thread.sleep(2000);
			
		 	Select pdropdown = new Select(w_dropdown); 
		 	pdropdown.selectByVisibleText("Created On(ASC)");  //select credated On DEsc
		 	
		 	Thread.sleep(4000);
		 	
		    
		 	
		 	 WebElement p_search=driver.findElement(By.xpath(properties.getProperty("p_search_page")));//search bar
		 	 p_search.sendKeys("cobranded_Test");
			 p_search.sendKeys(Keys.ENTER);
			 	Thread.sleep(4000);

			
		    driver.findElement(By.xpath(properties.getProperty("p_select_page"))).click();//to select page
		 	Thread.sleep(4000);

		    driver.findElement(By.xpath(properties.getProperty("p_select_page_preview"))).click();//preview of the template
		 	Thread.sleep(4000);
		 	
		 	String originalWindow = driver.getWindowHandle();// store the current window handle
			waitp.until(ExpectedConditions.numberOfWindowsToBe(2)); // wait for new tab to open
			Thread.sleep(5000);

			ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles()); // get all windows handle

			driver.switchTo().window(tabs.get(1)); // switch to the new tab

			Thread.sleep(3000);

			/*
			 * WebElement companylogoNewTab =
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.
			 * getProperty("")))); companylogoNewTab.click(); //perform actions in new tab
			 */
			driver.close(); // switch back to original tab and close the new tab
			driver.switchTo().window(tabs.get(0));
			Thread.sleep(3000);


		    driver.findElement(By.xpath(properties.getProperty("p_next"))).click();   //click on the next button
		 	Thread.sleep(4000);
logger.info("Selected the Page");

			WebDriverWait wait_pdropdown = new WebDriverWait(driver, 50);
			WebElement w_pdropdown = wait_pdropdown
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("p_partner_dropdown"))));  //select dropdown
			Thread.sleep(2000);

			Select partdropdown = new Select(w_pdropdown); 
			partdropdown.selectByVisibleText("Count(ASC)");  //select count ASC
	
			Thread.sleep(4000);
			
			WebElement search_partlist = driver.findElement(By.xpath(properties.getProperty("p_search_partnerlist")));
			search_partlist.sendKeys("Active Master partner list");
			search_partlist.sendKeys(Keys.ENTER);//select partner list
			Thread.sleep(4000);


			driver.findElement(By.xpath(properties.getProperty("p_select_partnerlist"))).click();//select partner list
			Thread.sleep(4000);

			driver.findElement(By.xpath(properties.getProperty("p_select_partnerlist_preview"))).click();//preview of the partner list
			Thread.sleep(5000);

			driver.findElement(By.xpath(properties.getProperty("p_select_partnerlist_preview_close"))).click();//close the preview of partner list
			Thread.sleep(4000);

logger.info("Selected the Partner List");

		   
}
}