//package stepdefs;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//
//public class Login_Stepdefinitions {
//
//	WebDriver driver;
//
//	@Given("^user is on login page$")
//	public void user_is_on_login_page() throws Throwable {
//		driver = utility.BrowserUtility.supplyDriver("chrome");
//		driver.manage().window().maximize();
//		driver.get("");
//		System.out.println(driver.getTitle());
//	}
//
//
//	@When("^user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_valid_and(String username, String password) throws Throwable {
//		driver.findElement(By.name("login")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//
//	@When("^click on login button$")
//	public void click_on_login_button() throws Throwable {
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//	}
//
//
//	@When("^user should navigate to home page$")
//	public void user_should_navigate_to_home_page() throws Throwable {
//		System.out.println(driver.getTitle());
//		driver.quit();
//	}
//
//}
