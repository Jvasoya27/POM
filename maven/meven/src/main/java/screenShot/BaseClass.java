package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayde\\eclipse\\java-2022-03\\eclipse\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");

	}

	public void failed() {

		File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrfile, new File("\\Users\\jayde\\git\\repository\\CodingJava\\maven\\maven\\meven\\ScreenShot"));
		} catch (IOException e) {
				
			e.printStackTrace();
		}

	}

}
