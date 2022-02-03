package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
	String path;
	WebDriver driver;
public void Launch()
{
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
	
	driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
	driver.findElement(By.className(""));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSSSelector oo=new CSSSelector();
		oo.Launch();
	}

}
