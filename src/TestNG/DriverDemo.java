package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverDemo {
	public static WebDriver driver;
	public static String path;
@BeforeSuite
public void Launch_Browser()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", path);
	
	driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
}

@AfterSuite
public void Close_Browser()
{
	driver.close();
}
}
