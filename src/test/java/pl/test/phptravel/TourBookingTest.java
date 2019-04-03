// Paweł Kalisz tests

package pl.test.phptravel;

import org.junit.*;
import org.openqa.selenium.WebDriver;

public class TourBookingTest {

	WebDriver driver;

	@Before
	public void open() {
		driver = PhpTravels.getDriver();
	}

	@Test
	public void openTest() {
		HomePage op = new HomePage(driver);
		op.goTours("Hurghada Sunset Desert Safari", "26/11/2019", "4", "Educational");
		TourSearch ts = new TourSearch(driver);
		ts.filterTour();
	}
	
	@After
	public void close() {
		PhpTravels.sleep(5);
		driver.close();
	}

}
