package com.xamplify.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;


//import org.apache.commons.lang3.RandomStringUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
//import com.opencsv.CSVWriter;

public class partners_tab_csv {
	private static final TimeUnit Seconds = null;
	static WebDriver driver = Instance.getInstance();
	static Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplifyproject\\xAmplify-Automation\\src\\main\\resources\\Partners.properties");
	final Logger logger = LogManager.getLogger(partners_tab_csv.class);

	@Test(priority = 8, enabled = true)
	public void onboarding_section() throws Throwable

	{
		Thread.sleep(3000);
		Select sortby = new Select(driver.findElement(By.xpath(properties.getProperty("sort"))));
		sortby.selectByVisibleText("Email(A-Z)");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("search1"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("search1"))).sendKeys("gayatri");
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("search1"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("entityinfo1"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("actionsin"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("saveasin"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("legall"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("legall"))).sendKeys("Legitimate interest - other");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("legall"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("nameofthelist"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("nameofthelist")))
				.sendKeys("harish" + System.currentTimeMillis() + "_");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("button12"))).click();
		Thread.sleep(2000);

	}



	@Test(priority = 9, enabled = true)
	public void onboard_icons() throws Throwable {
		Thread.sleep(8000);
		partners_onboard_comma onboard = new partners_onboard_comma();
		onboard.Signinprocess();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("resendemail"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("editpartner"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("companyid"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("companyid")))
				.sendKeys("newcompany name" + "_" + System.currentTimeMillis());
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("updatepartner"))).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("deletepartneronboard"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("yesdeleteit"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("sharecampaigns"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("checkallcampaigns"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("sharecampaigns2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("closing"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("partneranalytics"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("closeanalytics"))).click();
		Thread.sleep(5000);

	}

	@Test(priority = 10, enabled = true)
	public void Managepartners() throws Throwable

	{

		WebElement partners = driver.findElement(By.xpath(properties.getProperty("hoverpartner")));// hover to partners
																									// module in left
																									// menu
		Actions actions = new Actions(driver);
		actions.moveToElement(partners).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("managepartner"))).click();

	}

	@Test(priority = 11, enabled = true)
	public void Managepartners_icons() throws Throwable

	{
		Thread.sleep(3000);
		Select sortby1 = new Select(driver.findElement(By.xpath(properties.getProperty("sortbymanagepartners"))));
		sortby1.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("searchmanage"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("searchmanage"))).sendKeys("Active Master Partner List");
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("searchmanage"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("copyandsave"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("copyandsavename"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("copyandsavename")))
				.sendKeys("automated list" + "_" + System.currentTimeMillis());
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("savenamechanges"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("downloadlist"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("campain"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("entinfo"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("sharingcampaigns"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("closing"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("editlist"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("editinglist"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("cname"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("cname")))
				.sendKeys("cname" + " " + System.currentTimeMillis());

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("phnumber"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("phnumber"))).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("updated"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("managep"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("searchmanage"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("searchmanage"))).sendKeys("active");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("searchmanage"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("share1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("allcampains"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("shareallcampaigns"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("close"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("searchmanage"))).clear();
		Thread.sleep(2000);
		// driver.findElement(By.xpath(properties.getProperty("searchmanage")))
		driver.findElement(By.xpath(properties.getProperty("searchmanage"))).sendKeys("harish");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("searchmanage"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("deletemanage"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("deletemanagelist"))).click();
		Thread.sleep(5000);
	}

}
