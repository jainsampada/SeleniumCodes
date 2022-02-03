package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTestNG {
	WebDriver driver;
	String pathdriver;
	SoftAssert ast=new SoftAssert();
	@Test
public void Login()
{
	pathdriver=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.out.println(pathdriver);
	//Step -1
	System.setProperty("webdriver.chrome.driver", pathdriver);
	
	//Step-2 
	driver=new ChromeDriver();
	
	//Step -3
	driver.manage().window().maximize();
	//Step 4 - Open Application 
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	ast.assertEquals(driver.getTitle(), "OraneHRM");//Hard Assertion
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@type='submit']")).submit();
	ast.assertAll();
}
}
