package testcases;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pompages.Skillaryloginpage;
import pompages.skillarydemologinpage;
import pompages.addtocartpage;

public class TestCase1 extends BaseClass{
	@Test
	public void tc1() {
		Skillaryloginpage s= new Skillaryloginpage(driver);
		s.gearbutton();
		s.skillarydemoapplication();
		utilities.switchingtabs(driver);
		skillarydemologinpage sd= new skillarydemologinpage(driver);
		utilities.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtraingtab();
		addtocartpage d=new addtocartpage(driver);
		utilities.doubleclick(driver, d.getAddbtn());
		d.carttocartbtn();
		utilities.alertpopup(driver);
	}

}
