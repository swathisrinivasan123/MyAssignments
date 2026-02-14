package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelectClass {

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
		driver.findElement(By.id("accountName")).sendKeys("CDE");
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		//Select "ComputerSoftware" as the industry. 
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select sel=new Select(industry);
		sel.selectByVisibleText("Computer Software");
		//Select "S-Corporation" as ownership using SelectByVisibleText. 
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select sel1=new Select(ownership);
		sel1.selectByVisibleText("S-Corporation");
		//Select "Employee" as the source using SelectByValue.
		WebElement source=driver.findElement(By.id("dataSourceId"));
		Select sel2=new Select(source);
		sel2.selectByValue("LEAD_EMPLOYEE");
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex. 
		WebElement mc=driver.findElement(By.id("marketingCampaignId"));
		Select sel3=new Select(mc);
		sel3.selectByIndex(5);
		//Select "Texas" as the state/province using SelectByValue. 
		WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel4=new Select(state);
		sel4.selectByValue("TX");
		//Click the "Create Account" button. 
		driver.findElement(By.className("smallSubmit")).click();		
		//Close the browser window.
		//driver.close();

	}

}
