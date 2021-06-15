package PagesCredenciado;

//import io.cucumber.java.en.*;
import PageObjects.CmnPageObjects;
import PageObjects.RedePageObjects;
import org.openqa.selenium.WebDriver;

public class SOCPage {

    WebDriver navegador;
    RedePageObjects redePageObjects;
    CmnPageObjects cmnPageObjects;

    public SOCPage(WebDriver navegador)
    {
        this.navegador = navegador;
        cmnPageObjects = new CmnPageObjects(navegador);
    }


    //@Given("^O clique do botão para aceitar os cookies na página inicial$")
    public SOCPage aceitarCookiesClick()
    {
        cmnPageObjects.aceitarCookiesClickPO();
        return this;
    }

    //@When("^está na página de SOC$")
    public SOCPage SOCclick() throws Throwable
    {
        cmnPageObjects.SOCclick();
        return this;
    }

    //@Then("^Será clicado no SOCNET para ir à página de Rede Credenciada$")
    public SOCPage socNetClick()
    {
        cmnPageObjects.socNetClickPO();

        return this;
    }

    //@And("^O clique do botão em buscar credenciados$")
    public RedeCredenciada buscarCredenciadoClick()
    {
        redePageObjects = cmnPageObjects.buscarCredenciadoClickPO();


        return new RedeCredenciada(redePageObjects);
    }
}
