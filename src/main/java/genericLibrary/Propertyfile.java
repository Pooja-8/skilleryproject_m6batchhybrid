package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propertyfile {
	public String getPropertydata(String key) throws IOException
	{
		
		FileInputStream fis= new FileInputStream(IPathConstant.propertyfilepath);
		Properties p= new Properties();
		p.load(fis);
		return p.getProperty(key);
	}

}
