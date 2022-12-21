package com.xamplify.automation;

import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ManageMDFRequests_Vendor {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\MDF-xAmplify\\src\\main\\resources\\MDF.properties");

	final Logger logger = LogManager.getLogger(ManageMDFRequests_Vendor.class);

	@Test (priority=1,enabled=true)
	public void mdf_request_vendor() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("MDF_leftmenu"))).click(); //click on MDF left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Manage_MDFRequest_Vendor"))).click(); //click on manage mdf requests in vendor account 
		Thread.sleep(6000);
		String actualresult_tm1=driver.findElement(By.xpath(properties.getProperty("title_grid"))).getText();
		System.out.println("Request title is"+ actualresult_tm1);
		driver.findElement(By.xpath(properties.getProperty("Search_field_MDF"))).sendKeys(actualresult_tm1); //search with request title
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Search_icon_MDF"))).click(); //click on search icon
		Thread.sleep(3000);
		System.out.println("searched with request title in vendor account");

		//click on (+) icon - and view details
		driver.findElement(By.xpath(properties.getProperty("view_more_columns"))).click(); //click on view more columns icon ('+' icon against to request)
		Thread.sleep(5000);
		
		//scroll down till webpage end
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(7000);
		logger.info("Scrolled down till end");
		logger.info("request details displayed when clicks on + icon - vendor");
		driver.findElement(By.xpath(properties.getProperty("hide_more_columns"))).click(); //click on hide icon ('-' icon against to request)
		Thread.sleep(4000);
		logger.info("request details minimized when clicks on - icon - vendor");

		//click on change request icon 
		driver.findElement(By.xpath(properties.getProperty("change_request_mdf"))).click(); //click on change requets icon 
		Thread.sleep(3000);
		//scroll down till webpage end
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(7000);
		logger.info("Scrolled down till end");
		//scroll up till top
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		logger.info("Scrolled up in the web page");
		Thread.sleep(7000);		
		driver.findElement(By.xpath(properties.getProperty("action_button_mdf"))).click(); //click on action button 
		Thread.sleep(3000);	
		driver.findElement(By.xpath(properties.getProperty("changemdf_request"))).click(); //click on change mdf request option under action options
		Thread.sleep(4000);
		logger.info("selected 'Change MDF Request Status & Assignment' option");
		driver.findElement(By.xpath(properties.getProperty("description_mdf_request"))).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("description_mdf_request"))).sendKeys("Changing mdf request status"); //enter description to change mdf request
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("allocated_amount"))).sendKeys("10000");//enter allocated amount
		Thread.sleep(4000);
		logger.info("allocated amount has been entered");
		driver.findElement(By.xpath(properties.getProperty("allocation_datepicker"))).click(); //click on date picker
		Thread.sleep(7000);		
		driver.findElement(By.xpath(properties.getProperty("event_select_date"))).click(); //select date - (after 3 days of current date)
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("updatebutton_changerequest"))).click(); //click on update button
		Thread.sleep(6000);
		String actualresult_mdf=driver.findElement(By.xpath(properties.getProperty("errormessage_grid"))).getText();
		Thread.sleep(3000);
		String expectedresult_mdf = "There is a problem with your submission.Please check highlighted errors below.";                                
		if(expectedresult_mdf.equals(actualresult_mdf))
		{
			
			System.out.println("status is - new request open; so need to change the status");
			Select status_request = new Select(driver.findElement(By.xpath(properties.getProperty("status_dropdown_click")))); //click on status dropdown 
			Thread.sleep(6000);
			status_request.selectByVisibleText("In Progress,assigned to manager (Open)"); //select In Progress,assigned to manager (Open) from the dropdown
			logger.info("'In Progress,assigned to manager (Open)' dropdown has been selected");
			driver.findElement(By.xpath(properties.getProperty("updatebutton_changerequest"))).click(); //click on update button
			Thread.sleep(6000);
			driver.findElement(By.xpath(properties.getProperty("ok_button_popup_status"))).click(); //click on ok button on pop up
			Thread.sleep(6000);
			logger.info("request status changed successfully");

		}
		else
		{
			System.out.println("status is - not in new request open state; so no need to change the status");
			driver.findElement(By.xpath(properties.getProperty("ok_button_popup_status"))).click(); //click on ok button on pop up
			Thread.sleep(6000);
			System.out.println("request status changed successfully");
		} 
		
					
		logger.info("status has been changed to the request");
		Thread.sleep(3000);                        

		//view timeline
		driver.findElement(By.xpath(properties.getProperty("action_button_mdf"))).click(); //click on action button 
		Thread.sleep(3000);	
		driver.findElement(By.xpath(properties.getProperty("view_timeline"))).click(); //click on view _timeline option under action options
		Thread.sleep(4000);
		//scroll down till webpage end
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(7000);
		logger.info("Scrolled down till end");
		//scroll up till top
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		logger.info("Scrolled up in the web page");
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("download_button_document"))).click(); //click on download documents grid
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("downloadicon_document"))).click(); //click on download icon against to uploaded document
		Thread.sleep(4000);
		logger.info("document has been downloaded successfully");		
		driver.findElement(By.xpath(properties.getProperty("cross_icon_view_timeline"))).click(); //click on cross icon
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("cross_icon_view_timeline"))).click(); //click on cross icon
		Thread.sleep(5000);	
		logger.info("view timeline option has been selected and viewed the history of the request");
		
		
			
		//click on view history icon 
		driver.findElement(By.xpath(properties.getProperty("Search_field_MDF"))).sendKeys(actualresult_tm1); //search with request title
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Search_icon_MDF"))).click(); //click on search icon
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("view_history_icon"))).click(); //click on view history icon
		Thread.sleep(5000);	
		//scroll down till webpage end
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(7000);
		logger.info("Scrolled down till end");
		//scroll up till top
		js7.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		logger.info("Scrolled up in the web page");
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("download_button_document"))).click(); //click on download documents grid
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("downloadicon_document"))).click(); //click on download icon against to uploaded document
		Thread.sleep(4000);
		logger.info("document has been downloaded successfully");
		driver.findElement(By.xpath(properties.getProperty("cross_icon_view_timeline"))).click(); //click on cross icon
		Thread.sleep(4000);	
		logger.info("clicked on view history icon - viewed the history of the request");
		
		
		
		
		
		
		
		//add and view comments 
		driver.findElement(By.xpath(properties.getProperty("Search_field_MDF"))).sendKeys(actualresult_tm1); //search with request title
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Search_icon_MDF"))).click(); //click on search icon
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("comments_icon_mdf"))).click(); //click on comments icon
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("add_comments_mdf"))).sendKeys("adding comments to the request-vendor"); //add comments
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("submit_button_comments"))).click(); //click on submit button after adding comments
		Thread.sleep(4000);
		logger.info("comments added successfully for the request");
		driver.findElement(By.xpath(properties.getProperty("cross_icon_comments"))).click(); //click on cross icon in comments page
		Thread.sleep(4000);
		}
	

	//if allocated amount is greater than mdf amount
	@Test (priority=2,enabled=true)
	public void allocation_amount_update() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("MDF_leftmenu"))).click(); //click on MDF left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Manage_MDFRequest_Vendor"))).click(); //click on manage mdf requests in vendor account 
		Thread.sleep(6000);
		String actualresult_tm2=driver.findElement(By.xpath(properties.getProperty("title_grid"))).getText();
		System.out.println("Request title is"+ actualresult_tm2);
		driver.findElement(By.xpath(properties.getProperty("Search_field_MDF"))).sendKeys(actualresult_tm2); //search with request title
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Search_icon_MDF"))).click(); //click on search icon
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("change_request_mdf"))).click(); //click on change requets icon 
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("action_button_mdf"))).click(); //click on action button 
		Thread.sleep(3000);	
		driver.findElement(By.xpath(properties.getProperty("changemdf_request"))).click(); //click on change mdf request option under action options
		Thread.sleep(4000);
		logger.info("selected 'Change MDF Request Status & Assignment' option");
		driver.findElement(By.xpath(properties.getProperty("allocated_amount"))).sendKeys("5000000");//enter allocated amount gretaer than total mdf balance
		Thread.sleep(4000);
		logger.info("allocated amount has been entered greater than mdf amount");
		driver.findElement(By.xpath(properties.getProperty("updatebutton_changerequest"))).click(); //click on update button
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("clickhere_link"))).click(); //click on update button
		Thread.sleep(6000);
		logger.info("a new page is opened to update allocation amount");
		driver.findElement(By.xpath(properties.getProperty("enteramount_MDF"))).sendKeys("12000"); //enter 100 in enter amount field
		Thread.sleep(7000);	
		System.out.println("allocation amount is updated");
		driver.findElement(By.xpath(properties.getProperty("updatebutton_MDF"))).click(); //click on update button
		Thread.sleep(5000);
		logger.info("update button has been clicked");
		driver.findElement(By.xpath(properties.getProperty("okbutton_popup_MDF"))).click(); //click on OK on success popup
		Thread.sleep(5000);
		logger.info("OK button has been clicked on success pop up and funds updated successfully");
		driver.findElement(By.xpath(properties.getProperty("cross_icon_changestatus"))).click(); //click on cross icon
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("cross_icon_view_timeline"))).click(); //click on cross icon
		Thread.sleep(4000);	
		logger.info("page is redirected to view all mdf requests");


	}

}
