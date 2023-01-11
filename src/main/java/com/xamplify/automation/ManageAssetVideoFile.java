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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageAssetVideoFile {


	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\AssetLibrary.properties");
	final Logger logger = LogManager.getLogger(ManageAssetVideoFile.class);


	//sorting order for assets  
	@Test (priority=295,enabled=true)
	public void assetsorting_mp4() throws InterruptedException, IOException {	    	   
		Thread.sleep(8000);
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


	//grid and list view  -- successfull
	@Test (priority=296,enabled=true)
	public void gridlistview_mp4() throws InterruptedException
	{
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click(); //click on manage assets
		Thread.sleep(7000);		

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

	//search asset and view asset  
	@Test (priority=297,enabled=true)
	public void viewassetvideo_mp4() throws InterruptedException 	
	{
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("mp4");
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("viewicon_click_mp4"))).click(); //click on preview icon of mp4
		Thread.sleep(6000);
		logger.info("Assetvideofile viewed succesfully");



	}

	//search assset and edit video 
	@Test (priority=298,enabled=true)
	public void editassetvideo_mp4() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("mp4");
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();		
		//clicking on edit icon against to first asset file (mp4)
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("editicon_click"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("calltoaction_click"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("enable_on"))).click(); //click on enable on
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("fname&lname"))).click(); //uncheck first and last name 
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("skip"))).click(); //uncheck skip option
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("uppertext"))).sendKeys("upper_text"); //enter upper text
		Thread.sleep(6000);
		logger.info("upper text updated successfully");
		driver.findElement(By.xpath(properties.getProperty("lowertext"))).sendKeys("lower_text"); //enter lower text
		Thread.sleep(6000);
		logger.info("lower text updated successfully");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-750)");
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("updatebutton"))).click();
		Thread.sleep(6000);
		logger.info("clicked on update button");	
		
		String actualresult_asset=driver.findElement(By.xpath(properties.getProperty("Success"))).getText();
		Thread.sleep(3000);
		String expectedresult_asset = "Details Updated Successfully";                                
		if(expectedresult_asset.equals(actualresult_asset))
		{
			logger.info("Assetvideofile updated successfully");      
		}
		else
		{
			logger.info("Error while updating asset file-video");
		}
		
		Thread.sleep(3000);

	}





	//search asset and download asset 
	@Test (priority=299,enabled=true)
	public void downloadassetvideo_mp4() throws InterruptedException 	
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("mp4");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();		
		//clicking on download icon against to first asset file (mp4)
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("download_click_mp4"))).click(); //click on download of first mp4
		Thread.sleep(2000);
		logger.info("Assetvideofile downloaded successfully");

	}

	//search asset and publish asset to partner 
	@Test (priority=300,enabled=true)
	public void publishassetvideo_mp4() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("mp4");
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();	
		Thread.sleep(7000);

		//clicking on publish icon against to first asset file (mp4)
		driver.findElement(By.xpath(properties.getProperty("publish_click_mp4"))).click(); //click on publish link
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar_publish"))).sendKeys("automatedPartner");
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick_publish"))).click();		
		//clicking on edit icon against to first asset file (video)
		Thread.sleep(6000);		
		driver.findElement(By.xpath(properties.getProperty("arrow_click"))).click(); //select arrow of partner company
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("partner_select"))).click(); //select partner
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("submit_button"))).click();
		Thread.sleep(3000); 
		logger.info("clicked on submit button");	
		
		String actualresult_asset=driver.findElement(By.xpath(properties.getProperty("published_page"))).getText();
		Thread.sleep(3000);
		String expectedresult_asset = "Published Successfully";                                
		if(expectedresult_asset.equals(actualresult_asset))
		{
			logger.info("Asset video file published successfully");      
		}
		else
		{
			logger.info("Error while publishing asset file");
		}
		
		Thread.sleep(3000);								
		driver.findElement(By.xpath(properties.getProperty("cross_icon_publish"))).click();
		Thread.sleep(6000);
	}


	//search asset and createcompaign -- successfull
	@Test (priority=301,enabled=true)
	public void createcompaign_mp4() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("mp4");
		Thread.sleep(6000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(6000);	
		driver.findElement(By.xpath(properties.getProperty("createcompaign_icon_mp4"))).click();
		Thread.sleep(3000);	
		logger.info("Redirected to create compaign page-not creaing campaign");
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click();
		Thread.sleep(6000);	
		driver.findElement(By.xpath(properties.getProperty("unsave_compaign"))).click();
		Thread.sleep(6000);	
		logger.info("compaign page is closed");
		Thread.sleep(6000);	
	}


	//search asset and analytics -- succesfull
	@Test (priority=302,enabled=true)
	public void viewanalyticsvideo_mp4() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("mp4");
		Thread.sleep(7000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(7000); 
		driver.findElement(By.xpath(properties.getProperty("viewanalytics_icon_mp4"))).click(); //click on analytics
		Thread.sleep(9000);
		driver.findElement(By.xpath(properties.getProperty("cross_icon"))).click();	
		logger.info("able to view analytics of assetvideo-mp4 (if analytics are avaliable)");		
	}


	//	search asset and Delete asset video-mp4
	@Test (priority=303,enabled=true)
	public void deleteassetvideo_mp4() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("mp4");	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("deleteicon_click_mp4"))).click(); //click on delete icon of mp4 asset 
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("yes_on_deletepopup"))).click();
		Thread.sleep(7000);
		WebElement success = driver.findElement(By.xpath(properties.getProperty("asset_delete_grid")));	
		String actualresult = success.getText();
		if(actualresult.contains("Deleted Successfully"))
		{
			logger.info("Assetfile-mp4 deleted succesfully");	
		}
		else
		{
			logger.info("Assetfile has been used in campaigns, it can't be deleted.");		
		}	
	}
}


