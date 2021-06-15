package PagesBlog;

import Suporte.Data;
import Suporte.Screenshot;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalSOCPage {

    private WebDriver navegador;

    public PortalSOCPage(WebDriver navegador)
    {
        this.navegador = navegador;
    }

    public PortalSOCPage vericarTexto(String verificar)
    {
        WebElement texto = navegador.findElement(By.id("n2-ss-9item1"));
        String resultado = texto.getText();
        Assert.assertEquals(verificar, resultado);
        return this;
    }

    public PortalSOCPage saibaMaisClick()
    {
        navegador.findElement(By.linkText("Saiba mais")).click();
        return this;
    }

    public PortalSOCPage aceitarCookies()
    {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Screenshot.ScreenShot(navegador, "F:\\Teste\\Screenshot\\BlogPage\\BlogPage"+ methodName+ Data.data()+ ".png");
        navegador.findElement(By.xpath("/html/body/div[3]/div/section[3]/div/div/div[2]/div/div/div/div/div/a")).click();
        return this;
    }
}
