package Bdd.com;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import Utility.WebDriver;

public class regis {
	
	ChromeDriver driver;

	@Given("$User lunch the browser")
	
	public  void launchThebroweser() {
		driver = WebDriver.getDriver();
		
		
	}
	@And("$user naviget the url")
	
	public void navi()
	{
		driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		
		
	}
	@When("$enter the username")
	
	public void usena()
	{
		WebElement Firstname= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input"));
		
		Firstname.sendKeys("sg");

		
	}
	
}
