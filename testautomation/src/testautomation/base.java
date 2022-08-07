package testautomation;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait w = new WebDriverWait(driver ,5);

	    

		String[] itemsNeeded = {"Cucumber","Brocolli" ,"Beetroot"	};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(" span.promoInfo")));
		
		
		System.out.println(driver.findElement(By.cssSelector(" span.promoInfo")).getText());
		
		 	
		
		
		
		
		
		
	}
	public static void addItems(WebDriver driver ,String[] itemsNeeded)
	{
		int j=0;
	    List< WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	    for (int i=0 ; i< products.size(); i++)
	    	
	    {
	    	// Brocolli - 1 Kg
	    	//Brocolli ,  1 kg
	    	
	    String[] name= products.get(i).getText().split("-");
	    String formattedName = name[0].trim();
	    
	    //convert arry to arry list to easy search
	    List itemsNeededList = Arrays.asList(itemsNeeded);
	    
	    if(itemsNeededList.contains(formattedName))
         {
	    	// click on add cart
	    	 j++;
	    	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
	    		
	    	if(j==itemsNeeded.length)
	    	{
	    	break;
	    	//use lenght to get size array
	    	// use size to get size arraylist
	    	}
	      }
	    }
	}
}

	    
	   
	

	    
   // for (int i=0 ; i< products.size(); i++)
	    	
	 //   {
	   // String name= products.get(i).getText();
	    //if(name.contains("Brocolli "))
        // {
	    	// click on add cart
	    	 
	    //	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
	    	//break;
	    	
	    	
	
          //}
	    	
	    	
	    //}
	    

	//}

//}
