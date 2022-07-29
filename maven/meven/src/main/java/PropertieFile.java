import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
													// Project connected to config.properties
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

		FileInputStream ip = new FileInputStream("C:\\Users\\jayde\\git\\repository\\CodingJava\\maven\\maven\\meven\\src\\main\\java\\config.Properties");
		prop.load(ip);

		System.out.println(prop.getProperty("browser"));
		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\jayde\\eclipse\\java-2022-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("Firwfox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equals("Safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("No browser value has given");
		}
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
