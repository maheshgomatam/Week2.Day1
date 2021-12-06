package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_Week2_Day1_Test_Case_3 {

	public static void main(String[] args) {

		//Setup the chrome driver
		WebDriverManager.chromedriver().setup();

		//Launch the chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url (method --> get --> "http://")
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the chrome driver
		
		driver.manage().window().maximize();
		
		//Enter User Name and Password
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinoth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar Thirupathy");
		
		//Step 1: Find the dropdown element (select tag)
		WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Step 2: Convert that as a Select class
		Select obj = new Select(findElement);
		int totcount = obj.getOptions().size();
		obj.selectByIndex(totcount -1);
		
		WebElement findElement2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select obj2 = new Select(findElement2);
		obj2.selectByValue("CATRQ_CAMPAIGNS");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("First_name");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Last_name");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/17/2021");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MyProfile");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information IT");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
       		
		WebElement findElement3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select obj3 = new Select(findElement3);
		//obj3.selectByVisibleText("CAD - Canadian Dollar");
		obj3.selectByIndex(2);
		
		WebElement findElement4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select obj4 = new Select(findElement4);
		obj4.selectByVisibleText("Computer Software");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		
		WebElement findElement5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select obj5 = new Select(findElement5);
		int count = obj5.getOptions().size();
		obj5.selectByIndex(count-2);
		
		String text = driver.findElement(By.id("createLeadForm_ _sp")).getText();
		System.out.println(text);
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("2");
			
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("23");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("615-541-2966");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("5456");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Jeff Salsibry");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bala@salesforce.com");
		
		String text2 = driver.findElement(By.id("createLeadForm__sp")).getText();
		System.out.println(text2);
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Rakesh Maskara");
		
		WebElement findElement6 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select obj6 = new Select(findElement6);
		obj6.selectByValue("IOT");
		
		driver.findElement(By.name("submitButton")).click();
		
		String text3 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text3);
		String gettitle = driver.getTitle();
		System.out.println(gettitle);
		
		//Close the browser
		driver.close();
		
			
	}

}
