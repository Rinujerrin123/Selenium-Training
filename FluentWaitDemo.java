package com.qa.demo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Obsqura\\Driver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://groceryapp.uniqassosiates.com/admin"); 
	      driver.manage().window().maximize();
	      driver.findElement(By.name("username")).sendKeys("admin");
	      driver.findElement(By.name("password")).sendKeys("admin");
	      driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	     
	      
	      FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(20))
			       .pollingEvery(Duration.ofSeconds(2))
			       .ignoring(NoSuchElementException.class);
			 
			WebElement element1 = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
			WebElement element = driver.findElement(By.xpath("//*[@id='softwareTestingMaterial']"));
			String getTextOnPage = element.getText();
			if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
			System.out.println(getTextOnPage);
			return element;
			}else{
			System.out.println("FluentWait Failed");
			return null;
			}
			}
			});


	}

}
