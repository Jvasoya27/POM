import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
													// Project connected to config.properti
													// file
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PropertieFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver;

		// How to read property file
		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream("C:\\Users\\jayde\\eclipse-workspace\\meven\\src\\config.properties");
		prop.load(ip);

		System.out.println(prop.getProperty("browser"));
		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\jayde\\\\eclipse\\\\java-2022-03\\\\eclipse\\\\chromedriver_win32\\\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("Firwfox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equals("Safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("No browser value has given");
		}
		
		driver.get(prop.getProperty("url"));

	}

}
