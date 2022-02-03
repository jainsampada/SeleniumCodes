package LocatorsDemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
	WebDriver driver;
	WebElement uname;
	String path,expectedTitle="OrangeHRM",actualTitle,actualurl,expectedUrl="https://www.google.com";
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
//	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	
//	driver.navigate().back();
//	driver.navigate().forward();
//	driver.navigate().refresh();


//Locate By Id
//driver.findElement(By.id("txtUsername")).clear();
//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//driver.findElement(By.id("txtPassword")).clear();
//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//driver.findElement(By.id("btnLogin")).click();

//Locate By name
//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
//driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//driver.findElement(By.name("Submit")).submit();
//uname=driver.findElement(By.name("txtUsername"));
//if(uname.isDisplayed())
//{
//	uname.sendKeys("Admin");
//}
//Locate BY linktext
//driver.findElement(By.linkText("Forgot your password?")).click();
//actualTitle=driver.getTitle();
//actualurl=driver.getCurrentUrl();
//if(actualurl.equals(expectedUrl))
	//{
	//System.out.println("You are on correct page");
//}
//else
//{
	//System.out.println("Page not Found");
//}

//Locate By PartialLinkText
//driver.findElement(By.partialLinkText("your")).click();

	//locate By TagName
ArrayList<WebElement> al=(ArrayList<WebElement>) driver.findElements(By.tagName("a"));
System.out.println(al.size());
for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i).getText());
	System.out.println(al.get(i).getAttribute("href"));
}
	//Step -5 


	//driver.close();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Launch_Browser obj=new Launch_Browser();
			obj.Launch();
	}

}

		