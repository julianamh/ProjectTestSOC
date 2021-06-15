package Suporte;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Web {

    private WebDriver driver;

    public static WebDriver Chrome()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32_\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.soc.com.br/blog/");
        navegador.manage().window().maximize();
        return navegador;
    }

}


