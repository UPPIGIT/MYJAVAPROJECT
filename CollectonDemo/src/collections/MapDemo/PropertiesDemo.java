package collections.MapDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p = new Properties();
		
		File f= new File("C:\\git\\MYJAVAPROJECT\\CollectonDemo\\src\\collections\\MapDemo\\abc.properties");
		
		System.out.println(f.exists());
		
		FileInputStream fis = new FileInputStream(f);

		p.load(fis);
		
		System.out.println(p);
		
		String s=p.getProperty("userName");
		System.out.println(s);
		
		p.setProperty("userName", "Rishi");
		
		System.out.println(p);
		
		p.setProperty("7777", "pavan Kalyan");
		
		System.out.println(p);
		
		FileOutputStream fos = new FileOutputStream(f);
		
		p.store(fos, "updated");
		
	}

}
