package com.maven_project;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class purchase {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Veeralakshmi j\\eclipse-workspace\\SeleniumSepProject\\Driver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();

			driver.get("http://automationpractice.com/index.php");

			driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();

			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ramya35it@gmail.com");

			driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("ramya@21");

			driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();

			JavascriptExecutor js = (JavascriptExecutor) driver;

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();

			driver.findElement(By.xpath(
					"(//a[@title='Browse our different dresses to choose the perfect dress for an unforgettable evening!'])[1]"))
					.click();

			WebElement quickview = driver.findElement(By
					.xpath("(//a[@href=\"http://automationpractice.com/index.php?id_product=4&controller=product\"])[2]"));
			
			js.executeScript("arguments[0].click();", quickview);

			WebElement qty = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
			for (int i = 0; i < 9; i++) {
				qty.click();
			}

			WebElement size = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));
			Select s1 = new Select(size);
			s1.selectByValue("2");

			driver.findElement(By.xpath("//a[@name='Pink']")).click();

			TakesScreenshot ts1 = (TakesScreenshot) driver;
			File src1 = ts1.getScreenshotAs(OutputType.FILE);
			File dest1 = new File("C:\\Users\\Veeralakshmi j\\eclipse-workspace\\SeleniumSepProject\\screenshot\\quickview.png");
			FileUtils.copyFile(src1, dest1);

		    WebElement submit = driver.findElement(By.xpath("//span[text()='Add to cart']"));
			
			submit.click();

			driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

			WebElement Shopping_cart_summary = driver.findElement(By.id("cart_title"));
			
			js.executeScript("arguments[0].scrollIntoView();", Shopping_cart_summary);

			TakesScreenshot ts2 = (TakesScreenshot) driver;
			File src2 = ts2.getScreenshotAs(OutputType.FILE);
			File dest2 = new File("C:\\Users\\Veeralakshmi j\\eclipse-workspace\\SeleniumSepProject\\Screenshot\\Shopping_cart_summary.png");
			FileUtils.copyFile(src2, dest2);

			driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();

			WebElement Address = driver.findElement(By.xpath("//h1[text()='Addresses']"));
			js.executeScript("arguments[0].scrollIntoView();", Address);

			TakesScreenshot ts3 = (TakesScreenshot) driver;
			File src3 = ts3.getScreenshotAs(OutputType.FILE);
			File dest3 = new File("C:\\Users\\Veeralakshmi j\\eclipse-workspace\\SeleniumSepProject\\Screenshot\\Address.png");
			FileUtils.copyFile(src3, dest3);

			driver.findElement(By.xpath("//button[@name='processAddress']")).click();

			driver.findElement(By.xpath("//input[@type='checkbox']")).click();

			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

			driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();

			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();		
			
			WebElement order_conformation = driver.findElement(By.xpath("//span[text()='Order confirmation']"));
			js.executeScript("arguments[0].scrollIntoView();", order_conformation);

			TakesScreenshot ts4 = (TakesScreenshot) driver;
			File src4 = ts4.getScreenshotAs(OutputType.FILE);
			File dest4 = new File("C:\\Users\\Veeralakshmi j\\eclipse-workspace\\SeleniumSepProject\\Screenshot\\order_conformation.png");
			FileUtils.copyFile(src4, dest4);
			
			driver.findElement(By.xpath("//a[@title='Back to orders']")).click();
			
			driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")).click();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			WebElement quickview1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));
			
			js.executeScript("arguments[0].click();", quickview1);		
			
			WebElement qty1 = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
			
			for (int i = 0; i < 3; i++) 
			{
				qty1.click();
			}		
			
			WebElement size1 = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));
			
			Select s2 = new Select(size1);
			s2.selectByVisibleText("M");
			
			WebElement color = driver.findElement(By.xpath("//a[@title='Blue']"));
			
			color.click();
			
			WebElement submit1 = driver.findElement(By.xpath("//span[text()='Add to cart']"));
			
			submit1.click();
			
			
			driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
			
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
			
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span")).click();
		  
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")).click();
			
			driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();


			TakesScreenshot ts5 = (TakesScreenshot) driver;
			File src5 = ts5.getScreenshotAs(OutputType.FILE);
			File dest5 = new File("C:\\Users\\Veeralakshmi j\\eclipse-workspace\\SeleniumSepProject\\Screenshot\\Address1.png");
			FileUtils.copyFile(src5, dest5);
			
			
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span")).click();
			
			TakesScreenshot ts6 = (TakesScreenshot) driver;
			File src6 = ts6.getScreenshotAs(OutputType.FILE);
			File dest6 = new File("C:\\Users\\Veeralakshmi j\\eclipse-workspace\\SeleniumSepProject\\Screenshot\\order_conformation1.png");
			FileUtils.copyFile(src6, dest6);
			
			
			

		}
	}
