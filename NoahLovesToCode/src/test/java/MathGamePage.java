import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MathGamePage extends PageOjectBase {

	MathGamePage(WebDriver driver) {
		super(driver);
	}
	
	public String getGameUrl() {
		return this.driver.getCurrentUrl();
	}
	
	public MathGamePage select10() {
		 this.driver.findElement(By.id("value-10")).click();
		 return this;
	}
	
	public MathGamePage clickStart() {
		WebElement button = this.driver.findElement(By.cssSelector(".start"));
		Actions action = new Actions(this.driver);
		action.moveToElement(button).perform();
		button.click();
		return this;
	}
	
	public String getTextOfWrongButton() {
	    WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(By.cssSelector(".wrong"))));
		return this.driver.findElement(By.cssSelector(".wrong")).getText();
		  
	}

}
