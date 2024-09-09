package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondtest {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
		//xpath
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jeevanks9480@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("jeeva@9480");
      // driver.findElement(By.xpath("//button[@name='login']")).click();
        
		
		//name
		
//        driver.findElement(By.name("email")).sendKeys("ram9470@email.com");
//        driver.findElement(By.name("pass")).sendKeys("23nml55");
		
		
		
		//id
		
//		driver.findElement(By.id("email")).sendKeys("ramraj12@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("134@gmail.com");
		
		
//		linkTxt
		
		
     driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		
	}

}
