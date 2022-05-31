package Selenuim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class SeleniumImpl {
    private File currentDirFile = new File(".");
    private String myDir = currentDirFile.getAbsolutePath();
    private String driverDir = myDir+".\\drivers\\chromedriver.exe";

    public SeleniumImpl(String url){
        System.setProperty("webdriver.chrome.driver", driverDir);

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        pause(5000);
    }

    private void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (Exception e){
            System.out.println("ERRO:" + e);
        }
    }

    public static void main(String[] args){
        new SeleniumImpl("http://google.com");
    }
}
