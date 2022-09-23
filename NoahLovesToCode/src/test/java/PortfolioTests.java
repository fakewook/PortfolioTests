import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class PortfolioTests extends SeleniumTestBase {
  @Test
  public void canNavigateToPortfolio() {
	  String expectedUrl = "https://www.noahlovestocode.com/";
	  
	  String actualUrl = new LandingPage(this.getDriver())
			 .navigateToPortfolio()
			 .getPortfolioUrl();
	  
	  assertEquals(actualUrl, expectedUrl);
  }
  
  @Test
  public void canAccessResume() {
	  String expectedResume = "https://www.noahlovestocode.com/assets/resume.pdf";
	 
	  String resume = new LandingPage(this.getDriver()).navigateToPortfolio()
			  .clickKnowMore()
			  .viewResume()
			  .getResumeUrl();
	  assertEquals(resume, expectedResume);
  }
  
  @Test 
  public void canAccessMathSprintGameLive() {
	  String expectedLive = "https://fakewook.github.io/Math-Sprint-Game/";
	  
	  String live = new LandingPage(this.getDriver())
			  .navigateToPortfolio()
			  .scrollToProjects()
			  .openMathGame()
			  .getGameUrl();
	  
	  assertEquals(live, expectedLive);
  }

  @Test
  public void canStartMathGame() {
	  String expectedText = "Wrong";
	  
	  String buttonText = new LandingPage(this.getDriver())
			  .navigateToPortfolio()
			  .scrollToProjects()
			  .openMathGame()
			  .select10()
			  .clickStart()
			  .getTextOfWrongButton();
	  
	 
	  
	  assertEquals(buttonText, expectedText);
  }
  
  @Test
  public void canAccessSourceCode() {
	  String expectedSourceCode = "https://github.com/fakewook/Math-Sprint-Game";
	  
	  String sourceCode = new LandingPage(this.getDriver())
			  .navigateToPortfolio()
			  .scrollToProjects()
			  .viewSourceCode()
			  .getSourceCodeUrl();
	  
	  assertEquals(sourceCode, expectedSourceCode);
	  
  }
  
  @Test
  public void canClickGitHubLink() {
	  String expectedUrl = "https://github.com/fakewook";
	  
	  String actualUrl = new LandingPage(this.getDriver())
			  .navigateToPortfolio()
			  .scrollToContact()
			  .clickGithubIcon()
			  .getGithubLinkUrl();
	  
	  assertEquals(expectedUrl, actualUrl); 
  }
	  
}
