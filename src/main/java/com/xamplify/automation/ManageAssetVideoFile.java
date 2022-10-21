package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageAssetVideoFile {


	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\AssetLibrary.properties");
	final Logger logger = LogManager.getLogger(ManageAssetVideoFile.class);


	//sorting order for assets  -- successfull
	@Test (priority=0)
	public void assetsorting() throws InterruptedException, IOException {	    	   
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


	//grid and list view  -- successfull
	@Test (priority=1)
	public void gridlistview() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click(); //click on manage assets
		Thread.sleep(5000);		

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

		WebElement listview = driver.findElement(By.xpath(properties.getProperty("listclick")));
		if(listview.isEnabled())
		{
			listview.click();
		}
		else
		{
			System.out.println("list view icon is disabled");
		}
		logger.info("assets viewed in list and grid view");

	}

	//search asset and view asset  -- succesfull
	@Test (priority=2)
	public void viewassetvideo() throws InterruptedException 	
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("mp4");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("viewicon_click"))).click(); //click on preview icon
		Thread.sleep(3000);
		logger.info("Assetvideofile viewed succesfully");



	}

	//search assset and edit video - need to check
	@Test (priority=3)
	public void editassetvideo() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("mp4");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();		
		//clicking on edit icon against to first asset file (mp4)
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("editicon_click"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("calltoaction_click"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("enable_on"))).click(); //click on enable on
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("fname&lname"))).click(); //uncheck first and last name 
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("skip"))).click(); //uncheck skip option
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("uppertext"))).sendKeys("upper_text");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("lowertext"))).sendKeys("lower_text");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-750)");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("updatebutton"))).click();
		Thread.sleep(5000);

		logger.info("Assetvideofile updated succesfully");
		WebElement success1 = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult1 = success1.getText();
		String expectedresult1 = "Details Updated Successfully";
		Assert.assertEquals(actualresult1, expectedresult1);
		logger.info("update assertion succesfull for video");

	}





	//search asset and download asset -- succesfull
	@Test (priority=4)
	public void downloadassetvideo() throws InterruptedException 	
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("mp4");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("download_click"))).click(); //click on download of first mp4
		Thread.sleep(2000);
		logger.info("Assetvideofile downloaded succesfully");



	}

	//search asset and publish asset to partner -- successfull
	@Test (priority=5)
	public void publishassetvideo() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("mp4");
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); 
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("publish_click"))).click(); //click on publish link
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar_publish"))).sendKeys("automatedPartner");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick_publish"))).click();		
		//clicking on edit icon against to first asset file (video)
		Thread.sleep(5000);		
		driver.findElement(By.xpath(properties.getProperty("arrow_click"))).click(); //select arrow of partner company
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("partner_select"))).click(); //select partner
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("submit_button"))).click();
		Thread.sleep(5000);
		logger.info("Asset video file published succesfully");
		//Assertion 1st way for published asset
		Thread.sleep(5000);
		WebElement published = driver.findElement(By.xpath(properties.getProperty("published_page")));	
		String actualresult2 = published.getText();
		String expectedresult2 = "Published Successfully";				
		Assert.assertEquals(actualresult2, expectedresult2);
		logger.info("Assertion for published succesfull");	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("cross_icon_publish"))).click();

	}


	//search asset and createcompaign -- successfull
	@Test (priority=6)
	public void createcompaign() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("mp4");
		Thread.sleep(3000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("createcompaign_icon"))).click();
		Thread.sleep(3000);	
		logger.info("Redirected to create compaign page");
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click();
		Thread.sleep(3000);	

		driver.findElement(By.xpath(properties.getProperty("unsave_compaign"))).click();
		Thread.sleep(3000);	
		logger.info("compaign page closed");


	}


	//search asset and analytics -- succesfull
	@Test (priority=7)
	public void viewanalyticsvideo() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("mp4");
		Thread.sleep(3000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("viewanalytics_icon"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("cross_icon"))).click();	
		logger.info("able to view analytics of assetvideo");		
	}


	//	search asset and Delete asset video -- succesfull
	@Test (priority=8)
	public void deleteassetvide() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("mp4");	
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("deleteicon_click"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("yes_on_deletepopup"))).click();
		Thread.sleep(5000);
		logger.info("Assetfile deleted succesfully");

	}




}
