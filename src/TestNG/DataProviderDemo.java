package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	String path;
@DataProvider(name="LoginData")
public Object[][] login()
{
	Object[][] arr=new Object[2][2];
	
	arr[0][0]="kjhd";
	arr[0][1]="gfgh";
	
	arr[1][0]="hgh";
	arr[1][1]="gfx";
	return arr;
	
}
@Test(dataProvider="LoginData")
public void  CheckTest(String uname,String pass)
{
path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", path);
	
	driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys(uname);
	driver.findElement(By.id("txtPassword")).sendKeys(pass);
	driver.findElement(By.id("btnLogin")).click();
	
	driver.close();
	
}
}
