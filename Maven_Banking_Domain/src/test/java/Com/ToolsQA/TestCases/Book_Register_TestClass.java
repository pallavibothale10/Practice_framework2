package Com.ToolsQA.TestCases;

import org.testng.annotations.Test;

import Com.ToolsQA.BaseClass.Book_Register_BaseClass;
import Com.ToolsQA.PageClasses.Book_Register_PageClass;

public class Book_Register_TestClass  extends Book_Register_BaseClass {
	
	@Test
	public void Registration() throws InterruptedException {
		
		
		
		Book_Register_PageClass RPC = new Book_Register_PageClass();
		
		RPC.ScrollElement();
		
		RPC.NewuserButton();
		RPC.F_Name("Pallavi");
		RPC.L_Name("Bothale");
		RPC.UserNAME("both10");
		RPC.passWORD("Bothale@10");
		Thread.sleep(100000);

		//RPC.CheckBOX();
		RPC.Register();
		
		driver.switchTo().alert().accept();

	}

}
