package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class end2end {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("http://3.110.88.201/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@Value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@Value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		 if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		 {
			 System.out.println("its disabled");
			 Assert.assertTrue(true);
			 
		 }
		 else
		 {
			 Assert.assertTrue(false);

		 }
			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000L);
			
			for (int i=1 ;i<5 ; i++)
			{
				driver.findElement(By.id("hrefIncAdt")).click();
			}
			
			driver.findElement(By.id("btnclosepaxoption")).click();
			Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
			 System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
			
			 driver.findElement(By.cssSelector("input[Value='Search']")).click();
			 
	}

}
