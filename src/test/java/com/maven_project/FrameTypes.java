package com.maven_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTypes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Veeralakshmi j\\eclipse-workspace\\SeleniumSepProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Frames.html");

		int size = driver.findElements(By.xpath("iframe")).size();

		System.out.println(size);

		driver.switchTo().frame("singleframe");

		WebElement input1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

		input1.sendKeys("hello");

		WebElement nestedframetab = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));

		nestedframetab.click();

		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

		driver.switchTo().frame(outerFrame);

		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));

		driver.switchTo().frame(innerFrame);

		WebElement input2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

		input2.sendKeys("Hello java");

	}

}
