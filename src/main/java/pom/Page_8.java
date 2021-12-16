package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_8 {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bank;

	public WebElement getBank() {
		return bank;
	}
	
	public Page_8(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	

}
