package day3;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Dimension;

public class WorkingWIthEdge {
	
	
	EdgeDriver driver;
	public void invokeBrowser() {
	
		System.setProperty("webdriver.edge.driver","C:\\Users\\97154\\workspace\\libs\\edgedriver_afreen\\msedgedriver.exe");
		
	   driver = new EdgeDriver();
	   
	   Dimension dim = new Dimension(800,700);
	   
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
		
		//driver.quit();
	}

}
