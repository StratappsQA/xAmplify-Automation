package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
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
	@Test (priority=0)
	public void assetsorting() throws InterruptedException, IOException 
	{	    	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click(); //click on manage assets
		Thread.sleep(5000);		
		// click on sorting dropdown and sort by values
		Select values = new Select(driver.findElement(By.xpath(properties.getProperty("Clickondropdown")))); //click on sorting order drodpown
		Thread.sleep(5000);
		values.selectByVisibleText("Name(A-Z)");
		Thread.sleep(5000);
		logger.info("sorted in Name(A-Z) order");
		values.selectByVisibleText("Name(Z-A)");	
		Thread.sleep(5000);
		logger.info("sorted in Name(Z-A) order");
		values.selectByVisibleText("Created On(DESC)");
		Thread.sleep(5000);
		logger.info("sorted in Created On(DESC) order");
		values.selectByVisibleText("Created On(ASC)");
		logger.info("sorted in Created On(ASC) order");
		logger.info("sorting succesfully completed");
	}


	//grid and list view  
	@Test (priority=1)
	public void gridlistview() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click(); //click on manage assets
		Thread.sleep(5000);		

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
	}


	//search asset and view asset and download asset --succesfull
	@Test (priority=3)
	public void viewasset() throws InterruptedException 	
	{

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("asset_png");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("viewicon_click"))).click(); //click on preview icon
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("closebutton_click"))).click();
		logger.info("Assetfile previewed succesfully");			
		//download asset
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("download_click"))).click(); //click on download icon
		Thread.sleep(3000);
		logger.info("Assetfile downloaded succesfully");
	}

	

	//search asset and click on analytics -- succesfull
	@Test (priority=2)
	public void viewanalytics() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("asset_png");
		Thread.sleep(3000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); 
		Thread.sleep(3000);	

		driver.findElement(By.xpath(properties.getProperty("viewanalytics_icon"))).click();
		Thread.sleep(3000);	
		
		logger.info("analytics icon has been clicked");	

		driver.findElement(By.xpath(properties.getProperty("cross_icon"))).click();	
		Thread.sleep(3000);	

		logger.info("able to view analytics of asset");	
	}


	//search asset and publish asset to partner -- succesfull
	@Test (priority=4)
	public void publishasset() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("asset_png");
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); 
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("publish_click"))).click(); //click on publish link
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar_publish"))).sendKeys("automatedPartner");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick_publish"))).click();		
		//clicking on edit icon against to first asset file (png)
		Thread.sleep(5000);		
		driver.findElement(By.xpath(properties.getProperty("arrow_click"))).click(); //select arrow of partner company
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("partner_select"))).click(); //select partner
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("submit_button"))).click();
		Thread.sleep(5000);
		logger.info("Assetfile published succesfully");
		//Assertion 1st way for published asset
		Thread.sleep(5000);

		WebElement published = driver.findElement(By.xpath(properties.getProperty("published_page")));	
		String actualresult2 = published.getText();
		String expectedresult2 = "Published Successfully";				
		Assert.assertEquals(actualresult2, expectedresult2);
		logger.info("Assertion for partnerasset published succesfull");	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("cross_icon_publish"))).click();
		logger.info("cross icon clicked");

	}

	//Assertion 2nd way for published asset
	//			String publish = driver.findElement(By.xpath(properties.getProperty("published_page"))).getText(); // success message
	//			System.out.println(publish);			
	//			String expectedtitle ="Published Successfully";
	//			
	//			if(expectedtitle.equals(publish))
	//			{
	//				System.out.println("Asset Published to partner succesfully");
	//			}
	//			else {
	//				System.out.println("Asset is not published");
	//			}

	//search assset and edit png -- succesfull
	@Test (priority=5)
	public void editasset() throws InterruptedException
	{
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();	
		Thread.sleep(5000);		
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("asset_png");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();		
		//clicking on edit icon against to first asset file (png)
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("editicon_click"))).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).clear();
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description_edit");		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("Update"))).click();
		logger.info("Assetfile updated succesfully");
		Thread.sleep(5000);
		WebElement success1 = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult1 = success1.getText();
		String expectedresult1 = "Details Updated Successfully";
		Assert.assertEquals(actualresult1, expectedresult1);
		logger.info("update assertion succesfull");

	}

	//search asset and Delete asset -- succesfull
	@Test (priority=6)
	public void deleteasset() throws InterruptedException
	{

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("asset_png");	
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("deleteicon_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("yes_on_deletepopup"))).click();
		logger.info("Assetfile deleted succesfully");
	}
	
	
	//view detailed anaytics of png asset in vendor account after partner viewed and downloaded the asset in partner account
	@Test (priority = 7)
	public void viewanalyticsvendorpng() throws InterruptedException, IOException {	
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();	//click on managemyasset
		Thread.sleep(5000);		
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("partnerasset"); //search with partnerasset
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("viewanalytics_icon_partnerasset"))).click(); //click on analytics icon agaisnt to asset
		Thread.sleep(3000);	
		logger.info("analytics icon has been clicked against to asset-png");
		driver.findElement(By.xpath(properties.getProperty("viewanalytics_partner"))).click(); // click analytics of partner
		Thread.sleep(3000);
		logger.info("analytics icon has been clicked against to partner");

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
		logger.info("searched with India");
		driver.findElement(By.xpath(properties.getProperty("crossicon_click"))).click(); //click on cross icon in detailed anayltics page
		Thread.sleep(5000);
		logger.info("cross icon has been clicked");
		logger.info("detailed anaytics of asset are viewed in vendor account after partner viewed&downloaded the png asset");
		driver.findElement(By.xpath(properties.getProperty("crossicon_click"))).click(); //click on cross icon in parnter info page
			
	}
	
	
	//view detailed anaytics of pdf asset in vendor account after partner viewed and downloaded the asset in partner account
		@Test (priority = 8)
		public void viewanalyticsvendorpdf() throws InterruptedException, IOException {		
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();	//click on managemyasset
			Thread.sleep(5000);		
			driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("pdf"); //search with pdf
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("viewanalytics_icon_pdf"))).click(); //click on analytics icon agaisnt to asset
			Thread.sleep(3000);	
			logger.info("analytics icon has been clicked against to pdf asset");
			driver.findElement(By.xpath(properties.getProperty("viewanalytics_partner"))).click(); // click analytics of partner
			Thread.sleep(3000);
			logger.info("analytics icon has been clicked against to partner-pdf");
			driver.findElement(By.xpath(properties.getProperty("partner_only_view"))).click(); //click on view button in analytics
			Thread.sleep(5000);	
			logger.info("displayed only viewed pdf assets");	
			driver.findElement(By.xpath(properties.getProperty("partner_only_download"))).click(); //click on download button in analytics
			Thread.sleep(5000);	
			logger.info("displayed only downloaded pdf assets");
			driver.findElement(By.xpath(properties.getProperty("searchloc"))).sendKeys("India"); //search with India
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
			Thread.sleep(5000);
			logger.info("searched with India");
			driver.findElement(By.xpath(properties.getProperty("crossicon_click"))).click(); //click on cross icon in detailed anayltics page
			Thread.sleep(5000);
			logger.info("cross icon has been clicked");
			logger.info("detailed anaytics of pdf asset are viewed in vendor account after partner viewed&downloaded the pdf asset");
			driver.findElement(By.xpath(properties.getProperty("crossicon_click"))).click(); //click on cross icon in parnter info page
				
		}


}





























