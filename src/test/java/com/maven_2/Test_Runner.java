package com.maven_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Runner extends Base_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		
		driver = getBrowser("chrome");
		 
		url("http://automationpractice.com/index.php?id_category=10&controller=category");
		
	      thread(2000);
			
	  WebElement women = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
			
	      action(women, "move");
	        thread(2000);
			
			WebElement evngdress =driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[1]"));
	
			clickOnElement(evngdress);
			thread(2000);
			
			WebElement view = driver.findElement(By.xpath("//a[@title='View']"));
			clickOnElement(view);
		
		     
			Thread.sleep(2000);
			driver.manage().window().maximize();
			wait(10);
			
			WebElement add =driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
			multipleclick(add);
			
			WebElement size = driver.findElement(By.xpath("//select[@id=\"group_1\"]"));
		    dropdown("index",size,"1");
		    Thread.sleep(2000);
		  
			WebElement color =driver.findElement(By.xpath("//a[@name=\"Pink\"]"));
		   clickOnElement(color);
		 
		    Thread.sleep(2000);
			WebElement cart =driver.findElement(By.xpath("//span[text()='Add to cart']"));
			clickOnElement(cart);
			wait(10);
			
		    WebElement pco1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			clickOnElement(pco1);
			
			WebElement pco2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
			clickOnElement(pco2);
			
			thread(2000);
			WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
			inputValueElement(email, "Afaan@gmail.com");
			
			thread(2000);
			WebElement psw = driver.findElement(By.xpath("//input[@id='passwd']"));
			inputValueElement(psw, "Chelsea@1226");
			
			WebElement signin = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
			clickOnElement(signin);
			
			thread(2000);
			WebElement pco3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			clickOnElement(pco3);
			thread(2000);
			
			WebElement cbx = driver.findElement(By.xpath("//input[@type='checkbox']"));
			clickOnElement(cbx);
			
			WebElement pco4 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		    clickOnElement(pco4);
		  
			thread(2000);
			WebElement bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
		    clickOnElement(bank);
		  //--------------
			thread(2000);
			WebElement pco5 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			clickOnElement(pco5);
		
		
		
		

	}

}
