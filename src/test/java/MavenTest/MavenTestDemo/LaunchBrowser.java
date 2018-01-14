package MavenTest.MavenTestDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chromdriver",
				"d:\\Techcanvass_Workplace\\SeleniumBasics\\Artifacts\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

}
