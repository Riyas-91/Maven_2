package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_3 {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement pco1;

	public WebElement getPco1() {
		return pco1;
	}
	
	public Page_3(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
