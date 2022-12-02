package com.xamplify.automation;

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

public class VendorOpportunities extends ExtentReportsClass {
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\git\\xAmplifyproject\\xAmplify-Automation\\src\\main\\resources\\VendorOpportunities.properties");
	final Logger logger = LogManager.getLogger(VendorOpportunities.class);
	
	@Test(priority = 1, enabled= true)
	public void vendor_opportunities() throws InterruptedException{
		
		WebDriverWait vendor_opportunities_wait = new WebDriverWait(driver, 90);
		WebElement Ven_Opportunities_module = vendor_opportunities_wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("hover_opportunities_module"))));
		Ven_Opportunities_module.click();

		logger.info("Hovered on Opportunities module");
		Thread.sleep(3000);

		Actions opp_action = new Actions(driver);
		opp_action.moveToElement(Ven_Opportunities_module).perform();
		Thread.sleep(5000);

		logger.info("Click on Manage Leads");
		WebElement manage_leads = driver.findElement(By.xpath(properties.getProperty("click_vendor_manage_leads")));
		manage_leads.click();

		Thread.sleep(6000);
	}
	
	@Test(priority = 2, enabled = true)
	public void manage_leads() throws InterruptedException {
		
		Thread.sleep(6000);

		logger.info("click on search");
		WebElement manage_leads_Seach = driver.findElement(By.xpath(properties.getProperty("click_manage_leads_search_box")));
		manage_leads_Seach.sendKeys("mounika");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("click_manage_leads_search_icon"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("clear_search_lead_data"))).click();
		Thread.sleep(3000);
		
		logger.info("click on View lead icon");
		driver.findElement(By.xpath(properties.getProperty("click_manage_view_lead"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("close_manage_view_lead"))).click();
		Thread.sleep(4000);
		
		logger.info("click on comments icon");
		driver.findElement(By.xpath(properties.getProperty("click_ml_comments_icon"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_comment_text_box"))).sendKeys("Hello Lead");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_comment_submit"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("close_ml_comment_section"))).click();
		Thread.sleep(4000);
		
		logger.info("click on Campaign_view");
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaign_view"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_Viewleads_for_this_campaign"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaign_view_search_partner"))).sendKeys("Automated");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaign_view_search_icon_partner"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaign_view_search_partner_data_close"))).click();
		Thread.sleep(6000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollTo(document.body.scrollHeight,300)");
		  Thread.sleep(5000);
		
		logger.info("click on Number of leads icon");
		driver.findElement(By.xpath(properties.getProperty("click_ml_number_of_leads_icon"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_ViewLead_icon"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_ViewLead_close"))).click();
		Thread.sleep(3000);
		
		logger.info("click on comments icon");
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_comments_icon"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_commentstextbox"))).sendKeys("Hello Lead");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_comments_submit"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_comments_close"))).click();
		Thread.sleep(3000);
		
		logger.info("click on filter in campaign view");
		
		WebElement Campaogn_view_filter = driver.findElement(By.xpath(properties.getProperty("click_ml_campaign_view_filter")));
		Campaogn_view_filter.click();
		Thread.sleep(3000);
		
		
		
		logger.info("click on status dropdown");
		
		Select manage_leads_campaignview_status_drpdown = new Select(driver.findElement(By.xpath(properties.getProperty("click_manage_leads_campaignview_status_drpdown"))));
		manage_leads_campaignview_status_drpdown.selectByValue("Converted");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_filterbutton"))).click();
		Thread.sleep(5000);
		
		
		
		
		
	}

		
		
	

}
