package DropdownScripts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintSizeAndAllValues {
  
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/....................../chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().fullscreen();
    
    WebElement dropdown = driver.findElement(By.id("month"));
    Select month_dd = new Select(dropdown);
    List <WebElement> month_list = month_dd.getOptions();
    //Print number of elements in the list
    int total_month = month_list.size();
    
    System.out.println("Total month count is " +total_month);
    
    //Print all values in the list - "Ends for loop"
    for(WebElement ele:month_list)
    {
      String month_name = ele.getText();
      System.out.println("Month are ===== " +month_name);
    }
  }
}
