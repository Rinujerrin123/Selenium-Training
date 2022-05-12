package com.qa.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) 
	{
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Obsqura\\Driver\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://groceryapp.uniqassosiates.com/admin"); 
      driver.manage().window().maximize();
      driver.findElement(By.name("username")).sendKeys("admin");
      driver.findElement(By.name("password")).sendKeys("admin");
      driver.findElement(By.xpath("//button[@type='submit']")).click(); 
      
      driver.findElement(By.cssSelector("i.nav-icon.fas.fa-user-check")).click();
      driver.findElement(By.cssSelector("i.fa.fa-search")).click();
      
      //driver.findElement(By.xpath("//p[text()='Verify Users']//ancestor::a")).click();
      //driver.findElement(By.xpath("//a[text()=' Search']")).click();
      
      

     
      driver.findElement(By.cssSelector("input#un")).sendKeys("rinu");
      driver.findElement(By.cssSelector("input#ut")).sendKeys("rinu@gmail.com");
      driver.findElement(By.cssSelector("input#ph")).sendKeys("9887898909");
      
     // driver.findElement(By.cssSelector("input[type='text']")).sendKeys("rinu");
      
	}
}
