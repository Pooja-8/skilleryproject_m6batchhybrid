package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillarydemologinpage {
// declaration
	// addressof course
	@FindBy(id="course")
	private WebElement coursetab;
	
	//address of selenium traing
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumTraining;
	
	//adddress of dropdown
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	//initialization
		public skillarydemologinpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
		
	//utilization
		public WebElement getCoursetab() {
			return coursetab;
		}
		
		public void seleniumtraingtab() {
			seleniumTraining.click();
		}
		
		public WebElement getcoursedd() {
			return coursedd;
		}
		
}
