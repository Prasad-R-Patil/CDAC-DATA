package collections;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		Properties winProps = new Properties();
		//Load the data from window.properties into the Properties object: winProps
		String filePath = "./src/resources/window.properties";
		try(FileInputStream fin = new FileInputStream(filePath)){
			winProps.load(fin);
			//After the above statement's execution, all the information from the file is loaded into
			//Properties object: winProps
			Enumeration propertyNames = winProps.propertyNames();
			while(propertyNames.hasMoreElements()) {
				Object obj = propertyNames.nextElement();
				String propertyName = (String)obj;
				String propertyValue = winProps.getProperty(propertyName);
				System.out.println(propertyName + " -------> " + propertyValue);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
