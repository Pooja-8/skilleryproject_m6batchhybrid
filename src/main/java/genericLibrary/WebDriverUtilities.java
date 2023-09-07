package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

		//1. handling dropdown
	public void dropDown(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	//2. handling mousehover
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a =new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//3.handling doubleclick
	public void doubleclick(WebDriver driver, WebElement ele) {
		Actions a =new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	//4. handling rightclick
	public void rightclick(WebDriver driver, WebElement ele) {
		Actions a =new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	//5. handling drag and drop
	public void dragdrop(WebDriver driver, WebElement src, WebElement target) {
		Actions a =new Actions(driver);
		a.dragAndDrop(src,target).build().perform();
	}
	
	//6. shifting control to frame
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
		
	}
	
	//7. switching control to normal webpage
	public void switchbackframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	//8. shifting control to pop up
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	//9. shifting control to child window
	public void switchingtabs(WebDriver driver) {
		Set<String> child= driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}
		
	// 10. handling scroll bar
		public void scrollBar(WebDriver driver,int x,int y) {
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("windows.scrollBy("+x+","+y+")");
		}
	
}
