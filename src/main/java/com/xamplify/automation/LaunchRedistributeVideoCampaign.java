package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LaunchRedistributeVideoCampaign {

	
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\Workspace2\\xAmplify-Automation\\src\\main\\resources\\RedistributionCampaign.properties");// properties
																											// file
	final Logger logger = LogManager.getLogger(LaunchRedistributeVideoCampaign.class);


	@Test
	public void launchvideo_Redistributecampaign() throws InterruptedException {
	
		Thread.sleep(3000);

		RedistributeVideoCampaign launch_rvc=new RedistributeVideoCampaign();
		launch_rvc.hoverRedistributecampaigns();
		Thread.sleep(4000);

	
	driver.findElement(By.xpath(properties.getProperty("partner_redistribute_camp_now"))).click();// click Now
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("partner_redistribute_camp_launch"))).click(); // click
																										// Launch
	Thread.sleep(5000);

	String s_vde_red = driver.findElement(By.id(properties.getProperty("partnervcampaign_response_msg"))).getText(); // response
																												// message
	
	String expectedtitle = "Campaign launched successfully";

	if (expectedtitle.equals(s_vde_red)) {
		System.out.println(" Redistributed video Campaign launched successfully");
	} else {
		System.out.println(" Redistributed video Campaign failed");
	}

	logger.info("Redistributed VideoCampaign Launched Successfully");
	
	
	
}


	@Test(dependsOnMethods = { "launchvideo_Redistributecampaign" })

	public void register_videolead_campaign() throws InterruptedException 
	
	{
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("mvc_redistribution_cbr"))).click();// click analytics of the redistributed campaign
		Thread.sleep(5000);

		
		driver.findElement(By.xpath(properties.getProperty("mvc_campaignreports_mailid"))).click();// click any contact to get the register lead button
		Thread.sleep(2000);

		

		WebDriverWait wait=new WebDriverWait(driver,30);

		WebElement RegisterLeadButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("mvc_campaignreports_registerlead"))));
		
		RegisterLeadButton.click();
		
		//driver.findElement(By.xpath(properties.getProperty("mvc_campaignreports_registerlead"))).click();
		
		//click on register lead button
		
		
		
		
	}
	
	//@Test(priority = 3 , enabled=false)
	@Test(dependsOnMethods = { "register_videolead_campaign" })

	public void video_fillLeadRegistrationForm_deal() throws InterruptedException
	
	{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("mvc_registerlead_firstname"))).sendKeys(" "+" FName");  //first name
		driver.findElement(By.xpath(properties.getProperty("mvc_registerlead_lastname"))).sendKeys(" "+" LName");   //last name
		Thread.sleep(2000);
		
		
		
		
		driver.findElement(By.xpath(properties.getProperty("mvc_registerlead_companyname"))).sendKeys(" "+" cname");  //company name
		Thread.sleep(1000); 

		driver.findElement(By.xpath(properties.getProperty("mvc_registerlead_phoneno"))).sendKeys(" "+" 912345678"); // phone number
		Thread.sleep(5000);

		

		Select drpstage = new Select(driver.findElement(By.xpath(properties.getProperty("mvc_registerlead_selectstage")))); //select stage
		drpstage.selectByValue("4551");
		
		
		Thread.sleep(5000);

		
		
		driver.findElement(By.xpath(properties.getProperty("mvc_registerlead_address"))).sendKeys(" "+" Address");  //address
		Thread.sleep(1000);

		driver.findElement(By.xpath(properties.getProperty("mvc_registerlead_city"))).sendKeys(" "+" city");  //city
		Thread.sleep(1000);

		driver.findElement(By.xpath(properties.getProperty("mvc_registerlead_state"))).sendKeys(" "+" state"); //state
		Thread.sleep(1000);

		driver.findElement(By.xpath(properties.getProperty("mvc_registerlead_postalcode"))).sendKeys(" "+" 534342"); //zipcode
		Thread.sleep(1000);

		Select drpCountry = new Select(driver.findElement(By.xpath(properties.getProperty("mvc_registerlead_selectcountry")))); //country
		drpCountry.selectByValue("India");
		
		driver.findElement(By.xpath(properties.getProperty("mvc_registerlead_submit"))).click(); //submit 
		 
		logger.info("Lead submitted Successfully");

		
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mvc_opportunities"))).click(); //hover to opportunities
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mvc_oppo_manageleads"))).click(); //redirect to manage leads
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mvc_oppo_manageleads_registerdealclick"))).click();  // Register Deal button click
		Thread.sleep(4000);
		
		
		logger.info("Register deal button clicked Successfully");

		
		WebElement selectstage = driver.findElement(By.xpath(properties.getProperty("mvc_oppo_mleads_rdeal_selectstage")));   //select stage
		selectstage.sendKeys("Opened");
	    Actions keyDown = new Actions(driver);
	    keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
		
		Thread.sleep(3000);
		logger.info("Selected stage in dropdown Successfully");

		
		driver.findElement(By.xpath(properties.getProperty("mvc_oppo_mleads_rdeal_title"))).sendKeys("Title");  //title field
		
		Thread.sleep(3000);
		WebElement selectstage2 = driver.findElement(By.xpath(properties.getProperty("mvc_oppo_mleads_rdeal_selectdeal")));   //select stage
		selectstage2.sendKeys("Select Dealtype");
	    Actions keyDown2 = new Actions(driver);
	    keyDown2.sendKeys(Keys.chord(Keys.DOWN)).perform();
		
		logger.info("Selected Dealtype in dropdown Successfully");

	    Thread.sleep(3000);
		
		
		driver.findElement(By.xpath(properties.getProperty("mvc_oppo_mleads_rdeal_amount"))).sendKeys("2345"); //amount
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("mvc_oppo_mleads_rdeal_calendar"))).click();  //select calendar
		Thread.sleep(7000); 
		
	

WebElement cal=driver.findElement(By.xpath(properties.getProperty("mvc_oppo_mleads_rdeal_selectdate")));
cal.click(); //select current date
Thread.sleep(4000);
logger.info("Selected Date in Calendar Successfully");


driver.findElement(By.xpath(properties.getProperty("mvc_oppo_mleads_rdeal_addcomments"))).click(); //add comments button
Thread.sleep(3000);



driver.findElement(By.xpath(properties.getProperty("mvc_oppo_mleads_rdeal_commenttitle"))).sendKeys("commtitle"); //comment title
Thread.sleep(3000);


driver.findElement(By.xpath(properties.getProperty("mvc_oppo_mleads_rdeal_comment"))).sendKeys("comment"); // comment text area

Thread.sleep(3000);


driver.findElement(By.xpath(properties.getProperty("mvc_oppo_mleads_register_deal"))).click(); //click for register deal button
Thread.sleep(5000);
String s=driver.findElement(By.xpath(properties.getProperty("mvc_registerdeal_msg"))).getText();
System.out.println(s);


	
	
	
	
}
}
