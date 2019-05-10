package com.gbh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gotogbh {

	public static void main(String[] args) throws Throwable {
		
		gotogbh();

	}
	
	public static void gotogbh() throws Throwable {
		
		//Setup private mode on browser
		
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("-private");
		
		//Open browser with added options
	
		WebDriverManager.firefoxdriver().setup();
		 
		WebDriver driver = new FirefoxDriver(option);
		
		//Maximize window
		
		driver.manage().window().maximize();
		
		//Go to gbh
		
		driver.get("https://gbh.com.do/");
		
		Thread.sleep(4000);
		
		//Close ad that appears on opening page
		
		driver.findElement(By.xpath
				("//div[@id='gbhsubscribe']"))
				.click();
		
		Thread.sleep(2000);
		
		//Click portafolio tab
		
		driver.findElement(By.xpath("//a[contains(text(),'Portafolio')]")).click();
		
		//Click conocenos tab
		
		driver.findElement(By.xpath("//a[contains(text(),'Conócenos')]")).click();
		
		//Click empleos tab
		
		driver.findElement(By.xpath("//a[contains(text(),'Empleos')]")).click();
		
		//Click blogs tab
		
		driver.findElement(By.xpath("//a[contains(text(),'Blog')]")).click();
		
		//Click home button
		
		driver.findElement(By.xpath("//a[contains(text(),'Inicio')]")).click();
		
		//Print comment that search was succesful
		
		System.out.println("Test succesful!");
				
		//Delete all cookies on browser
		
		driver.manage().deleteAllCookies();
		
		//Close browser
		
		driver.quit();
		
	}

}
