package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesignPDF {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\AssetLibrary.properties");
	final Logger logger = LogManager.getLogger(DesignPDF.class);

	//create pdf asset and publish to partner
	@Test
	public void designpdf() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on content left menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("DesignPDF"))).click(); //click on design under design pdf grid
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("Savebutton"))).click(); // click on  save button
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("PDFName"))).sendKeys(properties.getProperty("PDFName_txt")+ "_" + System.currentTimeMillis());
		Thread.sleep(10000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath(properties.getProperty("PDFDescription"))).click();
		driver.findElement(By.xpath(properties.getProperty("PDFDescription"))).sendKeys(properties.getProperty("PDFDescription_txt")); //enter description
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("tag_select"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("SavePDF"))).click(); //click on savepdf
		logger.info("pdf saved succesfully");
		Thread.sleep(10000);
		
		//assertion for success message
		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Template Added Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion succesfull for success message of uploading pdf file");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click(); //click on refresh icon

		//search with the created partnerasset and publish to partner
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("pdf");
				Thread.sleep(5000);	
				driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); 
				Thread.sleep(5000);	
				driver.findElement(By.xpath(properties.getProperty("publish_click"))).click(); //click on publish link
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("Searchbar_publish"))).sendKeys("automatedPartner");
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("Searchclick_publish"))).click();		
				Thread.sleep(5000);		
				driver.findElement(By.xpath(properties.getProperty("arrow_click"))).click(); //select arrow of partner company
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("partner_select"))).click(); //select partner
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("submit_button"))).click();
				Thread.sleep(5000);
				logger.info("Assetfile pdf published succesfully");
				//Assertion 1st way for published asset
				Thread.sleep(5000);
				WebElement published = driver.findElement(By.xpath(properties.getProperty("published_page")));	
				String actualresult2 = published.getText();
				String expectedresult2 = "Published Successfully";				
				Assert.assertEquals(actualresult2, expectedresult2);
				logger.info("Assertion for published succesfull");	
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("cross_icon_publish"))).click();
				logger.info("cross icon clicked");		
				




	}

}
