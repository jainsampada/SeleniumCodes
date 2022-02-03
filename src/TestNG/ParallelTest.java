package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ParallelTest {
	String path,path1;
	WebDriver driver,driver1;
	
	
  @Test(threadPoolSize = 4, invocationCount = 4, timeOut = 1000)
  public void Login() {
	  path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.out.println(path);
		//Step -1
		System.setProperty("webdriver.chrome.driver", path);
		
		//Step-2 
		driver=new ChromeDriver();
		
		//Step -3
		driver.manage().window().maximize();
		//Step 4 - Open Application 
	driver.get("https://opensource-demo.orangehrmlive.com/");
  }
//  @Test()
//	public void CustomerDetails()
//	{
//	  path1=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
//		System.out.println(path1);
//		//Step -1
//		System.setProperty("webdriver.chrome.driver", path1);
//		
//		//Step-2 
//		driver1=new ChromeDriver();
//		
//		//Step -3
//		driver1.manage().window().maximize();
//		//Step 4 - Open Application 
//	driver1.get("https://opensource-demo.orangehrmlive.com/");
//	}
//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("Before Method");
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  System.out.println("After Method");
//  }
//
//  @BeforeClass
//  public void beforeClass() {
//	  System.out.println("Before Class");
//  }
//
//  @AfterClass
//  public void afterClass() {
//	  System.out.println("After Class");
//  }
//
//  @BeforeTest
//  public void beforeTest() {
//	  System.out.println("BeforeTest");
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  System.out.println("After Test");
//  }
//
//  @BeforeSuite
//  public void beforeSuite() {
//	  System.out.println("Before Suite");
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//	  System.out.println("After Suite");
//  }

}
