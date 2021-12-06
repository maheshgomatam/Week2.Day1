package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_Week2_Day1_Test_Case_1 {

	public static void main(String[] args) {

		//Setup the chrome driver
		WebDriverManager.chromedriver().setup();

		//Launch the chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url (method --> get --> "http://")
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the chrome driver
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Mahesh");
		driver.findElement(By.id("lastNameField")).sendKeys("Gomatam");
		driver.findElement(By.name("submitButton")).click();
		
		//Print the first name and browser title
		String title = driver.getTitle();
		String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println("First name is: " +text);
		System.out.println("Browser title is :"+title);
		
		//Close the browser
		driver.close();
		
		
		
		
		
		//Get the title
		//String title = driver.getTitle();
		//System.out.println(title);
		
		

		//Find the user name and enter the value
		/*
		 * driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 * driver.findElement(By.id("password")).sendKeys("crmsfa");
		 * driver.findElement(By.className("decorativeSubmit")).click();
		 * driver.findElement(By.linkText("CRM/SFA")).click();
		 * driver.findElement(By.linkText("Leads")).click();
		 * driver.findElement(By.linkText("Create Lead")).click();
		 * driver.findElement(By.id("createLeadForm_companyName")).
		 * sendKeys("DXC Technology");
		 * driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mahesh");
		 * driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gomatam");
		 * 
		 * driver.findElement(By.id("submitButton")).click();
		 * 
		 * String title2 = driver.getTitle(); System.out.println(title2);
		 */		
	}

}
