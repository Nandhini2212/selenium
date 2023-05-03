import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {
  
	  WebDriver driver =new EdgeDriver();
		@BeforeTest
		public void beforetest() throws InterruptedException{
			WebDriverManager.edgedriver().setup();
		    driver.manage().window().maximize();
		}
		@Test
		public void login() throws InterruptedException {
	
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
			Thread.sleep(3000);
			System.out.println("login successful");
		}
		@Test(dependsOnMethods=("login"))
		public void logout() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
			Thread.sleep(3000);
			String url = driver.getCurrentUrl();
			  Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
			  Thread.sleep(3000);
//			WebElement profile=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
//			Select select = new Select(profile);
//			select.selectByVisibleText("Logout");
			
			
			
		}
		@AfterTest
		public void quit() {
			driver.quit();
		}
  
}
