package exceloperation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumMain {

	public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver(); 
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	String filePath=".\\datafile\\orangeunamepass.xlsx";
	Thread.sleep(5000);
	FileInputStream input= new FileInputStream(filePath);
	XSSFWorkbook workBook= new XSSFWorkbook(input);
	XSSFSheet sheet= workBook.getSheetAt(0);
	Thread.sleep(5000);
	int rowCount=sheet.getLastRowNum();
	int cellCount=sheet.getRow(1).getLastCellNum();
	System.out.println("RowCount"+cellCount+"coloumCount"+rowCount);
	
	Thread.sleep(4000);
	for(int r=1;r<rowCount;r ++) {
		XSSFRow coloumCount=sheet.getRow(r);
		XSSFCell cell = coloumCount.getCell(0);
		String userName;
		Thread.sleep(3000);
        if (cell.getCellType() == CellType.NUMERIC) {
        	userName = String.valueOf(cell.getNumericCellValue());
        }
        else 
        {
        	userName = cell.getStringCellValue();
        }

		String password=coloumCount.getCell(1).getStringCellValue();
		Thread.sleep(4000);
		WebElement uName=driver.findElement(By.xpath("//input[@name='username']"));
		uName.sendKeys(userName);
		WebElement passWord=driver.findElement(By.xpath("//input[@name='password']"));
		passWord.sendKeys(password);
		System.out.println(userName+ "+"+ password);
				
	
	
	
	//hread.sleep(2000);
	//driver.close();
	
	}
}
}
	

	