package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocartpage {
	//declaration
	//address of + icon
	@FindBy(id= "add")
	private WebElement addbtn;

	//adddress of addtocart button
	@FindBy(xpath= "//button[text()=' Add to Cart']")
	private WebElement cartbtn;

	
	//initialization
	public addtocartpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	//utization
	public WebElement getAddbtn() {
		return addbtn;
	}
	
	public void carttocartbtn() {
		cartbtn.click();
	}
	
	
}
