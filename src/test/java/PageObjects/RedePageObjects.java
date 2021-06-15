package PageObjects;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import Suporte.Data;
import Suporte.Screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RedePageObjects {

    WebDriver navegador;

    public RedePageObjects(WebDriver navegador)
    {
        this.navegador = navegador;
    }


    public void mostrarConvenienciasClickPO()
    {

        WebElement conveniencias = new WebDriverWait(navegador, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Mostrar todas as conveniências\"]")));

        conveniencias.click();
    }


    public void filtroConvenienciasClickPO()
    {
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.findElement(By.xpath("//*[@id=\"div-filtro-conveniencias\"]/section/div[1]/label/span[2]")).click();
        navegador.findElement(By.xpath("//*[@id=\"div-filtro-conveniencias\"]/section/div[2]/label/span[2]")).click();
        navegador.findElement(By.xpath("//span[text()=\"Ar condicionado\"]")).click();
        navegador.findElement(By.xpath("//span[text()=\"Atendimento com hora marcada\"]")).click();

    }


    public void mostrarServicosClickPO()
    {
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.findElement(By.xpath("//*[@id=\"div-filtro-servicos\"]/span[3]")).click();

    }


    public void filtroServicosClickPO()
    {
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.findElement(By.xpath("//*[@id=\"div-filtro-servicos\"]/section/div[1]/label/span[2]")).click();
        navegador.findElement(By.xpath("//*[@id=\"div-filtro-servicos\"]/section/div[2]/label/span[2]")).click();
        navegador.findElement(By.xpath("//span[text()=\"Assessoria e consultoria\"]")).click();
        navegador.findElement(By.xpath("//span[text()=\"Exames médicos\"]")).click();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Screenshot.ScreenShot(navegador, "F:\\Teste\\Screenshot\\SOCPage\\SOCPage"+ methodName+ Data.data()+".png");

    }


    public void CEPTypePO()
    {
        navegador.findElement(By.id("ipt-busca-credenciado-2")).sendKeys("11390010");
    }


    public void pesquisarClickPO()
    {
        navegador.findElement(By.id("botao-buscar")).click();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Screenshot.ScreenShot(navegador, "F:\\Teste\\Screenshot\\SOCPage\\SOCPage"+ methodName+ Data.data()+ ".png");
    }


    public void saibaMaisClickPO()
    {
        navegador.findElement(By.xpath("//*[@id=\"conteudo-resultados\"]/div[1]/div/div/div/section/div[2]/p/span")).click();
        navegador.findElement(By.xpath("//*[@id=\"conteudo-resultados\"]/div[1]/div/div/div/section/div[2]/a/button")).click();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Screenshot.ScreenShot(navegador, "F:\\Teste\\Screenshot\\SOCPage\\SOCPage"+ methodName+ Data.data()+ ".png");

    }

}
