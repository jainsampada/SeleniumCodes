package Event_Handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	String pathdriver;
	WebDriver driver;
public void launch()
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
	driver.get("https://the-internet.herokuapp.com/windows");
	driver.findElement(By.linkText("Click Here")).click();
	
	Set<String> id=driver.getWindowHandles();
	System.out.println("Id is:"+id);
	
	Iterator<String> it=id.iterator();
	String parent_id=it.next();
	
	String child_id=it.next();
	System.out.println("Parent Window id is:"+parent_id);
	System.out.println("Child Window id is:"+child_id);
	
	driver.switchTo().window(child_id);
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(parent_id);
	System.out.println(driver.getTitle());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowHandling oo=new WindowHandling();
		oo.launch();
	}

}
