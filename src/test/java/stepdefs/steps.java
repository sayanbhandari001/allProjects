package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	WebDriver driver = new ChromeDriver();
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	
		System.out.println("hi");
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		System.out.println(driver.getTitle());
		System.out.println("fine");
	}

	@When("^user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_and(String username, String password) throws Throwable {
		driver.findElement(By.name("login")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^user should navigate to home page$")
	public void user_should_navigate_to_home_page() throws Throwable {
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
