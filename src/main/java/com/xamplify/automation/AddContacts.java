package com.xamplify.automation;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddContacts extends ExtentReportsClass{

		WebDriver driver = Instance.getInstance();

		Properties properties = PropertiesFile.readPropertyFile("D:\\git\\gayatriContactswrkspace\\xAmplify-Automation\\src\\main\\resources\\AddContacts.properties");
		
	final Logger logger = LogManager.getLogger(AddContacts.class);
		
		
		
		@Test(priority = 1, enabled = true)
	
		public void con_oneatatime() throws InterruptedException, SQLException {
			
			Thread.sleep(5000);
			

			WebDriverWait wait_con = new WebDriverWait(driver, 50);

			// Wait till the element is not visible
			WebElement con1 = wait_con.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("hovercontacts"))));// hover
																														// on
																														// contacts

			con1.click();
			Actions actions = new Actions(driver);
			WebElement contacts = driver.findElement(By.xpath(properties.getProperty("hovercontacts")));
			actions.moveToElement(contacts).build().perform();
			
			WebDriverWait wait_acon = new WebDriverWait(driver, 60);

			// Wait till the element is not visible
			WebElement acon1 = wait_acon.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("Addcontacts"))));
			acon1.click();
			
			
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("c_oneatatimelist"))).click(); //one at a time click
			Thread.sleep(5000);
		
			driver.findElement(By.xpath(properties.getProperty("c_oat_emailfield"))).sendKeys("Testcontact@analytify.com");
			Thread.sleep(3000);

			driver.findElement(By.id("firstName")).sendKeys("automate_fname");
			Thread.sleep(3000);

			driver.findElement(By.id("lastName")).sendKeys("automate_lname");
			Thread.sleep(3000);

			driver.findElement(By.id("company")).sendKeys("automate_company");
			Thread.sleep(3000);

			
			
			WebElement ele_legal = driver.findElement(By.xpath(properties.getProperty("contact_legalbasis")));// click legal
			// basis field
			// to get the
			// list

	Actions actions3 = new Actions(driver);
	actions3.moveToElement(ele_legal);
	actions3.click();

	actions3.sendKeys("Legitimate interest - prospect/lead");
	actions3.sendKeys(Keys.ENTER);
	actions3.build().perform();
	Thread.sleep(1000);


	  actions3.sendKeys("Legitimate interest - existing customer");
	  actions3.sendKeys(Keys.ENTER); actions3.build().perform();
	  Thread.sleep(1000); actions3.sendKeys("Legitimate interest - other");
	  actions3.sendKeys(Keys.ENTER); actions3.build().perform();
	  Thread.sleep(1000); actions3.sendKeys("Performance of a contract");
	  actions3.sendKeys(Keys.ENTER); actions3.build().perform();
	  Thread.sleep(1000);
	  
	  
	  driver.findElement(By.id("title")).sendKeys("automate_title");
	  
	  Thread.sleep(2000);
	  
	  
	  driver.findElement(By.id("address")).sendKeys("automate_address");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("city")).sendKeys("automate_city");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("state")).sendKeys("automate_state");
	  Thread.sleep(2000);
	 

			driver.findElement(By.id("zip")).sendKeys("a_500032");
			Thread.sleep(3000);

			WebElement cdropdown = driver.findElement(By.xpath(properties.getProperty("contact_dropdown")));//select dropdown
			Thread.sleep(2000);

			Select condrop = new Select(cdropdown);
			Thread.sleep(2000);
			condrop.selectByValue("India");


			Thread.sleep(2000);

			driver.findElement(By.xpath(properties.getProperty("c_mobileno"))).sendKeys("9123456789");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath(properties.getProperty("con_addbutton"))).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath(properties.getProperty("con_oat_path"))).sendKeys("con_oat_name");
			Thread.sleep(2000);
			

			

			DatabaseQueries data = new DatabaseQueries();
			String query8 = properties.getProperty("query.getcontactlistnames");
			List<String> contactNames = data.listNames(query8, "user_list_name");
			String contactNameFromProp = properties.getProperty("con_oat_name").toLowerCase();

			
			
			if (contactNames.indexOf(contactNameFromProp) > -1) {
				driver.findElement(By.xpath(properties.getProperty("con_oat_path"))).clear();  //clear the name if already list exists
				
			}
				
				driver.findElement(By.xpath(properties.getProperty("con_oat_path")))
						.sendKeys(properties.getProperty("con_oat_name")+"_"+System.currentTimeMillis());
				Thread.sleep(3000);
			
			
			
			driver.findElement(By.id("sample_editable_1_new")).click();  //sweet alert
			Thread.sleep(2000);


			driver.findElement(By.xpath(properties.getProperty("con_accept"))).click(); //click on the accept

			Thread.sleep(4000);
			

			
			
			String contact1 = driver.findElement(By.id("responseMessage")).getText();
			//System.out.println(contact);
			// System.out.println(partnertext.getText());
			Assert.assertEquals(contact1, "Your contact list has been created successfully and it is being processed.");
			
			
			Thread.sleep(1000);
			
			logger.info("Contact Added Successfully through 'ONE AT A TIME'");

		}
		
		
		//@Test(priority =2, enabled = true)
		@Test(dependsOnMethods = { "con_oneatatime" })
		
		public void copyclipboard_comma_contacts () throws InterruptedException, SQLException {
			Thread.sleep(6000);

			WebDriverWait wait_con = new WebDriverWait(driver, 50);

			// Wait till the element is not visible
			WebElement con1 = wait_con.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("hovercontacts"))));// hover
																														// on
																														// contacts

			con1.click();

			Actions actions = new Actions(driver);
			WebElement contacts = driver.findElement(By.xpath(properties.getProperty("hovercontacts")));
			actions.moveToElement(contacts).build().perform();
			
			Thread.sleep(5000);
			WebDriverWait wait_acon1 = new WebDriverWait(driver, 50);

			// Wait till the element is not visible
			WebElement acon11 = wait_acon1.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("Addcontacts"))));// hover
			acon11.click();
			
			
			
			

			Thread.sleep(5000);
			
			
			driver.findElement(By.xpath(properties.getProperty("copyfromclipboard_click"))).click(); //click on copy from clipboard
			Select delimiter1 = new Select(
					driver.findElement(By.xpath(properties.getProperty("selectdelimeter_dropdown"))));  //select delimeter
			delimiter1.selectByValue("CommaSeperated");
			WebElement textarea1 = driver.findElement(By.xpath(properties.getProperty("textarea")));  //click on text area
			textarea1.click();
			textarea1.sendKeys(
					"gayatri,a,stratapps,Testing,gayatri1@analytify.com,above BOI,hyderabad,Telangana,500081,india,91234567890");
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("verifybutton"))).click();  //click on verify button
			Thread.sleep(3000);

			WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("contact_legalbasis")));// click legal
																											// basis field
																											// to get the
																											// list

			Actions actions2 = new Actions(driver);
			actions2.moveToElement(ele1);
			actions2.click();
			actions2.sendKeys("Legitimate interest - prospect/lead");
			actions2.sendKeys(Keys.ENTER);
			actions2.build().perform();
			Thread.sleep(1000);
			
			  actions2.sendKeys("Legitimate interest - existing customer");
			  actions2.sendKeys(Keys.ENTER); 
			  actions2.build().perform();
			  Thread.sleep(1000);
			  actions2.sendKeys("Legitimate interest - other");
			  actions2.sendKeys(Keys.ENTER); 
			  actions2.build().perform();
			  Thread.sleep(1000);
			  actions2.sendKeys("Performance of a contract");
			  actions2.sendKeys(Keys.ENTER);
			  actions2.build().perform();
			  Thread.sleep(1000);
			  actions2.sendKeys("Freely given consent from contact");
			  actions2.sendKeys(Keys.ENTER);
			  actions2.build().perform();
			  Thread.sleep(1000);
			  actions2.sendKeys("Not applicable");
			  actions2.sendKeys(Keys.ENTER); 
			  actions2.build().perform();
			 

		
			  driver.findElement(By.xpath(properties.getProperty("contactcopyfromclipboardlistnamexpath"))) .sendKeys(properties.getProperty("contactcopyfromclipboardlistnam"));
			 
			Thread.sleep(5000);
			
			

			  DatabaseQueries data10 = new DatabaseQueries();
				String query10 = properties.getProperty("query.getcontactlistnames");
				List<String> contactNames = data10.listNames(query10, "user_list_name");
				String contactNameFromProp = properties.getProperty("contactcopyfromclipboardlistnam").toLowerCase();

				
				
				if (contactNames.indexOf(contactNameFromProp) > -1) {
					driver.findElement(By.xpath(properties.getProperty("contactcopyfromclipboardlistnamexpath"))).clear();
					
				}
					
					driver.findElement(By.xpath(properties.getProperty("contactcopyfromclipboardlistnamexpath")))
							.sendKeys(properties.getProperty("contactcopyfromclipboardlistnam")+"_"+System.currentTimeMillis());
					Thread.sleep(3000);
				
			  
			
			driver.findElement(By.id("sample_editable_1_new")).click();  //sweet alert
			Thread.sleep(1000);
			driver.findElement(By.xpath(properties.getProperty("con_accept"))).click(); //click on accept button
			Thread.sleep(2000);
			String contact = driver.findElement(By.id("responseMessage")).getText();
			//System.out.println(contact);
			// System.out.println(partnertext.getText());
			Assert.assertEquals(contact, "Your contact list has been created successfully and it is being processed.");
			
			
			Thread.sleep(1000);
			

			logger.info("Contact Added Successfully through 'COPY LIST FROM CLIPBOARD, COMMASEPARATED'");

		}
		
		
		@Test(dependsOnMethods = { "copyclipboard_comma_contacts" })
		
		 public void copyclipboard_tab_contacts () throws InterruptedException, SQLException {
				Thread.sleep(6000);

				WebDriverWait wait_con2 = new WebDriverWait(driver, 50);

				// Wait till the element is not visible
				WebElement con2 = wait_con2.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("hovercontacts"))));// hover
																															// on
																															// contacts

				con2.click();

				Actions actions = new Actions(driver);
				WebElement contacts = driver.findElement(By.xpath(properties.getProperty("hovercontacts")));
				actions.moveToElement(contacts).build().perform();
				
				Thread.sleep(5000);
				WebDriverWait wait_acon2 = new WebDriverWait(driver, 50);

				// Wait till the element is not visible
				WebElement acon12 = wait_acon2.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("Addcontacts"))));// hover
				acon12.click();
				
				
				
				

				Thread.sleep(5000);
				
				
				driver.findElement(By.xpath(properties.getProperty("copyfromclipboard_click"))).click(); //click on copy from clipboard
				Select delimiter12 = new Select(
						driver.findElement(By.xpath(properties.getProperty("selectdelimeter_dropdown"))));  //select delimeter
				delimiter12.selectByValue("TabSeperated");
				WebElement textarea12 = driver.findElement(By.id("copyFromclipTextArea"));  //click on text area
				textarea12.click();
				
				
				
				((JavascriptExecutor) driver).executeScript(
						"document.getElementById('copyFromclipTextArea').value='gayatri	a	stratapps	Testing	gayatri1@analytify.com	above BOI	hyderabad	Telangana	500081	india';");

				Thread.sleep(5000);
				
				textarea12.sendKeys(Keys.SPACE);
				
				
				Thread.sleep(3000);

				driver.findElement(By.xpath(properties.getProperty("verifybutton"))).click();
				Thread.sleep(3000);

				WebElement ele12 = driver.findElement(By.xpath(properties.getProperty("contact_legalbasis")));// click legal
																												// basis field
																												// to get the
																												// list

				Actions actions21 = new Actions(driver);
				actions21.moveToElement(ele12);
				actions21.click();
				actions21.sendKeys("Legitimate interest - prospect/lead");
				actions21.sendKeys(Keys.ENTER);
				actions21.build().perform();
				Thread.sleep(1000);
				
				  actions21.sendKeys("Legitimate interest - existing customer");
				  actions21.sendKeys(Keys.ENTER); 
				  actions21.build().perform();
				  Thread.sleep(1000);
				  actions21.sendKeys("Legitimate interest - other");
				  actions21.sendKeys(Keys.ENTER); 
				  actions21.build().perform();
				  Thread.sleep(1000);
				  actions21.sendKeys("Performance of a contract");
				  actions21.sendKeys(Keys.ENTER);
				  actions21.build().perform();
				  Thread.sleep(1000);
				  actions21.sendKeys("Freely given consent from contact");
				  actions21.sendKeys(Keys.ENTER);
				  actions21.build().perform();
				  Thread.sleep(1000);
				  actions21.sendKeys("Not applicable");
				  actions21.sendKeys(Keys.ENTER); 
				  actions21.build().perform();
				 

			
				  driver.findElement(By.xpath(properties.getProperty("contactcopyfromclipboardlistnamexpath"))) .sendKeys(properties.getProperty("contactcopyfromclipboardlistnam"));
				 
				Thread.sleep(5000);
				
				

				  DatabaseQueries data10 = new DatabaseQueries();
					String query10 = properties.getProperty("query.getcontactlistnames");
					List<String> contactNames = data10.listNames(query10, "user_list_name");
					String contactNameFromProp = properties.getProperty("contactcopyfromclipboardlistnam").toLowerCase();

					
					
					if (contactNames.indexOf(contactNameFromProp) > -1) {
						driver.findElement(By.xpath(properties.getProperty("contactcopyfromclipboardlistnamexpath"))).clear();
						
					}
						
						driver.findElement(By.xpath(properties.getProperty("contactcopyfromclipboardlistnamexpath")))
								.sendKeys(properties.getProperty("contactcopyfromclipboardlistnam")+"_"+System.currentTimeMillis());
						Thread.sleep(3000);
					
				  
				
				driver.findElement(By.id("sample_editable_1_new")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(properties.getProperty("con_accept"))).click();
				Thread.sleep(2000);
				String contact = driver.findElement(By.id("responseMessage")).getText();
				//System.out.println(contact);
				// System.out.println(partnertext.getText());
				Assert.assertEquals(contact, "Your contact list has been created successfully and it is being processed.");
				
				
				Thread.sleep(1000);
				logger.info("Contact Added Successfully through 'COPY LIST FROM CLIPBOARD, TABSEPARATED'");
		 }
		
		
		//@Test(priority =3, enabled = false)
		@Test(dependsOnMethods = { "copyclipboard_tab_contacts" })
		
		public void uploadcsvcontacts() throws InterruptedException, IOException, SQLException {
			Thread.sleep(5000);


				//driver.get("https://xamplify.co/home/dashboard/welcome");
				
			WebDriverWait wait_ucon = new WebDriverWait(driver, 50);// Wait till the element is not visible
			WebElement conu1 = wait_ucon.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("hovercontacts"))));// hover
																														// on
																														// contacts
			conu1.click();
			Actions actions = new Actions(driver);
			WebElement contacts = driver.findElement(By.xpath(properties.getProperty("hovercontacts")));
			actions.moveToElement(contacts).build().perform();
			Thread.sleep(4000);
			driver.findElement(By.xpath(properties.getProperty("Addcontacts"))).click();
			Thread.sleep(5000);

			driver.findElement(By.id("uploadCSV")).click();
			Thread.sleep(8000);

			Runtime.getRuntime().exec("D:\\Selenium\\files\\uploadcsvcontacts.exe");
			Thread.sleep(10000);

			WebElement ele11 = driver.findElement(By.xpath(properties.getProperty("contact_legalbasis")));// click legal
																											// basis field
																											// to get the
																											// list

			Actions actions3 = new Actions(driver);
			actions3.moveToElement(ele11);
			actions3.click();
			actions3.sendKeys("Legitimate interest - prospect/lead");
			actions3.sendKeys(Keys.ENTER);
			actions3.build().perform();
			Thread.sleep(1000);
			
			
			  actions3.sendKeys("Legitimate interest - existing customer");
			  actions3.sendKeys(Keys.ENTER); actions3.build().perform();
			  Thread.sleep(1000); actions3.sendKeys("Legitimate interest - other");
			  actions3.sendKeys(Keys.ENTER); actions3.build().perform();
			  Thread.sleep(1000); actions3.sendKeys("Performance of a contract");
			  actions3.sendKeys(Keys.ENTER); actions3.build().perform();
			  Thread.sleep(1000); actions3.sendKeys("Freely given consent from contact");
			  actions3.sendKeys(Keys.ENTER); actions3.build().perform();
			  Thread.sleep(1000); actions3.sendKeys("Not applicable");
			  actions3.sendKeys(Keys.ENTER); actions3.build().perform();
			 

			Thread.sleep(3000);

			
			  DatabaseQueries data9 = new DatabaseQueries();
				String query9 = properties.getProperty("query.getcontactlistnames");
				List<String> contactNames = data9.listNames(query9, "user_list_name");
				String contactNameFromProp = properties.getProperty("uploadlistname").toLowerCase();

				
				
				if (contactNames.indexOf(contactNameFromProp) > -1) {
					driver.findElement(By.xpath(properties.getProperty("uploadlistxpath"))).clear();
					
				}
					
					driver.findElement(By.xpath(properties.getProperty("uploadlistxpath")))
							.sendKeys(properties.getProperty("uploadlistname")+"_"+System.currentTimeMillis());
					Thread.sleep(3000);
				
			  
			  
			
				driver.findElement(By.id("sample_editable_1_new")).click();
				Thread.sleep(4000);

				Thread.sleep(1000);
				driver.findElement(By.xpath(properties.getProperty("con_accept"))).click();

				Thread.sleep(4000);
				String contact = driver.findElement(By.id("responseMessage")).getText();
				Assert.assertEquals(contact, "Your contact list has been created successfully and it is being processed.");
				
				
				
				logger.info("Contact Added Successfully through 'UPLOAD A CSV'");
		}
		
		

	
}