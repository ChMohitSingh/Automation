package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	private WebDriver driver;
	public void setup() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
