package com.xamplify.automation;

import java.util.Properties;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ManageMDFRequests_Partner {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\MDF-xAmplify\\src\\main\\resources\\MDF.properties");

	final Logger logger = LogManager.getLogger(ManageMDFRequests_Partner.class);

	@Test (priority=1,enabled=true)
	public void add_request_partner() throws InterruptedException
	{
		//add requests in partner account
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("MDF_leftmenu"))).click(); //click on MDF left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Manage_MDFRequest_Partner"))).click(); //click on manage mdf requests in partner account 
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Search_field_MDF_partner"))).sendKeys("automatedVendor"); //search with automated vendor
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Search_icon_MDF"))).click(); //click on search icon
		Thread.sleep(5000);
		System.out.println("searched with automated vendor");
		
		//add request to partner
		driver.findElement(By.xpath(properties.getProperty("add_request_MDF"))).click(); //click on add request icon
		Thread.sleep(5000); 

		String generaterequesttitle=RandomStringUtils.randomAlphabetic(3);
		String Title=generaterequesttitle+"_Request Title";	
		System.out.println("Request title is"+ Title);
		driver.findElement(By.xpath(properties.getProperty("request_title_mdf"))).sendKeys(Title); // enter title 
		Thread.sleep(5000);
		Select activity = new Select(driver.findElement(By.xpath(properties.getProperty("activity_dropdown_click")))); //click on activity dropdown 
		Thread.sleep(6000);
		activity.selectByVisibleText("Promotion"); //select promotion from the dropdown
		logger.info("activity dropdown has been selected");
		driver.findElement(By.xpath(properties.getProperty("request_amount_mdf"))).sendKeys("1");  // enter request amount
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("event_datepicket_mdf"))).click(); //click on date picker
		Thread.sleep(7000);		
		driver.findElement(By.xpath(properties.getProperty("event_select_date"))).click(); //select date - (after 3 days of current date)
		Thread.sleep(6000);
		logger.info("event date has been selected");
		driver.findElement(By.xpath(properties.getProperty("request_description_mdf"))).sendKeys("Request Description"); //entere description
		Thread.sleep(6000);
		System.out.println("entered all manadatory fields");
		driver.findElement(By.xpath(properties.getProperty("submit_mdf_request"))).click(); //select date - (after 3 days of current date)
		Thread.sleep(6000);
		logger.info("submit button has been clicked");

		String actualresult_mdf=driver.findElement(By.xpath(properties.getProperty("Success_message_grid_MDF"))).getText();
		Thread.sleep(3000);
		String expectedresult_mdf = "Request Saved Successfully";				
		if(expectedresult_mdf.equals(actualresult_mdf))
		{
			System.out.println("mdf request is saved");
			logger.info("MDF request has been saved in partner account");

		}
		else
		{
			System.out.println("mdf request is not saved");
		}
		Thread.sleep(3000);		

	}

	@Test (priority=2,enabled=true)
	public void view_requests_partner() throws InterruptedException
	{
		//view requests in partner account
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("MDF_leftmenu"))).click(); //click on MDF left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Manage_MDFRequest_Partner"))).click(); //click on manage mdf requests in partner account 
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("view_requests_mdf"))).click(); //click on view requests icon 
		Thread.sleep(4000);

		String actualresult_tm=driver.findElement(By.xpath(properties.getProperty("title_grid"))).getText();
		System.out.println("Request title is"+ actualresult_tm);
		driver.findElement(By.xpath(properties.getProperty("Search_field_MDF"))).sendKeys(actualresult_tm); //search with request title
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Search_icon_MDF"))).click(); //click on search icon
		Thread.sleep(3000);
		System.out.println("searched with request title");

		//click on (+) icon - and view details
		driver.findElement(By.xpath(properties.getProperty("view_more_columns"))).click(); //click on view more columns icon ('+' icon against to request)
		Thread.sleep(5000);
		//scroll down till webpage end
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(7000);
		logger.info("Scrolled down till end");
		logger.info("request details displayed when clicks on + icon");
		driver.findElement(By.xpath(properties.getProperty("hide_more_columns"))).click(); //click on hide icon ('-' icon against to request)
		Thread.sleep(4000);
		logger.info("request details minimized when clicks on - icon");

		//click on comments icon and add comments
		driver.findElement(By.xpath(properties.getProperty("comments_icon_mdf"))).click(); //click on comments icon 
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("add_comments_mdf"))).sendKeys("adding comments to the request"); //add comments
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("submit_button_comments"))).click(); //click on submit button after adding comments
		Thread.sleep(4000);
		logger.info("comments added successfully for the request");
		driver.findElement(By.xpath(properties.getProperty("cross_icon_comments"))).click(); //click on cross icon in comments page
		Thread.sleep(4000);

		//click on history icon-view details 
		driver.findElement(By.xpath(properties.getProperty("history_icon_mdf"))).click(); //click on history icon
		Thread.sleep(4000);
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

		//click on upload document and upload document
		driver.findElement(By.xpath(properties.getProperty("upload_documents_mdf"))).click(); // move to upload document grid
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("upload_button_document"))).click(); //click on upload button
		Thread.sleep(4000);
		logger.info("page moved to upload document grid and clicked on upload button");	
		WebElement document=driver.findElement(By.xpath(properties.getProperty("choosefile_icon_mdf"))); //click on choose file icon
		document.sendKeys("D:\\Selenium\\files\\MDF_Document.csv"); // windows file upload with file path
		driver.findElement(By.xpath(properties.getProperty("description_document"))).sendKeys("Description"); //enter description to document
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("afteruploaddocument_button"))).click(); //click on upload button after file has been selected
		Thread.sleep(4000);
		logger.info("clicked on upload button after file has been uploaded");			
		driver.findElement(By.xpath(properties.getProperty("after_upload_ok_popup"))).click(); //click on ok in pop up
		Thread.sleep(4000);
		logger.info("document has been uploaded successfully");			

		//download the uploaded document
		driver.findElement(By.xpath(properties.getProperty("downloadicon_document"))).click(); //click on download icon against to uploaded document
		Thread.sleep(4000);
		logger.info("document has been downloaded successfully");			

		driver.findElement(By.xpath(properties.getProperty("cross_icon_redirection"))).click(); //click on cross icon
		Thread.sleep(4000);	
		logger.info("cross icon has been clicked and page is redirected to manage mdf requests interface");			

	}


	@Test (priority=3,enabled=true)
	public void Sorting_order_mdf_partner() throws InterruptedException
	{	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("MDF_leftmenu"))).click(); //click on MDF left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Manage_MDFRequest_Partner"))).click(); //click on manage mdf details 
		Thread.sleep(7000);
		// click on sorting dropdown and sort by values
		Select values = new Select(driver.findElement(By.xpath(properties.getProperty("Clickondropdown_MDF")))); //click on sorting order drodpown
		Thread.sleep(6000);
		values.selectByVisibleText("Company Name (A-Z)");
		logger.info("sorted in Company Name (A-Z) order");
		Thread.sleep(4000);
		values.selectByVisibleText("Company Name (Z-A)");
		logger.info("sorted in Company Name (Z-A) order");
		Thread.sleep(4000);
		values.selectByVisibleText("Number Of Requests(ASC)");
		logger.info("sorted in Number Of Requests(ASC) order");
		Thread.sleep(4000);
		values.selectByVisibleText("Number Of Requests(DESC)");
		logger.info("sorted in Number Of Requests(DESC) order");
		Thread.sleep(4000);
		values.selectByVisibleText("Created On (ASC)");
		logger.info("sorted in Created On (ASC) order");
		Thread.sleep(4000);
		values.selectByVisibleText("Created On (DESC)");
		logger.info("sorted in Created On (DESC) order");
		Thread.sleep(4000);
		System.out.println("sorting done successfully in partner acocunt");

	}
}
