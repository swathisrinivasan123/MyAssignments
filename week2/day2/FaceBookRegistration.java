package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.log.model.ViolationSetting.Name;
import org.openqa.selenium.support.ui.Select;

public class FaceBookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Click on the Create new account button.
		driver.findElement(By.linkText("Create new account")).click();
		//Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("assignment1");
		//Enter the sur Name
		driver.findElement(By.name("lastname")).sendKeys("tracker");
		//Enter the Mobile number or email address.
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		//Enter the New password.
		driver.findElement(By.id("password_step_input")).sendKeys("qazwsx");
		//Handle all three dropdowns in Date of birth
		//Select by index
		WebElement day=driver.findElement(By.id("day"));
		Select sel=new Select(day);
		sel.selectByIndex(13);
		//Select by visible text
		WebElement month=driver.findElement(By.id("month"));
		Select sel1=new Select(month);
		sel1.selectByVisibleText("Oct");
		//Select by value
		WebElement year=driver.findElement(By.id("year"));
		Select sel2=new Select(year);
		sel2.selectByVisibleText("1998");
		//Select the radio button in Gender.
		driver.findElement(By.id("sex")).click();
		
		

	}

}
