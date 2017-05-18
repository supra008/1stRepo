package testPackg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.*;

public class initiateDriver {
	
	public static void setupDriver() throws FileNotFoundException, IOException{
		
     System.setProperty("webdriver.chrome.driver", "D:\\Practice\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		ArrayList<String> url = excelReaddata.excelRead(0);
		
		for(int i=0;i<=url.size();i++)
		{
			driver.get(url.get(i));
			System.out.println("URL - " + url);
		}
		
		driver.close();
	}
	
	

}
