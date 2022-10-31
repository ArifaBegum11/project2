package day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class WorkingChrome {
	
	ChromeDriver driver;
	public void invokeBrowser() {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97154\\workspace\\libs\\chromedriver_afreen\\chromedriver.exe");
		
	   driver = new ChromeDriver();
	   
	   Dimension dim = new Dimension(300,300);
	   
	   driver.manage().window().setSize(dim);
		
		//driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://google.com");
	}
	
	public void printTitleOfPage() {
		
		String titleOfPage = driver.getTitle();
		
		System.out.println("Title of page is " +titleOfPage);
	}
	
	public void navigateCommand() {
		
		driver.navigate().to("https://facebook.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
	}
	
	public void closeBrowser() {
		
		//closes only the current window
		
		//driver.close();
		
		//quits all the windows used by selenium
		
		driver.quit();
	}

}
