package com.example.main.testing.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_t4 {
	public static void main( String[] args ) throws InterruptedException
    {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver =new EdgeDriver();
	    driver.get("https://www.abhibus.com/bus-ticket-booking");
	    driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("chennai");
	    driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("coimbatore");
	    driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).sendKeys("28-04-2023");
	    
   
    }
}
