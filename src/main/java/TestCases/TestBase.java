package TestCases;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentTest;


public class TestBase {
	
	public static WebDriver driver;
	public static Logger logger;
	public static ExtentReports extentreports;
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentTest extenttest;
	
	@BeforeSuite(alwaysRun=true)
	public static void LaunchBrowser() throws IOException {		
		if(getConfigProperty("browser").equalsIgnoreCase("chrome")) {
		System.setProperty("driver.chrome.webdriver","chromedriver.exe");
		driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger = Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("'"+getConfigProperty("browser")+"' Browser Successfully Launched");
		extentreports = new ExtentReports();
		htmlreporter = new ExtentHtmlReporter("extentreport.html");
		extentreports.attachReporter(htmlreporter);
	}
	
	
	public static String getConfigProperty(String Key) throws IOException {
		FileInputStream fis = new FileInputStream("Config.properties");		
		Properties prop = new Properties();		
		prop.load(fis);
		String Value = prop.getProperty(Key);
		return Value;
	}
	
	@BeforeTest(alwaysRun=true)
	public static void LaunchApp() throws IOException {
		driver.get(getConfigProperty("AppURL"));
		logger.info("'"+getConfigProperty("AppURL")+"' URL is Successfully Launched");
	}
	
	
	@AfterSuite(alwaysRun=true)		
	public static void TearDown() throws IOException {
		driver.quit();
		logger.info("'"+getConfigProperty("browser")+"' Browser is Successfully Closed");
		extentreports.flush();
	}
	
	
	public static void autoCompletebox(List<WebElement> element, String value) {
		for (WebElement iterable_element : element) {
			if(iterable_element.getText().contains(value)) {
				String temp = iterable_element.getText();
				iterable_element.click();				
				logger.info("Value '"+temp+"' is selected from the dropdown");
				break;
			}
			else
			{
				logger.error("Expected value starting with '"+value+"' is not present in the dropdown");
			}
		}
	}
}
