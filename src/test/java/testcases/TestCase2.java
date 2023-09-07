package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pompages.skillarydemoapptesting;
import pompages.Skillaryloginpage;
import pompages.skillarydemologinpage;

public class TestCase2 extends BaseClass{
	@Test
	public void TC2() throws Throwable {
		Skillaryloginpage s= new Skillaryloginpage(driver);
		s.gearbutton();
		s.skillarydemoapplication();
		skillarydemologinpage sd= new skillarydemologinpage(driver);
		utilities.switchingtabs(driver);
		utilities.dropDown(sd.getcoursedd(), pdata.getPropertydata("coursedd"));
		skillarydemoapptesting tp=new skillarydemoapptesting(driver);
		utilities.dragdrop(driver, tp.getSeleniumtraing(), tp.getCarttab());
	}

}
