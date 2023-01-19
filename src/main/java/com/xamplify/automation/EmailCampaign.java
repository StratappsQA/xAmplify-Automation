package com.xamplify.automation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Keymap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmailCampaign {
	

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("src/main/resources/Campaign.properties");
	
final Logger logger = LogManager.getLogger(EmailCampaign.class);
	
	//@Test(priority=146,enabled=true)
     @Test
	public void ecampaign() throws InterruptedException, SQLException {
		//driver.get("https://xamplify.co/home/dashboard/welcome");

				//Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


		WebDriverWait wait = new WebDriverWait(driver, 80);

		// Wait till the element is not visible

		WebElement campele = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("e_campaignhover"))));
		campele.click(); // hover on campaign

		Actions camp_action = new Actions(driver);
		camp_action.moveToElement(campele).perform();
		Thread.sleep(5000);
		WebElement create_campele = driver.findElement(By.xpath(properties.getProperty("e_createcampaign"))); //click on create campaign
		camp_action.moveToElement(create_campele);
		camp_action.click();
		camp_action.perform();
		Thread.sleep(5000);
		WebDriverWait waitc = new WebDriverWait(driver, 40);
		WebElement opncamp = waitc.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("e_openecampaign")))); //select email campaign
		opncamp.click();
		
logger.info("Choose the Email campaign");

		List<String> campaignNames = new ArrayList<String>();
		String query = properties.getProperty("query.getCampaignNamesByOrganizationId").replaceAll(":emailId",
				properties.getProperty("user.name"));
		ResultSet resultSet = DatabaseConnection.getResultSet(query);
		while (resultSet.next()) {
			campaignNames.add(resultSet.getString("campaign_name").toLowerCase());			//query,if campaign name already exists checking 
		}
		String campaignNameFromProp = properties.getProperty("ewrite_campaign").toLowerCase();

		driver.findElement(By.id(properties.getProperty("ecampaignName")))
				.sendKeys(properties.getProperty("ewrite_campaign"));
		Thread.sleep(5000);
		if (campaignNames.indexOf(campaignNameFromProp) > -1) {
			driver.findElement(By.id(properties.getProperty("ecampaignName"))).clear();
			driver.findElement(By.id(properties.getProperty("ecampaignName")))
					.sendKeys(properties.getProperty("ewrite_campaign") + "_" + System.currentTimeMillis());
	}
		WebElement ecampaignName = 	driver.findElement(By.id(properties.getProperty("ecampaignName")));


		String getcampaignname = ecampaignName.getAttribute("value");

       // y = getcampaignname;
		WebDriverWait wait2 = new WebDriverWait(driver, 50);
		WebElement w2 = wait2.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("e_through_partner"))));  //toggle through partner
		w2.click();
		// through partner//
		
		
		driver.findElement(By.xpath(properties.getProperty("esubjectline"))).sendKeys("subjectLine***");    //subjectline 
		//Thread.sleep(3000); 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000); 

		driver.findElement(By.xpath(properties.getProperty("epreheader"))).sendKeys("preHeader**");			//preheader

		WebDriverWait wait3 = new WebDriverWait(driver, 50);
		WebElement w3 = wait3
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("enotify"))));		//notify me email is opened
		
		w3.click();
		driver.findElement(By.xpath(properties.getProperty("lnotify"))).click();
		/*WebDriverWait wait4 = new WebDriverWait(driver, 50);
		WebElement w4 = wait4.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("emarketo_notify"))));	//marketo notify
		w4.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("selectmarketo"))).click();
		driver.findElement(By.xpath(properties.getProperty("selecthubspot"))).click();
		Thread.sleep(10000);*/
		WebDriverWait wait5 = new WebDriverWait(driver, 50);
		WebElement w5 = wait5
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("enext1"))));			//next page
		w5.click();
