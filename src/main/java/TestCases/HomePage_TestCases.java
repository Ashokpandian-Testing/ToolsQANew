package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import AppPages.HomePage_ToolsQA;
public class HomePage_TestCases extends TestBase {
	
	
	@Test(groups= {"Interactions","Links"},priority=0)
	public static void ClickInteractions_Verify() {
		PageFactory.initElements(driver, HomePage_ToolsQA.class);
		HomePage_ToolsQA.InteractionsLink.click();				
		assertEquals(HomePage_ToolsQA.InteractionsTitle.isDisplayed(), true);
	}
	
	
	@Test(groups= {"Widgets","Links"},priority=1)
	public static void ClickWidgets_Verify() {
		PageFactory.initElements(driver, HomePage_ToolsQA.class);
		HomePage_ToolsQA.WidgetsLink.click();
		assertEquals(HomePage_ToolsQA.WidgetsTitle.isDisplayed(), true);			
	}
	
	
	@Test(groups= {"Tooltips","Links"}, priority=2)
	public static void ClickTooltip_Verify() {
		PageFactory.initElements(driver, HomePage_ToolsQA.class);
		HomePage_ToolsQA.ToolTipsLink.click();
		assertEquals(HomePage_ToolsQA.ToolTipsTitle.isDisplayed(), true);			
	}
	
	
	@Test(groups= {"Home","Links"},priority=3)
	public static void ClickHome_Verify() {
		PageFactory.initElements(driver, HomePage_ToolsQA.class);
		HomePage_ToolsQA.HomeLink.click();
		assertEquals(HomePage_ToolsQA.HomeTitle.isDisplayed(), true);			
	}
	
	
	
	
}
