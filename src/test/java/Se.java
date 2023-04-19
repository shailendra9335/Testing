import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

						
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Atlassian\\chrome\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				
				//driver.get("https://www.google.com");
				
				driver.manage().window().maximize();
				driver.navigate().to("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
				
				WebElement messageinput= driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input"));
				
				messageinput.click();
				
				
				WebElement s= driver.findElement(By.xpath("//*[@id=\"buttoncheck\"]"));
						
				
				s.click();
				
				WebElement e= driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input"));				
				 e.click();
				
				
				WebElement d= driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[1]/input"));				
				 d.click();
				
				
				WebElement first= driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button"));
				first.click();
				
				
								
				Thread.sleep(10000);
				
				driver.quit();
				
				
				}
				
				
			
				
				


	}


