package exceloperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mmainsel {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("\"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//window maximize
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement uName=driver.findElement(By.xpath("//input[@name='username']"));
		uName.sendKeys("Admin");
		WebElement passWord=driver.findElement(By.xpath("//input[@name='password']"));
		passWord.sendKeys("admin123");
		WebElement adminLogin=driver.findElement(By.xpath(" //button[text()=' Login ']"));
		adminLogin.click();



	}

}
