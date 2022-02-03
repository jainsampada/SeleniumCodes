package Doubt_Session;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapSelenium {
	 static HashMap logindata() {
		  HashMap hm = new HashMap();
		  hm.put("x", "mercury@mercury");
		  hm.put("y", "mercury1@mercury1");
		  hm.put("z", "mercury2@mercury2");

		  return hm;
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pawan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

  driver.get("https://opensource-demo.orangehrmlive.com/");

  // Login as X
  String credentials = (String) logindata().get("x"); // Retriving value 'x' from
             // HashMap

  // Login as y
  // String credentials = logindata().get("y");

  // Login as z
  // String credentials = logindata().get("x");

  String uarr[] = credentials.split("@"); // separting value of 'x' int o
            // 2 parts using delimeter '@'

  driver.findElement(By.name("txtUsername")).sendKeys(uarr[0]); // Passing
                 // value 1
                 // i.e
                 // username
                 // from
                 // array
  driver.findElement(By.name("txtPassword")).sendKeys(uarr[1]); // Passing
                 // value 2
                 // i.e
                 // password
                 // from
                 // array
  driver.findElement(By.name("Submit")).click();

  // Validation
  if (driver.getTitle().equals("OrangeHRM")) {
   System.out.println("Test Passed");

  } else {
   System.out.println("Test failed");

  }

	}

}
