package stepdefinitions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Home {
	 WebDriver driver;
	@Given("^user opens the browser$")
	public void user_opens_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 WebDriverManager.edgedriver().setup();  
		  driver=new EdgeDriver();
		//	driver.get("https://demoblaze.com/");	

	}
	

	@When("^launch the application$")
	public void launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://demoblaze.com/");	
		}

	@Then("^Application should launch successfully$")
	public void application_should_launch_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getTitle(), "STORE");
				
	}

	@Then("^observe the contents in the category section$")
	public void observe_the_contents_in_the_category_section(DataTable data) throws Throwable {
	//	List<String>d=data.asList();
		 List<List<String>> d = data.asLists(String.class);
	   for(int i=0;i<d.size();i++)
	   {
		Assert.assertEquals(driver.findElement(By.xpath("//a[normalize-space()='"+d.get(i)+"']")).getText(),d.get(i));
	   }
	}

	@When("^clicks on login link$")
	public void clicks_on_login_link() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^enter \"([^\"]*)\" \"([^\"]*)\" and click on login button$")
	public void enter_and_click_on_login_button(String username, String password) throws Throwable {
		driver.findElement(By.id("loginusername")).sendKeys(username);
		driver.findElement(By.id("loginpassword")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		
		  // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should logins successfully$")
	public void user_should_logins_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^user launches registration page$")
	public void user_launches_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.edgedriver().setup();

		driver=new EdgeDriver();
		 driver.get("http://demo.automationtesting.in/Register.html");
	}

	@Given("^observes the contents$")
	public void observes_the_contents() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.getCurrentUrl();
	}
	@Given("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//a[text()='"+arg1+"']")).click();
	}
	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	driver.close();
	}
}
