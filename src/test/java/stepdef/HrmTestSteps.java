package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class HrmTestSteps 
{
	public WebDriver driver;
	@Given("Open HRM application")
	public void open_hrm_application() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enters username {string} and enters password {string}")
	public void user_enters_username_and_enters_password(String un, String psw) {
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(psw);
	    
	}

	@When("User clicks on login button from login pannel")
	public void user_clicks_on_login_button_from_login_pannel() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User should able to login and navigate to dashboard page")
	public void user_should_able_to_login_and_navigate_to_dashboard_page() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login is Falied");
	    System.out.println("Login is completed");
	}


}
