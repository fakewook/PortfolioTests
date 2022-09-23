import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContactMePage extends PageOjectBase {

	ContactMePage(WebDriver driver) {
		super(driver);
	}
	
	public ContactMePage clickGithubIcon() {
		WebElement github = this.driver.findElement(By.xpath("//i[@class=\"fa fa-github fa-inverse\"]"));
		Actions a = new Actions(this.driver);
		a.click(github).build().perform();
		return this;
	}
	
	public String getGithubLinkUrl() {
		Set<String> windows = this.driver.getWindowHandles();
		  Iterator<String> it = windows.iterator();
		  it.next();
		  String childWindow = it.next();
		  this.driver.switchTo().window(childWindow);
		  return this.driver.getCurrentUrl();
	}

}
