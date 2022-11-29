package com.xamplify.automation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TeamMember_Vendor {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\TeamMember-xAmplify\\src\\main\\resources\\TeamMember.properties");

	final Logger logger = LogManager.getLogger(TeamMember_Vendor.class);


	@Test (priority=1,enabled=true)
	public void add_teammember_vendor() throws InterruptedException, SQLException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Team_leftmenu"))).click(); //click on Team left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Add_button_TM"))).click(); //click on Add button 
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Fname_field"))).sendKeys(properties.getProperty("Fname_input")); //entering first name
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Lname_field"))).sendKeys(properties.getProperty("Lname_input")); //entering last name
		Thread.sleep(6000);
		logger.info("first name and last names are provided");	

		List<String> teammailid = new ArrayList<String>();  //checking the entered email id is available in data base or not
		String query = properties.getProperty("query.getteammembermailid").replaceAll(":emailId", properties.getProperty("user.name"));
		ResultSet resultSet = DatabaseConnection.getResultSet(query);
		while (resultSet.next()) 
		{
			teammailid.add(resultSet.getString("lower").toLowerCase());
		}

		String teammailidprop = properties.getProperty("TMemailid")+"@gmail.com".toLowerCase();
		driver.findElement(By.xpath(properties.getProperty("Email_field"))).sendKeys(properties.getProperty("TMemailid")+"@gmail.com");
		logger.info("email id has been entered");
		Select group = new Select(driver.findElement(By.xpath(properties.getProperty("TM_group_dropdown_click")))); //click on team member group dropdown
		driver.findElement(By.xpath(properties.getProperty("TM_group_dropdown_click"))).click();
		Thread.sleep(6000);
		group.selectByVisibleText("Channel Account Manager");  //selecting channel account manager from the dropdown
		Thread.sleep(6000);
		logger.info("selected 'Channel Account Manager' group from  the dropdown");
		driver.findElement(By.xpath(properties.getProperty("Save_button_TM"))).click(); //click on save button 
		Thread.sleep(7000);
		logger.info("save button has been clicked");

		Thread.sleep(5000);
		if (teammailid.indexOf(teammailidprop) > -1) 
		{
			driver.findElement(By.xpath(properties.getProperty("Email_field"))).clear();
			WebElement TMEmail = driver.findElement(By.xpath(properties.getProperty("Email_field")));
			TMEmail.sendKeys(properties.getProperty("TMemailid") + "_" + System.currentTimeMillis()+"@gmail.com");
			System.out.println(TMEmail.getAttribute("value"));	
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Save_button_TM"))).click(); //click on save button
			logger.info("entered team member is previously exists in data base, so added time stamp to the email");
		} 
		else
		{
			logger.info("entered team member is previously not exists in data base ");
		}

		Thread.sleep(6000);
		WebElement tm_saved_grid = driver.findElement(By.xpath(properties.getProperty("Success_message_grid_TM")));	
		String actualresult_tm = tm_saved_grid.getText();
		String expectedresult_tm = "Team Member added successfully.";				
		Assert.assertEquals(actualresult_tm, expectedresult_tm);
		Thread.sleep(5000);
		logger.info("Team member has been created through Add button option");
		logger.info("Assertion successfull for team member creation");			
	}

	@Test (priority=2,enabled=true)
	public void edit_teammember_vendor() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Team_leftmenu"))).click(); //click on Team left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Search_field_TM"))).sendKeys("autoteammember"); //search with autoteammember
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Search_icon_TM"))).click(); //click on search icon
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("edit_icon_TM"))).click(); //click on edit icon 
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Fname_field"))).clear(); //clear the existing first name
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Fname_field"))).sendKeys(properties.getProperty("Fname_edit")); //update first name
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Lname_field"))).clear(); //clear the existing last name
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Lname_field"))).sendKeys(properties.getProperty("Lname_edit")); //update last name
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Save_button_TM"))).click(); //click on update button 
		Thread.sleep(7000);
		logger.info("update button has been clicked");
		WebElement tm_updated_grid = driver.findElement(By.xpath(properties.getProperty("Success_message_grid_TM")));	
		String actualresult_tm = tm_updated_grid.getText();
		String expectedresult_tm = "Team member details updated succesfully.";				
		Assert.assertEquals(actualresult_tm, expectedresult_tm);
		Thread.sleep(5000);
		logger.info("Team member has been updated successfully");
		logger.info("Assertion successfull for team member updation");			
	}

	@Test (priority=3,enabled=true)
	public void send_invitation_teammember_vendor() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Team_leftmenu"))).click(); //click on Team left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Search_field_TM"))).sendKeys("autoteammember"); //search with autoteammember
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Search_icon_TM"))).click(); //click on search icon
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Email_icon_TM"))).click(); //click on email icon 
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("yes_popup_TM"))).click(); //click on yes on popup 
		Thread.sleep(5000);
		logger.info("email icon has been clicked");
		WebElement tm_updated_grid = driver.findElement(By.xpath(properties.getProperty("Success_message_grid_TM")));	
		String actualresult_tm = tm_updated_grid.getText();
		String expectedresult_tm = "Invitation sent successfully.";				
		Assert.assertEquals(actualresult_tm, expectedresult_tm);
		Thread.sleep(5000);
		logger.info("Invitaion has been sent to team member successfully");
		logger.info("Assertion successfull for team member invitation");	
	}

	@Test (priority=4,enabled=true)
	public void delete_teammember_vendor() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Team_leftmenu"))).click(); //click on Team left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Search_field_TM"))).sendKeys("autoteammember"); //search with autoteammember
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Search_icon_TM"))).click(); //click on search icon
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("delete_icon_TM"))).click(); //click on delete icon 
		Thread.sleep(5000);
		logger.info("delete icon has been clicked");	
		driver.findElement(By.xpath(properties.getProperty("yes_popup_TM"))).click(); //click on yes on popup 
		Thread.sleep(5000);
		logger.info("cliked on yes in pop up");	
		WebElement tm_updated_grid = driver.findElement(By.xpath(properties.getProperty("Success_message_grid_TM")));	
		String actualresult1 = tm_updated_grid.getText();
		if(actualresult1.contains("deleted successfully."))
		{
			logger.info("Team member has been deleted successfully");		

		}
		else
		{
			logger.info("team member is not deleted");

		}	
		logger.info("Assertion successfull for team member deletion");	
	}


	@Test (priority=2,enabled=true)
	public void UploadCSV_TM_vendor() throws InterruptedException, IOException, InvalidFormatException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Team_leftmenu"))).click(); //click on Team left menu
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("download_CSV_TM"))).click(); //click on  download csv template
		Thread.sleep(3000);
		logger.info("TeamMember-CSV template has been downloaded");

		//generate random email id with 7 alphabets

		//		String generatemail=RandomStringUtils.randomAlphabetic(7);
		//		String emailid=generatemail+"@gmail.com";
		//		System.out.println(emailid);
		//		Thread.sleep(8000);
		//		logger.info("Random mail id has been generated with 7 alphabets");


		Actions action=new Actions(driver);
		WebElement uploadcsv=driver.findElement(By.xpath(properties.getProperty("upload_CSV_TM"))); //click on upload csv button
		action.moveToElement(uploadcsv).click().perform();
		Thread.sleep(6000);
		logger.info("clicked on upload button");

		// Upload CSV file with random email
		RandomEmailGeneration.randomEmail();
		logger.info("ttttt");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\TeamMember_CSV.csv");
		logger.info("TeamMember-CSV template has been uploaded");
		Thread.sleep(6000);
		Select group1 = new Select(driver.findElement(By.xpath(properties.getProperty("TM_group_dropdown_click_CSV"))));//click on team member group dropdown
		driver.findElement(By.xpath(properties.getProperty("TM_group_dropdown_click_CSV"))).click();
		Thread.sleep(6000);
		group1.selectByVisibleText("Channel Account Manager");  //selecting channel account manager from the dropdown
		Thread.sleep(6000);
		logger.info("selected 'Channel Account Manager' group from  the dropdown-while uploading CSV");
		driver.findElement(By.xpath(properties.getProperty("Save_button_TM"))).click(); //click on save button 
		Thread.sleep(6000);
		WebElement tm_saved_grid = driver.findElement(By.xpath(properties.getProperty("Success_message_grid_TM")));	
		String actualresult_tm = tm_saved_grid.getText();
		String expectedresult_tm = "Team Member added successfully.";				
		Assert.assertEquals(actualresult_tm, expectedresult_tm);
		Thread.sleep(5000);
		logger.info("Team member has been created by uploading CSV file");
		logger.info("Assertion successfull for team member creation by CSV upload");		
	}

}





