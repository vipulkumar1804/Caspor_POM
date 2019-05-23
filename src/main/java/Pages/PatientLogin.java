package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PatientLogin {
	
	static String patientID="(//*[@class=\"section-title\"]//following::div[4])[2]";
	static String patientPassword="(//*[@class=\"section-title\"]//following::div[4])[3]";
	static String close="//span[contains(text(),'Close')]";
	static String logoutLogo="//span[@class='ng-star-inserted']";
	static String logout="//button[@class='mat-menu-item ng-star-inserted']";
	static String id="//input[@id='mat-input-26']";
	static String password="//input[@id='mat-input-27']";
	
	public static void patientCredentials(WebDriver driver) {
		
		String idPatient=driver.findElement(By.xpath(patientID)).getText();
		System.out.println("patient id is:"+idPatient);
		String passwordPatient=driver.findElement(By.xpath(patientPassword)).getText();
		System.out.println("patient password is:"+passwordPatient);
		driver.findElement(By.xpath(close)).click();

		driver.findElement(By.xpath(logoutLogo)).click();
		driver.findElement(By.xpath(logout)).click();
		
	
	  driver.findElement(By.xpath(id)).sendKeys(idPatient);
	  driver.findElement(By.xpath(password)).sendKeys(passwordPatient);
	  driver.findElement(By.xpath(Login.login)).click();
	  
	  
  }
}
