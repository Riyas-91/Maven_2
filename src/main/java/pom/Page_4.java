package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_4 {
	
	public WebDriver driver;
	
	@FindBy(xpath ="(//a[@title='Proceed to checkout'])[2]")
	private WebElement pco2;

	public WebElement getPco2() {
		return pco2;
	}
	
	public Page_4(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

}
