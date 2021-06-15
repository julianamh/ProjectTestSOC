package PageObjects;

import Suporte.Data;
import Suporte.Screenshot;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CmnPageObjects {

    WebDriver navegador;

    public CmnPageObjects(WebDriver navegador)
    {
        this.navegador = navegador;
    }

    public void aceitarCookiesClickPO()
    {
        navegador.findElement(By.linkText("Aceitar cookies")).click();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Screenshot.ScreenShot(navegador, "F:\\Teste\\Screenshot\\SOCPage\\SOCPage"+ methodName+ Data.data()+ ".png");
    }

    public void SOCclick()
    {
        navegador.findElement(By.xpath("/html/body/div[1]/div/header[1]/div/div/div/div/div/section[2]/div/div/div/div/div/div[1]/div/div/a")).click();

    }

    public void socNetClickPO()
    {
        navegador.findElement(By.xpath("//strong[text()=\"SOC\"]/following::a")).click();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Screenshot.ScreenShot(navegador, "F:\\Teste\\Screenshot\\SOCPage\\SOCPage"+ methodName+ Data.data()+ ".png");
    }

    public RedePageObjects buscarCredenciadoClickPO()
    {
        navegador.findElement(By.linkText("Buscar credenciados")).click();
        return new RedePageObjects(navegador);
    }

}