logger.info("Given all the data in the Campaign details page");		
		/*JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");*/
		
		driver.findElement(By.xpath(properties.getProperty("egoto_top"))).click();//go to top arrow
		Thread.sleep(5000);
		
		
		WebDriverWait wait_edropdown = new WebDriverWait(driver, 50);
		WebElement w_edropdown = wait_edropdown
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("e_select_dropdown"))));
		Thread.sleep(2000);
		
	 	Select dropdown = new Select(w_edropdown); 
	 	dropdown.selectByVisibleText("Count(DESC)");
	 	
		
        WebDriverWait wait6 = new WebDriverWait(driver, 50);
		WebElement w6 = wait6
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("esearch_select_partnerlist_click"))));
		w6.sendKeys("Master");
		//Search for partner list
		w6.sendKeys(Keys.ENTER);  //Click on search
		
		
		Thread.sleep(5000);

		

		driver.findElement(By.xpath(properties.getProperty("epartnerlist_preview"))).click();				//preview of selected partner list
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("eclose_partnerpreview"))).click();			//close the selected partner preview list
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("eselect_partnerlist"))).click();							//select the partner list
		Thread.sleep(5000);

logger.info("Selected the Partner list");
		/*
		 * WebElement
		 * c1=driver.findElement(By.xpath(properties.getProperty("eprtnr_prvwpagenation"
		 * )));
		 * 
		 * for(int a=0;a<=6;a++) {
		 * driver.findElement(By.xpath(properties.getProperty("eprtnr_prvwpagenation")))
		 * .click(); Thread.sleep(3000); }
		 */

		/*
		 * WebElement eg =
		 * driver.findElement(By.xpath(properties.getProperty("eplist")));
		 * List<WebElement> links = eg.findElements(By.tagName("li")); for (int i = 0; i
		 * <= links.size()+2; i++) { System.out.println(i); //
		 * System.out.println(links.size()); //
		 * System.out.println(links.get(i).getText());
		 * 
		 * 
		 * WebElement
		 * c1=driver.findElement(By.xpath(properties.getProperty("eprtnr_prvwpagenation"
		 * ))); c1.click(); Thread.sleep(2000); System.out.println(i +"clicked");
		 * 
		 * 
		 * }
		 * 
		 * 
		 * Thread.sleep(5000);
		 */
		
		driver.findElement(By.xpath(properties.getProperty("enext2"))).click();							//next page
		//Thread.sleep(5000);

		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("window.scrollTo(0,document.body.scrollHeight)");						//to scroll down the page

		/*
		 * WebElement eg1 =
		 * driver.findElement(By.xpath(properties.getProperty("eplist2")));
		 * List<WebElement> links1 = eg1.findElements(By.tagName("li")); for (int j = 1;
		 * j <= links1.size()-2; j++) { System.out.println(j);
		 * System.out.println(links1.size());
		 * System.out.println(links1.get(j).getText());
		 * 
		 * 
		 * WebElement
		 * c2=driver.findElement(By.xpath(properties.getProperty("epagenation")));
		 * Thread.sleep(10000); c2.click(); Thread.sleep(9000); System.out.println(j
		 * +"clicked");
		 * 
		 * 
		 * }
		 */

		WebDriverWait wait61 = new WebDriverWait(driver, 50);
		WebElement w61 = wait61
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("egoto_top2"))));		//go to top navigation
		w61.click();

		

	WebElement template_search=	driver.findElement(By.xpath(properties.getProperty("esearch_template")));//search for template
	template_search.sendKeys("Cobranding");	
	template_search.sendKeys(Keys.ENTER);                       //for clicking on the search
		
		
		WebDriverWait wait8 = new WebDriverWait(driver, 50);
		WebElement w8 = wait8
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("esearch_template_select"))));			//select  template
		w8.click();
		
		
		Thread.sleep(5000);


		
		driver.findElement(By.xpath(properties.getProperty("etemplate_preview"))).click();
		Thread.sleep(5000);
		
		
		
		/*WebElement element = driver.findElement(By.xpath("//*[@id=\"show_email_template_preivew\"]/div/div/div[2]"));
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(5000);*/
		
		driver.findElement(By.xpath(properties.getProperty("etemplate_preview_close"))).click();
		Thread.sleep(5000);
		
logger.info("Selected the Email Template");
		driver.findElement(By.xpath(properties.getProperty("enext3"))).click();							//next page
		Thread.sleep(5000);
		/*driver.findElement(By.xpath(properties.getProperty("now_campaign"))).click();			//click NOW
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("now_launch"))).click();				//click LAUNCH
		
		Thread.sleep(8000);*/

	}
	
	
	
	
	
}