package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount_Ha1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/.");
		//Enter a username and password.
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the "CRM/SFA" link.
		driver.findElement(By.partialLinkText("CRM")).click();
		//Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name.
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("swathi");
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		//Enter a Number Of Employees.
		driver.findElement(By.id("numberEmployees")).sendKeys("20");
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		//Print theTitle name.
		String title=driver.getTitle();
		System.out.println("Title of the page is "+ title);
		//Close the browser window.
		driver.close();
		
		
		
		

	}

}
