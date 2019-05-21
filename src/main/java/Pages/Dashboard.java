package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Common.Utilities;

public class Dashboard {
	
	static String addPatient="//button[contains(text(),'Add Patient')]";
	static String firstName="//input[@id='mat-input-7']";
	static String lastName="//input[@id='mat-input-8']";
	
	
	public static void addPatient(WebDriver driver) throws IOException {
		driver.findElement(By.xpath(addPatient)).click();
		driver.findElement(By.xpath(firstName)).sendKeys(Utilities.getCongifProperty("firstName"));
		driver.findElement(By.xpath(lastName)).sendKeys(Utilities.getCongifProperty("lastName"));
	
		
	}
	

}
