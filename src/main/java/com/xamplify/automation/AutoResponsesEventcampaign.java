package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutoResponsesEventcampaign {

	
	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\xAmplify-Automation\\src\\main\\resources\\EventCampaign.properties");
	
	final Logger logger = LogManager.getLogger(AutoResponsesEventcampaign.class);

	@Test
	public void autoResponsesevent() throws InterruptedException {

		driver.findElement(By.xpath(properties.getProperty("eveautoresponse1"))).click(); // auto responses
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		Thread.sleep(4000);
	
		driver.findElement(By.xpath(properties.getProperty("eve_are_subject")))
				.sendKeys("Email is not Opened"); // select "send immediatley after clicked"
		Thread.sleep(5000);
		

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("eve_ar_frame1"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement()
				.sendKeys("Hello:email is not opened plz open the mail");
//send immediately after clicked,thanku for clicking immediately
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		
		
		
		

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(document.body.scrollHeight,0)");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("eve_autoresponse2"))).click(); // auto response
		Thread.sleep(5000);

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		
		WebElement eve_ele_drpdwn2 = driver.findElement(By.xpath(properties.getProperty("evedrop_down_click2"))); // drop down
		// ele_drpdwn4.click(); // click

		Select eve_when_to_send_email2 = new Select(eve_ele_drpdwn2); // select drop down
		Thread.sleep(5000);
		eve_when_to_send_email2.selectByValue("13");
		Thread.sleep(8000);

		
		
		driver.findElement(By.xpath(properties.getProperty("eve_are_subject2")))
		.sendKeys(" "+ "Email is Opened"); // select "send immediatley after clicked"
Thread.sleep(5000);
		
		
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("eve_ar_frame2"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement()
				.sendKeys("Hello:Thanks for opening the email");
//send immediately after clicked,thanku for clicking immediately
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		
		
		
		
		
		
		
		
	}
	
	
}
