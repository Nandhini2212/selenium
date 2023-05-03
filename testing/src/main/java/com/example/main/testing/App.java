package com.example.main.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println("Hello World!" );
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Nandhini");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Ravi");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("nandhiniravi44@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Nandhini");
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
     
    }
}
