package com.example.main.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class app2 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println("Hello World!" );
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Nandhini");
        driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("nandhiniravi44@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("nandhini");
        driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("nandhiniravi44@gmail.com");
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)", args);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
     
    }
}