import org.openqa.selenium.WebDriver;

public class MathSourceCodePage extends PageOjectBase {

	MathSourceCodePage(WebDriver driver) {
		super(driver);
	}
	
	public String getSourceCodeUrl() {
		return this.driver.getCurrentUrl();
	}

}
