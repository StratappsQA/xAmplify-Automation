package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//this class need to run in partner account to view and download asset
public class AccessSharedAssetInPartner {


	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\AssetLibrary.properties");
	final Logger logger = LogManager.getLogger(AccessSharedAssetInPartner.class);


	//view and download png asset file in partner account
	@Test (priority = 0)
	public void sharedasset() throws InterruptedException, IOException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("access_sharedasset"))).click(); //click on access shared asset
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("partnerasset"); //search with partnerasset 
		Thread.sleep(3000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); //click on search icon
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("partner_asset_view"))).click();  //click on view icon of shared asset
		logger.info("Assetfile has been viewed in partner account successfully");
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("partner_asset_download"))).click();  //click on download button of shared asset
		logger.info("Assetfile has been downloaded in partner account successfully");
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("partner_cross_icon"))).click(); //click on cross icon
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("partnerasset"); //search with partnerasset 
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); //click on search icon
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("partner_view_analytics"))).click(); //click on analytics icon
		Thread.sleep(10000);	
		logger.info("Analytics have been viewed succesfully in partner account for the assetfile");	
		driver.findElement(By.xpath(properties.getProperty("partner_only_view"))).click(); //click on view button in analytics
		Thread.sleep(5000);	
		logger.info("displayed only viewed assets");	
		driver.findElement(By.xpath(properties.getProperty("partner_only_download"))).click(); //click on download button in analytics
		Thread.sleep(5000);	
		logger.info("displayed only downloaded assets");
		driver.findElement(By.xpath(properties.getProperty("searchloc"))).sendKeys("India"); //search with India
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("crossicon_click"))).click(); //click on cross icon in detailed anayltics page
		Thread.sleep(3000);
		logger.info("cross icon has been clicked and page is redirected to all asstes");

		//clicking on grid view
		WebElement gridview = driver.findElement(By.xpath(properties.getProperty("gridclick")));
		if(gridview.isEnabled())
		{
			gridview.click();
			Thread.sleep(5000);		
		}
		else
		{
			System.out.println("grid view icon is disabled");
		}
		logger.info("assets viewed in grid view");

		//clickng on folder list view
		WebElement folderlistview = driver.findElement(By.xpath(properties.getProperty("folderlistclick")));
		if(folderlistview.isEnabled())
		{
			folderlistview.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("listview_items"))).click(); //to view all items in folder list view
			Thread.sleep(5000);
			logger.info("all items viewed under folder list view");			
		}	
		else
		{
			System.out.println(" folder list view icon is disabled");
		}
		logger.info("assets viewed in folderlist view");
		
		//clickng on folder grid view
		WebElement foldergridview = driver.findElement(By.xpath(properties.getProperty("foldergridclick")));
		if(foldergridview.isEnabled())
		{
			foldergridview.click();
			Thread.sleep(5000);
			WebElement ele = driver.findElement(By.xpath("//div[@id='category-icon-div']"));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("gridview_items"))).click(); //to view all items in folder gird view
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("go_back"))).click(); //click on go back
			Thread.sleep(5000);
			logger.info("all items viewed under folder grid view");
		}
		else
		{
			System.out.println(" folder grid view icon is disabled");
		}
		logger.info("assets viewed in foldergrid view");

		//clickng on list view
		WebElement listview = driver.findElement(By.xpath(properties.getProperty("listclick")));
		if(listview.isEnabled())
		{
			listview.click();
		}
		else
		{
			System.out.println("list view icon is disabled");
		}
		logger.info("assets viewed in list view");


		// click on sorting dropdown and sort by values
		Select values = new Select(driver.findElement(By.xpath(properties.getProperty("Clickondropdown")))); //click on sorting order drodpown
		Thread.sleep(5000);
		values.selectByVisibleText("Name(A-Z)");
		Thread.sleep(5000);
		logger.info("sorted in Name(A-Z) order");
		values.selectByVisibleText("Name(Z-A)");	
		Thread.sleep(5000);
		logger.info("sorted in Name(Z-A) order");
		values.selectByVisibleText("Published On(ASC)");
		Thread.sleep(5000);
		logger.info("sorted in Published On(ASC) order");
		values.selectByVisibleText("Published On(DESC)");
		logger.info("sorted in Published On(DESC) order");
		logger.info("sorting succesfully completed");
	}
	
	
	
  //view,edit and download pdf asset file in partner account
	@Test (priority = 1)
	public void sharedassetpdf() throws InterruptedException, IOException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("access_sharedasset"))).click(); //click on access shared asset
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("pdf"); //search with partnerasset 
		Thread.sleep(3000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); //click on search icon
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("partner_editicon_pdf"))).click(); //click on edit icon against to shared pdf
		Thread.sleep(10000);
		logger.info("pdf edit icon has been clicked");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(properties.getProperty("partner_save_button"))).click(); //click on save button pdf
		Thread.sleep(5000);
		logger.info("pdf template updated successfully");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("pdf"); //search with pdf 
		Thread.sleep(3000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); //click on search icon
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("partner_pdfasset_view"))).click();  //click on view icon of shared asset
		logger.info("pdf Assetfile has been viewed in partner account successfully");
		Thread.sleep(3000);	
		driver.findElement(By.xpath(properties.getProperty("partner_asset_download"))).click();  //click on download button of shared asset
		logger.info("pdf Assetfile has been downloaded in partner account successfully");
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("partner_cross_icon"))).click(); //click on cross icon
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("pdf"); //search with pdf 
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); //click on search icon
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("partner_pdfasset_analytics"))).click(); //click on analytics icon
		Thread.sleep(10000);	
		logger.info("Analytics have been viewed succesfully in partner account for the pdf assetfile");	
		driver.findElement(By.xpath(properties.getProperty("partner_only_view"))).click(); //click on view button in analytics
		Thread.sleep(5000);	
		logger.info("displayed only viewed pdf assets");	
		driver.findElement(By.xpath(properties.getProperty("partner_only_download"))).click(); //click on download button in analytics
		Thread.sleep(5000);	
		logger.info("displayed only downloaded pdf assets");
		driver.findElement(By.xpath(properties.getProperty("crossicon_click"))).click(); //click on cross icon in detailed anayltics page
		Thread.sleep(4000);
		logger.info("cross icon has been clicked and page is redirected to all asstes");
		
	}
	
}

