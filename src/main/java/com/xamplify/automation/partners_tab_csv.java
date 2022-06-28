package com.xamplify.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;
import com.opencsv.CSVWriter;

public class partners_tab_csv {
	private static final TimeUnit Seconds = null;
	static WebDriver driver = Instance.getInstance();
	static Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Partners.properties");
	final Logger logger = LogManager.getLogger(partners_tab_csv.class);
	
	
	@Test(priority=7,enabled=true)
	public void copy_from_clipboard2() throws InterruptedException, SQLException, IOException

	{
		
		 WebDriverWait wait = new WebDriverWait(driver,30);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("copyFromClipBoard")));
			//logger.debug("Starting creating partner using copy from clipboard - comma separated");

			driver.findElement(By.id("copyFromClipBoard")).click();// click copy from clipboard
			Select delimiter = new Select(driver.findElement(By.xpath("//div[@class='col-xs-6']//select[@class='opts form-control']")));
			delimiter.selectByValue("TabSeperated");
			driver.findElement(By.xpath(properties.getProperty("drop"))).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(properties.getProperty("drop"))).sendKeys("Legitimate interest - prospect/lead");// enter data for legal basis field
			 Thread.sleep(1000);
			 
			 WebElement textbox2 =driver.findElement(By.xpath(properties.getProperty("drop")));
			 textbox2.sendKeys(Keys.ENTER);// click enter in the keyboard
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(properties.getProperty("drop"))).sendKeys("Legitimate interest - existing customer");// enter data for legal basis field
			 Thread.sleep(1000);
			 textbox2.sendKeys(Keys.ENTER);// click enter in the keyboard
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(properties.getProperty("drop"))).click();
			 Thread.sleep(1000);
			driver.findElement(By.xpath(properties.getProperty("drop"))).sendKeys("Legitimate interest - other");// enter data for legal basis field
			Thread.sleep(1000);
			 textbox2.sendKeys(Keys.ENTER);// click enter in the keyboard
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(properties.getProperty("drop"))).click();
			 Thread.sleep(1000);
			driver.findElement(By.xpath(properties.getProperty("drop"))).sendKeys("Performance of a contract");// enter data for legal basis field
			Thread.sleep(1000);
			 textbox2.sendKeys(Keys.ENTER);// click enter in the keyboard
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(properties.getProperty("drop"))).click();
			 Thread.sleep(1000);
			driver.findElement(By.xpath(properties.getProperty("drop"))).sendKeys("Freely given consent from contact");// enter data for legal basis field
			Thread.sleep(1000);
			 textbox2.sendKeys(Keys.ENTER);// click enter in the keyboard
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(properties.getProperty("drop"))).click();
			 Thread.sleep(1000);
			driver.findElement(By.xpath(properties.getProperty("drop"))).sendKeys("Not applicable");// enter data for legal basis field
			Thread.sleep(1000);
			 textbox2.sendKeys(Keys.ENTER);// click enter in the keyboard
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(properties.getProperty("clip"))).click();
			 Thread.sleep(1000);
			 
			 
			 ((JavascriptExecutor) driver).executeScript(
						"document.getElementById('copyFromclipTextArea').value='Teja	Doddipati	Stratapps	QAAutomationEngineer	';");
				Thread.sleep(5000);
				driver.findElement(By.id(properties.getProperty("cfcfieldid")))
						.sendKeys(System.currentTimeMillis() + "banoj@stratapps.com	");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath(properties.getProperty("verify"))).click();
				driver.findElement(By.xpath(properties.getProperty("actions"))).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath(properties.getProperty("save"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(properties.getProperty("accept1"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(properties.getProperty("limit"))).sendKeys("100");
				Thread.sleep(2000);
				driver.findElement(By.xpath(properties.getProperty("Not"))).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath(properties.getProperty("team_member_group"))).click();
				Thread.sleep(3000);
				
				
				
				//Select objSelect = new Select(driver.findElement(By.xpath(properties.getProperty("option"))));
				//objSelect.selectByIndex(1);
			driver.findElement(By.xpath(properties.getProperty("option"))).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath(properties.getProperty("checkbox"))).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath(properties.getProperty("proceed"))).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath(properties.getProperty("save1"))).click();
				Thread.sleep(5000);
					
							
	}
	
	
		
}