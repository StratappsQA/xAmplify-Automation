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

import org.apache.commons.lang3.RandomStringUtils;
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
import com.opencsv.CSVWriter;

public class partners_tab_csv {
	private static final TimeUnit Seconds = null;
	static WebDriver driver = Instance.getInstance();
	static Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Partners.properties");
	final Logger logger = LogManager.getLogger(partners_tab_csv.class);

	@Test(priority = 7, enabled = false)
	public void copy_from_clipboard_tab() throws InterruptedException, SQLException, IOException

	{

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("copyFromClipBoard")));
		// logger.debug("Starting creating partner using copy from clipboard - comma
		// separated");

		driver.findElement(By.id("copyFromClipBoard")).click();// click copy from clipboard
		Select delimiter = new Select(
				driver.findElement(By.xpath("//div[@class='col-xs-6']//select[@class='opts form-control']")));
		delimiter.selectByValue("TabSeperated");
		driver.findElement(By.xpath(properties.getProperty("drop"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("drop"))).sendKeys("Legitimate interest - prospect/lead");// enter
																														// data
																														// for
																														// legal
																														// basis
																														// field
		Thread.sleep(1000);

		WebElement textbox2 = driver.findElement(By.xpath(properties.getProperty("drop")));
		textbox2.sendKeys(Keys.ENTER);// click enter in the keyboard
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("drop")))
				.sendKeys("Legitimate interest - existing customer");// enter data for legal basis field
		Thread.sleep(1000);
		textbox2.sendKeys(Keys.ENTER);// click enter in the keyboard

		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("drop"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("drop"))).sendKeys("Legitimate interest - other");// enter
																												// data
																												// for
																												// legal
																												// basis
																												// field
		Thread.sleep(1000);
		textbox2.sendKeys(Keys.ENTER);// click enter in the keyboard
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("drop"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("drop"))).sendKeys("Performance of a contract");// enter data
																											// for legal
																											// basis
																											// field
		Thread.sleep(1000);
		textbox2.sendKeys(Keys.ENTER);// click enter in the keyboard
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("drop"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("drop"))).sendKeys("Freely given consent from contact");// enter
																													// data
																													// for
																													// legal
																													// basis
																													// field
		Thread.sleep(1000);
		textbox2.sendKeys(Keys.ENTER);// click enter in the keyboard
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("drop"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("drop"))).sendKeys("Not applicable");// enter data for legal
																								// basis field
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

		// Select objSelect = new
		// Select(driver.findElement(By.xpath(properties.getProperty("option"))));
		// objSelect.selectByIndex(1);
		driver.findElement(By.xpath(properties.getProperty("option"))).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("checkbox"))).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("proceed"))).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("save1"))).click();
		Thread.sleep(5000);
	}

	/*
	 * @Test(priority=8,enabled=true) public void copy_from_clipboard3() throws
	 * InterruptedException, SQLException, IOException { 
	 * setcsvdata();
	 * Thread.sleep(2000);
	 * driver.findElement(By.xpath(properties.getProperty("uploadcsv1"))).sendKeys(
	 * "D:\\Selenium\\files\\Data.csv"); }
	 * 
	 * 
	 * public void setcsvdata() throws IOException { String myEmailAddress =
	 * "m.harish340"+"_"+ System.currentTimeMillis() +"@gmail.com";
	 * 
	 * 
	 * CSVWriter writer = new CSVWriter(new
	 * FileWriter("D:\\Selenium\\files\\Data.csv")); String line1[] = { "FIRSTNAME",
	 * "LASTNAME", "COMPANY", "JOBTITLE",
	 * "EMAILID","VERTICAL","REGION","TYPE","CATEGORY","ADDRESS","CITY","STATE",
	 * "ZIP","COUNTRY","MOBILE NUMBER" }; String line2[] = { "lal", "Krishna",
	 * "sapps", "ceo",
	 * myEmailAddress,"ver","reg","type1","category1","add1","hyderabad","telangana"
	 * ,"500070","india","987654321" };
	 * 
	 * writer.writeNext(line1); writer.writeNext(line2);
	 * 
	 * writer.flush(); 
	 * writer.close();
	 *  }
	 * 
	 * @Test(priority = 9, enabled=false) public void act() throws
	 * InterruptedException, SQLException, IOException{
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); String
	 * generatedString = RandomStringUtils.randomAlphabetic(10);
	 * 
	 * WebElement searchbar
	 * =driver.findElement(By.xpath(properties.getProperty("searchh")));
	 * searchbar.sendKeys(generatedString); searchbar.sendKeys(Keys.ENTER);
	 * Thread.sleep(5000); //searchbar.clear(); // Thread.sleep(4000);
	 * driver.findElement(By.xpath(properties.getProperty("clear"))).click();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	@Test(priority = 8, enabled = false)
	public void upload_csv() throws Throwable {
		String fileToUpdate = "D:\\Selenium\\files\\Data.csv", replace = "@mail-hub.info";
		String str = "mharish";
		int row = 2, col = 5;

		File inputFile = new File(fileToUpdate);

//Read existing file 

		CSVReader reader = new CSVReader(new FileReader(inputFile), ',');

		List<String[]> csvBody = reader.readAll();

//get CSV row column  and replace with by using row and column

		Thread.sleep(7000);

		csvBody.get(row)[col] = str + System.currentTimeMillis() + replace;

		reader.close();

//Write to CSV file which is open

		CSVWriter writer = new CSVWriter(new FileWriter(inputFile), ',');

		writer.writeAll(csvBody);

		writer.flush();

		writer.close();

		Actions actions111 = new Actions(driver);

		WebElement partners111 = driver.findElement(By.xpath(properties.getProperty("hoverpartner")));

		actions111.moveToElement(partners111).build().perform();

		Thread.sleep(3000);

		System.out.println("partners");

		// driver.findElement(By.xpath(properties.getProperty("onboardingpartners"))).click();

		// //onboardingpartners

		driver.get("https://release.xamplify.io/home/partners/add");

		Thread.sleep(5000);

		driver.findElement(By.id("uploadCSV")).sendKeys("D:\\Selenium\\files\\Data.csv");

		// driver.findElement(By.xpath("//*[@id=\"uploadCSV\"]/input")).click();

		// driver.findElement(By.partialLinkText("Upload a CSV")).click();

		// driver.findElement(By.xpath("//*[@id=\"uploadCSV\"]/span")).click();

		Thread.sleep(7000);

		// Runtime.getRuntime().exec("D:\\Selenium\\Files\\uploadcsv.exe");

		Thread.sleep(7000);

		driver.findElement(By.xpath(

				"/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-partners[1]/div[1]/div[3]/div[2]/button[1]/span[1]"))

				.click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(

				"/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-partners[1]/div[1]/div[3]/div[2]/ul[1]/li[1]/a[1]"))

				.click();

		Thread.sleep(8000);

		driver.findElement(By.xpath(

				"/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-add-partners[1]/div[3]/app-contacts-campaigns-mails[1]/div[1]/div[1]/div[1]/div[1]/button[1]"))

				.click();

	}

	@Test(priority = 9, enabled = false)
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
	}

	@Test(priority = 10, enabled = false)
	public void pagination() throws Throwable

	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("scroll(0, 2000)");

		Thread.sleep(3000);

		List<WebElement> pagination1 = driver.findElements(By.xpath("//ul[@class='pagination']/li/a"));
		System.out.println(pagination1.size());
		for (int i = 3; i <= pagination1.size() - 2; i++) {
			// Thread.sleep(10000);
			pagination1.get(i).click();
			Thread.sleep(5000);
		}
		// driver.findElement(By.xpath(properties.getProperty("pagenation_last"))).click();
		// Thread.sleep(3000);
		// driver.findElement(By.xpath(properties.getProperty("pagenation_first"))).click();

	}

	@Test(priority = 11, enabled = false)
	public void pagenation() throws Throwable

	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("pagenation2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("pagenation_last"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("pagenation_first"))).click();

	}

	@Test(priority = 12, enabled = false)
	public void restall_icons() throws Throwable {
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("deletepartner"))).click();
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
		Thread.sleep(3000);
        driver.findElement(By.xpath(properties.getProperty("closeanalytics"))).click();
        
	}
        
    	@Test(priority = 13, enabled = true)
    	public void Managepartners() throws Throwable

    	{
        
    		WebElement partners = driver.findElement(By.xpath(properties.getProperty("hoverpartner")));//hover to partners module in left menu
    		Actions actions = new Actions(driver);
    		actions.moveToElement(partners).perform();
    		Thread.sleep(3000);
    		driver.findElement(By.xpath(properties.getProperty("managepartner"))).click();
    		
        
    	}
    	@Test(priority = 14, enabled = true)
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
    		driver.findElement(By.xpath(properties.getProperty("editlist"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(properties.getProperty("editinglist"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(properties.getProperty("cname"))).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath(properties.getProperty("cname"))).sendKeys("cname"+" "+System.currentTimeMillis());
        Thread.sleep(2000);
       /* WebElement textbox3 = driver.findElement(By.xpath(properties.getProperty("dropp")));
		Thread.sleep(1000);
        driver.findElement(By.xpath(properties.getProperty("dropp"))).sendKeys("Legitimate interest - prospect/lead");
		textbox3.sendKeys(Keys.ENTER);// click enter in the keyboard

		Thread.sleep(1000);
*/
        driver.findElement(By.xpath(properties.getProperty("updated"))).click();
        Thread.sleep(2000);
        
       // driver.findElement(By.xpath(properties.getProperty("campaignlist"))).click();
        driver.findElement(By.xpath(properties.getProperty("campaignanalytics"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(properties.getProperty("closes"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(properties.getProperty("copyandsave"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(properties.getProperty("copyandsavename"))).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath(properties.getProperty("copyandsavename"))).sendKeys("automated list"+"_"+System.currentTimeMillis());
	    Thread.sleep(2000);
        driver.findElement(By.xpath(properties.getProperty("savenamechanges"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(properties.getProperty("downloadlist"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(properties.getProperty("campain"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(properties.getProperty("entinfo"))).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath(properties.getProperty("sharingcampaigns"))).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath(properties.getProperty("closing"))).click();
    	}

}