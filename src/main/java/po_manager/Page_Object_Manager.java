package po_manager;

import org.openqa.selenium.WebDriver;

import pom.Final_Page;
import pom.Home_Page;
import pom.Page_2;
import pom.Page_3;
import pom.Page_4;
import pom.Page_5;
import pom.Page_6;
import pom.Page_7;
import pom.Page_8;



public class Page_Object_Manager {

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
		
	}
	public WebDriver driver;
	
	private Home_Page hp;
	private Page_2 p2;
	private Page_3 p3;
	private Page_4 p4;
	private Page_5 p5;
	private Page_6 p6;
	private Page_7 p7;
	private Page_8 p8;
	private Final_Page fp;
	
	
	public Home_Page getInstanceHp() {
		if (hp == null) {
    		hp = new Home_Page(driver);
    	}
    	
		return hp;
    	
    	 }
	
	public Page_2 getInstanceP2() {
		if (p2 == null) {
			p2 = new Page_2(driver);
		}
		return p2;
	}
	
	public Page_3 getInstanceP3() {
		
		if (p3 == null) {
			p3 = new Page_3(driver);
		}
		return p3;
		
	}
	
	public Page_4 getInstanceP4() {
		
		if (p4 == null) {
			p4 = new Page_4(driver);
		}
		return p4;
	}
	
	public Page_5 getInstanceP5() {
		if (p5 == null) {
			
			p5 = new Page_5(driver);
		}
		return p5;
	}
	
	public Page_6 getInstanceP6() {
		
		if (p6 == null) {
			
			p6 = new Page_6(driver);
		}
		return p6;
	}
	
	public Page_7 getInstanceP7() {
		
		if (p7 == null) {
			p7 = new Page_7(driver);
		}
		return p7;
	}
	
	public Page_8 getInstanceP8() {
		
		if (p8 == null) {
			p8 = new Page_8(driver);
		}
		return p8;
	}
	
	public Final_Page getInstancefp() {
		if (fp == null) {
			fp = new Final_Page(driver);
		}
		return fp;
	}
	}
	
	
	


