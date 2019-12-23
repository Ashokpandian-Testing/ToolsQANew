package AppPages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WidgetsPage_ToolsQA {
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/ul/li[19]/a")
	public static WebElement AccordionLink;
	
	
	@FindBy(xpath="//div[@id='accordion']/h3")
	public static List<WebElement> AccordionList;
	
	@FindBy(xpath="//div[@id='accordion']/div/p")
	public static List<WebElement> AccordionContent;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/ul/li[18]/a")
	public static WebElement AutocompleteLink;
	
	
	@FindBy(id="tags")
	public static WebElement AutocompleteBox;
	
	
	@FindBy(xpath="//ul[@id='ui-id-1']/li/div")
	public static List<WebElement> Autocompletelist;
	

}
