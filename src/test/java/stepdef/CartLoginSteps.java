package stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class CartLoginSteps 
{
	public WebDriver driver;
	
	@Given("Open Cart Login page")
	public void open_cart_login_page() {
	    
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("I enter valid credentials for login")
	public void i_enter_valid_credentials_for_login(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

		List<Map<String,String>> dt=table.asMaps();
		driver.findElement(By.name("email")).sendKeys(dt.get(0).get("email"));
		driver.findElement(By.name("password")).sendKeys(dt.get(0).get("Password"));
       
	}

	@When("I click login button")
	public void i_click_login_button() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("I should able to login to opencart application")
	public void i_should_able_to_login_to_opencart_applicatio() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("account"), "Fail:Login is failed");
	    System.out.println("Login is completed...");
	}



	

}
