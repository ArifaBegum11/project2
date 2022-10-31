package day4;

import org.openqa.selenium.By;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Guru99 {
	
	ChromeDriver driver;
	public void invokeBrowser() {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97154\\workspace\\libs\\chromedriver_afreen\\chromedriver.exe");
		
	   driver = new ChromeDriver();
	   
	   //Dimension dim = new Dimension(1024,740);
	   
	   //driver.manage().window().setSize(dim);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/v4");
		
	}
	
	public void login(String userName, String userPassword) {
		
		//WebElement userIdElement;
		
	//	userIdElement = driver.findElement(By.name("uid"));
		
		//userIdElement.sendKeys(userName);
		
		
		driver.findElement(By.name("uid")).sendKeys(userName);
		
		driver.findElement(By.name("password")).sendKeys(userPassword);
		
		driver.findElement(By.name("btnLogin")).click();
	}
	
	public void addCustomer() {
		
		driver.findElement(By.linkText("New Customer")).click();
		
		driver.findElement(By.name("name")).sendKeys("kanika");
		
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		driver.findElement(By.name("dob")).sendKeys("10/11/2000");
		
		driver.findElement(By.name("addr")).sendKeys("101 Muweilah commercial");
		
		driver.findElement(By.name("city")).sendKeys("Sharjah");
		
		driver.findElement(By.name("state")).sendKeys("UAE");
		
		driver.findElement(By.name("pinno")).sendKeys("500054");
		
		driver.findElement(By.name("telephoneno")).sendKeys("9988776655");
		
		String emailID= "asdf" + System.currentTimeMillis() + "@gmail.com";
		
		driver.findElement(By.name("emailid")).sendKeys(emailID);
		
		driver.findElement(By.name("password")).sendKeys("asdfgh");
		
		//driver.findElement(By.className(""))
		
		driver.findElement(By.name("sub")).click();	
		
	}
	
	public String getCustomerId() {
		
		return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
	}
	
	public void customerAccount(String customerID) {
		
		driver.findElement(By.linkText("New Account")).click();
		
		driver.findElement(By.name("cusid")).sendKeys(customerID);
		
		WebElement dropdown=driver.findElement(By.name("selaccount"));
		
		Select newAccount= new Select(dropdown);
		
		newAccount.selectByVisibleText("current");
		
		boolean isFlag =newAccount.isMultiple();
		
		System.out.println(isFlag);
		
		driver.findElement(By.name("inideposit")).sendKeys("25000");
		
		driver.findElement(By.name("button2")).click();
		
	}
}
