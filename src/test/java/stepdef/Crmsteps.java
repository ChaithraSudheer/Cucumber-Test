package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import hooksDemo.BrowserSetUp;
import io.cucumber.java.en.*;

public class Crmsteps 
{
	public WebDriver driver=BrowserSetUp.getDriver();
	@Given("Open CRM Home Page")
	public void open_crm_application() {
	   // driver=new ChromeDriver();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //driver.get("https://automationplayground.com/crm/");
	}

	@When("User click on Signin")
	public void user_click_on_signin() {
	    driver.findElement(By.linkText("Sign In")).click();
	}

	@Then("Signin page should be open")
	public void signin_page_should_be_open() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Signin page is not opened");
	    System.out.println("Sign in page is opened");
	}

	@When("User enter valid email {string} and valid password {string}")
	public void user_enter_valid_email_and_valid_password(String email, String psw) {
		//driver.findElement(By.linkText("Sign In")).click();//manually added step
		driver.findElement(By.id("email-id")).sendKeys(email);
	    driver.findElement(By.id("password")).sendKeys(psw);
	}

	@When("User click on Submit button")
	public void user_click_on_submit_button() {
	    driver.findElement(By.id("submit-id")).click();
	}

	@Then("User should able to login and navigate to Customer page")
	public void user_should_able_to_login_and_navigate_to_customer_page() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("customers"), "Login Falied");
	    System.out.println("Login Completed");
	}




}
