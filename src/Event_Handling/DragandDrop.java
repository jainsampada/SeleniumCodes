package Event_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	String pathdriver;
	WebDriver driver;
public void Launch()
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
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	Actions act=new Actions(driver);
	act.clickAndHold(driver.findElement(By.id("draggable")))
	.moveToElement(driver.findElement(By.id("droppable")))
	.release().build().perform();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragandDrop oo=new DragandDrop();
		oo.Launch();
	}

}
