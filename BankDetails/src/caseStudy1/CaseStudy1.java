package caseStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy1 {
	
	ChromeDriver driver;
	public void invokeBrowser() {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97154\\workspace\\libs\\chromedriver_afreen\\chromedriver.exe");
		
	   driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.edureka.co/");
	}
	
	public void detialCase() {
		
		//------- To inspect Login Button------
		driver.findElement(By.xpath("//span[contains(text(), 'Log In')]")).click();
		driver.findElement(By.name("data[User][email]")).sendKeys("fouzifoj@gmail.com");
		//driver.findElement(By.id("si_popup_passwd")).sendKeys("faug@2021!");
		//driver.findElement(By.linkText("login")).click();
		
		//---------To click on search bar ----------
		//driver.findElement(By.xpath("//input[@class='open_search_overlay']")).click();
		//driver.findElement(By.className("new-search-inp")).sendKeys("Python");
		
	}
}
