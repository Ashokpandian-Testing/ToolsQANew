package TestCases;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import AppPages.HomePage_ToolsQA;
import AppPages.WidgetsPage_ToolsQA;
public class WidgetPage_TestCases extends TestBase {


	@Test(groups= {"Widgets","Accordion"},priority=0)
	public static void ClickAccordion_Verify() throws InterruptedException {
		extenttest = extentreports.createTest("ClickAccordion_Verify");
		PageFactory.initElements(driver, HomePage_ToolsQA.class);
		HomePage_ToolsQA.WidgetsLink.click();				
		PageFactory.initElements(driver, WidgetsPage_ToolsQA.class);
		WidgetsPage_ToolsQA.AccordionLink.click();
		for (WebElement AccordionElement : WidgetsPage_ToolsQA.AccordionList) {			
			AccordionElement.click();
			Thread.sleep(1000);
			for (WebElement content : WidgetsPage_ToolsQA.AccordionContent) {
				if(content.isDisplayed()) {
					System.out.println(content.getText());
					extenttest.log(Status.PASS, MarkupHelper.createLabel(content.getText(), ExtentColor.BLUE));
					extenttest.warning(content.getText());
				}
			}

			Thread.sleep(3000);
		}
	}


	@Test(groups= {"Widgets","AutoComplete"},priority=1)
	@Parameters("SearchText")
	public static void ClickAutocomplete_Verify(@Optional("Apple") String Value) {
		extenttest = extentreports.createTest("ClickAutocomplete_Verify");
		PageFactory.initElements(driver, HomePage_ToolsQA.class);
		HomePage_ToolsQA.WidgetsLink.click();
		PageFactory.initElements(driver, WidgetsPage_ToolsQA.class);
		WidgetsPage_ToolsQA.AutocompleteLink.click();
		WidgetsPage_ToolsQA.AutocompleteBox.sendKeys(Value);
		TestBase.autoCompletebox(WidgetsPage_ToolsQA.Autocompletelist, Value);
		extenttest.log(Status.PASS, "It is passed");
	}


}
