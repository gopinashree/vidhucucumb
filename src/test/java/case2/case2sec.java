package case2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case2sec {
	WebDriver driver;
	
	@Given("login page is displayed")
	public void login_page_is_displayed() {
		System.setProperty("webdriver.chrome.driver", "C:\\vidhya1\\RemoteSystemsTempFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		 //driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		 
	   
	}

	@Given("user enters {string}")
	public void user_enters(String string) {
		 driver.findElement(By.id("userName")).sendKeys(string);
		
		
	   
	}
	@When("user gives {string}")
	public void user_gives(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	    
	}

	@When("login page displayed")
	public void login_page_displayed() {
		 driver.findElement(By.xpath("//input[@name='Login']")).click();
		 
	   
	}



}
