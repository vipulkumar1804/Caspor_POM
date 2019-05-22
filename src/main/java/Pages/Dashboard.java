package Pages;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Common.Utilities;

public class Dashboard {
	
	static String addPatient="//button[contains(text(),'Add Patient')]";
	static String firstName="//input[@id='mat-input-7']";
	static String lastName="//input[@id='mat-input-8']";
	static String day="//mat-select[@id='mat-select-1']";
	static String select="//span[contains(@class, 'mat-option-text')]";
	static String month="//mat-select[@id='mat-select-2']";
	static String year="//mat-select[@id='mat-select-3']";
	static String gender="//mat-select[@id='mat-select-0']";
	static String height="//input[@id='mat-input-11']";
	static String weight="//input[@id='mat-input-12']";
	static String bmi="//input[@id='mat-input-13']";
	static String therapyGoal="//textarea[@id='mat-input-14']";
	static String therapist="//textarea[@id='mat-input-15']";
	static String other="//textarea[@id='mat-input-16']";
	static String emailPat="//input[@id='mat-input-9']";
	static String phoneNum="//input[@id='mat-input-10']";
	static String street="//input[@id='mat-input-17']";
	static String streetNum="//input[@id='mat-input-18']";
	static String zip="//input[@id='mat-input-19']";
	static String city="//input[@id='mat-input-20']";
	static String country="//mat-select[@id='mat-select-4']";
	static String button="//button[@class='divider-right mat-ripple caspar-button']";
	
	
	public static void addPatient(WebDriver driver) throws IOException, InterruptedException {
		driver.findElement(By.xpath(addPatient)).click();
		driver.findElement(By.xpath(firstName)).sendKeys(Utilities.getCongifProperty("firstName"));
		driver.findElement(By.xpath(lastName)).sendKeys(Utilities.getCongifProperty("lastName"));
		// Select day from drop down
		driver.findElement(By.xpath(day)).click();
List<WebElement> options = driver.findElements(By.xpath(select));
		for(WebElement option : options) {
			String text = option.getText();
			System.out.println("text is:"+text);
			if (option.getText().equals(Utilities.getCongifProperty("day"))) {
				try{
					option.click();
				     break;
				  }
				  catch(Exception e){
					  System.out.println(e.getMessage());
				  }
				}
		}
		// Select month from drop down
		driver.findElement(By.xpath(month)).click();
		List<WebElement> months = driver.findElements(By.xpath(select));
		for(WebElement month : months) {
			if (month.getText().equals(Utilities.getCongifProperty("month"))) {
				try{
					month.click();
				     break;
				  }
				  catch(Exception e){
					  System.out.println(e.getMessage());
				  }
				}
		}
		// Select year from drop down
		driver.findElement(By.xpath(year)).click();
		List<WebElement> years = driver.findElements(By.xpath(select));
		for(WebElement year : years) {
			if (year.getText().equals(Utilities.getCongifProperty("year"))) {
				try{
					year.click();
				     break;
				  }
				  catch(Exception e){
					  System.out.println(e.getMessage());
				  }
				}
		}
		// Select gender from drop down
		driver.findElement(By.xpath(gender)).click();
		List<WebElement> genders = driver.findElements(By.xpath(select));
		for(WebElement gender : genders) {
			if (gender.getText().equals(Utilities.getCongifProperty("gender"))) {
				try{
					gender.click();
				     break;
				  }
				  catch(Exception e){
					  System.out.println(e.getMessage());
				  }
				}
		}
		
		driver.findElement(By.xpath(height)).sendKeys(Utilities.getCongifProperty("height"));
		driver.findElement(By.xpath(weight)).sendKeys(Utilities.getCongifProperty("weight"));
		driver.findElement(By.xpath(bmi)).sendKeys(Utilities.getCongifProperty("bmi"));
		driver.findElement(By.xpath(therapyGoal)).sendKeys(Utilities.getCongifProperty("therapyGoal"));
		driver.findElement(By.xpath(therapist)).sendKeys(Utilities.getCongifProperty("therapist"));
		driver.findElement(By.xpath(other)).sendKeys(Utilities.getCongifProperty("other"));
		driver.findElement(By.xpath(emailPat)).sendKeys(Utilities.getCongifProperty("emailPat"));
		driver.findElement(By.xpath(phoneNum)).sendKeys(Utilities.getCongifProperty("phoneNum"));
		driver.findElement(By.xpath(street)).sendKeys(Utilities.getCongifProperty("street"));
		driver.findElement(By.xpath(streetNum)).sendKeys(Utilities.getCongifProperty("streetNum"));
		driver.findElement(By.xpath(zip)).sendKeys(Utilities.getCongifProperty("zip"));
		driver.findElement(By.xpath(city)).sendKeys(Utilities.getCongifProperty("city"));
		
		// Select country from dropdown
		WebElement element= driver.findElement(By.xpath(country));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		List<WebElement> countrys = driver.findElements(By.xpath(select));
		for(WebElement country : countrys) {
			if (country.getText().equals(Utilities.getCongifProperty("country1"))) {
				try{
					country.click();
				     break;
				  }
				  catch(Exception e){
					  System.out.println(e.getMessage());
				  }
				}
		}
		driver.findElement(By.xpath(button)).click();
		
		}
	}



