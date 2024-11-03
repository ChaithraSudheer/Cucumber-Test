package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class shoppingcartSteps 
{
	 public WebDriver driver;
	 
	@Given("Open the product page")
	public void open_the_product_page() {
	    
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/fastrack-optimus-pro-1-43-amoled-display-aod-466x466-functional-crown-bt-calling-smartwatch/p/itma4744c9053b72?pid=SMWGV3ZY9YJYEYEC&lid=LSTSMWGV3ZY9YJYEYECZN6QCW&marketplace=FLIPKART&store=ajy%2Fbuh&srno=b_1_1&otracker=browse&fm=organic&iid=e2f1891e-9b51-43d9-9d41-3f52c050a908.SMWGV3ZY9YJYEYEC.SEARCH&ppt=hp&ppn=homepage&ssid=r3hodkap3k0000001719399624320");
		driver.manage().window().maximize();
	}

	@When("I click on the add to cart button")
	public void i_click_on_the_add_to_cart_button() {
	    driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
	}

	@Then("Product shoud be added to cart page")
	public void product_shoud_be_added_to_cart_page() {
		
		System.out.println("Title of the page is: "+driver.getTitle());
		Assert.assertTrue(driver.getCurrentUrl().contains("FLIPKART"), "Url is matched");
		System.out.println("Url is matched & product is on cart page");

	}
	
}
