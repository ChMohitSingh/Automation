package testngdemo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



     public class DemoLogin {
	
	   WebDriver driver;
	   @Test(priority = 0)
	   @Parameters("browser")
	
	  public void setup(String browser) {
		  if(browser.equalsIgnoreCase("chrome")) {
			  
		  
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://automationexercise.com/login");
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		  }
		  else if(browser.equalsIgnoreCase("Edge")) {
			  
			  driver=new EdgeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://automationexercise.com/login");
			  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		  }
		  else {
			  
			   System.err.println("Invaild browser name");
		  }
	  }
	   @Test(priority  =1)
     public void FullName() {
		   
	   driver.findElement(By.name("name")).sendKeys("rajesh yadav");
	   
		  
	  }

	   @Test(priority  =2)
     public void EnterEmail() {
	  driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys("rajeshyadav14112@gmail.com");
	   
   }
	   @Test(priority =3)
    public void click_On_signup_button() {
	  
    	driver.findElement(By.xpath("//button[.='Signup']")).click();
	   
	  String expected="ENTER... ACCOUNT INFORMATION";
	  
	  String actual = driver.findElement(By.xpath("//b[.='Enter Account Information']")).getText();
	 
	 // SoftAssert soft=new SoftAssert();
	  
	  //soft.assertEquals(actual, expected);
	  
	  Assert.assertEquals(expected, actual);
	  System.out.println("Information is verified successfully");
	  
	driver.findElement(By.id("first_name")).sendKeys("harry porter");
	  
	      
	    // soft.assertAll() ;
	      
	      
	   }
	   
	   @AfterClass
    public void teardown() throws InterruptedException {
    	Thread.sleep(5000);
    	driver.close();
    }
	  
}
