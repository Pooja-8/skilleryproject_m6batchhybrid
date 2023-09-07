package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillarydemoapptesting {
	//declaration
	//address of seleniumtraining
	@FindBy(id="Selenium Training")
	private WebElement seleniumtraining;
	
	//address of addtocartdrop
	@FindBy(xpath="//div[@id='cartArea']")
	private WebElement carttab;
	
	//address of facebook icon
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;
	
	//initialization
	public skillarydemoapptesting(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}

	
	
	//utization
	public WebElement getSeleniumtraing() {
		return seleniumtraining;
	}

	public WebElement getCarttab() {
		return carttab;
	}

	public void facebook() {
		facebookicon.click();
	}
	
}
