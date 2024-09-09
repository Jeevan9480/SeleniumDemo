package basicweb;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//window maximize
		driver.manage().window().maximize();
		WebElement Enter=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Enter.sendKeys("iphone 15 pro max");
		Thread.sleep(3000);
		
		WebElement phone=driver.findElement(By.xpath("//div[@aria-label='iphone 15 pro max']"));
		phone.click();
		
		Thread.sleep(3000);
		WebElement iphone= driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 15 Pro Max (256 GB) - Black Titanium')]"));
		iphone.click();
		
		//windowHandles
		Thread.sleep(3000);
		Set<String> handels = driver.getWindowHandles(); 
		Iterator<String> I=handels.iterator();
		
		String parentId=(String)I.next(); 
		String childId=(String)I.next();
		driver.switchTo().window(childId);
		
		
		WebElement cart = driver.findElement(By.xpath("//input[@class='a-button-input' and @name='submit.add-to-cart']"));
		cart.click();
		
		//
		Thread.sleep(5000);
		WebElement proced=driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce' and @class='a-button-input']/.."));
		proced.click();		
		Thread.sleep(5000);
//		WebElement send=driver.findElement(By.xpath("//input[@id='ap_email']"));
//		send.sendKeys("ramraj123@email.com");
		
		

	
		
		

		
	
}

	
}


