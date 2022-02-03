package TestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends DriverDemo {
@Test
public void Login()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
}
@Test
public void forgetpass()
{
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.navigate().back();
}
}
