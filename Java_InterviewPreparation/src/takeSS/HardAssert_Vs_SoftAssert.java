package takeSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert_Vs_SoftAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}
	
	@Test
	public void sofAsrt() {
		System.setProperty("webdriver.edge.driver", "F:\\Libraries/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals("googl", driver.getTitle());
		
		softassert.assertAll();
	}

}
