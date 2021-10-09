package com.maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Veeralakshmi j\\eclipse-workspace\\SeleniumSepProject\\Driver\\chromedriver.exe");
			
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://en-gb.facebook.com/");
		  
		  WebElement email=driver.findElement(By.id("email"));
		  
		  email.sendKeys("ramya35it@gmail.com");
		  
		  WebElement password= driver.findElement(By.name("pass"));
		  
		  password.sendKeys("Ramya@1992");
		  
	 // WebElement loginBtn= driver.findElement(By.name("login"));
		  
		  //click()---> click the element 
		  
	  //loginBtn.click();
		  
		  
		  WebElement firstname = driver.findElement(By.xpath("//input[@class='firstname']"));
		  
		  firstname.sendKeys("ramya");
		  
		  WebElement lastname = driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
		  
		  lastname.sendKeys("Jawahar");
		  
		  
		  
		  
		 // WebElement createBtn= driver.findElement(By.xpath("//a[@role='button'])[2]"));

		//  createBtn.click();
		  
		//  WebElement firstname= driver.findElement(By.xpath("//input[@type='text'])[2]"));

		//  firstname.sendKeys("empire");
		  
		  WebElement surname= driver.findElement(By.xpath("//input[@name='lastname'])"));
		  
		  surname.sendKeys("smith");
		  Thread.sleep(1000);

		  WebElement mobile= driver.findElement(By.xpath("//div[text()='Mobile number or email address']"));
		  
		  String text= mobile.getText();
		  
		  System.out.println(text);
		  
		  WebElement mobilenumber= driver.findElement(By.xpath("//input[contains(@aria-label,'number or email')]"));
		  
		  mobilenumber.sendKeys("5896325699");

		  
		  WebElement pass= driver.findElement(By.xpath("//input[@type='password')[2]"));
		  pass.sendKeys("357336368&*&");
		  
		  WebElement FBtxt= driver.findElement(By.xpath("//p[contains(text(),'Sign Up,you agree to')]"));
		  
		  String text2 =FBtxt.getText();
		  
		  System.out.println(text2);
		  
		  firstname.clear();
		  
		  //compile time exception
		  
		  Thread.sleep(1000);
	}
	

}
