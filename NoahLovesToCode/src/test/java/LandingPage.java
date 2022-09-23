import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends PageOjectBase {

	LandingPage(WebDriver driver) {
		super(driver);
	}
	
	public LandingPage navigateToPortfolio() {
		 this.driver.get("https://www.noahlovestocode.com");
		 return this;
	}
	
	public String getPortfolioUrl() {
		return this.driver.getCurrentUrl();
	}
	
	public AboutMePage clickKnowMore() {
		this.driver.findElement(By.linkText("Know more")).click();
		return new AboutMePage(driver);
	}
	
	public ProjectsPage scrollToProjects() {
		
		JavascriptExecutor js = (JavascriptExecutor)this.driver;
		js.executeScript("window.scrollBy(0,1400)", "");
		WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(By.xpath("//a[@href=\"https://fakewook.github.io/Math-Sprint-Game/\"]"))));
		 
		return new ProjectsPage(this.driver);
	}
	
	public ContactMePage scrollToContact() {
		Actions a = new Actions(this.driver);
		a.scrollByAmount(0, 4000).build().perform();
		return new ContactMePage(this.driver);
	}

}
