package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bag for boys");
		driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
		System.out.println(
		driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText());
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		driver.findElement(By.xpath("//span[text()='Safari']")).click();
		driver.findElement(By.xpath("//span[text()='Frantic']")).click();
		Thread.sleep(5000);
		String productDetails=driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 puis-line-clamp-3-for-col-4-and-8 s-link-style a-text-normal']//span)[1]")).getText();
		Thread.sleep(5000);
		String productPrize=driver.findElement(By.xpath("//a[@class='a-link-normal s-no-hover s-underline-text s-underline-link-text s-link-style a-text-normal']/span[1]")).getText();
		Thread.sleep(5000);
		String originalPrize=driver.findElement(By.xpath("(//span[@class='a-price a-text-price'])[1]")).getText();
		System.out.println("Product details are "+productDetails + "\nProduct prize is " +productPrize +"\nOriginal prize is "+ originalPrize);
	}
}
