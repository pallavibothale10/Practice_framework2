package Com.ToolsQA.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Book_Register_BaseClass {

public static WebDriver driver;


@BeforeMethod
public void intialization() {
	
	System.setProperty("webdriver.Chrome.Driver",
			"C:\\Users\\A\\eclipse-workspace1\\Maven_Banking_Domain\\src\\test\\resources\\Driver\\chromedriver.exe");

	driver = new ChromeDriver();
	//loggers.info("Open the browser");

	driver.manage().window().maximize();
	//loggers.info("Max. the window");

	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get("https://demoqa.com");
	//loggers.info("Hit the URL");
	
}


@AfterMethod
public void TearDown() throws InterruptedException {

	Thread.sleep(3000);
	//driver.close();
}





}
