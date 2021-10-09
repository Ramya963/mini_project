package com.maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Veeralakshmi j\\eclipse-workspace\\SeleniumSepProject\\Driver\\chromedriver.exe");
		
	  WebDriver driver=new ChromeDriver();
	  //chrome browser only can implement for all.
	  
	  driver.get("https://chromedriver.storage.googleapis.com/index.html?path=93.0.4577.15/");
	

	  ChromeDriver driver1=new ChromeDriver();
	  
	 // driver.get(null);
	  
	 // driver1.get(null);
	  
	  String title=driver.getTitle();
	   
	   System.out.println(title);
	   
	   String  currentUrl =driver.getCurrentUrl();
	   
	   System.out.println(currentUrl);
	  
	   
	 //  String pagesource=driver.getPageSource();
	 //  System.out.println(pagesource);
	   
	   driver.navigate().to("http://google.com/");
	   
	  // get-whole thing interact will wait for entire page loading.
	  //to-will move straightly to that page. 
	  // navigate-stores history
	   
	  driver.navigate().back();
	   
	  driver.navigate().forward();
	   
	   driver.navigate().refresh();
	   
	  // driver.close();
	   


	   
	   
	   
	  
	}
	

}
