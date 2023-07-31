package Com.ToolsQA.PageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.ToolsQA.BaseClass.Book_Register_BaseClass;

public class PracticeForm_PageClass extends Book_Register_BaseClass {

	public PracticeForm_PageClass() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = ("//h5[contains (text(),\"Forms\")]"))
	public WebElement Form_tab;

	@FindBy(xpath = "//span[contains (text(), 'Practice Form')]")
	public WebElement Practice_Tab;

	@FindBy(xpath = "//input[@id=\"firstName\"] ")
	public WebElement Firstname;

	@FindBy(xpath = "//input[@id=\"lastName\"]")
	public WebElement lastname;

	@FindBy(xpath = "//input[@id='userEmail']")
	public WebElement Useremail;

	@FindBy(xpath = "(//label[@class=\"custom-control-label\"])[2]")
	public WebElement Gender;

	@FindBy(xpath = "//input[@id=\"userNumber\"]")
	public WebElement Number;

	@FindBy(xpath = "//select[@class=\"react-datepicker__month-select\"]//option")
	public WebElement Month;

	@FindBy(xpath = "//select[@class=\"react-datepicker__year-select\"]//option")
	public WebElement Year;

	@FindBy(xpath = "//div[contains(text(),\"10\")]")
	public WebElement Day;

	@FindBy(xpath = "(//label[@class=\"custom-control-label\"])[4]")
	public WebElement Hobbies;

	@FindBy(xpath = "//textarea[@placeholder=\"Current Address\"]")
	public WebElement Address;

	@FindBy(xpath = "//div[contains(text(),\"Select State\")]")
	public WebElement State;

	@FindBy(xpath = "//div[@id=\"city\"]")
	public WebElement City;

	@FindBy(xpath = "//button[contains(text(),\"Submit\")]")
	public WebElement Submit;

	public void Form() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Form_tab);
		Form_tab.click();
	}

	public void Practice() {
		Practice_Tab.click();
	}

	public void U_Name(String Fname) {
		Firstname.sendKeys(Fname);
	}

	public void L_Name(String Lname) {
		lastname.sendKeys(Lname);
	}

	public void Email(String ID) {
		Useremail.sendKeys(ID);
	}

	public void Gender_Select(){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Gender );
		Gender.click();
	}

	public void Number_Tab(String no) {
		Number.sendKeys(no);
	}

	public void Month_Tab() {

		Month.click();
		Select S1 = new Select(Month);
		S1.selectByVisibleText("April");
	}

	public void Year_Tab() {
		Year.click();
		Select S1 = new Select(Year);
		S1.selectByVisibleText("1996 ");

	}

	public void Hobbies_Select() {
		Hobbies.click();
	}

	public void Address_Select() {
		Address.sendKeys("Pune Maharashtra");
	}
	public void State_Select(){
		State.sendKeys("Rajasthan");
//		Select S1 = new Select(State);
//		S1.selectByVisibleText("");

	}
	
	public void City_Select() {
		City.click();
	}
	public void Submit_Tab() {
		Submit.click();
	}

	
	
	

}
