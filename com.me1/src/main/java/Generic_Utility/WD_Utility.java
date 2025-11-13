package Generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WD_Utility {
	public String ddt_Note(String data) throws IOException {
		FileInputStream fis = new FileInputStream("./Demo.properties");
		Properties p = new Properties();
		p.load(fis);
		String Data = p.getProperty(data);
		return Data;

	}
}
