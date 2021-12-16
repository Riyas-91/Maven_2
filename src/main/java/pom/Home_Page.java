package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver; //null
	
	
	
	@FindBy(xpath = "(//a[text()='Women'])[1]")
	private WebElement women;

	public WebElement getWomen() {
		return women;
	}
	
	@FindBy(xpath ="(//a[text()='Evening Dresses'])[1]")
	private WebElement evngdress;

	public WebElement getEvngdress() {
		return evngdress;
	}
	
	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

}
