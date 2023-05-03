package com.example.main.testing.Day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_t3 {
	public static void main( String[] args ) throws InterruptedException
    {
    WebDriverManager.edgedriver().setup();
    WebDriver driver =new EdgeDriver();
    driver.get("https://demo.guru99.com/test/delete_customer.php");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("401");
    driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
    Thread.sleep(3000);
    Alert alert=driver.switchTo().alert();
    alert.dismiss();
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
    driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("402");
    driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
    Thread.sleep(3000);
    alert.accept();
    Thread.sleep(3000);
    String msg=alert.getText();
    System.out.println(msg);
    alert.accept();

    }
}
