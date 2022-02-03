package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DependsMethods {
	String path;
	WebDriver driver;
@BeforeSuite
public void Launch()
{
path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", path);
	
	driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");

}
@Test(enabled=false)
public void Login()
{
	System.out.println("Login code");
}
@Test(dependsOnMethods="Login")
public void Logout()
{
	System.out.println("Logout Code");
}
@AfterSuite
public void Close_Browser()
{
	driver.close();
}
}




