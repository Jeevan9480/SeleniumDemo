package exceloperation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollThePage {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scroll to sum pixel
		//js.executeScript("window.scrollBy(0,1000)","");
		
		//scroll to particular element
		WebElement element= driver.findElement(By.xpath("//a[text()='Instagram']"));
		js.executeScript("arguments[0].scrollIntoView();",element);
		element.click();
		Thread.sleep(3000);
		
	

	}

}
