package Data_DrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchData {
	String path,pathdriver;
	WebDriver driver;
	String uname,pass,message;
public void Launch() throws IOException
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
	

	//Step -1 Giving the path of the xlsx file
	path=System.getProperty("user.dir")+"//TestData//Login_Data.xlsx";
	
	//Step - 2Give the path in FileinputStream class from where you want to read data 
	FileInputStream  fis=new FileInputStream(path);
	
	//Step 3 Move to Workbook
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	//Step 4 Move to specific Sheet 
	XSSFSheet sheet=wb.getSheet("Login_Details");
	
	//Step 5 Read Rows from excel Sheet
	System.out.println(sheet.getLastRowNum());
	
	//Step 6 Read data from cell
	//String uname=sheet.getRow(1).getCell(0).getStringCellValue();
	//System.out.println("Username is:"+uname);
	for(int i=0;i<=sheet.getLastRowNum();i++)
	{
		uname=sheet.getRow(i).getCell(0).getStringCellValue();
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		
	
		pass=sheet.getRow(i).getCell(1).getStringCellValue();
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		
		FileOutputStream os=new FileOutputStream(path);
		message="Data imported successfully";
		sheet.getRow(i).createCell(2).setCellValue(message);
		
		wb.write(os);
		os.close();
		driver.findElement(By.id("btnLogin")).submit();
	}

}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FetchData oo=new FetchData();
		oo.Launch();
	}

}
