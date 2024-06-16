
public class DownloadFileInCustomFolder {

	public static void main(String[] args) throws InterruptedException {
		
		String location = System.getProperty("user.dir") + "\\Screenshot";
		
		System.out.println(location);
		
		EdgeOptions options = new EdgeOptions();
		
//		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		prefs.put("download.default_directory", location);
		prefs.put("browser.download.folderList", 2);
		prefs.put("browser.download_dir", location);
		prefs.put("browser.download.useDownloadDir", true);
		prefs.put("plugins.always_open_pdf_externally", true); //
		
		prefs.put("pdfjs.disabled", true); //disable the built in pdf viewer
		
		prefs.put("browser.helperApps.neverAsk.saveToDisk", "application/pdf;text/plain;application/text;text/plain;application/xml");
		
		options.setExperimentalOption("prefs", prefs); 
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
			
	  WebDriver driver = new EdgeDriver(options);
			
		driver.manage().window().maximize();
			
		driver.get("https://filesamples.com/formats/csv");
		Thread.sleep(2000);
			
		Actions action = new Actions(driver);
		ction.scrollByAmount(0, 300).perform();
			
		driver.findElement(By.xpath("(//div[@class = 'output']//a)[1]" ) ).click();			
		System.out.println("File Downloaded Succesfully....");
//	driver.close();
			
			
		
		
	}

}
