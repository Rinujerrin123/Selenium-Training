package com.qa.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Obsqura\\Driver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://groceryapp.uniqassosiates.com/admin"); 
	      driver.manage().window().maximize();
	      driver.findElement(By.name("username")).sendKeys("admin");
	      driver.findElement(By.name("password")).sendKeys("admin");
	      driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	      driver.findElement(By.linkText("Manage Orders")).click(); 
	      driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']")).click();
	      WebElement ele=driver.findElement(By.id("od"));
	      ele.sendKeys("123");
	      
	      Actions actions=new Actions(driver);
	    	actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("a");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();
	        
	        actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("c");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();
	        
	        WebElement element=driver.findElement(By.id("um"));
	        element.click();
	        actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("v");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();

	        
	   

	}

}
