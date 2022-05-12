package com.qa.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.globalsqa.com/demo-site/draganddrop/"); 
	      driver.manage().window().maximize();
	      
	     // WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	       /*driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
	       
	       driver.switchTo().defaultContent();
	       driver.switchTo().frame(0);*/
	       
	       List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
	       System.out.println("Total number of iframes are " + iframeElements.size());

	       Thread.sleep(5000);
	       Actions action=new Actions(driver);
	       WebElement srcElement=driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']//parent::li"));
	      
	      
	       WebElement destinationElement=driver.findElement(By.id("trash"));
	       action.dragAndDrop(srcElement, destinationElement).perform();
	     
	       //img[@src='images/high_tatras_min.jpg']
	      //trash
	     
	     
	       WebElement ele=driver.findElement(By.id(""));
	        ele.sendKeys(Keys.CONTROL);
	        ele.sendKeys("V");

		}

}
