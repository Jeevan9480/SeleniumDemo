package exceloperation;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class CookiesMethod {
 
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
       Set<Cookie> cookies=driver.manage().getCookies();
       System.out.println("Size of Cookies:"+ cookies.size());
       for(Cookie cookie:cookies) {
    	   System.out.println(cookie.getName()+":"+cookie.getValue());  
       }

	}

}
