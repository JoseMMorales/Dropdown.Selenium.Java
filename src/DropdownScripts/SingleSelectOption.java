package DropdownScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectOption {
	
	public static void main(String[] args) throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "/................................/chromedriver");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().fullscreen();
	   
	  WebElement dropdown = driver.findElement(By.id("month"));
	  
	  Select month_dd = new Select(dropdown);
	  
	  WebElement selected_value = month_dd.getFirstSelectedOption();
	  
	  //It should return Feb
	  System.out.println("After Selection selected value is " +selected_value.getText());
	  
	  //It will select March
	  month_dd.selectByIndex(3);
	  
	  WebElement selected_value1 = month_dd.getFirstSelectedOption();
	  
	  System.out.println("After Selection selected value is " +selected_value1.getText());
	  
	  String Element_DD = driver.findElement(By.xpath("//*[@id=\"month\"]/option[4]")).getText();
	  
	  //If Statement to verify text in the requirements
	  if(Element_DD.equals("Mar"))
	  {
		  System.out.println("Passed!"); 
	  }
	  else
	  {
		  System.out.println("Fail!");
	  }
  }
}
