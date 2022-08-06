package br.com.igor.Scraper.mavenproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.List;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.opencsv.CSVWriter;

public class Scraper {
	
	private String driverPath = "C:\\Users\\igorb\\Documents\\GitHub\\estudos_java\\Scraper\\mavenproject\\libs\\drivers\\chromedriver_103_0_5060_53.exe";
	private String csvFilePath = "";
	private static BufferedReader reader;
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scraper.initInputReader();
        new Scraper();
    }
	
	public Scraper() {
		WebClient webClient = new WebClient(BrowserVersion.CHROME);
		try {
			HtmlPage page = webClient.getPage("https://www.fundamentus.com.br/resultado.php");
			System.out.println("get by id result: \n");
			System.out.println(page.getElementsById("resultado"));
			
			System.out.println("get by id result: \n");
			System.out.println(page.getElementsById("resultado"));
			
			webClient.getCurrentWindow().getJobManager().removeAllJobs();
			webClient.close();
		} catch (IOException e) {
			System.out.println("An error occurred: " + e);
		}
	}
	
	private static void initInputReader() {
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void callReadLine() {
		try {
			reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}