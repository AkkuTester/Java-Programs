package takeSS;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TakeSS {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver", "F:\\Libraries/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src =	ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".//ss/demo.png");
		
		// FileUtils.copyFile(src, dest);
		
		
		
	}

}
