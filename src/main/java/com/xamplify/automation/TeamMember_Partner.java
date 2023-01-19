package com.xamplify.automation;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamMember_Partner extends ExtentReportsClass{

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("src/main/resources/TeamMember.properties");

	final Logger logger = LogManager.getLogger(TeamMember_Partner.class);


	@Test (priority=256,enabled=true)
	public void add_teammember_partner() throws InterruptedException, SQLException
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
		group.selectByVisibleText("Partner Account Manager");  //selecting partner account manager from the dropdown
		Thread.sleep(6000);
		logger.info("selected 'Partner Account Manager' group from  the dropdown");
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
			Thread.sleep(4000);
			driver.findElement(By.xpath(properties.getProperty("Save_button_TM"))).click(); //click on save button
			logger.info("entered team member is previously exists in data base, so added time stamp to the email");
		} 
		else
		{
			logger.info("entered team member is previously not exists in data base ");
		}

		Thread.sleep(6000);
		String actualresult_tm=driver.findElement(By.xpath(properties.getProperty("Success_message_grid_TM"))).getText();
		Thread.sleep(3000);
		String expectedresult_tm = "Team Member added successfully.";				
		if(expectedresult_tm.equals(actualresult_tm))
		{
			System.out.println("Team member is created");
			logger.info("Team member has been created through Add button option-partner");

		}
		else
		{
			System.out.println("Team member creation is failed");
		}
		Thread.sleep(3000);			
	}

	@Test (priority=257,enabled=true)
	public void edit_teammember_partner() throws InterruptedException
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

		String actualresult_tm = driver.findElement(By.xpath(properties.getProperty("Success_message_grid_TM"))).getText();	
		String expectedresult_tm = "Team member details updated successfully.";
		if(expectedresult_tm.equals(actualresult_tm))
		{
			System.out.println("Team member is updated");
			logger.info("Team member has been updated successfully-partner");

		}
		else
		{
			System.out.println("Team member updation is failed");
		}
		Thread.sleep(3000);		
	}

	@Test (priority=258,enabled=true)
	public void send_invitation_teammember_partner() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Team_leftmenu"))).click(); //click on Team left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Search_field_TM"))).sendKeys("autoteammember"); //search with autoteammember
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Search_icon_TM"))).click(); //click on search icon
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Email_icon_TM"))).click(); //click on email icon 
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("yes_popup_TM"))).click(); //click on yes on popup 
		Thread.sleep(6000);
		logger.info("email icon has been clicked");

		String actualresult_tm = driver.findElement(By.xpath(properties.getProperty("Success_message_grid_TM"))).getText();	
		Thread.sleep(3000);
		String expectedresult_tm = "Invitation sent successfully.";
		if(expectedresult_tm.equals(actualresult_tm))
		{
			System.out.println("Invitation is sent to email");
			logger.info("Invitaion has been sent to team member successfully-partner");

		}
		else
		{
			System.out.println("Invitation sent is failed");
		}

		Thread.sleep(3000);	
	}

	@Test (priority=259,enabled=true)
	public void delete_teammember_partner() throws InterruptedException
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
		String actualresult1 = driver.findElement(By.xpath(properties.getProperty("Success_message_grid_TM"))).getText();	

		if(actualresult1.contains("deleted successfully."))
		{
			System.out.println("Team member is deleted");
			logger.info("Team member has been deleted successfully-partner");	

		}
		else
		{
			System.out.println("team member is not deleted");

		}	

	}


	//to upload csc file we have to use two java files (RandomEmailGeneration and ProductModel)
	@Test (priority=260,enabled=true)
	public void uploadCSV_TM_partner() throws InterruptedException, IOException, InvalidFormatException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Team_leftmenu"))).click(); //click on Team left menu
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("download_CSV_TM"))).click(); //click on  download csv template
		Thread.sleep(3000);
		logger.info("TeamMember-CSV template has been downloaded");

		TeamMember_Vendor obj = new TeamMember_Vendor(); //calling RandomEmailGeneration class in this class(email id updation in csv file will happen in randomemailgeneration class) 
		((RandomEmailGeneration) obj).main(null);

		WebElement uploadcsv=driver.findElement(By.xpath(properties.getProperty("upload_CSV_TM"))); //click on upload csv button
		Thread.sleep(6000);
		logger.info("clicked on upload button");
		uploadcsv.sendKeys("D:\\GitHub\\xAmplify-Automation\\Teammember_CSV.csv");			
		Thread.sleep(5000);

		String actualresult = driver.findElement(By.xpath(properties.getProperty("Success_message_grid_TM_CSV"))).getText();	
		if(actualresult.contains("duplicate "))
		{
			logger.info("Team member mail ids are not uploaded, duplicate mail ids may exists");
		}		
		else
		{
			logger.info("Team member mail ids are uploaded through CSV file");
		}

		Thread.sleep(6000);
		Select group1 = new Select(driver.findElement(By.xpath(properties.getProperty("TM_group_dropdown_click_CSV1"))));//click on team member group dropdown
		driver.findElement(By.xpath(properties.getProperty("TM_group_dropdown_click_CSV1"))).click();
		Thread.sleep(6000);
		group1.selectByVisibleText("Partner Account Manager");  //selecting partner account manager from the dropdown-team member1
		Thread.sleep(6000);
		logger.info("selected 'Partner Account Manager' group from  the dropdown-while uploading CSV");
		Select group2 = new Select(driver.findElement(By.xpath(properties.getProperty("TM_group_dropdown_click_CSV2"))));//click on team member group dropdown
		driver.findElement(By.xpath(properties.getProperty("TM_group_dropdown_click_CSV2"))).click();
		Thread.sleep(6000);
		group2.selectByVisibleText("Partner Account Manager");  //selecting partner account manager from the dropdown-team member2
		Thread.sleep(6000);
		logger.info("selected 'Partner Account Manager' group from  the dropdown-while uploading CSV");
		driver.findElement(By.xpath(properties.getProperty("Save_button_TM"))).click(); //click on save button 
		Thread.sleep(6000);


		String actualresult_tm=driver.findElement(By.xpath(properties.getProperty("Success_message_grid_TM"))).getText();
		Thread.sleep(3000);
		String expectedresult_tm = "Team Members added successfully.";				
		if(expectedresult_tm.equals(actualresult_tm))
		{
			System.out.println("Team members are created");
			logger.info("Team members have been created through upload CSV option-partner");

		}
		else
		{
			System.out.println("Team members creation is failed");
		}
		Thread.sleep(3000);
	}





	@Test (priority=261,enabled=true)
	public void view_avabliablemodules_partner() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Team_leftmenu"))).click(); //click on Team left menu
		Thread.sleep(7000);

		//view avaliable modules of partner account manager
		driver.findElement(By.xpath(properties.getProperty("Search_field_TM"))).sendKeys("Partner"); //search with partner
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Search_icon_TM"))).click(); //click on search icon
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Preview_icon_tmgroup"))).click(); //click on preview icon of partner account manager
		Thread.sleep(10000);
		logger.info("Displayed the avaliable modules in partner account manager team member group-partner");
		driver.findElement(By.xpath(properties.getProperty("close_button_modules"))).click(); //click on close button
		Thread.sleep(7000);
		logger.info("close button has been clicked");
		driver.findElement(By.xpath(properties.getProperty("Search_field_TM"))).clear();


	} 



}





