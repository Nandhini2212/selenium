package com.example.main.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println("Hello World!" );
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://j2store.net/free/");
        
        driver.manage().window().maximize();
        String url1=driver.getCurrentUrl();
        System.out.println(url1);
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
        String url2=driver.getCurrentUrl();
        System.out.println(url2);
    }
}