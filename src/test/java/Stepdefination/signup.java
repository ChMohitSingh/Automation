package Stepdefination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signup {
	WebDriver driver;
	
	
	
	
	
	
	@Given("user is at signup page")
	public void user_is_at_signup_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com/login");

	}

	@When("user enter the name and email")
	public void user_enter_the_name_and_email() {
		driver.findElement(By.name("name")).sendKeys("mohit");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("Mohitsingh14@gmail.com");
		
	}

	@And("click on signup Button")
	public void click_on_signup_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
;
	}

	@Then("user navigated to th information page")
	public void user_navigated_to_th_information_page() {
		String act = driver.findElement(By.xpath("//b[.='Enter Account Information']")).getText();
		String exp= "ENTER ACCOUNT INFORMATION";
		assertEquals(act,exp);

	}


}
