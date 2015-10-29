package com.imaginea.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gmail_Login {
	
	WebDriver driver = null;
	public  Gmail_Login(){
		 BaseClass b = new BaseClass();
		driver = b.getDriver();
	}
	
	public void open(){
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("aparnareddy03@gmail.com");
		driver.findElement(By.id("next")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("Passwd")).sendKeys("december@1612");
		driver.findElement(By.id("signIn")).click();
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void composeMail(){
		driver.findElement(By.xpath("*//div/div[contains(@class,'T-I J-J5-Ji T-I-KE L3')]")).click();
		driver.findElement(By.xpath("*//td/div/div/textarea[@id=':o9']")).sendKeys("rajulaaparna@gmail.com");
		driver.findElement(By.xpath("//table/tbody/tr/td/form/div/input[@id=':nu']")).sendKeys("Code mail");
		driver.findElement(By.xpath("*//table/tbody/tr/td/div/div[@id=':ow']")).sendKeys("Hi");
		driver.findElement(By.xpath("//*[@id=':oq']/div[2]")).click();
	}
	
	public static void main(String[] args) {
		Gmail_Login g = new Gmail_Login();
		g.open();
		g.composeMail();
	}
}
