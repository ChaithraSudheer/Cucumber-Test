package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Googlestep 
{
	public WebDriver driver;
	public String title;

	@Given("Open Google Application")
	public void open_google_application() {
	    System.out.println("Google application opens!!!");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com");
	    
	}

	@When("I capture current page title")
	public void i_capture_current_page_title() {
	    System.out.println("Current page title is captured");
	    title=driver.getTitle();
	}

	@Then("Title should match to Google")
	public void title_should_match_to_google() {
	    Assert.assertTrue(title.contains("Google"), "Title is not matched");
	    System.out.println("Title is matched");

	}
	
	@When("I enter valid keyword in search field")
	public void i_enter_valid_keyword_in_search_field() {
	    driver.findElement(By.id("APjFqb")).sendKeys("Cucumber");
	}

	@Then("Valid keyword result should dispaly")
	public void valid_keyword_result_should_dispaly() {
	    List<WebElement> ls=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	    System.out.println("Total options are: "+ls.size());
	    
	    for(WebElement i:ls)
	    {
	    	System.out.println(i.getText());
	    }
	}


}
