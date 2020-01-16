import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CasoPrueba1 {

    static WebDriver driver;
    static String chromeDriver = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";

    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        String baseURL = "https://www.amazon.com/";

        try{
            //Abro el navegador Y entro a la URL
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(baseURL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebDriverWait waitVar = new WebDriverWait(driver, 10);
            
        }

        catch (WebDriverException we){
            System.err.println("\nEl WebDriver falló: " + we.getMessage());
            we.printStackTrace();
        }

        catch (Exception ex){
            System.err.println("\nHubo un fallo en el programa: " + ex.getMessage());
            ex.printStackTrace();
        }






    }
}
