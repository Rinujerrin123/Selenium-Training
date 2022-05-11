package com.qa.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
		WebElement element=driver.findElement(By.xpath("//div[@class='navFooterLine']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver; //one time declaration
		//js.executeScript("arguments[0].click();", element);  // click
		
		js.executeScript("arguments[0].scrollIntoView();", element); //This will scroll the page till the element is found	
		js.executeScript("window.scrollBy(0,1000)");  //This  will scroll down the page by  1000 pixel vertical
		

	}

}
