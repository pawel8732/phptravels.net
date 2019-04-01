package pl.test.phptravel;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import pl.test.phptravel.*;

public class HomePageTest {

	WebDriver driver;

	@Before
	public void open() {
		driver = TravelTest.getDriver();
	}

	@Test
	public void openTest() {
		HomePage op = new HomePage(driver);
		op.goTours("London", "26/11/2019", "4", "Educational");
	}
	
	@After
	public void close() {
		TravelTest.sleep(2);
		driver.close();
	}

}
