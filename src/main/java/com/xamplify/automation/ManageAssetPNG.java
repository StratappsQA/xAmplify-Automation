package com.xamplify.automation;

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
	
	
	@Test
	public void manageassets() throws InterruptedException
	{
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();
		
		Thread.sleep(5000);

		
		// click on sorting dropdown and sort by values
	   /* Select values = new Select(driver.findElement(By.xpath(properties.getProperty("Clickondropdown"))));
		Thread.sleep(5000);
		values.selectByVisibleText("Name(A-Z)");
		Thread.sleep(5000);
		values.selectByVisibleText("Name(Z-A)");
		Thread.sleep(5000);
		values.selectByVisibleText("Created On(DESC)");
		Thread.sleep(5000);
		values.selectByVisibleText("Created On(ASC)");*/
		
		//grid and list view 
		/*WebElement gridview = driver.findElement(By.xpath(properties.getProperty("gridclick")));
		if(gridview.isEnabled())
		{
			gridview.click();
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
		}*/
		
		
		//search assset  -
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys(properties.getProperty("Name_text1"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		
		
		

		
		//Manage asset - for uploaded file asset (png,txt,pdf....) 
		// click on sorting dropdown and sort by values
		   /* Select values = new Select(driver.findElement(By.xpath(properties.getProperty("Clickondropdown"))));
			Thread.sleep(5000);
			values.selectByVisibleText("Name(A-Z)");
			Thread.sleep(5000);
			values.selectByVisibleText("Name(Z-A)");
			Thread.sleep(5000);
			values.selectByVisibleText("Created On(DESC)");
			Thread.sleep(5000);
			values.selectByVisibleText("Created On(ASC)");
	     	logger.info("sorting succesfully completed");*/

		
		
			//grid and list view 
			/*WebElement gridview = driver.findElement(By.xpath(properties.getProperty("gridclick")));
			if(gridview.isEnabled())
			{
				gridview.click();
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
			}*/
			

			//search assset  -
						 
			driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys(properties.getProperty("Name_text1"));
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
			
			//clicking on edit icon against to asset file (png)
			Thread.sleep(3000);
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
//			WebElement success1 = driver.findElement(By.xpath(properties.getProperty("Success")));	
//			String actualresult1 = success1.getText();
//			String expectedresult1 = "Details Updated Successfully";
//			Assert.assertEquals(actualresult1, expectedresult1);
//			logger.info("update assertion succesfull");

			
			//search asset
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys(properties.getProperty("Name_text1"));
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
			
			//clicking on preview icon
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("viewicon_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("closebutton_click"))).click();
			logger.info("Assetfile previewed succesfully");
			
			//download asset
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("download_click"))).click();
			Thread.sleep(3000);
			logger.info("Assetfile downloaded succesfully");
			
			//publish asset to partner
			driver.findElement(By.xpath(properties.getProperty("publish_click"))).click();
			driver.findElement(By.xpath(properties.getProperty("arrow_click"))).click();
			driver.findElement(By.xpath(properties.getProperty("partner_select"))).click();
			driver.findElement(By.xpath(properties.getProperty("submit_button"))).click();
			logger.info("Assetfile published succesfully");
			//Assertion 1st way for published asset
			WebElement published = driver.findElement(By.xpath(properties.getProperty("published_page")));	
			String actualresult2 = published.getText();
			String expectedresult2 = "Published Successfully";				
			Assert.assertEquals(actualresult2, expectedresult2);
			logger.info("Assertion for published succesfull");			
			//Assertion 2nd way for published asset
			String publish = driver.findElement(By.xpath(properties.getProperty("published_page"))).getText(); // success message
			System.out.println(publish);			
			String expectedtitle ="Published Successfully";
			
			if(expectedtitle.equals(publish))
			{
				System.out.println("Asset Published to partner succesfully");
			}
			else {
				System.out.println("Asset is not published");
			}
			
			
			//Delete asset
			driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys(properties.getProperty("Name_text1"));
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
			driver.findElement(By.xpath(properties.getProperty("deleteicon_click"))).click();
			driver.findElement(By.xpath(properties.getProperty("yes_on_deletepopup"))).click();
			logger.info("Assetfile deleted succesfully");

			
			

	
}


		
		
		
		
		
		
		
		
		
		
	
		
		
				
		
		
	}
	

