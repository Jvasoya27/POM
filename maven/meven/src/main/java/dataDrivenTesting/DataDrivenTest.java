package dataDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {

	WebDriver driver;

	
	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\jayde\\eclipse\\java-2022-03\\eclipse\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test(dataProvider="LogInData")
	public void logInTest(String name, String num, String zip, String add, String clas) {
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement text = driver.findElement(By.xpath("//input[@id='Email']"));
		text.clear();
		text.sendKeys("user");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='Password']"));
		pass.clear();
		pass.sendKeys("Password");
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
	}
	
	@DataProvider(name = "LogInData")
	public String [][] getData() {
		
		String logInData[][] = {
				{"Jaydeep","15","15234","common","d2"},
				{"Rajesh","16","15235","Rare","f2"},
				{"Arjun","17","15236","Middle","g2"},
				{"Kunti","18","15237","Left","h2"},
			};
		return logInData;
	}
	
	@AfterTest
	void tearDown() {
		
		driver.close();
	}
	
}
