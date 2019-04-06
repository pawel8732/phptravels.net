// Paweł Kalisz tests

package pl.test.phptravel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingTour {
	
	WebDriver driver;
		
	@FindBy(id = "selectedAdults")
	WebElement selectedAdults;
	
	@FindBy(id = "selectedChild")
	WebElement selectedChild;
	
	@FindBy(id = "selectedInfants")
	WebElement selectedInfants;
	
	@FindBy(css = "#body-section > div:nth-child(7) > div.panel.panel-default > div.panel-body > div > form > div:nth-child(5) > button")
	WebElement bookBtn;
	
	@FindBy(css = "#guestform > div:nth-child(1) > div:nth-child(2) > input")
	WebElement firstName;
	
	@FindBy(css = "#guestform > div:nth-child(1) > div:nth-child(3) > input")
	WebElement lastName;
	
	@FindBy(css = "#guestform > div:nth-child(2) > div:nth-child(2) > input")
	WebElement emailBtn;
	
	@FindBy(css = "#guestform > div:nth-child(2) > div:nth-child(3) > input")
	WebElement confirmEmail;
	
	@FindBy(css = "#guestform > div:nth-child(3) > div.col-md-10.col-xs-10 > input")
	WebElement numberBtn;
	
	@FindBy(css = "#guestform > div:nth-child(4) > div.col-md-10.col-xs-10 > input")
	WebElement addressBtn;
	
	@FindBy(css = "#s2id_autogen1 > a")
	WebElement countryBtn;
	
	@FindBy(css = "#select2-drop > ul > li:nth-child(154)")
	WebElement countryPoland;
	
	@FindBy(css = "#guestform > div.panel-body > div > div.panel-heading > label > div")
	WebElement notesCb;
	
	@FindBy(css = "#special > div > textarea")
	WebElement notesAdd;
	
	@FindBy(css = "#bookingdetails > div.panel.panel-default.guest > table > tbody > tr:nth-child(1) > td:nth-child(4) > label > span > span:nth-child(2)")
	WebElement extras_1;
	
	@FindBy(css = "#bookingdetails > div.panel.panel-default.guest > table > tbody > tr:nth-child(2) > td:nth-child(4) > label > span > span:nth-child(2)")
	WebElement extras_2;
	
	@FindBy(css = "#bookingdetails > div.panel.panel-default.guest > table > tbody > tr:nth-child(3) > td:nth-child(4) > label > span > span:nth-child(2)")
	WebElement extras_3;
	
	@FindBy(css = "#bookingdetails > div.panel.panel-default.guest > table > tbody > tr:nth-child(4) > td:nth-child(4) > label > span > span:nth-child(2)")
	WebElement extras_4;
	
	@FindBy(css = "#body-section > div.container.booking > div > div > div > div.col-md-8.offset-0.go-right > div:nth-child(2) > div.form-group > button")
	WebElement confirmBtn;
	
	@FindBy(css = ".btn.btn-default.arrivalpay")
	WebElement payArrival;
	
	public BookingTour(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void bookNow(String adults, String childs, String infants) {
				
		selectedAdults.click();
		Select adultCount = new Select(driver.findElement(By.id("selectedAdults")));
		adultCount.selectByValue(adults);
		selectedAdults.click();
		Select adultChild = new Select(driver.findElement(By.id("selectedChild")));
		adultChild.selectByValue(childs);
		selectedAdults.click();
		Select adultInfants = new Select(driver.findElement(By.id("selectedInfants")));
		adultInfants.selectByValue(infants);
		bookBtn.click();
			
	}
	
	public void confirmBooking(String name, String last, String email, String number, String address, String note) {
		
		firstName.click();
		firstName.sendKeys(name);
		lastName.click();
		lastName.sendKeys(last);
		emailBtn.click();
		emailBtn.sendKeys(email);
		confirmEmail.click();
		confirmEmail.sendKeys(email);
		numberBtn.click();
		numberBtn.sendKeys(number);
		addressBtn.click();
		addressBtn.sendKeys(address);
		countryBtn.click();
		countryPoland.click();
		notesCb.click();
		notesAdd.click();
		notesAdd.sendKeys(note);
	}
	
	public void extras(){
		
		extras_1.click();
		extras_2.click();
		extras_3.click();
		extras_4.click();
				
	}
	
	public void endBooking( ) {
		
		confirmBtn.click();
		payArrival.click();
		driver.switchTo().alert().accept();
		
	}
	

}
