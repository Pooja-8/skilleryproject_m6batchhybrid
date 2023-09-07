package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillaryloginpage {
	//declaration
	//address of gears
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	
	//address of skillarydemoapp
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillarydemoapp;
	
	//address of searchtxtfiled
	@FindBy(xpath= "//input[@name='q']")
	private WebElement searchtb;
	
	//address of searchicon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	//initialization
	public Skillaryloginpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void gearbutton() {
		gearbtn.click();
	}
	
	public void skillarydemoapplication() {
		skillarydemoapp.click();
	}
	
	public void searchtab(String name) {
		searchtb.sendKeys(name);
	}
	
	public void gobutton() {
		searchbtn.click();
	}
}
