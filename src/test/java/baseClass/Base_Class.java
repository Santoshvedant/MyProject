package baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
public static WebDriver driver;
	
	@BeforeTest
	public static void setupMethod() {
	
		
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://magento.softwaretestingboard.com/");
			
		}
		
		
	
	
	
	@AfterTest
	
	public static void teardownMethod() {
		
		driver.close();
	}
}
