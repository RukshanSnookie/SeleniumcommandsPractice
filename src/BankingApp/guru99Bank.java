package BankingApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99Bank {

	WebDriver driver;
	String url = "https://demo.guru99.com/v4/";
	
	
	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver","C://Users//ruksh//eclipse-workspace//libs//Browser_Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to(url);
	}
	
	
	public void login(String usrName, String pwrd) {
		driver.findElement(By.name("uid")).sendKeys(usrName);
		driver.findElement(By.name("password")).sendKeys(pwrd);
		driver.findElement(By.name("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}
