import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


public class SeleniumTestBase {
	private WebDriver driver;
	public String browserType = "chrome";
	
  @BeforeMethod
  public void launchDriver() {
	  String browserType = this.browserType;
	 
	  DriverManager driverManager = DriverManagerFactory.getManager(browserType);
	  driverManager.createDriver();
	  this.driver = driverManager.getDriver();
	  this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  this.driver.manage().window().maximize();
  }
  
  @AfterMethod
  public void cleanUp() {
	  if (this.driver != null) {
		  this.driver.quit();
	  }
  }
  
  public WebDriver getDriver() {
		return this.driver;
	}
}
