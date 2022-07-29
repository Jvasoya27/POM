package screenShot;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;

@Listeners(CustomListener.class)
public class ScreenShotTest extends BaseClass {
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
	@Test
	public void takeScreenShotTest() {
		assertEquals(false, true);
	}

}
