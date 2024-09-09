package basicweb;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement login=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		login.click();
		WebElement edit=driver.findElement(By.xpath("//span[@class='xUWkem']"));
		edit.click();
		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		FirstName.sendKeys("ram");
		WebElement LastName=driver.findElement(By.xpath("//input[@name='lastName']"));
		LastName.sendKeys("raj");
		WebElement Save=driver.findElement(By.xpath("//button[contains(text(),'SAVE')]"));
		Save.click();
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.close();

	}

}
