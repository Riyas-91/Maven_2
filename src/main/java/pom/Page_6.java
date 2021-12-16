package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_6 {
	
	public WebDriver driver;
	
	@FindBy(xpath ="(//button[@type='submit'])[2]")
	private WebElement pco3;

	public WebElement getPco3() {
		return pco3;
	}
	
	public Page_6(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

}
