package DropdownScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValues_DifferentMethods {
	
	public static void main(String[] args) throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "/....................../chromedriver");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().fullscreen();
	  
	  
	  WebElement dropdown = driver.findElement(By.id("month"));
	  
	  Select month_dd = new Select(dropdown);
	  
	  //It will select March
	  month_dd.selectByIndex(3);
	  
	  Thread.sleep(3000);
	  
	  //It will select Oct
	  month_dd.selectByValue("10");
	  
	  Thread.sleep(3000);
	  
	  //It will select Aug
	  month_dd.selectByVisibleText("Aug");
	  
	  
  }
}
