package com.maven_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Runner_Class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://automationpractice.com/index.php?id_category=10&controller=category");
			Thread.sleep(2000);
			
			Actions a = new Actions(driver);
	        WebElement women = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
			a.moveToElement(women).perform();
			Thread.sleep(2000);
			
			WebElement evngdress =driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[1]"));
			evngdress.click();
			Thread.sleep(4000);
			
			WebElement view = driver.findElement(By.xpath("//a[@title='View']"));
		     view.click();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			WebElement add =driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
			a.moveToElement(add).perform();
			for(int i=0;i<3;i++) {
				a.click().perform();
			}
			
			WebElement size = driver.findElement(By.xpath("//select[@id=\"group_1\"]"));
			Select s = new Select(size);
			s.selectByVisibleText("M");
			
			WebElement color =driver.findElement(By.xpath("//a[@name=\"Pink\"]"));
			a.moveToElement(color).click().perform();
			
			WebElement cart =driver.findElement(By.xpath("//span[text()='Add to cart']"));
			cart.click();
			
			
			
			Thread.sleep(2000);
			WebElement pco1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			pco1.click();
			
			Thread.sleep(2000);
			WebElement pco2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
			pco2.click();
			
			Thread.sleep(2000);
			WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
			email.sendKeys("Afaan@gmail.com");
			Thread.sleep(2000);
			WebElement psw = driver.findElement(By.xpath("//input[@id='passwd']"));
			psw.sendKeys("Chelsea@1226");
			WebElement signin = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
			signin.click();
			
			Thread.sleep(2000);
			WebElement pco3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			pco3.click();
			Thread.sleep(2000);
			WebElement cbx = driver.findElement(By.xpath("//input[@type='checkbox']"));
			cbx.click();
			WebElement pco4 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
			pco4.click();
			
			Thread.sleep(2000);
			WebElement bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
			bank.click();
			
			Thread.sleep(2000);
			WebElement pco5 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			pco5.click();

	}

}
