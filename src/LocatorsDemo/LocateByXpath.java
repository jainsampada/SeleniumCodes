package LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXpath {
	String path;
	WebDriver driver;
public void LocateBypath()
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
	//driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	//Locate username textfield by using Xpath
	//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	//driver.findElement(By.xpath("//input[@type='submit']")).submit();
	
	//Locate by contains method in xpath
	//driver.findElement(By.xpath("//input[contains(@type,'sub')]")).submit();
	
	//Locate By contains and text() method
	//String locate=driver.findElement(By.xpath("//span[contains(text(),'( Username : Admin | Password : admin123 )')]")).getText();
	//System.out.println("Value present in span tag is:"+locate);
	
	//Using and operator
	//String text=driver.findElement(By.xpath("//*[contains(text(),'Password') and @class='form-hint']")).getText();
	
	//System.out.println("Text is:"+text);
	
	//Self Method
	//String selftag=
driver.findElement(By.xpath("//input[@id='txtUsername']/self::input")).sendKeys("Admin");;
	//System.out.println("Self tag value is:"+selftag);
	
	//parent 
	//String parenttag=driver.findElement(By.xpath("//a[contains(text(),'Minda Corporation')]/parent::td")).getText();
	//System.out.println("Parent tag text is:"+parenttag);
	
	//Child
	//List<WebElement> li=driver.findElements(By.xpath("//a[contains(text(),'Minda Corporation')]/ancestor::tr/child::td"));
	//System.out.println(li.size());
	//Lambda Expression
	/*li.forEach(name->
	{System.out.println(name.getText());
	});
*/	
	//driver.close();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocateByXpath oo=new LocateByXpath();
		oo.LocateBypath();
	}

}
