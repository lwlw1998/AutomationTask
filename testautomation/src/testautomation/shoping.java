package testautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shoping {
	
	ChromeDriver driver ;
	String Url ="http://automationpractice.com/index.php";
	
	public void invokeBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver= new ChromeDriver ();
		driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Url);
		
		String urlWebpage =driver.getCurrentUrl();
		if (urlWebpage.equals("http://automationpractice.com/index.php"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
			
		}
	}
	public void signin() throws InterruptedException
	{
		driver.findElement(By.className("login")).click();
		driver.findElement(By.name("email")).sendKeys("alizeidan@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("alizeidan1998");
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		driver.findElement(By.xpath("(//img[@class='replace-2x'])[1]")).click();
		driver.findElement(By.xpath("(//img[@class='replace-2x'])[2]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//img[@title='Blouse']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[1]")).click();

		 driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]")).click();		
		 driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]")).click();		
			driver.findElement(By.xpath("//input[@id='cgv' and @value='1']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			 driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]")).click();		
			 driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();	
			 driver.findElement(By.xpath("(//span[normalize-space()='I confirm my order'])[1]")).click();	
			 driver.findElement(By.xpath("(//span[normalize-space()='Ali zeidan'])[1]")).click();	
			 driver.findElement(By.xpath("(//span[normalize-space()='Order history and details'])[1]")).click();	

			 driver.close();
			 
			 


		

			
		

		
		
		
		


		
	}

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		shoping st = new shoping();
		st.invokeBrowser();
		st.signin();
		

	}

}
