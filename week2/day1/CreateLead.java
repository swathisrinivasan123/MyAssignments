package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		//Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		//Click on the "Create Lead" button
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter a FirstName.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("swathi");
		//Enter a LastName.
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("srinivasan");
		//Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//Enter a title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("M");
		//Click the "Create Lead" button.
		driver.findElement(By.name("submitButton")).click();
		//Print theTitle.
		System.out.println(driver.getTitle());    
		//Close the browser window.
		driver.close();
		

	}

}
