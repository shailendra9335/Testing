import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AA {
	
	@Test(priority=1)



		
		
		public void cc() throws InterruptedException
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Atlassian\\chrome\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			//driver.get("https://www.google.com");
			
			driver.manage().window().maximize();
			driver.navigate().to("http://demo.seleniumeasy.com/basic-first-form-demo.html");
			
			WebElement messageinput= driver.findElement(By.id("user-message"));
			
			messageinput.sendKeys("Fist methods of clas AA");
			
			WebElement s= driver.findElement(By.xpath("//*[@id=\"get-input\"]/button"));
			
		
			
			s.click();
			
			WebElement d= driver.findElement(By.id("display"));
			
			String w= d.getText();
			
			if (w.equals("shailendra"))
			{
			System.out.println("pass");
			}
			
			else {
				System.out.println("fail");
			}
			
			WebElement first= driver.findElement(By.id("sum1"));
			first .sendKeys("3");
			
			WebElement sec= driver.findElement(By.id("sum2"));
			
			sec.sendKeys("34");
			
			WebElement f= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button"));
			
			f.click();
			
			Thread.sleep(10000);
			
			driver.quit();
			
			
			}
			
			
		@Test(priority=2)
		
		public void google() throws InterruptedException {
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Atlassian\\chrome\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			
			driver.navigate().to("http://demo.seleniumeasy.com/input-form-demo.html");
		
			driver.manage().window().maximize();
			
	WebElement Firstname= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input"));
			
	Firstname.sendKeys("sg");

	WebElement Lastname= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input"));

	Lastname.sendKeys("Singh");

	WebElement Email= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input"));

	Email.sendKeys("Singh@gmail.com");

	WebElement phone= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input"));

	phone.sendKeys("4526662222");

	WebElement add= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input"));

	add.sendKeys("noida and grater noida");

	WebElement city= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input"));

	city.sendKeys("ddddd");

	WebElement sta= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select"));

	Select select= new Select(sta);

	select.selectByIndex(4);

	WebElement zip= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input"));

	zip.sendKeys("24515");

	WebElement web= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[9]/div/div/input"));

	web.sendKeys("www.com");

	WebElement op= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[1]/label/input"));

	op.click();

	WebElement dec= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea"));

	dec.sendKeys("Secand methods of class AA");

	WebElement send= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button"));

	Thread.sleep(6000);

	send.click();
	Thread.sleep(6000);

	driver.quit();



					
		}
		
		@Test(priority=3)
		
		public void Ball() throws InterruptedException {
			
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


