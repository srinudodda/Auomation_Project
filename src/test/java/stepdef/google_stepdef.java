package stepdef;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class google_stepdef {
	public  WebDriver driver;
	 public String actT;
	@Given("open the Google application")
	public void open_the_google_application() {
	    driver=new ChromeDriver();
	   driver.get("https://www.google.com");
	}

	@When("User captures current page title")
	public void user_captures_current_page_title() {
	    String expT="Google";
	    String actT = driver.getTitle();
	}

	@Then("Title should match")
	public void title_should_match() {
	   Assert.assertTrue(actT.contains("Google"),"title is matched");
	   System.out.println("tc is passed");
	}



}
