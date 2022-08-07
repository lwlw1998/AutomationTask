 package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	  System.out.println(driver.findElements(By.tagName("a")).size());
	  
		
	}

}
