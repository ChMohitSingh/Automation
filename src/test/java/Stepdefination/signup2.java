package Stepdefination;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signup2 {
   
	  WebDriver driver;
	 
//Background steps
	  @Before
	    public void setup() {
	    	driver=new ChromeDriver();
	    	  driver.manage().window().maximize();
	    }
	    
@Given("user is at signuppages")
public void user_is_at_signuppages() {
  // driver= new ChromeDriver();
  // driver.manage().window().maximize();
   driver.get("https://automationexercise.com/login");
   
}

@When("user enter the nameemail")
public void user_enter_the_nameemail(DataTable dataTable) {
	 List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
     
     // Extract name and email from the first row
     String name = data.get(0).get("name");
     String email = data.get(0).get("email");

     driver.findElement(By.name("name")).sendKeys(name);
	  driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys(email);
}


@And("click on Button")
public void click_on_Button() throws InterruptedException {
   driver.findElement(By.xpath("//button[.='Signup']")).click();
}

@Then("user to the page")
public void user_to_the_page() {
	String act = driver.findElement(By.xpath("//b[.='Enter Account Information']")).getText();
	String exp="ENTER ACCOUNT INFORMATION";
   assertEquals(act, exp);
   
}

// Scenario outline
/*@Given("user naviagte to the signup page")
public void user_naviagte_to_the_signup_page() {
	  driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://automationexercise.com/login");
}
*/

@When("user input (.*)and(.*)$")
public void user_input_fullname_and_emailid(String name,String mail) {
	driver.findElement(By.name("name")).sendKeys(name);
	  driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys(mail);
}

@And("click onbutton")
public void click_onbutton() throws InterruptedException {
	driver.findElement(By.xpath("//button[.='Signup']")).click();
Thread.sleep(3000);}

@Then("user should naviagt to the  page with valid data")
public void user_should_naviagte_to_the_page_with_valid_data() {
    
	String act = driver.findElement(By.xpath("//b[.='Enter Account Information']")).getText();
	String exp="ENTER ACCOUNT INFORMATION";
   assertEquals(act, exp);
}
}