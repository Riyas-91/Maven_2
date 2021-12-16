package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement pco5;

	public WebElement getPco5() {
		return pco5;
	}
	
	public Final_Page(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}
	
	

}
