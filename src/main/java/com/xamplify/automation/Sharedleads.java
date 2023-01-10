package com.xamplify.automation;


import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Sharedleads {
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\Sharedleads.properties");
	final Logger logger = LogManager.getLogger(PartnerLogin.class);

	@Test(priority = 220, enabled = true)
	public void sharedleads() throws InterruptedException, SQLException {
		Thread.sleep(5000);

	driver.findElement(By.xpath(properties.getProperty("sharedleads"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(properties.getProperty("search"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(properties.getProperty("search"))).sendKeys("Harish");
	Thread.sleep(2000);
	driver.findElement(By.xpath(properties.getProperty("search"))).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	Select se = new Select(driver.findElement(By.xpath(properties.getProperty("select"))));
	
	// Select the option by index
	se.selectByIndex(3);
	
	Thread.sleep(2000);
	driver.findElement(By.xpath(properties.getProperty("icon"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(properties.getProperty("search1"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(properties.getProperty("search1"))).sendKeys("Harish");
	Thread.sleep(2000);
	driver.findElement(By.xpath(properties.getProperty("search1"))).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
Select se1 = new Select(driver.findElement(By.xpath(properties.getProperty("select1"))));
	
	// Select the option by index
	se1.selectByIndex(3);
	Thread.sleep(3000);
	
	
	WebElement all_tile_shareleads = driver.findElement(By.xpath(properties.getProperty("all_tile_edit")));
	
	 if (all_tile_shareleads.isEnabled()) {
		 all_tile_shareleads.click();
     Thread.sleep(5000);
	 }
	 
     else {
    	 System.out.println("Leads count is zero");
    	 Thread.sleep(3000);
     }
	 
		WebElement valid_tile_shareleads = driver.findElement(By.xpath(properties.getProperty("valid")));
		
		 if (valid_tile_shareleads.isEnabled()) {
			 valid_tile_shareleads.click();
	     Thread.sleep(5000);
		 }
	     else {
	    	 System.out.println("Valid Leads count is zero");
	    	 Thread.sleep(3000);
	    	 
	    	 
	     }
		 Thread.sleep(3000);
		 WebElement undeliverable_tile_shareleads = driver.findElement(By.xpath(properties.getProperty("undeliverable")));
			
		 if (undeliverable_tile_shareleads.isEnabled()) {
			 undeliverable_tile_shareleads.click();
	     Thread.sleep(5000);
		 }
	     else {
	    	 System.out.println("undeliverable Leads count is zero");
	    	 Thread.sleep(3000);
	     }
		 Thread.sleep(3000);
		 WebElement unsubscribe_tile_shareleads = driver.findElement(By.xpath(properties.getProperty("unsubscribe")));
			
		 if (unsubscribe_tile_shareleads.isEnabled()) {
			 unsubscribe_tile_shareleads.click();
	     Thread.sleep(5000);
		 }
	     else {
	    	 System.out.println("unsubscribe Leads count is zero");
	    	 Thread.sleep(3000);
	     }
	}
		 @Test(priority = 221, enabled = true)
	public void managesharedleads() throws InterruptedException, SQLException {
				Thread.sleep(5000);
		 driver.findElement(By.xpath(properties.getProperty("managesharedleads"))).click();
		 Thread.sleep(5000);
		 
		
		 
			WebElement valid_tile_manageshareleads = driver.findElement(By.xpath(properties.getProperty("valid_tile")));
			
			 if (valid_tile_manageshareleads.isEnabled()) {
				 valid_tile_manageshareleads.click();
		     Thread.sleep(5000);
			 }
		     else {
		    	 System.out.println("Valid Leads count is zero");
		    	 Thread.sleep(3000);
		    	 
		    	 
		     }
			 Thread.sleep(3000);
			 WebElement undeliverable_tile_shareleads = driver.findElement(By.xpath(properties.getProperty("undeliverable_tile")));
				
			 if (undeliverable_tile_shareleads.isEnabled()) {
				 undeliverable_tile_shareleads.click();
		     Thread.sleep(5000);
			 }
		     else {
		    	 System.out.println("undeliverable Leads count is zero");
		    	 Thread.sleep(3000);
		     }
			 
			 Thread.sleep(3000);
			 WebElement unsubscribe_tile_shareleads = driver.findElement(By.xpath(properties.getProperty("unsubscribe_tile")));
			 
			 Thread.sleep(4000);
				
			 if (unsubscribe_tile_shareleads.isEnabled()) {
				 unsubscribe_tile_shareleads.click();
		     Thread.sleep(5000);
			 }
		     else {
		    	 System.out.println("unsubscribe Leads count is zero");
		    	 Thread.sleep(3000);
		     }
			 WebElement all_tile_manageshareleads = driver.findElement(By.xpath(properties.getProperty("manageall")));
				
			 if (all_tile_manageshareleads.isEnabled()) {
				 all_tile_manageshareleads.click();
		     Thread.sleep(5000);
			 }
			 
		     else {
		    	 System.out.println("Leads count is zero");
		    	 Thread.sleep(3000);
		     }
			 
			 driver.findElement(By.xpath(properties.getProperty("campaignanalytics"))).click();
			 Thread.sleep(5000);
		 driver.findElement(By.xpath(properties.getProperty("close"))).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(properties.getProperty("sharedleads"))).click();
	}
	
}
	
