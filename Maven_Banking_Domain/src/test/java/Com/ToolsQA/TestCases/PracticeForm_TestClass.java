package Com.ToolsQA.TestCases;

import org.testng.annotations.Test;

import Com.ToolsQA.BaseClass.Book_Register_BaseClass;
import Com.ToolsQA.PageClasses.PracticeForm_PageClass;

public class PracticeForm_TestClass extends Book_Register_BaseClass {

	@Test
	public void RegForm() throws InterruptedException {

		PracticeForm_PageClass PF = new PracticeForm_PageClass();
		
		

		PF.Form();
		PF.Practice();
		PF.U_Name("Pallavi");
		PF.L_Name("Bothale");
		PF.Email("pb@gmail.com");
		PF.Gender_Select();
		PF.Number_Tab("8855947443");
		PF.Month_Tab();
		PF.Year_Tab();
		PF.Hobbies_Select();
		PF.Address_Select();
		PF.State_Select();
		PF.City_Select();
		PF.Submit_Tab();
		
		

	}

}
