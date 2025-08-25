package com.testDemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Synchronization {

	@Test(priority = 1)
	public static void main(String[] args) throws InterruptedException {
		/*
		 * 1. what is test synchronization?
		 * 2. why is it required?
		 * */
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/test-sync-example");
		
		driver.findElement(By.xpath("//input[@id='ninja_forms_field_97']")).sendKeys();
		driver.findElement(By.xpath("//input[@id='ninja_forms_field_98']")).click();
		driver.findElement(By.xpath("//input[@id='ninja_forms_field_100']")).click();
		
		
		driver.findElement(By.id("u_5_6")).click(); 
		Thread.sleep(1000); 
		driver.findElement(By.linkText("Go to Next Page")).click();
	}
}
