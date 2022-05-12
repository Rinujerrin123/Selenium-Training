package com.qa.demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FistAutomation {

	
	
	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Obsqura\\Driver\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://groceryapp.uniqassosiates.com/admin"); 
      driver.manage().window().maximize();
      
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
      
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
      
      driver.findElement(By.name("username")).sendKeys("admin");
      driver.findElement(By.name("password")).sendKeys("admin");
      WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
      wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
      driver.findElement(By.xpath("//button[@type='submit']")).click(); 
      
     // driver.findElement(By.linkText("Manage Orders")).click();
      
     // String hrefAttribute=driver.findElement(By.xpath("//i[@class=' fa fa-search']//parent::a")).getAttribute("href");
    //  System.out.println(hrefAttribute);
    //  String cssValue=driver.findElement(By.xpath("//i[@class=' fa fa-search']//parent::a")).getCssValue("background-color");
    //  System.out.println(cssValue);
      driver.findElement(By.partialLinkText("Manage Or")).click();
      // driver.findElement(By.className("nav-icon fas fa-shopping-basket")).click();
      
      //Action class
     /* Actions action=new Actions(driver);
      action.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();*/
      
      
      
      
       
      
      /* Wait fluentWait = new FluentWait(driver)
    		  .withTimeout(Duration.ofSeconds(20))
    		  .pollingEvery(Duration.ofSeconds(2))
    		  .ignoring(Exception.class);

    		  WebElement obsqura=fluentWait.until(new Function<WebDriver, WebElement>() {
    		  public WebElement apply(WebDriver driver) {
    		  return driver.findElement(By.id("obsqura"));
    		  }
    		  });*/

      
     /* driver.findElement(By.cssSelector("i.nav-icon.fas.fa-user-check")).click();
      driver.findElement(By.cssSelector("i.fa.fa-search")).click();*/
      
      /*String text=driver.findElement(By.xpath("//span[@class='brand-text font-weight-light']")).getText();
      System.out.println(text);
      
      if(text.equals("7rmart supermarket"))
      {
    	  System.out.println("Testcase passed"); 
      }
      else
      {
    	  System.out.println("Testcase Failed");   
      }*/
      
      
      
     /* boolean isDisplayed=driver.findElement(By.xpath("//span[@class='brand-text font-weight-light']")).isDisplayed();
      System.out.println(isDisplayed);
      if(isDisplayed==true)
      {
    	  System.out.println("Testcase passed"); 
      }
      else
      {
    	  System.out.println("Testcase Failed");   
      }*/
      
      
//      String title=driver.getTitle();
//      System.out.println(title); 
//      
//      
//      String url=driver.getCurrentUrl();
//      System.out.println(url); 
      
//      
//      String pageSource=driver.getPageSource();
//      System.out.println(pageSource); 
      
      
      /*driver.findElement(By.cssSelector("input#un")).sendKeys("rinu");
      driver.findElement(By.cssSelector("input#ut")).sendKeys("rinu@gmail.com");
      driver.findElement(By.cssSelector("input#ph")).sendKeys("9887898909");*/
     
      //driver.findElement(By.xpath("//p[text()='Manage Orders']//ancestor::a")).click();
      //driver.findElement(By.xpath("//a[text()=' Search']")).click();
      
      //Select dropdown= new Select(driver.findElement(By.id("pt")));
     // dropdown.selectByVisibleText("COD");
     // dropdown.selectByValue("Cash on Delivery");
      //dropdown.selectByIndex(2);
      //dropdown.deselectByIndex(1);
      //dropdown.deselectAll();
      
      
      
      //driver.findElement(By.cssSelector("i.nav-icon.fas.fa-tasks")).click();
      //driver.findElement(By.cssSelector("a.btn.btn-sm.btn.btn-primary.btncss")).click();
     /* boolean unlimitedStockIsSelected=driver.findElement(By.name("unlimitw[]")).isSelected();
      if(!driver.findElement(By.name("unlimitw[]")).isSelected())
      {
    	  driver.findElement(By.name("unlimitw[]")).click();  
      }*/
      
      
      
	  
      /*for(int i=1;i<27;i++)
      {
    	  Thread.sleep(1000);
    	  String name=driver.findElements(By.xpath("(//li[@class='nav-item']//p)")).get(i).getText();
          System.out.println("Name "+name);
      }*/
      
      //driver.close();
      //driver.quit();
      
     
      
	}
}
	
	//p[text()='Dashboard']//parent::a
	//a[@href='https://groceryapp.uniqassosiates.com/admin/home']//child::i
	//p[text()='Dashboard']//preceding-sibling::i
	//i[@class='nav-icon fas fa-th-large']//following-sibling::p
	//p[text()='Dashboard']//ancestor::ul
	//p[text()='Dashboard']//ancestor::li//following-sibling::li
	//  (//p[text()='Dashboard']//ancestor::li//following-sibling::li)[1]
	//  ((//p[text()='Dashboard']//ancestor::li//following-sibling::li)[1]//p)[1]
	

