package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TermandCond {
	
	static String checkBox="//div[@class='mat-checkbox-inner-container']";
	static String cont="//button[@class='tos-accept ml-auto mat-ripple caspar-button']";
	
	public static void term(WebDriver driver){
		driver.findElement(By.xpath(checkBox)).click();
		driver.findElement(By.xpath(cont)).click();
		
	}
	

}
