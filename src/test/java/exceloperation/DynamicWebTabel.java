package exceloperation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTabel {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		/*
		//*[@id="customers"]/tbody/tr[2]/td[1]/span
		//*[@id="customers"]/tbody/tr[3]/td[1]/span
		//*[@id="customers"]/tbody/tr[4]/td[1]/span
		//*[@id="customers"]/tbody/tr[5]/td[1]/span
		//*[@id="customers"]/tbody/tr[6]/td[1]/span
		//*[@id="customers"]/tbody/tr[7]/td[1]/span
		String beforeXpath="//*[@id=\'customers\']/tbody/tr[";
		String afterXpath="]/td[1]/span";
		for(int i=2;i<=7;i++) {
			 String name=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();	
			 System.out.println(name);
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//*[@id="customers"]/tbody/tr[2]/td[3]/span
		//*[@id="customers"]/tbody/tr[7]/td[3]/span
		Thread.sleep(5000);
		String beforeXPATH="//*[@id=\'customers\']/tbody/tr[";
		String afterXPATH="]/td[3]/span";
		for(int i=2;i<=7;i++) {
			String name2=driver.findElement(By.xpath(beforeXPATH+i+afterXPATH)).getText();
			System.out.println(name2);
			}
			
			///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			 
			 */
		//*[@id="product"]/tbody/tr[1]/td[4]
		//*[@id="product"]/tbody/tr[8]/td[4]
		int sum=0;
		String beforeXPATH="//*[@id=\"product\"]/tbody/tr[";
		String afterXPATH="]/td[4]";
		for(int i=1;i<=8;i++) {
			String name2=driver.findElement(By.xpath(beforeXPATH+i+afterXPATH)).getText();
			int number = Integer.parseInt(name2);//Integer.parseInt() i used to convert a sstrig to int 
			 sum += number;
			
			}
		System.out.println(sum);
	}

}
//https://simplifyqa.app/user/module
