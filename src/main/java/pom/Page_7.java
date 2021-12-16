package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_7 {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement cbx;

	public WebElement getCbx() {
		return cbx;
	}
	
	@FindBy(xpath ="//button[@name='processCarrier']")
	private WebElement pco4;

	public WebElement getPco4() {
		return pco4;
	}
	
	public Page_7 (WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

}
