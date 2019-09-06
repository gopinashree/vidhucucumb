package study1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class study1sec {
	WebDriver driver;
	
	@Given("user opens the application")
	public void user_opens_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\vidhya1\\RemoteSystemsTempFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.manage().window().maximize();

	    
	}

	@Given("user clicks on signup button")
	public void user_clicks_on_signup_button() {
		driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
		
	   
	}
	@Then("user enters username as {string}")
	public void user_enters_username_as(String string) {
		 driver.findElement(By.id("userName")).sendKeys("string");
	}
		  
	@When("user enters firstname as {string}")
	public void user_enters_firstname_as(String string) {
		 
		  driver.findElement(By.id("firstName")).sendKeys("string");
	    
	}

	@When("and user enters lastname  as {string}")
	public void and_user_enters_lastname_as(String string) {
	    
		 driver.findElement(By.id("lastName")).sendKeys("ravi");
	}

	@When("password is {string} in the password field")
	public void password_is_in_the_password_field(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	    
	}

	@Then("password is {string} in the confirm password field")
	public void password_is_in_the_confirm_password_field(String string) {
		 driver.findElement(By.id("pass_confirmation")).sendKeys(string);
	    
	}

	@Then("user clicks {string} in the gender field")
	public void user_clicks_in_the_gender_field(String string) {
		 driver.findElement(By.xpath("//input[@value='Female']")).click();
	   
	}

	@Then("user enters {string} in the Email field")
	public void user_enters_in_the_Email_field(String string) {
		 driver.findElement(By.id("emailAddress")).sendKeys(string);
	   
	}

	@Then("user enters mobile no as {string}")
	public void user_enters_mobile_no_as(String string) {
		 driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(string);
	  
	}

	@Then("user passes dob as {int}\\/{int}\\/{int}")
	public void user_passes_dob_as(Integer int1, Integer int2, Integer int3) {
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

	@Then("user enters address as {string}")
	public void user_enters_address_as(String string) {
		 driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(string);
	    
	}

	@Then("user selects security question as {string}")
	public void user_selects_security_question_as(String string) {
		WebElement security=driver.findElement(By.xpath("//select[@id='securityQuestion']"));
		 Select secques=new Select(security);
		 secques.selectByIndex(2);
	    
	}

	@Then("user enters {string} in the Answer field")
	public void user_enters_in_the_Answer_field(String string) {
		 driver.findElement(By.xpath("//input[@id='answer']")).sendKeys(string);
	 
	}

	@When("user click on register")
	public void user_click_on_register() {
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@When("registration is sucessfull")
	public void registration_is_sucessfull() {
		System.out.println("registration sucessfull");
	    
	}



}
