package Utility;


import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


	
public class WebDriver {
	
	public static ChromeDriver getDriver() 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Atlassian\\chrome\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver =new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		return driver;
		
	}	
	
	}


