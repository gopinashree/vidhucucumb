package casestudy4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class casestudy4run {
	
	WebDriver driver;
	@Given("user enters homepage")
	public void user_enters_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\vidhya1\\RemoteSystemsTempFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   
	}

	@When("users enters {string}  search bar")
	public void users_enters_search_bar(String string) {
		 driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
	  
	}

	@Then("user enters find details")
	public void user_enters_find_details() {
		Actions act=new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/form/input"))).click().build().perform();
		 
	}

	@And("user tries to add to cart")
	public void user_tries_to_add_to_cart() {
		Actions act=new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/center/a"))).click().build().perform();
		
		
		
	}

	@Then("he will be asked for login details")
	public void he_will_be_asked_for_login_details() {
		Assert.assertEquals(driver.getTitle(),"Login");
	}
	   
	}



