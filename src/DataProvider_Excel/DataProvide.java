package DataProvider_Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
	String sheetpath,path;
	WebDriver driver=null;
@DataProvider(name="EnterData")
public Object[][] readdata()
{
	sheetpath=System.getProperty("user.dir")+"//TestData//LoginData.xls";
	
	Xls_Reader xlr=new Xls_Reader(sheetpath);
	
	//Count rows
	int rowcount=xlr.getRowCount("Login_Details");
	System.out.println("No of rows are:"+rowcount);
	
	//Count columns
	int colcount=xlr.getColumnCount("Login_Details");
	
	Object[][] arr=new Object[rowcount-1][colcount];
	int ci=0;
	for(int i=2;i<=rowcount;i++,ci++)
	{
		int cj=0;
		for(int j=0;j<colcount;j++,cj++)
		{
			//arr[0][0]=
			arr[ci][cj]=xlr.getCellData("Login_Details", j, i);
			System.out.println(arr[ci][cj]);
			
		}
	}
	return arr;
}
@Test(dataProvider="EnterData")
public void Check_Login(String uname,String pass)
{
//	System.out.println("Username is:"+uname);
//	System.out.println("Password is:"+pass);
path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", path);
	
	driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.id("txtUsername")).sendKeys(uname);
	driver.findElement(By.id("txtPassword")).sendKeys(pass);
	driver.findElement(By.id("btnLogin")).click();
}
}
