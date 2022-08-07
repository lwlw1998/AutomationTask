package testautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class creare_acc {
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
		public void Signup() throws InterruptedException 
		{
			
			driver.findElement(By.className("login")).click();
			driver.findElement(By.id("email_create")).sendKeys("alizeid@gmail.com");
			driver.findElement(By.id("SubmitCreate")).click();
			Thread.sleep(2000);
			//driver.findElement(By.id("uniform-id_gender1")).click();
			//driver.findElement(By.xpath("(//div[@id='uniform-id_gender2'])[2]")).click();
			driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
			driver.findElement(By.name("customer_firstname")).sendKeys("Ali");
			driver.findElement(By.name("customer_lastname")).sendKeys("zeidan");
			driver.findElement(By.name("passwd")).sendKeys("alizeidan1998");
			Thread.sleep(2000);
			WebElement dataElement =driver.findElement(By.id("days"));
			dataElement.click();
			Thread.sleep(2000);
			WebElement monthElement =driver.findElement(By.id("months"));
			monthElement.click();
			Thread.sleep(2000);
			WebElement yearElement =driver.findElement(By.id("years"));
			yearElement.click();
			Thread.sleep(2000);
	
			Select dataDropdown =new Select(dataElement);
			Select monthDropdown =new Select(monthElement);
			Select yearDropdown =new Select(yearElement);
			
			dataDropdown.selectByValue("2");
			Thread.sleep(2000);
			monthDropdown.selectByValue("1");
			Thread.sleep(2000);
			yearDropdown.selectByValue("2021");
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@id='newsletter' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@id='optin' and @value='1']")).click();
			driver.findElement(By.name("company")).sendKeys("nike");
			driver.findElement(By.name("address1")).sendKeys("354  floor ground");
			driver.findElement(By.name("address2")).sendKeys("354 st floor ground");
			driver.findElement(By.name("city")).sendKeys("cairo");
			
			Thread.sleep(2000);
			//WebElement stateElement =driver.findElement(By.xpath("//select[@id='id_state']"));
			WebElement stateElement =driver.findElement(By.id("id_state"));
			stateElement.click();
			Select stateDropdown =new Select(stateElement);
			stateDropdown.selectByVisibleText("Alabama");
			
			driver.findElement(By.name("postcode")).sendKeys("11511");
		
			WebElement countryElement =driver.findElement(By.id("id_country"));
			countryElement.click();
			Select countryDropdown =new Select(countryElement);
			countryDropdown.selectByVisibleText("United States");
			
			
			driver.findElement(By.name("other")).sendKeys("this is my company ");
			
			driver.findElement(By.name("phone")).sendKeys("0233037270");
			driver.findElement(By.name("phone_mobile")).sendKeys("01148035664");
			driver.findElement(By.name("alias")).sendKeys("smdmsndmsn ");
			driver.findElement(By.id("submitAccount")).click();
			
			
					
		
		
		}
		
	
	
	
	
	

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub

		
		creare_acc acc = new creare_acc();
		acc.invokeBrowser();
		acc.Signup();
	}

}
