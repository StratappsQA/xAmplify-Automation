package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ManageMDF_Vendor {


	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\MDF.properties");

	final Logger logger = LogManager.getLogger(ManageMDF_Vendor.class);

	@Test (priority=192,enabled=true)
	public void Add_MDF_Amount_vendor() throws InterruptedException
	{
		//add funds
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("MDF_leftmenu"))).click(); //click on MDF left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Manage_MDF"))).click(); //click on manage mdf details 
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Search_field_MDF"))).sendKeys("automatedpartner"); //search with automated partner
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Search_icon_MDF"))).click(); //click on search icon
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("edit_icon_MDF"))).click(); //click on edit icon against to automatedpartner to add mdf amount
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("enteramount_MDF"))).sendKeys("10000"); //enter 100 in enter amount field
		Thread.sleep(7000);	
		driver.findElement(By.xpath(properties.getProperty("description_MDF"))).sendKeys("Adding mdf funds"); //enter description
		Thread.sleep(7000);
		logger.info("Amount and description provided in the text fields");
		driver.findElement(By.xpath(properties.getProperty("updatebutton_MDF"))).click(); //click on update button
		Thread.sleep(5000);
		logger.info("update button has been clicked");
		driver.findElement(By.xpath(properties.getProperty("okbutton_popup_MDF"))).click(); //click on OK on success popup
		Thread.sleep(5000);
		logger.info("OK button has been clicked on success pop up and funds added successfully");

		//Remove some added mdf funds
		driver.findElement(By.xpath(properties.getProperty("edit_icon_MDF"))).click(); //click on edit icon against to automatedpartner to remove some added mdf amount
		Thread.sleep(5000);
		Select dropdown_mdf = new Select(driver.findElement(By.xpath(properties.getProperty("mdf_dropdown_click")))); //click on select option dropdown
		driver.findElement(By.xpath(properties.getProperty("mdf_dropdown_click"))).click();
		Thread.sleep(6000);
		dropdown_mdf.selectByVisibleText("Remove Funds");  //selecting remove funds from the dropdown
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("enteramount_MDF"))).sendKeys("8000"); //enter 80 in enter amount field
		Thread.sleep(7000);	
		driver.findElement(By.xpath(properties.getProperty("description_MDF"))).sendKeys("Removing mdf funds"); //enter description
		Thread.sleep(7000);
		logger.info("Amount and description provided in the text fields");
		driver.findElement(By.xpath(properties.getProperty("updatebutton_MDF"))).click(); //click on update button
		Thread.sleep(5000);
		logger.info("update button has been clicked");
		driver.findElement(By.xpath(properties.getProperty("okbutton_popup_MDF"))).click(); //click on OK on success popup
		Thread.sleep(5000);
		logger.info("OK button has been clicked on success pop up and funds removed successfully");

		//click on view history icon and view the history
		driver.findElement(By.xpath(properties.getProperty("historyicon_MDF"))).click(); //click on view history icon
		Thread.sleep(5000);
		//scroll down till webpage end
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(7000);
		logger.info("Scrolled down till end");
		//scroll up till top
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		logger.info("Scrolled up in the web page");
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("crossicon_MDF"))).click(); //click on cross icon in view history page
		Thread.sleep(5000);
		logger.info("cross icon has been clicked in view history page");			

	}



	@Test (priority=193,enabled=true)
	public void Sorting_order_mdf_vendor() throws InterruptedException
	{	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("MDF_leftmenu"))).click(); //click on MDF left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Manage_MDF"))).click(); //click on manage mdf details 
		Thread.sleep(7000);
		// click on sorting dropdown and sort by values
		Select values = new Select(driver.findElement(By.xpath(properties.getProperty("Clickondropdown_MDF")))); //click on sorting order drodpown
		Thread.sleep(5000);
		values.selectByVisibleText("First Name (A-Z)");
		logger.info("sorted in First Name (A-Z) order");
		Thread.sleep(4000);
		values.selectByVisibleText("First Name (Z-A)");
		logger.info("sorted in First Name (Z-A) order");
		Thread.sleep(4000);
		values.selectByVisibleText("Last Name (A-Z)");
		logger.info("sorted in Last Name (A-Z) order");
		Thread.sleep(4000);
		values.selectByVisibleText("Last Name (Z-A)");
		logger.info("sorted in Last Name (Z-A) order");
		Thread.sleep(4000);
		values.selectByVisibleText("Email Id (A-Z)");
		logger.info("sorted in Email Id (A-Z) order");
		Thread.sleep(4000);
		values.selectByVisibleText("Company Name (A-Z)");
		logger.info("sorted in Company Name (A-Z) order");
		Thread.sleep(4000);
		values.selectByVisibleText("Company Name (Z-A)");
		logger.info("sorted in Company Name (Z-A) order");
		Thread.sleep(4000);
		values.selectByVisibleText("Created On (ASC)");
		logger.info("sorted in Created On (ASC) order");
		Thread.sleep(4000);
		values.selectByVisibleText("Created On (DESC)");
		logger.info("sorted in Created On (DESC) order");
		Thread.sleep(4000);
		System.out.println("sorting done successfully in manage mdf page-vendor");

	}



	@Test (priority=194,enabled=true)
	public void edit_mdf_form_vendor() throws InterruptedException
	{
		//add fields in mdf form
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("MDF_leftmenu"))).click(); //click on MDF left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Manage_MDF"))).click(); //click on manage mdf details 
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("edit_mdf_form"))).click(); //click on edit mdf form button
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("add_fields_form"))).click(); //click on add fields button
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("singleline_textfield"))).click(); //click on singletextfield option
		Thread.sleep(3000);
		logger.info("Single line text field is added in to the form");
		driver.findElement(By.xpath(properties.getProperty("crossicon_addfields"))).click(); //click on cross icon in all optional fields page 
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("updatebutton_addfield"))).click(); //click on update button
		Thread.sleep(4000);
		logger.info("update button has been clicked");
		//scroll up till top
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		logger.info("Scrolled up in the web page");
		Thread.sleep(7000); 
		String actualresult_addfield=driver.findElement(By.xpath(properties.getProperty("addfield_successgrid"))).getText();
		Thread.sleep(3000);
		String expectedresult_addfield = "Form Updated Successfully";                                
		if(expectedresult_addfield.equals(actualresult_addfield))
		{
			System.out.println("Form is updated successfully");
			logger.info("from is updated with one new single line text field");
		}
		else
		{
			System.out.println("Form is not updated");
		}
		Thread.sleep(3000);   

		driver.findElement(By.xpath(properties.getProperty("crossicon_editmdf"))).click(); //click on cross icon after field has been added
		Thread.sleep(6000);
		System.out.println("cross icon has been clicked"); 

		//remove the added field in mdf edit form
		driver.findElement(By.xpath(properties.getProperty("edit_mdf_form"))).click(); //click on edit mdf form button
		Thread.sleep(4000);
		//scroll down till webpage end
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(9000);
		logger.info("Scrolled down till end");
		driver.findElement(By.xpath(properties.getProperty("delete_field_mdf"))).click(); //click on edit mdf form button
		Thread.sleep(6000);         
		driver.findElement(By.xpath(properties.getProperty("updatebutton_addfield"))).click(); //click on edit mdf form button
		Thread.sleep(4000);  
		logger.info("clicked on update button");
		//scroll up till top
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		logger.info("Scrolled up in the web page");
		Thread.sleep(7000); 
		String actualresult_deletefield=driver.findElement(By.xpath(properties.getProperty("addfield_successgrid"))).getText();
		Thread.sleep(3000);
		String expectedresult_deletefield = "Form Updated Successfully";                                
		if(expectedresult_deletefield.equals(actualresult_deletefield))
		{
			System.out.println("Form is updated successfully");
			logger.info("field is deleted and updated successfully");
		}
		else
		{
			System.out.println("Form is not updated");
		}
		Thread.sleep(3000);   
		driver.findElement(By.xpath(properties.getProperty("crossicon_editmdf"))).click(); //click on cross icon after field has been deleted
		Thread.sleep(6000);
		System.out.println("cross icon has been clicked");	
		logger.info("one additional field is added and deleted successfully in mdf form");

	}



}
