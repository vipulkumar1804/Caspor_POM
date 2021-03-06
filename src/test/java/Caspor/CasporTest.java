package Caspor;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Utilities;
import Pages.Dashboard;
import Pages.Login;
import Pages.PatientLogin;
import Pages.TermandCond;

public class CasporTest {

	
	WebDriver driver;
	
	  @BeforeMethod
	  public void setup() throws IOException, InterruptedException{

			  driver =  Utilities.startApplication();
				driver.manage().window().maximize();
					
}    
	  @Test
	  public void automateTest() throws IOException, InterruptedException {
		  
		  Login.loginUser(driver);
		  Dashboard.addPatient(driver);
		  PatientLogin.patientCredentials(driver);
		  TermandCond.term(driver);	
	  }
	  @AfterMethod
	  public void close() {
		  driver.close();
	  }
}