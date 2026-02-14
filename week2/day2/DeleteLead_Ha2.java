package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead_Ha2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/.");
		//Enter the username
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/form/p[1]/input")).sendKeys("democsr2");
		//Enter the password.
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		//Click the Login button.
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//Click the "crm/sfa" link.
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		//Click the "Leads" link.
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//Click "Find leads."
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter the phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("111111");
		//Click the "Find leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//Capture the lead ID of the first resulting lead.
		WebElement lead=driver.findElement((By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		String text1=lead.getText();
		System.out.println(text1);
		//Thread.sleep(5000);
		lead.click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("id")).sendKeys(text1);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		WebElement elementName=driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		String text2=elementName.getText();
		Thread.sleep(5000);
		System.out.println(text2);
		driver.close();
		
		
	
		
		
		
	}

}
