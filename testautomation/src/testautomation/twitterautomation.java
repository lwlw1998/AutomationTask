package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class twitterautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String user="";
		String pass="";
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@placeholder='Phone, email or username']")));
		WebElement userTextField = driver.findElement(By.xpath(".//input[@placeholder='Phone, email or username']"));
		userTextField.sendKeys(user);
		WebElement PassTextField = driver.findElement(By.xpath(".//input[@class='js-password-field']"));
		PassTextField.sendKeys(pass);
		
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		WebElement tweetBox = driver.findElement(By.id("tweet-box-home-timeline"));
		tweetBox.click();
		tweetBox.sendKeys("Tweet less than 255 characters ");
		driver.findElement(By.xpath(".//button[@class='tweet-action EdgeButton EdgeButton--primary js-tweet-btn']")).click();
		
		driver.quit();

		


	}

}
