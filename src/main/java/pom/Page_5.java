package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_5 {
	
	public WebDriver driver;
	
	@FindBy(xpath ="//input[@id='email']")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(xpath ="//input[@id='passwd']")
	private WebElement psw;

	public WebElement getPsw() {
		return psw;
	}
	
	@FindBy(xpath ="//button[@id='SubmitLogin']")
	private WebElement signin;

	public WebElement getSignin() {
		return signin;
	}
	
	public Page_5(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}


}
