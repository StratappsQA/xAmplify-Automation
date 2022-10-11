package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageAssetPNG {
	
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\AssetLibrary.properties");
	final Logger logger = LogManager.getLogger(UploadAssetFile.class);
	
	
		//sorting order for assets - successfull
	    @Test (enabled = false)
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
	
		//grid and list view  -- succesfull
     	@Test (enabled = false)
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

		
		
		
		//search assset and edit png -- succesfull
     	@Test (enabled = false)
	    public void editasset() throws InterruptedException
	    {
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();	
		Thread.sleep(5000);		
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("png");
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
     	
     	
     	
			//search asset and view asset and download asset --succesfull
			@Test (enabled = false)
		    public void viewasset() throws InterruptedException 	
			{
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("png");
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
			
			
			//search asset and publish asset to partner -- succesfull
			@Test (enabled = false)
		    public void publishasset() throws InterruptedException
		    {
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("png");
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
			logger.info("Assertion for published succesfull");	
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("cross_icon_publish"))).click();
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
			
			//search asset and click on analytics -- succesfull
			@Test (enabled = false)
		    public void viewanalytics() throws InterruptedException
		    {
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("png");
			Thread.sleep(3000);	
			driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); 
			Thread.sleep(3000);	

			driver.findElement(By.xpath(properties.getProperty("viewanalytics_icon"))).click();
			Thread.sleep(3000);	

			driver.findElement(By.xpath(properties.getProperty("cross_icon"))).click();	
			Thread.sleep(3000);	

			logger.info("able to view analytics of asset");	
		    }
			
			
           //search asset and Delete asset -- succesfull
			@Test
		    public void deleteasset() throws InterruptedException
		    {
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();		
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("png");	
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("deleteicon_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("yes_on_deletepopup"))).click();
			logger.info("Assetfile deleted succesfully");
			
		    }
									
}

			
			
			

	




		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	
	

