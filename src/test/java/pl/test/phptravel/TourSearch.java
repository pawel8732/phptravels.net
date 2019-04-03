// Paweł Kalisz tests

package pl.test.phptravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TourSearch {
	
	WebDriver driver;
	
	@FindBy(css = "#collapse1 > div.hpadding20 > div > div:nth-child(9) > div > ins")
	WebElement starsGrade;
	
	@FindBy(css = "#collapse2 > div > div > div.slider-track > div:nth-child(2)")
	WebElement sliderL;
	
	@FindBy(css = "#collapse2 > div > div > div.slider-track > div:nth-child(3)")
	WebElement sliderR;
	
	@FindBy(css = "#collapse3 > div.hpadding20 > div:nth-child(21) > div > ins")
	WebElement tourType;
	
	@FindBy(id = "cookyGotItBtn")
	WebElement cookieBtn;
	
	@FindBy(id = "searchform")
	WebElement searchBtn;	
	
	@FindBy(linkText = "Sheraton Trip")
	WebElement tourDetails;
	
	public TourSearch (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void filterTour() {
		
		starsGrade.click();
		Actions move = new Actions(driver);
		move.moveToElement(sliderL).click().dragAndDropBy(sliderL, 25, 0).build().perform();
		move.moveToElement(sliderR).click().dragAndDropBy(sliderR, -25, 0).build().perform();
		tourType.click();
		cookieBtn.click();
		move.moveToElement(searchBtn).click().perform();
		tourDetails.click();
		
	}
}
