

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class ProjectsPage extends PageOjectBase {

	ProjectsPage(WebDriver driver) {
		super(driver);
	}
	
	
	public MathGamePage openMathGame() {
		this.driver.findElement(By.xpath("//a[@href=\"https://fakewook.github.io/Math-Sprint-Game/\"]")).click();
		  Set<String> windows = this.driver.getWindowHandles();
		  
		  Iterator<String> it = windows.iterator();
		  String parentHandle = it.next();
		  String childHandle = it.next();
		  this.driver.switchTo().window(childHandle);
		return new MathGamePage(this.driver);
	}
	
	public MathSourceCodePage viewSourceCode() {
		 this.driver.findElement(By.xpath("//a[@href=\"https://github.com/fakewook/Math-Sprint-Game\"]")).click();
		 
		  Set<String> windows = this.driver.getWindowHandles();
		  
		  Iterator<String> it = windows.iterator();
		  String parentHandle = it.next();
		  String childHandle = it.next();
		  this.driver.switchTo().window(childHandle);
		  
		  return new MathSourceCodePage(this.driver);
		
	}

}
