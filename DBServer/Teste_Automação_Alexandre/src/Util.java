import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Util {
	

	public static String nomePasta;
	private String primeiraExecucao;
	
	
	// Método para capturar e organizar evidências
	public void Print(WebDriver fdriver, String nomeArquivo) throws IOException {
		
		if(this.primeiraExecucao == "S") {
			nomePasta = "C:\\Users\\corre\\fts109-workspace\\prints\\" +
	           new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance().getTime()).toString();
			
		}    
		
		
		File foto =((TakesScreenshot)fdriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(foto, new File(nomePasta + "\\" + "Chrome" + "\\" + nomeArquivo + ".png"));

		
		
	}
	
}