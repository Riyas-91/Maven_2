package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_2 {
	
	public WebDriver driver;
	
	@FindBy(xpath ="//a[@title='View']")
    private WebElement view;

	public WebElement getView() {
		return view;
	}
	
	@FindBy(xpath ="(//a[@data-field-qty='qty'])[2]")
	private WebElement add;

	public WebElement getAdd() {
		return add;
	}
	
	@FindBy(xpath ="//select[@id=\"group_1\"]")
	private WebElement size;

	public WebElement getSize() {
		return size;
	}
	
	@FindBy (xpath ="//a[@name=\"Pink\"]")
	private WebElement color;

	public WebElement getColor() {
		return color;
	}
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement cart;

	public WebElement getCart() {
		return cart;
	}
	
	public Page_2(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	

}
