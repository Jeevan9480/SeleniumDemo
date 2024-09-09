package exceloperation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement a=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(a).perform();
		
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//span[text()='Baby Wishlist']"));
		element.click();
		
		Thread.sleep(7000);
		driver.close();	
		}

}
