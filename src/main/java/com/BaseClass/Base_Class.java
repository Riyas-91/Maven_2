package com.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	public static String value;
	public static WebDriver getBrowser(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
			System.getProperty("user.dir")+"//Driver//firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		
		//driver.manage().window().maximize();
		return driver;
	}
	
	public static void fullscreen() {
		driver.manage().window().maximize();
	}
	public static void url(String url) {
		driver.get(url);
	}
	public static void inputValueElement(WebElement element ,String value) {
		element.sendKeys(value);
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void multipleclick(WebElement element) {
		for(int i=0;i<3;i++) {
			element.click();
		}
	}
	public static void dropdown(String type,WebElement element ,String value) {
	  Select s1 = new Select(element);
	  
	  if(type.equalsIgnoreCase("index")) {
 		
		  int index = Integer.parseInt(value);
		  s1.selectByIndex(index);
	}
	  
	  else if(type.equalsIgnoreCase("value")) {
		  s1.selectByValue(value);
	  }
	  else if(type.equalsIgnoreCase("text")) {
		  s1.selectByVisibleText(value);
	  }
	  
	 }
	
	 public static void thread(int t) throws Throwable{
		  Thread.sleep(t);
	  }
	 
	 public static void javascriptE() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeAsyncScript("window.scrollBy(0,600);");
	 }
	 
	 public static void wait(int sec ) {
		 driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
	 }
	 
	 public static void screenshot() throws Throwable {
		 
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File f1 = ts.getScreenshotAs(OutputType.FILE);
		 File f2 = new File("C:\\Users\\riyas\\Desktop\\MavenProject_2\\new.png");
		 FileHandler.copy(f1, f2);
	 }
	 
	 public static void action(WebElement element , String type) {
	 Actions a = new Actions(driver);
	 if(type.equalsIgnoreCase("move")) {
		 a.moveToElement(element).build().perform();
	 }
	 else if(type.equalsIgnoreCase("click")) {
		 a.click().build().perform();
	 }
	 else if(type.equalsIgnoreCase("doubleclick")) {
		  a.click().build().perform();
	 }
	 }
	 
	 public static String particular_data(String path , int sheet_Index , int row_Index,int cell_Index ) throws Throwable {
			
			File f = new File(path);
			
			FileInputStream fis = new FileInputStream(f);
			
			Workbook wb = new XSSFWorkbook(fis);
			
			Sheet sheetAt = wb.getSheetAt(sheet_Index);
			
			Row row = sheetAt.getRow(row_Index);
			
			Cell cell = row.getCell(cell_Index);
			
			CellType cellType = cell.getCellType();
			
			if(cellType.equals(CellType.STRING)) {
				
				value = cell.getStringCellValue();
			}
			else if(cellType.equals(CellType.NUMERIC)) {
				double d =cell.getNumericCellValue();
				int i =(int) d;
				value = String.valueOf(i);
			}
			return value;
			
			
			
		}
}

	
		 
		 
	 


