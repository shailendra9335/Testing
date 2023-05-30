import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OnlyGoogleLive {

	
	@Test(priority=4)



	
	
	public void cc() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Atlassian\\chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");

		
		driver.quit();
}
}