package Com.ToolsQA.PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.ToolsQA.BaseClass.Book_Register_BaseClass;

public class Book_Register_PageClass extends Book_Register_BaseClass {

	
	
	public Book_Register_PageClass() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath=("//button[contains(text(),\"New User\")]"))
	public WebElement Scroll; 

	@FindBy(xpath = "//button[contains(text(),\"New User\")]")
	public WebElement NewUser;
	
	@FindBy(xpath = "//input[@id='firstname'] ")
	public WebElement Firstname ;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastname;
	
	@FindBy(xpath = "//input[@id='userName']")
	public WebElement Username ;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement password ;

//	@FindBy(xpath = "//div[@class=\"recaptcha-checkbox-border\"]")
//	public WebElement Checkbox ;
	
	
	@FindBy(xpath = "//button[@id='register']")
	public WebElement Registerbutton ;
	
	
	public void  NewuserButton(){
		NewUser.click();
	}

	public void F_Name(String fname) {
		Firstname.sendKeys(fname);
	}
	public void L_Name(String lname) {
		lastname.sendKeys(lname);
	}

	public void UserNAME(String user) {
		
		Username.sendKeys(user);
		
	}

	public void passWORD(String pass) throws InterruptedException {
		
		password.sendKeys(pass);
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Registerbutton);
		
	}
	

//	public void CheckBOX() {
//		Checkbox.click();
//	}
	
	public void  Register(){
		Registerbutton.click();
		
	}
	
	public void ScrollElement() {
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Scroll);
		
	}

}
