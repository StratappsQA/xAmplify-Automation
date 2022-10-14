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

		driver.findElement(By.xpath(properties.getProperty("PDFName"))).sendKeys(properties.getProperty("PDFName_txt"));
		Thread.sleep(10000);

		driver.switchTo().frame(1);
		driver.findElement(By.xpath(properties.getProperty("PDFDescription"))).click();
		driver.findElement(By.xpath(properties.getProperty("PDFDescription"))).sendKeys(properties.getProperty("PDFDescription_txt"));
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("SavePDF"))).click();

		logger.info("pdf saved succesfully");
		Thread.sleep(10000);

		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Template Added Successfully";

		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion succesfull for success message");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click(); //click on refresh icon













	}

}
