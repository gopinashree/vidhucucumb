package c1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class c1sec {
	
	WebDriver driver;
	@Given("user opens application")
	public void user_opens_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\vidhya1\\RemoteSystemsTempFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.manage().window().maximize();
	   
	}

	@Given("user clicks signup button")
	public void user_clicks_signup_button() {
		driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
		
	  
	}

	@Then("user clicks username")
	public void user_clicks_username() {
		driver.findElement(By.id("userName")).sendKeys("vidhyaravi");
	   
	}

	@When("user enters firstname")
	public void user_enters_firstname() {
		  driver.findElement(By.id("firstName")).sendKeys("vidhya");
	}

	@When("and user enters lastname")
	public void and_user_enters_lastname() {
		 driver.findElement(By.id("lastName")).sendKeys("ravi");
	   
	}

	@When("password is as {string} in the password field")
	public void password_is_as_in_the_password_field(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
		
	    
	}

	@Then("password as {string} in the confirm password field")
	public void password_as_in_the_confirm_password_field(String string) {
		 driver.findElement(By.id("pass_confirmation")).sendKeys(string);
	    
	}

	@Then("user clicks gender")
	public void user_clicks_gender() {
		 driver.findElement(By.xpath("//input[@value='Female']")).click();
	   
	}

	@Then("user enters as {string} in the Email field")
	public void user_enters_as_in_the_Email_field(String string) {
		 driver.findElement(By.id("emailAddress")).sendKeys(string);
	    
	}

	@Then("user enters mobile no {string}")
	public void user_enters_mobile_no(String string) {
		 driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(string);
	    
	}

	@Then("user passes dob")
	public void user_passes_dob() {
		driver.findElement(By.xpath("//img[@title='Ch']")).click();
		  
		  WebElement selmonth= driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		  Select month=new Select(selmonth);
		  month.selectByValue("4");
		  
		  WebElement selyear= driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		  Select year=new Select(selyear);
		  year.selectByValue("1998");
		  
		  WebElement seldate= driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
		 seldate.findElement(By.linkText("1")).click();
	   
	
	}

	@Then("user enters address  {string}")
	public void user_enters_address(String string) {
		 driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(string);
	    
	}

	@Then("user selects security question  {string}")
	public void user_selects_security_question(String string) {
		WebElement security=driver.findElement(By.xpath("//select[@id='securityQuestion']"));
		 Select secques=new Select(security);
		 secques.selectByIndex(2);
	    
	  
	}

	@Then("user enters as {string} in the Answer field")
	public void user_enters_as_in_the_Answer_field(String string) {
		 driver.findElement(By.xpath("//input[@id='answer']")).sendKeys(string);
	   
	}

	@When("user clicks register")
	public void user_clicks_register() {
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@When("registration  sucessfull")
	public void registration_sucessfull() {
		System.out.println("registration sucessfull");
		   
	}



}
