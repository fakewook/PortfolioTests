import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {


	public void createDriver() {
		String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("mac")) {
			URL driverPathForMac = getClass().getResource("mac/chromedriver");
			System.setProperty("webdriver.chrome.driver", driverPathForMac.getPath());
		}
		if (os.contains("windows")) {
			URL driverPathForWindows = getClass().getResource("windows/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", driverPathForWindows.getPath());
		}
		this.setDriver(new ChromeDriver());

	}

}
