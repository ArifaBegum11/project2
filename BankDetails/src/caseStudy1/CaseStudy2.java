package caseStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CaseStudy2 {
	

	ChromeDriver driver;
	public void invokeBrowser() {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97154\\workspace\\libs\\chromedriver_afreen\\chromedriver.exe");
		
	   driver = new ChromeDriver();
	   
	   //Dimension dim = new Dimension(1024,740);
	   
	   //driver.manage().window().setSize(dim);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.airindia.in/");
	}
	
	public void inspectAirIndia() {
		
		driver.findElement(By.xpath("//label[@id='lblOneWay']")).click();
		
		//driver.findElement(By.xpath("//label[@id='lblRoundTrip']")).click();
		
		driver.findElement(By.name("from")).sendKeys("Dubai, Dubai International Airport, DXB, United Arab Emirates");
		driver.findElement(By.id("to")).sendKeys("Hyderabad, Rajiv Gandhi International Airport, HYD, India");
		driver.findElement(By.name("_depdateeu1")).sendKeys("12/11/2022");
		
		WebElement dropdown= driver.findElement(By.name("ddladult1"));
		
		Select newElement= new Select(dropdown);
		newElement.selectByVisibleText("2");
		
		WebElement dropdown2= driver.findElement(By.name("ddlchildren1"));
		
		Select newElement2= new Select(dropdown2);
		newElement2.selectByVisibleText("0");
		
		WebElement dropdown3= driver.findElement(By.name("ddlinfants1"));
		
		Select newElement3= new Select(dropdown3);
		newElement3.selectByVisibleText("0");
		
		WebElement dropdown4= driver.findElement(By.id("concessionaryType1"));
		
		Select newElement4= new Select(dropdown4);
		newElement4.selectByVisibleText("Armed Forces");
		
		WebElement dropdown5= driver.findElement(By.id("_classType1"));
		
		Select newElement5= new Select(dropdown5);
		newElement5.selectByVisibleText("Economy");
		
		driver.findElement(By.xpath("//input[@id='btnbooking']")).click();
		
	}

}
