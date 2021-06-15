package extentReport;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportTest {

    public WebDriver navegador;

    public ExtentHtmlReporter htmlReporter;
    public ExtentReports extentReports;
    public ExtentTest extentTest;

    @BeforeTest
    public void setExtent()
    {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/Report/Report.html");
        htmlReporter.config().setDocumentTitle("Relatório de Automação");
        htmlReporter.config().setReportName("Relatório SOC");
        htmlReporter.config().setTheme(Theme.DARK);

        extentReports = new ExtentReports();
        extentReports.attachReporter( htmlReporter);
        extentReports.setSystemInfo("Hostname","LocalHost");
        extentReports.setSystemInfo("OS", "Windows10");
        extentReports.setSystemInfo("Tester","SOC teste");
        extentReports.setSystemInfo("Browser", "Chrome");

    }

    @AfterTest
    public void endReport()
    {
        extentReports.flush();
    }

    @BeforeMethod
    public void SetUp()
    {
        extentTest = extentReports.createTest("Teste Blog");

    }


    public void tearDown(ITestResult result) throws IOException {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            extentTest.log(Status.FAIL, "O teste que falhou é" + result.getName());
            extentTest.log(Status.FAIL,"O teste falhou porque" +  result.getThrowable());

            String screenshotPath = ReportTest.getScreenshot(navegador,result.getName());
            extentTest.addScreenCaptureFromPath(screenshotPath);

        }
        else if(result.getStatus() == ITestResult.SKIP)
        {
            extentTest.log(Status.SKIP, "O teste que pulou foi" + result.getName());
        }
        else if(result.getStatus() == ITestResult.SUCCESS)
        {
            extentTest.log(Status.PASS, "O teste que passou foi" + result.getName());
        }
    }

    public static String getScreenshot(WebDriver driver, String sreenchoName) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String destination = System.getProperty("user.dir") + "/Screenshots/" +sreenchoName+ dateName+".png";
        File finaldestination = new File(destination);
        FileUtils.copyFile(source, finaldestination);
        return  destination;


    }
}
