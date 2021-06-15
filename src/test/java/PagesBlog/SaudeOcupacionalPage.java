package PagesBlog;

import Suporte.Data;
import Suporte.Screenshot;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SaudeOcupacionalPage {

    private WebDriver navegador;

    public SaudeOcupacionalPage(WebDriver navegador)
    {
        this.navegador = navegador;
    }

    public SaudeOcupacionalPage verificarTexto(String resultadoPesquisa)
    {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Screenshot.ScreenShot(navegador, "F:\\Teste\\Screenshot\\BlogPage\\BlogPage"+ methodName+  Data.data()+".png");
        WebElement texto = navegador.findElement(By.xpath("/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section/div/div/div/div/div/div[2]/div/h2"));

        String resultado = texto.getText();
        Assert.assertEquals(resultadoPesquisa, resultado);
        return this;
    }

    public PortalSOCPage verificarAcessoPortalClick()
    {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Screenshot.ScreenShot(navegador, "F:\\Teste\\Screenshot\\BlogPage\\BlogPage"+ methodName+ Data.data()+ ".png");
        navegador.findElement(By.linkText("Acesse o portal")).click();
        return new PortalSOCPage(navegador);
    }



}
