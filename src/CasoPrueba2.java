import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CasoPrueba2 {

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


            //Cambio el idioma de la web page
            WebElement btnCambiarIdioma = driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]"));
            waitVar.until(ExpectedConditions.elementToBeClickable(btnCambiarIdioma));
            btnCambiarIdioma.click();
            WebElement btnIdioma = driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[1]/div/label/i"));
            waitVar.until(ExpectedConditions.elementToBeClickable(btnIdioma));
            btnIdioma.click();
            driver.findElement(By.xpath("//*[@id=\"icp-btn-save\"]/span/input")).click();


            //Selecciono el departamento Electronics
            driver.findElement(By.id("searchDropdownBox")).click();
            WebElement btnDepartamento = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[9]"));
            waitVar.until(ExpectedConditions.elementToBeClickable(btnDepartamento));
            btnDepartamento.click();


            //Busco el producto SanDisk 128GB Ultra microSDXC UHS-I Memory Card with Adapter, y lo selecciono
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("micro sd card");
            driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

            WebElement btnMarca = driver.findElement(By.xpath("//*[@id=\"p_89/SanDisk\"]/span/a/div/label/i"));
            waitVar.until(ExpectedConditions.elementToBeClickable(btnMarca));
            btnMarca.click();

            WebElement btnPrecio = driver.findElement(By.xpath("//*[@id=\"p_36/1253503011\"]/span/a/span"));
            waitVar.until(ExpectedConditions.elementToBeClickable(btnPrecio));
            btnPrecio.click();

            WebElement producto = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
            waitVar.until(ExpectedConditions.elementToBeClickable(producto));
            producto.click();


            //Añado el producto al carrito de compras
            WebElement btnAddToCart = driver.findElement(By.id("add-to-cart-button"));
            waitVar.until(ExpectedConditions.elementToBeClickable(btnAddToCart));
            btnAddToCart.click();


            //Valido que el producto se añadió al carrito
            WebElement validacion = driver.findElement(By.xpath("//*[@id=\"attachDisplayAddBaseAlert\"]/div/h4"));
            WebElement resultadoEsperado = driver.findElement(By.xpath("//*[@id=\"attachDisplayAddBaseAlert\"]/div/h4"));
            if(validacion.equals(resultadoEsperado)){
                System.out.println("\nPrueba Pasada");
            } else{
                System.out.println("\nPrueba Fallida");
            }
            
        }

        catch (WebDriverException we){
            System.err.println("\nEl WebDriver falló: " + we.getMessage());
            we.printStackTrace();
        }

        catch (Exception ex){
            System.err.println("\nHubo un fallo en el programa: " + ex.getMessage());
            ex.printStackTrace();
        }
        finally {
            driver.quit();
        }






    }
}
