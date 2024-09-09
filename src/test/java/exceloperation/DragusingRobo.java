package exceloperation;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragusingRobo {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		
		Actions act = new Actions(driver);
		Robot robo=new Robot();
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
	/*	
		Point loc=source.getLocation();
	Point loc2=target.getLocation();
		
		
		
		
		robo.mouseMove(source.getLocation().getX(), target.getLocation().getY());
		robo.mousePress(InputEvent.BUTTON1_MASK);
	    Thread.sleep(50);
	    robo.mouseRelease(InputEvent.BUTTON1_MASK);


		int a=source.getLocation().getX();
	int b=	target.getLocation().getY();
		System.out.println(a);
		System.out.println(b);
		*/
		Thread.sleep(3000);
		robo.mouseMove(550, 550);
	    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	    Thread.sleep(2000);
	    robo.mouseMove(695, 580);
	    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	  
		
	    
	    	    //driver.close();
		
	}

}
