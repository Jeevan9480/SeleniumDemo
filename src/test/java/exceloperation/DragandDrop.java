package exceloperation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		
		Actions act = new Actions(driver);
		
		
		//dragAndDrop Action
		//act.dragAndDrop(driver.findElement(By.xpath("//*[text()='Explore all']")),driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"))).build().perform();
		
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		act.contextClick(target);
		Action dragAndDrop =act.clickAndHold(source).moveToElement(target).release(target).build();
		Thread.sleep(2000);
		dragAndDrop.perform();
		
		
		
		Thread.sleep(2000);
//		WebElement mN=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		
//		mN.sendKeys("mobile");
//		Thread.sleep(4000);
//		act.moveToElement(mN).click().doubleClick();
		
	//	act.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).sendKeys("mobile").doubleClick();
		act.doubleClick(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")));
		Thread.sleep(3000);
		//driver.close();
	
		

	}

}
