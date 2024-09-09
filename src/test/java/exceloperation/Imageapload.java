package exceloperation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imageapload {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://postimages.org/#google_vignette");
		
		Thread.sleep(2000);
		String image="C:\\Users\\Guru\\Downloads\\Jeevan_photo.jpeg";
		
		WebElement photo=driver.findElement(By.xpath("//p[text()='Click to choose, copy & paste or drag & drop files anywhere']"));
		photo.click();
		Thread.sleep(3000);
		photo.sendKeys(image); 
		Thread.sleep(2000);
//		WebElement upLoad=driver.findElement(By.xpath("//button[text()='Upload']"));
//		upLoad.click();		

	}

}
