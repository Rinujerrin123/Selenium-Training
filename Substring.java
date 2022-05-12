package com.qa.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Substring {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/list-product");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
        
		driver.findElement(By.xpath("span[class^='brand-text']")).click();   //prefix
		driver.findElement(By.xpath("span[class$='light']")).click();     //Suffix
		driver.findElement(By.xpath("span[class*='font']")).click();   //substring
		

	}

}
