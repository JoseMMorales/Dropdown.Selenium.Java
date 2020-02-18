
<img src="https://avatars0.githubusercontent.com/u/983927?v=3&s=80" height="70" width="78"> <img src="https://www.testbytes.net/wp-content/uploads/2017/11/Eclipse.png" height="70" width="78"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSjEqXLRdziR2C5OMK0BqhdWXrQwDjR81IxaskwUWsOkIYTtoHN" height="80" width="88"> 
# Dropdown.Selenium.Java 

This repository contains a good practice on handling Dropdowns in different scenarios, which makes it one of the most interesting topics in Automation Testing using WebDriver, Selenium and Java. Very useful hands on experience to run own workshops to improve your Technical Skills in Software Testing.

### Clone Project

$ git clone https://github.com/JoseMMorales/Dropdown.Selenium.Java.git

$ cd Dropdown.Selenium.Java

### Pre-requisites
#### You'll need to install
* Webdriver
* Java JDK 13
* Eclipse IDE 2019‑09
* Selenium Java Client 3.141.59
* JUnit5 

### Demo website to practice Dropdown

Website | Dropdown
------------ | -------------
http://demo.guru99.com/test/newtours/register.php | <img src="https://user-images.githubusercontent.com/43299285/74765606-d965bd80-527b-11ea-8581-e6d11aa82429.png" height="220" width="498">
https://www.testandquiz.com/selenium/testing.html | <img src="https://user-images.githubusercontent.com/43299285/74767341-9b1dcd80-527e-11ea-8c02-5265db351af5.png" height="240" width="498">
https://www.facebook.com/ | <img src="https://user-images.githubusercontent.com/43299285/74767642-25663180-527f-11ea-807c-39f1a961fdd2.png" height="240" width="298">
http://testautomationpractice.blogspot.com/ | <img src="https://user-images.githubusercontent.com/43299285/74768198-1338c300-5280-11ea-9920-6feaad5934f5.png" height="240" width="498">


1. Website: http://demo.guru99.com/test/newtours/register.php
<img src="https://user-images.githubusercontent.com/43299285/74765606-d965bd80-527b-11ea-8581-e6d11aa82429.png" height="220" width="498">

2. Website: https://www.testandquiz.com/selenium/testing.html
<img src="https://user-images.githubusercontent.com/43299285/74767341-9b1dcd80-527e-11ea-8c02-5265db351af5.png" height="240" width="498">

3. Website: https://www.facebook.com/
<img src="https://user-images.githubusercontent.com/43299285/74767642-25663180-527f-11ea-807c-39f1a961fdd2.png" height="240" width="298">

4. Website: http://testautomationpractice.blogspot.com/
<img src="https://user-images.githubusercontent.com/43299285/74768198-1338c300-5280-11ea-9920-6feaad5934f5.png" height="240" width="498">

### Practice with (Class and Methods)

* "Select"Class - Objects can be initialized by passing the dropdown webElement as parameter to its constructor.
* .deselectAll() – To deselect all the selected options.
* .deselectByIndex(int index) – To deselect the option based on its index.
* .deselectByValue(String valueAttribute) – To deselect the option its ‘value’ attribute.
* .deselectByVisibleText(String text) – To deselect the option based on the text over the option.
* .getOptions() – To return list of all the options(List<WebElement>).
* .getAllSelectedOptions() – To return the list of all the selected options(List<WebElement>).
* .getFirstSelectedOption() – To return the selected option/the first selected option in case of dropdowns allowing multi-select.
* isMultiple() 

