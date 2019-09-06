package c3;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class c3sec {
	WebDriver driver;
	
	@Given("login page")
	public void login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\vidhya1\\RemoteSystemsTempFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		 driver.findElement(By.id("userName")).sendKeys("Lalitha");
		 driver.findElement(By.id("password")).sendKeys("Password123");
		 driver.findElement(By.xpath("//input[@name='Login']")).click();
		
	}

	@Given("user click on search bar")
	public void user_click_on_search_bar() {
		 driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
		 
	    
	    
	}

	@When("he searches as {string}")
	public void he_searches_as(String string) {
		 driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
	    
	}

	@Then("he try to find details")
	public void he_try_to_find_details() {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		
	   
	}

}
