package com.xamplify.automation;

import java.io.IOException;
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
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageAssetPNG {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\AssetLibrary.properties");
	final Logger logger = LogManager.getLogger(ManageAssetPNG.class);


	//sorting order of assets 
	@Test (priority=0,enabled=true)
	public void assetsorting_png() throws InterruptedException, IOException 
	{	    	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click(); //click on manage assets
		Thread.sleep(6000);		
		// click on sorting dropdown and sort by values
		Select values = new Select(driver.findElement(By.xpath(properties.getProperty("Clickondropdown")))); //click on sorting order drodpown
		Thread.sleep(6000);
		values.selectByVisibleText("Name(A-Z)");
		Thread.sleep(6000);
		logger.info("sorted in Name(A-Z) order");
		values.selectByVisibleText("Name(Z-A)");	
		Thread.sleep(6000);
		logger.info("sorted in Name(Z-A) order");
		values.selectByVisibleText("Created On(DESC)");
		Thread.sleep(6000);
		logger.info("sorted in Created On(DESC) order");
		values.selectByVisibleText("Created On(ASC)");
		logger.info("sorted in Created On(ASC) order");
		logger.info("sorting successfully completed");
	}


	//grid and list view  
	@Test (priority=1,enabled=true)
	public void gridlistview_png() throws InterruptedException
	{
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click(); //click on manage assets
		Thread.sleep(6000);		

		//clicking on grid view
		WebElement gridview = driver.findElement(By.xpath(properties.getProperty("gridclick")));
		if(gridview.isEnabled())
		{
			gridview.click();
			Thread.sleep(6000);		
		}
		else
		{
			System.out.println("grid view icon is disabled");
		}
		logger.info("assets viewed in grid view");

		Thread.sleep(6000);		

		//clickng on folder list view
		WebElement folderlistview = driver.findElement(By.xpath(properties.getProperty("folderlistclick")));
		if(folderlistview.isEnabled())
		{
			folderlistview.click();
			Thread.sleep(6000);
			driver.findElement(By.xpath(properties.getProperty("listview_items"))).click(); //to view all items in folder list view
			Thread.sleep(6000);
			logger.info("all items viewed under folder list view");			
		}	
		else
		{
			System.out.println(" folder list view icon is disabled");
		}
		logger.info("assets viewed in folderlist view");
		Thread.sleep(6000);		


		//clickng on folder grid view
		WebElement foldergridview = driver.findElement(By.xpath(properties.getProperty("foldergridclick")));
		if(foldergridview.isEnabled())
		{
			foldergridview.click();
			Thread.sleep(6000);
			WebElement ele = driver.findElement(By.xpath("//div[@id='category-icon-div']"));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			Thread.sleep(6000);
			driver.findElement(By.xpath(properties.getProperty("gridview_items"))).click(); //to view all items in folder gird view
			Thread.sleep(6000);
			driver.findElement(By.xpath(properties.getProperty("go_back"))).click(); //click on go back
			Thread.sleep(6000);
			logger.info("all items viewed under folder grid view");
		}
		else
		{
			System.out.println(" folder grid view icon is disabled");
		}
		logger.info("assets viewed in foldergrid view");
		Thread.sleep(6000);		


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
	}


	//search asset and view asset and download asset --succesfull
	@Test (priority=2,enabled=true)
	public void viewasset_png() throws InterruptedException 	
	{

		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("asset_png");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("viewicon_click"))).click(); //click on preview icon
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("closebutton_click"))).click();
		logger.info("Assetfile previewed successfully");			
		//download asset
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("download_click"))).click(); //click on download icon
		Thread.sleep(4000);
		logger.info("Assetfile downloaded successfully");
	}



	//search asset and click on analytics -- succesfull
	@Test (priority=3,enabled=true)
	public void viewanalytics_png() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("asset_png");
		Thread.sleep(4000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); 
		Thread.sleep(4000);	

		driver.findElement(By.xpath(properties.getProperty("viewanalytics_icon"))).click(); //click on analytics icon
		Thread.sleep(4000);	

		logger.info("analytics icon has been clicked-but no parnter details avaliable");	

		driver.findElement(By.xpath(properties.getProperty("cross_icon"))).click();	
		Thread.sleep(4000);	

		logger.info("able to view analytics of asset");	
	}


	//search asset and publish asset to partner
	@Test (priority=4,enabled=true)
	public void publishasset_png() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("asset_png");
		Thread.sleep(6000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); 
		Thread.sleep(6000);	
		driver.findElement(By.xpath(properties.getProperty("publish_click"))).click(); //click on publish link
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar_publish"))).sendKeys("automatedPartner");
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick_publish"))).click();		
		//clicking on edit icon against to first asset file (png)
		Thread.sleep(6000);		
		driver.findElement(By.xpath(properties.getProperty("arrow_click"))).click(); //select arrow of partner company
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("partner_select"))).click(); //select partner
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("submit_button"))).click();
		Thread.sleep(6000);		
		logger.info("clicked on submit button");	
		
		String actualresult_asset=driver.findElement(By.xpath(properties.getProperty("published_page"))).getText();
		Thread.sleep(3000);
		String expectedresult_asset = "Published Successfully";                                
		if(expectedresult_asset.equals(actualresult_asset))
		{
			logger.info("partner asset published successfully");      
		}
		else
		{
			logger.info("Error while publishing the asset to partner");
		}
		
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("cross_icon_publish"))).click();
		logger.info("cross icon has been clicked");

	}

	//search assset and edit png 
	@Test (priority=5,enabled=true)
	public void editasset_png() throws InterruptedException
	{

		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();	
		Thread.sleep(6000);		
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("asset_png");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();		
		//clicking on edit icon against to first asset file (png)
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("editicon_click"))).click();  //click on edit icon
		Thread.sleep(8000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).clear();
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description_edit"); //updating with description		
		Thread.sleep(8000); 
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("Update"))).click();
		Thread.sleep(3000); 
		logger.info("clicked on update button");	
		
		String actualresult_asset=driver.findElement(By.xpath(properties.getProperty("Success"))).getText();
		Thread.sleep(3000);
		String expectedresult_asset = "Details Updated Successfully";                                
		if(expectedresult_asset.equals(actualresult_asset))
		{
			logger.info("Assetfile-png updated successfully with description");      
		}
		else
		{
			logger.info("Error while updating asset file");
		}
		
		Thread.sleep(6000);
	

	}

	//search asset and Delete asset
	@Test (priority=6,enabled=true)
	public void deleteasset_png() throws InterruptedException
	{

		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("asset_png");	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("deleteicon_click"))).click(); //click on delete icon
		Thread.sleep(4000);
		logger.info("clicked on delete icon");	
		driver.findElement(By.xpath(properties.getProperty("yes_on_deletepopup"))).click();
		Thread.sleep(4000);
		logger.info("clicked on yes on delete pop up");	
		
		String actualresult_asset=driver.findElement(By.xpath(properties.getProperty("asset_delete_grid"))).getText();
		Thread.sleep(3000);
		if(actualresult_asset.contains("Deleted Successfully"))
		{
			logger.info("Assetfile-png deleted succesfully");      
		}
		else
		{
			logger.info("Assetfile has been used in campaigns,it can't be deleted");
		}
		
		Thread.sleep(6000);	
		
		
	}


	//view detailed anaytics of png asset in vendor account after partner viewed and downloaded the asset in partner account
	@Test (priority = 7,enabled=true)
	public void viewanalyticsvendor_png() throws InterruptedException, IOException 
	{	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();	//click on managemyasset
		Thread.sleep(6000);		
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("partnerasset"); //search with partnerasset
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("viewanalytics_icon_partnerasset"))).click(); //click on analytics icon against to asset-png
		Thread.sleep(8000);	
		logger.info("analytics icon has been clicked against to asset-png");
		driver.findElement(By.xpath(properties.getProperty("viewanalytics_partner"))).click(); // click analytics of partner
		Thread.sleep(8000);
		logger.info("analytics icon has been clicked against to partner");
		driver.findElement(By.xpath(properties.getProperty("partner_only_view"))).click(); //click on view button in analytics
		Thread.sleep(8000);	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		logger.info("displayed only viewed assets");	
		driver.findElement(By.xpath(properties.getProperty("partner_only_download"))).click(); //click on download button in analytics
		Thread.sleep(7000);	
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,150)", "");
		logger.info("displayed only downloaded assets");
		driver.findElement(By.xpath(properties.getProperty("searchloc"))).sendKeys("India"); //search with India
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(7000);
		logger.info("searched with India");
		driver.findElement(By.xpath(properties.getProperty("crossicon_click"))).click(); //click on cross icon in detailed anayltics page
		Thread.sleep(7000);
		logger.info("cross icon has been clicked");
		logger.info("detailed anaytics of asset are viewed in vendor account after partner viewed&downloaded the png asset");
		driver.findElement(By.xpath(properties.getProperty("crossicon_click"))).click(); //click on cross icon in parnter info page

	}


	//view detailed anaytics of pdf asset in vendor account after partner viewed and downloaded the asset in partner account
	@Test (priority = 8,enabled=true)
	public void viewanalyticsvendor_pdf() throws InterruptedException, IOException {		
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();	//click on managemyasset
		Thread.sleep(6000);		
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("pdf"); //search with pdf
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("viewanalytics_icon_pdf"))).click(); //click on analytics icon agaisnt to asset
		Thread.sleep(6000);	
		logger.info("analytics icon has been clicked against to pdf asset");
		driver.findElement(By.xpath(properties.getProperty("viewanalytics_partner"))).click(); // click analytics of partner
		Thread.sleep(6000);
		logger.info("analytics icon has been clicked against to partner-pdf");
		driver.findElement(By.xpath(properties.getProperty("partner_only_view"))).click(); //click on view button in analytics
		Thread.sleep(6000);	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		logger.info("displayed only viewed pdf assets");	
		driver.findElement(By.xpath(properties.getProperty("partner_only_download"))).click(); //click on download button in analytics
		Thread.sleep(6000);	
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,150)", "");
		logger.info("displayed only downloaded pdf assets");
		driver.findElement(By.xpath(properties.getProperty("searchloc"))).sendKeys("India"); //search with India
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(6000);
		logger.info("searched with India");
		driver.findElement(By.xpath(properties.getProperty("crossicon_click"))).click(); //click on cross icon in detailed anayltics page
		Thread.sleep(6000);
		logger.info("cross icon has been clicked");
		logger.info("detailed anaytics of pdf asset are viewed in vendor account after partner viewed&downloaded the pdf asset");
		driver.findElement(By.xpath(properties.getProperty("crossicon_click"))).click(); //click on cross icon in parnter info page			
		Thread.sleep(10000);

		//design -- create a new pdf by clicking on save as 
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("pdf"); //search with pdf
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("designicon_pdf"))).click(); //click on design icon of pdf 
		Thread.sleep(10000);	
		driver.switchTo().frame(0);
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Savebutton"))).click(); // click on  save button
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		//change the pdf name and click on save as button
		driver.findElement(By.xpath(properties.getProperty("PDFName"))).clear(); //clear existing pdf name
		driver.findElement(By.xpath(properties.getProperty("PDFName"))).sendKeys(properties.getProperty("PDFName_txt_saveas")+ "_" + System.currentTimeMillis());
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("PDF_Saveas_button"))).click(); // click on  save as button
		Thread.sleep(8000); 
		logger.info("New pdf has been created");
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click(); //click on refresh icon

		//design -- new version of pdf will be created when clicks on save button	
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("pdf"); //search with pdf
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("designicon_pdf"))).click(); //click on design icon of pdf 
		Thread.sleep(4000);	
		driver.switchTo().frame(0);
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("Savebutton"))).click(); // click on  save button
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		//change the pdf name and click on save button
		driver.findElement(By.xpath(properties.getProperty("PDFName"))).clear(); // clear existing pdf name
		driver.findElement(By.xpath(properties.getProperty("PDFName"))).sendKeys(properties.getProperty("PDFName_txt_save")+ "_" + System.currentTimeMillis());
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("SavePDF"))).click(); // click on  save as button
		Thread.sleep(6000); 
		logger.info("new pdf has been created with new version");
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click(); //click on refresh icon
		Thread.sleep(6000); 
		//click on history icon to view newly created pdf
		driver.findElement(By.xpath(properties.getProperty("historyicon_pdf"))).click(); // click on  histoty icon 
		Thread.sleep(12000); 
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,200)", "");
		logger.info("newly created pdf has been viewed with new version-grid is maximized");
		driver.findElement(By.xpath(properties.getProperty("historyicon_pdf"))).click(); // click on  minus  icon to minimize grid
		Thread.sleep(8000);
		logger.info("clicked on minus icon and the grid is minimized");

	}


}





























