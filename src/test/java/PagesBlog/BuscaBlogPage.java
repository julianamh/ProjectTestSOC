package PagesBlog;

import Suporte.Data;
import Suporte.Screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaBlogPage {

    private WebDriver navegador;

    public BuscaBlogPage(WebDriver navegador)
    {
        this.navegador = navegador;
    }

    public BuscaBlogPage aceitarCookiesClick()
    {
        navegador.findElement(By.linkText("Aceitar cookies")).click();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Screenshot.ScreenShot(navegador, "F:\\Teste\\Screenshot\\BlogPage\\BlogPage"+ methodName+ Data.data() +".png");
        return this;
    }

    public BuscaBlogPage searchType(String busca)
    {
        navegador.findElement(By.xpath("/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/form/div/input")).sendKeys(busca);
        return this;
    }

    public BuscaBlogPage botaoClick()
    {
        navegador.findElement(By.className("elementor-search-form__submit")).click();
        return this;
    }

    public SaudeOcupacionalPage pesquisaClick()
    {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Screenshot.ScreenShot(navegador, "F:\\Teste\\Screenshot\\BlogPage\\BlogPage"+ methodName+  Data.data()+".png");
        navegador.findElement(By.className("elementor-post__read-more")).click();
        return new SaudeOcupacionalPage(navegador);
    }
}
