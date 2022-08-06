package TestPipe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spipe {
	WebDriver driver;
	@Test
	public void first() throws InterruptedException {
	 
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
Thread.sleep(6000);	
		
		driver.close();
		

}

	}

