package com.example.main.testing.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_t2 {
	public static void main( String[] args ) throws InterruptedException
    {
    WebDriverManager.edgedriver().setup();
    WebDriver driver =new EdgeDriver();
    driver.get("https://jqueryui.com/droppable/");
    driver.manage().window().maximize();
    driver.switchTo().frame(0);
    WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
    WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
    Actions act=new Actions(driver);
    act.dragAndDrop(drag, drop).build().perform();
    driver.switchTo().defaultContent();
    WebElement btn=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[3]/a"));
    btn.click();
    Thread.sleep(3000);
    driver.quit();
    
    }
}
