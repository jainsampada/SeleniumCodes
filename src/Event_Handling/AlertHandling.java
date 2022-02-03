package Event_Handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	String pathdriver;
	WebDriver driver;
public void Launch() throws InterruptedException
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
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.name("proceed")).click();
	Thread.sleep(5000);
	Alert alt=driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
	
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AlertHandling oo=new AlertHandling();
		oo.Launch();
	}

}
