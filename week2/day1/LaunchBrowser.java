package week2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		FirefoxDriver driver2=new FirefoxDriver();
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\SIVA KUMAR\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver1=new EdgeDriver();
	}

}
