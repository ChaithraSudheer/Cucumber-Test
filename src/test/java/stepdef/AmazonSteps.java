package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmazonSteps 
{
	public WebDriver driver;
	@Given("Open Amzon application")
	public void open_amzon_application() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.amazon.in");
	}

	@When("user capture the actual home page title")
	public void user_capture_the_actual_home_page_title() {
	    System.out.println(driver.getTitle());
	}

	@Then("Title should be matched with expected home page Title")
	public void title_should_be_matched_with_expected_home_page_title() {
	    Assert.assertTrue(driver.getTitle().contains("Online"), "Title is not matched");
	    System.out.println("Home Page Title is matched");
	}

	@When("user opens Bestsellers page")
	public void user_opens_bestsellers_page() {
	    driver.findElement(By.linkText("Best Sellers")).click();
	}

	@When("user captures Best Sellers acutal title")
	public void user_captures_best_sellers_acutal_title() {
	    System.out.println(driver.getTitle());
	}

	@Then("Title should be matched with BestSellers expected Title")
	public void title_should_be_matched_with_best_sellers_expected_title() {
	    Assert.assertTrue(driver.getTitle().contains("Bestsellers"),"Title is not matched");
	    System.out.println("Bestsellers title is matched");
	}

	@When("user opens mobiles page")
	public void user_opens_mobiles_page() {
	    driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("user captures Mobiles page actual title")
	public void user_captures_mobiles_page_actual_title() {
	    System.out.println(driver.getTitle());
	}

	@Then("Tile should be matched with Mobiles page expected title")
	public void tile_should_be_matched_with_mobiles_page_expected_title() {
	    Assert.assertTrue(driver.getTitle().contains("Mobiles"), "Title is not matched");
        System.out.println("Mobiles page title is matched");	
	}

	@When("user opens Todays Deal page")
	public void user_opens_todays_deal_page() {
	    driver.findElement(By.linkText("Today's Deals")).click();
	}

	@When("user captures todaysdeal page actual title")
	public void user_captures_todaysdeal_page_actual_title() {
	    System.out.println(driver.getTitle());
	}

	@Then("Title should be matched with Todaysdeal page expected title")
	public void title_should_be_matched_with_todaysdeal_page_expected_title() {
	   Assert.assertTrue(driver.getTitle().contains("Deals"), "Title is not matched");
	   System.out.println("Todays Deal page title is matched");
	}






}
