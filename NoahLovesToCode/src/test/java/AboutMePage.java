import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutMePage extends PageOjectBase {

	AboutMePage(WebDriver driver) {
		super(driver);
	}
	
	public AboutMePage viewResume() {
		this.driver.findElement(By.linkText("View Resume")).click();
		return this;
	}
	
	public String getResumeUrl() {
		
		  Set<String> windows = this.driver.getWindowHandles();
		  Iterator<String> it = windows.iterator();
		  String parentHandle = it.next();
		  String childHandle = it.next();
		  this.driver.switchTo().window(childHandle);
		  
		  return this.driver.getCurrentUrl();
	}
	

}
