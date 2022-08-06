package br.com.igor.Scraper;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scraper {
	private WebDriver driver = null;
	private String caminhoWebDriver = "..\\libs\\drivers\\chromedriver.exe";
//	private String caminhoWebDriver = "..\\libs\\drivers\\geckodriver.exe";
	
	public Scraper() {
		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", caminhoWebDriver);
		
		driver = new ChromeDriver();
//		driver.navigate().to("https://www.fundamentus.com.br/index.php");
//		driver.manage().window().maximize();
	}
}
