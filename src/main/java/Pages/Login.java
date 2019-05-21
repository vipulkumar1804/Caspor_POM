package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Common.Utilities;

public class Login {
	
	static String email="//input[@id='mat-input-0']";
	static String password="//input[@id='mat-input-1']";
	static String login="//button[@class='login non-trasparent mat-raised-button mat-primary']";
	
	public static void loginUser(WebDriver driver) throws IOException {
		
		driver.findElement(By.xpath(email)).sendKeys(Utilities.getCongifProperty("email"));
		driver.findElement(By.xpath(password)).sendKeys(Utilities.getCongifProperty("password"));
		driver.findElement(By.xpath(login)).click();
	
		
	}

}
