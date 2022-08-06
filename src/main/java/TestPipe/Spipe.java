package TestPipe;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spipe {
	WebDriver driver;
	@Test
	public void first() throws InterruptedException {
	 
		driver = WebDriverManager.chromedriver().create();   
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
Thread.sleep(6000);	
		
		driver.close();
		

}

	}

