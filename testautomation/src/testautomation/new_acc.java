package testautomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class new_acc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		

	}

}
