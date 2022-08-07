package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locater3 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	ChromeDriver driver =  new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	
	
	
	

}
}


