package stepDefinition;
import PagesCredenciado.RedeCredenciada;
import PagesCredenciado.SOCPage;
import PagesBlog.BuscaBlogPage;
import Suporte.Web;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;
import com.aventstack.extentreports.reporter.configuration.Theme;
import extentReport.ReportTest;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/*@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/Features/buscar.feature",
        glue={"stepDefinition"})

*/

public class BuscaInicial {

    private WebDriver navegador;
    ReportTest teste = new ReportTest();
    public ExtentTest extentTest;
    public ExtentReports extentReports;
    public ExtentHtmlReporter htmlReporter;
    Web web;
    private ITestResult result;

    @After
    public void setExtent()
    {
        teste.setExtent();
    }

    @AfterMethod
    public void report()
    {
        teste.SetUp();

    }

    @Before
    public void setUp()
    {

        this.navegador = Web.Chrome();
    }


     @Test
     public void BuscaNoBlog()
     {
       // extentTest = extentReports.createTest("BuscaBlog");
         navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            new BuscaBlogPage(navegador).aceitarCookiesClick().searchType("Saúde Ocupacional").botaoClick().pesquisaClick().verificarTexto("Saúde Ocupacional")
                .verificarAcessoPortalClick().vericarTexto("SEGURANÇA DO TRABALHO").saibaMaisClick().aceitarCookies();
    }

    @Test
    public void busca_credenciado() throws Throwable {

        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new SOCPage(navegador).aceitarCookiesClick().SOCclick().socNetClick().buscarCredenciadoClick()
                .mostrarConvenienciasClick()
                .filtroConvenienciasClick()
                .mostrarServicosClick()
                .filtroServicosClick()
                .CEPType()
                .pesquisarClick()
                .saibaMaisClick();
    }

    @After
    public void Fechar()
    {
        //navegador.quit();
    }

    @AfterMethod(alwaysRun = true)
    public void endReport()
    {
        teste.endReport();
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) throws IOException {
        teste.tearDown(result);
    }
}
