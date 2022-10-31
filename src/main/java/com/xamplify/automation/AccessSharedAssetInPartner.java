package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//this class need to run in partner account to view and download asset
public class AccessSharedAssetInPartner {


	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\AssetLibrary.properties");
	final Logger logger = LogManager.getLogger(AccessSharedAssetInPartner.class);


	@Test 
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
		logger.info("cross icon has been clicked and page is redirected to asstes");

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
}

