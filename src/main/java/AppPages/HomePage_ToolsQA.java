package AppPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_ToolsQA {
	
	
	@FindBy(xpath="//ul[@id='menu-top']/li/a[contains(text(),'Home')]")
	public static WebElement HomeLink;
	
	
	@FindBy(xpath="//div[@id='content']/h1[contains(text(),'Home')]")
	public static WebElement HomeTitle;
	
	
	@FindBy(xpath="//ul[@id='menu-top']/li/a[contains(text(),'Interactions')]")
	public static WebElement InteractionsLink;
	
	
	@FindBy(xpath="//div[@id='content']/h1[contains(text(),'Interactions')]")
	public static WebElement InteractionsTitle;
	
	
	@FindBy(xpath="//ul[@id='menu-top']/li/a[contains(text(),'Widgets')]")
	public static WebElement WidgetsLink;
	
	@FindBy(xpath="//div[@id='content']/h1[contains(text(),'Widgets')]")
	public static WebElement WidgetsTitle;
	
	
	@FindBy(xpath="//ul[@id='menu-top']/li/a[contains(text(),'Tooltip and Double click')]")
	public static WebElement ToolTipsLink;
	
	@FindBy(xpath="//div[@id='content']/h1[contains(text(),'Tooltip')]")
	public static WebElement ToolTipsTitle;

}
