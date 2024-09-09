package basicweb;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Whatsapp {

	public static void main(String[] args) throws Exception {
		
//driver connection
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//maximizee the window	
		 driver.manage().window().maximize();
		
		
//get current URL
		 String Url = driver.getCurrentUrl();
	     System.out.println("Current URL: " + Url);
	     
	    
	     
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Email address or phone number']")).sendKeys("jeevanks9480@gmail.com");
		driver.findElement(By.xpath("//input[@type='password' and @placeholder='Password']")).sendKeys("8762984097");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		
		
//isDisplayed
		WebElement btn=driver.findElement(By.xpath("//div[@class='_9lsa']"));//.click();
		if(btn.isDisplayed()){
			System.out.println("yes button is displayed");
			btn.click();
		}
		else
		{
			System.out.println("sorry b utton is not displayed");
		}
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@role='button' and @data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		WebElement  FirstName = driver.findElement(By.xpath("//input[@name='firstname' and @class='inputtext _58mg _5dba _2ph-']"));
		FirstName.sendKeys("Ram");
		
		
		
		//getAttribute
		String Name=FirstName.getAttribute("value");
        System.out.println("firstnameis : "+Name); 
        
        
        
        //equals
        WebElement Lastname= driver.findElement(By.xpath("//input[@name='lastname']"));
        Lastname.sendKeys("raj");
        
        if (FirstName.equals(Lastname)) {
            System.out.println("First Name is equal to Last Name");
        } else {
            System.out.println("First Name is NOT equal to Last Name");
        }
        
        
       
        
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @aria-label='Mobile number or email address']")).sendKeys("ramraj9480@email.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ramraj9480@email.com");
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @aria-label='New password']")).sendKeys("ram123@");
		WebElement button=  driver.findElement(By.xpath("//select[@name='birthday_day' and @id='day']"));
		
		//isEnabled()
		if(button.isEnabled()) {
			System.out.println("yes button is Enabled");
			button.click();
		}
		else
		{
			System.out.println("button is Unavabile");
		}
		
		//Day
		WebElement Day = driver.findElement(By.xpath("//select[@name='birthday_day' and @id='day']"));
		Select selectDay = new Select(Day);
		selectDay.selectByVisibleText("28");
		
		//Month

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select monthSelect = new Select(month);
         monthSelect.selectByVisibleText("May");
		
		//year
         
         WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
         Select selectyear =new Select(year);
         selectyear.selectByVisibleText("2000");
         
         WebElement RadioButton = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
         RadioButton.click();  
         
         WebElement Sub = driver.findElement(By.xpath("//button[@type='submit' and @class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
         Sub.click();
         
         
         
         String getTitle=driver.getTitle();
         System.out.println(getTitle);
         
         
         //driver.navigate().to("https://www.amazon.in/");
         //driver.close();
         
         
		
	
		

		
	}

}
