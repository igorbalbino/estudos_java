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

<<<<<<< HEAD
        System.out.println("TA DANDO PAAAAAAAAAU");
//        driver.navigate().to(url);
        driver.get(url);
=======
        //driver.get(url);
		driver.navigate().to(url);
>>>>>>> 5fd845c304d5efd591d985b3933469c67cc7c978
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
