package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertandFIndings {

	public static void main(String[] args) {
		ChromeDriver driver;
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\97154\\workspace\\libs\\chromedriver_afreen\\chromedriver.exe");
			
		   driver = new ChromeDriver();
		   
		   //Dimension dim = new Dimension(1024,740);
		   
		   //driver.manage().window().setSize(dim);
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
			
			driver.switchTo().frame("iframeResult");
			
			driver.findElement(By.tagName("button")).click();
			
			Alert result = driver.switchTo().alert();
			
			System.out.println(result.getText());
			
			result.accept();
 			
	}

}
