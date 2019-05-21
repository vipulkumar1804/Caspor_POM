package Caspor;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Utilities;

public class CasporTest {

	
	WebDriver driver;
	
	  @BeforeMethod
	  public void setup() throws IOException, InterruptedException{

			  driver =  Utilities.startApplication();
				driver.manage().window().maximize();
				
	
}    
	  @Test
	  public void abc() {
		  
	  }
}