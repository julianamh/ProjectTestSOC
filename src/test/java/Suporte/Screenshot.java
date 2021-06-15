package Suporte;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.apache.commons.io.FileUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Screenshot {

    public static void ScreenShot(WebDriver navegador, String arquivo)
    {
        File screenshot = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);

        try
        {
            FileUtils.copyFile(screenshot, new File(arquivo));
        }
        catch (Exception e)
        {
            System.out.println("Houve um problema ao copiar o arquivo para pasta" + e.getMessage()  );
        }
    }
}


