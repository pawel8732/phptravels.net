package pl.test.phptravel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[3]/a")
	WebElement toursBtn;
	
	@FindBy(css = "#s2id_autogen10 > a > span.select2-chosen")
	WebElement cityChoose;
	
	@FindBy(css = "#select2-drop > div > input")
	WebElement cityName;
	
	@FindBy(css = "#select2-drop > ul > li > ul > li > div > span")
	WebElement cityBtn;
	
	@FindBy(css = "#tchkin > div > input")
	WebElement dateBtn;
	
	@FindBy(css = "#adults")
	WebElement guestBtn;
	
	@FindBy(css = "#s2id_tourtype > a")
	WebElement typeSelect;
	
	@FindBy(css = "#select2-drop > ul > li > div")
	WebElement typeConfirm;
	
	@FindBy(css = "#tours > form > div.col-md-2.form-group.go-right.col-xs-12.search-button > button")
	WebElement submitBtn;


	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goTours(String city, String date, String guests, String destination) {
		toursBtn.click();
		cityChoose.click();
		cityName.sendKeys(city);
		cityBtn.click();
		dateBtn.click();
		dateBtn.clear();
		dateBtn.sendKeys(date);
		guestBtn.click();
		Select guestsCount = new Select(driver.findElement(By.id("adults")));
		guestsCount.selectByValue(guests);		
		typeSelect.click();
		typeSelect.sendKeys(destination);
		typeConfirm.click();
		submitBtn.click();
	}

}
