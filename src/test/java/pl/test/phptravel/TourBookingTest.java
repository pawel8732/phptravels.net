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
		BookingTour bt = new BookingTour(driver);
		bt.bookNow("2", "1", "1");
		bt.confirmBooking("Pawel", "Test", "pawel@pawel.com", "565777888", "Dluga 389/44", "No meal");
		bt.extras();
		bt.endBooking();
		
	}
	
	@After
	public void close() {
		PhpTravels.sleep(10);
		driver.close();
	}

}
