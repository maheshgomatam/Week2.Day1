package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_Week2_Day1_Test_Case_2 {

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
		driver.findElement(By.linkText("Find Contacts")).click();
		//driver.findElement(By.className("x-tab-strip-text")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		driver.findElement(By.className("x-btn-text")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		//Close the browser
		driver.close();
		
		
		
		
		
	}

}
