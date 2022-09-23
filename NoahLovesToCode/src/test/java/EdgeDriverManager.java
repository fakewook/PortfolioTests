import java.net.URL;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager {

	@Override
	public void createDriver() {
		String os = System.getProperty("os.name").toLowerCase();

		if (os.contains("mac")) {
			URL driverPathPathForMac = getClass().getResource("mac/msedgedriver");
			System.setProperty("webdriver.edge.driver", driverPathPathForMac.getPath());
		}

		if (os.contains("windows")) {
			URL driverPathForWindows = getClass().getResource("windows/msedgedriver.exe");
			System.setProperty("webdriver.edge.driver", driverPathForWindows.getPath());
		}

		this.setDriver(new EdgeDriver());

	}

}
