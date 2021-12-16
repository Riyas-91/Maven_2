package com.BaseClass;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import po_manager.Page_Object_Manager;

public class Test_Runner extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	static Logger log = Logger.getLogger(Properties.class);
	
	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		
		url("http://automationpractice.com/index.php?id_category=10&controller=category");
		
		wait(10);
		log.info("url launched");
		action(pom.getInstanceHp().getWomen(), "move");
		
		clickOnElement(pom.getInstanceHp().getEvngdress());
		
		log.info("mouse over to evngdress");
		
		clickOnElement(pom.getInstanceP2().getView());
		
		fullscreen();
		
		multipleclick(pom.getInstanceP2().getAdd());
		
		dropdown("index",pom.getInstanceP2().getSize(), "1");
		
		clickOnElement(pom.getInstanceP2().getColor());
		
		clickOnElement(pom.getInstanceP2().getCart());
		
		wait(10);
		
		clickOnElement(pom.getInstanceP3().getPco1());
		
		clickOnElement(pom.getInstanceP4().getPco2());
		
		
		String email = particular_data("C:\\Users\\riyas\\Desktop\\Mavenproject\\TeamCaptains.xlsx", 2, 2, 0) ;
		
		inputValueElement(pom.getInstanceP5().getEmail(),email);
		
		String password = particular_data("C:\\Users\\riyas\\Desktop\\Mavenproject\\TeamCaptains.xlsx", 2, 2, 1);
		inputValueElement(pom.getInstanceP5().getPsw(), password);
		log.info("Username and Password Entered");
		
		clickOnElement(pom.getInstanceP5().getSignin());
		
		clickOnElement(pom.getInstanceP6().getPco3());
		
		clickOnElement(pom.getInstanceP7().getCbx());
		clickOnElement(pom.getInstanceP7().getPco4());
		clickOnElement(pom.getInstanceP8().getBank());
		clickOnElement(pom.getInstancefp().getPco5());
		
		screenshot();
		
		
	}
}
