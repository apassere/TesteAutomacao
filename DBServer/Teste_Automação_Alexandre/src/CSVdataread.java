import java.io.FileReader;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVReader;

public class CSVdataread {

	
	WebDriver driver;
	String url = "http://automationpractice.com";
	String CSV_file = "C:\\Iterasys\\FTS117\\massa\\massa.csv";
	
	@BeforeClass
	public void AbrirNavegador(){
		System.setProperty("webdriver.chrome.driver","C:\\Iterasys\\FTS117\\drivers\\Chrome\\v2.44\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void verify_Search() {
		driver.get(url);
		
		CSVReader reader = null;
		
		try {
			reader = new CSVReader(new FileReader(CSV_file));
			String[] cell;
			
			while((cell=reader.readNext())!=null) {
				
				String keyword = cell[0];
				
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
