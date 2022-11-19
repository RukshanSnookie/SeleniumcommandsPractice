package basicSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeTesting {

	WebDriver driver;
	
	String url = "http://qatechhub.com";
	String titleWeb = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
	
	
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver","C://Users//ruksh//eclipse-workspace//libs//Browser_Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
	
	public void validateTitle() {
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase(titleWeb)) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
	}
	
	public void navigateFb() {
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
	}
	
	
	public void CurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	
	
	public void forwardAndRefresh() {
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	

	public static void main(String[] args) {
		chromeTesting ct = new chromeTesting();
		
		ct.invokeBrowser();
		ct.validateTitle();
		ct.navigateFb();
		ct.CurrentUrl();
		ct.forwardAndRefresh();
		ct.closeBrowser();
	}
}
