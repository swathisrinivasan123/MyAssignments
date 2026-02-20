package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.pvrcinemas.com/");
		//Click on Cinema under Quick Book
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		//Select a cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'INOX Lido Mall, Ulsoor Bengaluru')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		
		//WebElement movie=driver.findElement(By.xpath("//span[text()='Select Movie']"));
		//driver.executeScript("arguments[0].click()",movie);	
		driver.findElement(By.xpath("(//span[text()='DO DEEWANE SEHER MEIN'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='07:35 PM']")).click();
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("(//span[text()='4'])[4]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("//span[text()='Skip & Proceed']")).click();
		String seatInfo=driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println(seatInfo);
		String grandTotal=driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span")).getText();
		System.out.println(grandTotal);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		//WebElement close=driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]"));
		//driver.executeScript("arguments[0].click();",close);
				System.out.println(driver.getTitle());
				driver.close();
	}
	
	

}
