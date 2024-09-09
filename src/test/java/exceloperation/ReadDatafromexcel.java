package exceloperation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;

public class ReadDatafromexcel {

	public static void main(String[] args) throws IOException, Throwable  {
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		    String excelFilepath=".\\datafile\\UserNAmePAss.xlsx";
			FileInputStream inputStream=new FileInputStream(excelFilepath);
			Thread.sleep(5000);
			XSSFWorkbook workBook=new XSSFWorkbook(inputStream);
			
			XSSFSheet sheet =workBook.getSheetAt(0);       //index
			//XSSFSheet sheet=workBook.getSheet("sheet1"); sheet
			//to get the excel data in the console
			/*
 			int rows=sheet.getLastRowNum(); 
			int colss=sheet.getRow(1).getLastCellNum();
			for(int r=0;r<=rows;r++) {
				XSSFRow row=sheet.getRow(r);
					for(int c=0;c<colss;c++){
					XSSFCell cell=row.getCell(c);
					switch(cell.getCellType())
					{
					case STRING: System.out.print(cell.getStringCellValue());break;
					case NUMERIC:System.out.print(cell.getNumericCellValue());break;
					case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
					}
					System.out.print("    |    ");
				}
				System.out.println();
			}
			*/
			Thread.sleep(5000);
			int rowCount=sheet.getLastRowNum();
			int cellCount=sheet.getRow(1).getLastCellNum();
			System.out.println("RowCount"+cellCount+"coloumCount"+rowCount);
			
			
			for(int r=1;r<rowCount;r ++) {
				XSSFRow coloumCount=sheet.getRow(r);
				//String mobile=coloumCount.getCell(0).getStringCellValue();
				//String mobile = String.valueOf(coloumCount.getCell(0).getNumericCellValue());
				
				//////////
				XSSFCell cell = coloumCount.getCell(0);
				String mobile;
	            if (cell.getCellType() == CellType.NUMERIC) {
	                mobile = String.valueOf(cell.getNumericCellValue());
	            }
	            else 
	            {
	                mobile = cell.getStringCellValue();
	            }

				String password=coloumCount.getCell(1).getStringCellValue();
		
				Thread.sleep(4000);
				WebElement emailMobil=driver.findElement(By.xpath("//input[@type='text' and @placeholder='Email address or phone number']"));
				emailMobil.sendKeys(mobile);
				
				
				Thread.sleep(4000);
				emailMobil.clear();
				WebElement passWord=driver.findElement(By.xpath("//input[@type='password' and @placeholder='Password']"));
				passWord.sendKeys(password);
				Thread.sleep(4000);
				passWord.clear();
			
				System.out.println(r +"    |   "+ mobile+"   |  "+ password);
//				emailMobil.clear();
//				passWord.clear();
			}
			

	}

}
