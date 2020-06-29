package stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializar extends Base {

	public void beforeHooks() {

		// All properties or codes which will execute before each
		// Scenario or scenario outline.
		String browserName = Base.getBrowserName();
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "FF":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new FirefoxDriver();
			break;
			defualt;

		}

	}

	public void afterHooks() {

	}

}
