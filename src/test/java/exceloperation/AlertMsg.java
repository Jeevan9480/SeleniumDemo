package exceloperation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertMsg {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
  
    WebElement button=driver.findElement(By.xpath("//input[@title='Sign in']"));
    button.click();
    
    Alert alert=driver.switchTo().alert();
    System.out.println(alert.getText());
    Thread.sleep(5000);
    alert.accept();//this is for ok buttto 
    //alert.dismiss();// this is for cancel
    Thread.sleep(5000);
    driver.close();
    
    
    }

}
