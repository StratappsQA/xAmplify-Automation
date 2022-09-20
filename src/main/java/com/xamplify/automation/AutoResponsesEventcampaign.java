package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutoResponsesEventcampaign {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\EventCampaign.properties");

	final Logger logger = LogManager.getLogger(AutoResponsesEventcampaign.class);

	@Test
	public void autoResponsesevent() throws InterruptedException {

		driver.findElement(By.xpath(properties.getProperty("eveautoresponse1"))).click(); // auto responses
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scroll down the page

		Thread.sleep(4000);
		
		driver.findElement(By.xpath(properties.getProperty("eve_are_subject"))).sendKeys("_" + "Email is not Opened"); // subject
		Thread.sleep(3000);																								// line

		driver.findElement(By.xpath(properties.getProperty("eve_rplyindays_1"))).sendKeys("1");
		Thread.sleep(4000);																							
		

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("eve_ar_frame1")))); // switch to the
																										// frame
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello:email is not opened please open the mail");
		driver.switchTo().defaultContent();
		Thread.sleep(4000);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(document.body.scrollHeight,0)"); // scroll up the page

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("eve_autoresponse2"))).click(); // auto response
		Thread.sleep(5000);

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scroll down the page
		Thread.sleep(4000);

		WebElement eve_ele_drpdwn2 = driver.findElement(By.xpath(properties.getProperty("evedrop_down_click2")));

		Select eve_when_to_send_email2 = new Select(eve_ele_drpdwn2); // select drop down
		Thread.sleep(5000);
		eve_when_to_send_email2.selectByValue("13");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("eve_are_subject2"))).sendKeys(" _ " + "Email is Opened"); // subject
																														// line
																														// field
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("eve_rplyindays_2"))).sendKeys("1");
		Thread.sleep(4000);																							// field
		


		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("eve_ar_frame2"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello:Thanks for opening the email");
		driver.switchTo().defaultContent();
		Thread.sleep(6000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(document.body.scrollHeight,100)");// scroll up the page
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("eve_autoresponse3"))).click(); // auto response
		Thread.sleep(5000);

		Actions a_scroll = new Actions(driver);
		a_scroll.sendKeys(Keys.PAGE_DOWN).build().perform(); // scroll down the page
		Thread.sleep(6000);

		WebElement eve_ele_drpdwn3 = driver.findElement(By.xpath(properties.getProperty("evedrop_down_click3"))); // drop
																													// down

		Select eve_when_to_send_email3 = new Select(eve_ele_drpdwn3); // select drop down
		Thread.sleep(5000);
		eve_when_to_send_email3.selectByValue("16");
		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("eve_are_subject3")))
				.sendKeys(" " + "send immediatley after clicked"); // subject line field
		Thread.sleep(3000);

		driver.switchTo().defaultContent(); // switch to the frame
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("eve_ar_frame3"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello:Thanks for opening the email immediately");
		driver.switchTo().defaultContent();
		Thread.sleep(6000);

		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(document.body.scrollHeight,100)");  // scroll up the page
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("eve_autoresponse4"))).click(); // auto response
		Thread.sleep(5000);

		Actions a_scroll2 = new Actions(driver);
		a_scroll2.sendKeys(Keys.PAGE_DOWN).build().perform(); // scroll down the page
		Thread.sleep(6000);

		WebElement eve_ele_drpdwn4 = driver.findElement(By.xpath(properties.getProperty("evedrop_down_click4")));
		Select eve_when_to_send_email4 = new Select(eve_ele_drpdwn4); // select drop down
		Thread.sleep(5000);
		eve_when_to_send_email4.selectByValue("24");
		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("eve_are_subject4")))
				.sendKeys(" " + "If event is not shared by Partner"); // subject line field
		Thread.sleep(3000);

		driver.switchTo().defaultContent(); // switch to the frame
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("eve_ar_frame4"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello:plz share to the partner");

		driver.switchTo().defaultContent();
		Thread.sleep(6000);

		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("window.scrollTo(document.body.scrollHeight,100)");// scroll up the page
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("eve_autoresponse5"))).click(); // auto response
		Thread.sleep(5000);

		Actions a_scroll3 = new Actions(driver);
		a_scroll3.sendKeys(Keys.PAGE_DOWN).build().perform(); // scroll down the page
		Thread.sleep(6000);

		WebElement eve_ele_drpdwn5 = driver.findElement(By.xpath(properties.getProperty("evedrop_down_click5")));

		Select eve_when_to_send_email5 = new Select(eve_ele_drpdwn5); // select drop down
		Thread.sleep(5000);
		eve_when_to_send_email5.selectByValue("30");
		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("eve_are_subject5")))
				.sendKeys(" " + "send remainder if responded yes"); // subject line field
		Thread.sleep(3000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("eve_ar_frame5"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello: Thanks for responded its a remainder email for yes");

		driver.switchTo().defaultContent();
		Thread.sleep(6000);

		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("window.scrollTo(document.body.scrollHeight,100)"); // scroll up the page
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("eve_autoresponse6"))).click(); // auto response
		Thread.sleep(5000);

		Actions a_scroll4 = new Actions(driver);
		a_scroll4.sendKeys(Keys.PAGE_DOWN).build().perform(); // scroll down the page
		Thread.sleep(6000);

		WebElement eve_ele_drpdwn6 = driver.findElement(By.xpath(properties.getProperty("evedrop_down_click6")));

		Select eve_when_to_send_email6 = new Select(eve_ele_drpdwn6); // select drop down
		Thread.sleep(5000);
		eve_when_to_send_email6.selectByValue("25");
		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("eve_are_subject6")))
				.sendKeys(" " + "send email if rsvp yes"); // subject line field
		Thread.sleep(3000);

		driver.switchTo().defaultContent(); // switch to the frame
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("eve_ar_frame6"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello: Thanks for giving rsvp YES");

		driver.switchTo().defaultContent();
		Thread.sleep(6000);

		JavascriptExecutor js71 = (JavascriptExecutor) driver;
		js71.executeScript("window.scrollTo(document.body.scrollHeight,100)");
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("eve_autoresponse6"))).click(); // auto response
		Thread.sleep(5000);

		Actions a_scroll5 = new Actions(driver);
		a_scroll5.sendKeys(Keys.PAGE_DOWN).build().perform(); // scroll down the page
		Thread.sleep(6000);

		WebElement eve_ele_drpdwn7 = driver.findElement(By.xpath(properties.getProperty("evedrop_down_click7"))); // drop
																													// down

		Select eve_when_to_send_email7 = new Select(eve_ele_drpdwn7); // select drop down
		Thread.sleep(5000);
		eve_when_to_send_email7.selectByValue("28");
		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("eve_are_subject7"))).sendKeys(" " + "send after event"); // subject
																														// line
																														// field
		Thread.sleep(3000);

		driver.switchTo().defaultContent(); // switch to the frame
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("eve_ar_frame7"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello: Event was done");

		driver.switchTo().defaultContent();
		Thread.sleep(6000);

	}

}
