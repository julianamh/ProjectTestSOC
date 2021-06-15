package PagesCredenciado;

import PageObjects.RedePageObjects;
import Suporte.Web;
//import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.*;
import stepDefinition.BaseUtil;


public class RedeCredenciada {

    private WebDriver navegador = null;

    private BaseUtil base;

    private String urlCurrent;

    Web web;

    RedePageObjects redePageObjects;

    public RedeCredenciada (RedePageObjects redePageObjects)
    {
        this.redePageObjects = redePageObjects;
    }

    public RedeCredenciada(BaseUtil base, WebDriver navegador)
    {
        base = new BaseUtil();
        this.navegador = navegador;
    }

    //@Given("^o mostrar todas as conveniências$")
    public RedeCredenciada mostrarConvenienciasClick()
    {
        redePageObjects.mostrarConvenienciasClickPO();
        return this;
    }

   // @When("^todos os filtros de conveniências forem aplicados$")
    public RedeCredenciada filtroConvenienciasClick()
    {
        redePageObjects.filtroConvenienciasClickPO();
        return  this;
    }

    //@Then("^todos os serviços serão mostrados com as conveniências$")
    public RedeCredenciada mostrarServicosClick()
    {
        redePageObjects.mostrarServicosClickPO();
        return this;
    }

    //@Given("^Os filtros aplicados de serviços$")
    public RedeCredenciada filtroServicosClick()
    {
        redePageObjects.filtroServicosClickPO();
        return this;
    }

    //@When("^Inserido o CEP$")
    public RedeCredenciada CEPType()
    {
        redePageObjects.CEPTypePO();
        return this;
    }


    public RedeCredenciada pesquisarClick()
    {
        redePageObjects.pesquisarClickPO();
        return this;
    }

    //@Then("^clicado em saiba mais será mostrado o credenciado$")
    public RedeCredenciada saibaMaisClick()
    {
        redePageObjects.saibaMaisClickPO();

        return this;
    }
}
