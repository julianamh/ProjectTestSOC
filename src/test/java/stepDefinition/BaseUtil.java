package stepDefinition;

import org.openqa.selenium.WebDriver;

public class BaseUtil {

   WebDriver driver;

   public BaseUtil(WebDriver driver)
   {
         this.driver = driver;
   }

   public BaseUtil()
   {

   }

   public WebDriver getNavegador()
   {
       return this.driver;
   }

   public void setNavegador(WebDriver navegador)
   {
       this.driver = navegador;
   }

}
