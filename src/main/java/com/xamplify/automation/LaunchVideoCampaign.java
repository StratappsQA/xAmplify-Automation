package com.xamplify.automation;



import java.sql.SQLException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

//public class LaunchVideoCampaign extends VideoCampaign {

public class LaunchVideoCampaign  {
	 
	 WebDriver driver = Instance.getInstance();
	 Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");
	
	@Test
	
	public void vlaunch() throws InterruptedException, SQLException
	{
		Thread.sleep(5000);
		VideoCampaign vc= new VideoCampaign();
		vc.vdecampaign();
		Thread.sleep(4000);
		//AutoresponsesVideo arv=new AutoresponsesVideo();
		//arv.autoResponsesVideo();
		Thread.sleep(4000);

		
	driver.findElement(By.xpath(properties.getProperty("video_now"))).click();			//click NOW
	Thread.sleep(4000);
	
	driver.findElement(By.xpath(properties.getProperty("video_launch"))).click();				//click LAUNCH
	
	Thread.sleep(6000);
	
	
	String v_launch = driver.findElement(By.xpath(properties.getProperty("p_response_msg"))).getText(); // response message
	
	String expectedtitle ="Campaign launched successfully";
	
	if(expectedtitle.equals(v_launch))
	{
		System.out.println(" Video Campaign launched successfully");
	}
	else {
		System.out.println(" Video Campaign failed");
	}

	
}
}