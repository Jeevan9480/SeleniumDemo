package basicweb;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmOrange {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
	
         int randomint= Generalmethods.randomInt();	
   
    
   
   
		Thread.sleep(3000);
		WebElement adminUserName=driver.findElement(By.xpath("//input[@name='username']"));
		adminUserName.sendKeys("Admin");
		WebElement adminPassword=driver.findElement(By.xpath("//input[@name='password']"));
		adminPassword.sendKeys("admin123");
		WebElement adminLogin=driver.findElement(By.xpath("//button[@type='submit']"));
		adminLogin.click();
		Thread.sleep(5000);
		
	
		
		
		Thread.sleep(3000);
		
		WebElement PiMButton=driver.findElement(By.xpath("//span[text()='PIM']"));
		PiMButton.click();
		
		
		

		Thread.sleep(3000);
		WebElement addEmployee=driver.findElement(By.xpath("//a[text()='Add Employee']"));
		addEmployee.click();
		
		Thread.sleep(3000);
		
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		String empName=Generalmethods.generateRandomString(6);
		firstName.sendKeys(empName);
		
		WebElement middleName=driver.findElement(By.xpath("//input[@name='middleName']"));
		middleName.sendKeys("ma");
		
		
		WebElement lastName=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastName.sendKeys("r");
		
	
		
		WebElement EmployeeId=driver.findElement(By.xpath("//label[text()='Employee Id']/../following-sibling::div/input"));
		EmployeeId.click();
		
         
		Thread.sleep(2000);
		
		if(EmployeeId.isDisplayed())
		{
			
			Thread.sleep(4000);
			js.executeScript("arguments[0].value = '';", EmployeeId);
			
		}
		
		
		Thread.sleep(9000);
		EmployeeId.sendKeys(String.valueOf(randomint));
		
		Thread.sleep(3000);
		WebElement loginDetails=driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"));
		loginDetails.click();
		
		
		
		WebElement employeeUserName=driver.findElement(By.xpath("//label[text()='Username']/../following-sibling::div/input"));
		employeeUserName.sendKeys(Generalmethods.generateRandomString(6));
		
		
		WebElement employeePassword=driver.findElement(By.xpath("//label[text()='Password']/../following-sibling::div/input"));
		employeePassword.sendKeys(empName+randomint);
		
		WebElement employeeconfirmPassword=driver.findElement(By.xpath("//label[text()='Confirm Password']/../following-sibling::div/input"));
		employeeconfirmPassword.sendKeys(empName+randomint);                
		//button[@type='submit']
		
		WebElement saveButton=driver.findElement(By.xpath("//button[@type='submit']"));
		saveButton.click();
		
		WebElement employeeList=driver.findElement(By.xpath("//button[@type='submit']"));
		employeeList.click();
		
	    
	   
	    WebElement otherId=driver.findElement(By.xpath("//label[text()='Other Id']/../following-sibling::div/input"));
	    otherId.sendKeys("0012");
	    
	    
	    //org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
	    //WARNING: Unable to find an exact match for CDP version 127, returning the closest version; found: 126; Please update to a Selenium version that supports 
	    //CDP version 127 how solve this error is the programing error what 
	    
	    
	    
	    
	    
	
		
        
	}

}
