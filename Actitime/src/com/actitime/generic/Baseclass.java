package com.actitime.generic;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
public class Baseclass {
	// static for listener implimentation [single object] but 
	//non static for parallel execution[new objects will be created]
	public  WebDriver driver;
	public Filelib f=new Filelib();
	@BeforeTest
	public void openbrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		String url = f.readdatafromproperty("url");
		driver.get(url);
		Reporter.log("openbrowser",true);
	}
	@BeforeMethod
	public void login() throws IOException
	{
		String un = f.readdatafromproperty("username");
		String pwd = f.readdatafromproperty("pwd");
		LoginPage l=new LoginPage(driver);
		l.setLogin(un,pwd);
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		h.setLogout();
		Thread.sleep(1000);
		Reporter.log("logout",true);
	}
	@AfterTest
	public void closebrowser()
	{
		driver.quit();
		Reporter.log("closebrowser",true);
	}


}
