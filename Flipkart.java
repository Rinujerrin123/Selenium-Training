package com.qa.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://groceryapp.uniqassosiates.com/admin"); 
      driver.manage().window().maximize();
      driver.findElement(By.name("username")).sendKeys("admin");
      driver.findElement(By.name("password")).sendKeys("admin");
      driver.findElement(By.xpath("//button[@type='submit']")).click(); 
      //Action class
     // Actions action=new Actions(driver);
     // action.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
     
      //action.doubleClick(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
      
      //action.contextClick(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
      //driver.findElement(By.linkText("Manage Orders")).click();
      
        // locators
       //driver.findElement(By.xpath("//p[text()='Manage Orders']//parent::a")).click();
       
       /*String hrefAttribute=driver.findElement(By.xpath("//i[@class='nav-icon fas fa-shopping-basket']//parent::a")).getAttribute("href");
       System.out.println(hrefAttribute);*/
      
      //String cssValue=driver.findElement(By.xpath("//i[@class=' fa fa-search']//parent::a")).getCssValue("box-shadow");
      //System.out.println(cssValue);
      
       //driver.findElement(By.partialLinkText("Manage Or")).click();
      
       //driver.findElement(By.className("active nav-link")).click();
      //driver.findElement(By.tagName("button")).click();
    
      
      
	}
     
}
