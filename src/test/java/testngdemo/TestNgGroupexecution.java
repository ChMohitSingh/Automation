package testngdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgGroupexecution {
	
	WebDriver driver;
	//@Test(priority = 0)
	@BeforeClass(groups ="smoke")
	public void setup() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/login");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
	}
	@Test(groups = "smoke",priority = 1)
	public void FullName() {
		driver.findElement(By.name("name")).sendKeys("Mohit Singh");
		
	}
	@Test(groups = "smoke",priority = 2)
	public void EnterEmail() {
		//driver.findElement(By.name("email")).sendKeys("Mohitsingh@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("Mohitsingh13@gmail.com");
		
	}
	@Test(groups = "Regression",priority = 3)
	public void click_on_signup_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
		
	}
	//@Test(priority = 4)
	@AfterClass(groups = "sanity")
	public void teardown() {
		driver.close();
	}

}
