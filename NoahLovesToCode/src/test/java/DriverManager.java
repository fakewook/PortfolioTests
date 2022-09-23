import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	private WebDriver driver;
	
	abstract public void createDriver();
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	protected void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void quitDriver() {
		if (this.driver != null) {
			this.driver.quit();
		}
	}

}
