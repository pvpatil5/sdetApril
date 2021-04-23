package sdetapril;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc__001 {


	@Test
	public void getTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com");
		System.out.println(driver.getTitle());
	}
}
