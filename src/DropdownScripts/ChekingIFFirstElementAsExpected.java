package DropdownScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChekingIFFirstElementAsExpected {
  
  public static void main(String[] args) throws Exception  {
    System.setProperty("webdriver.chrome.driver" , "/...................../chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
    
    String Text = driver.findElement(By.id("automation")).getText();
    if(Text.equals("Automation Testing"))
    {
      System.out.println("Passed!");
    }
    else {
      System.out.println("Failed!");
    }
  }
}



