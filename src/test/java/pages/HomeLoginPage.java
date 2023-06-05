package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeLoginPage {
    //variables
    private WebDriver driver;
    private By txtMensajeExito = By.xpath("//h3[contains(.,'Login Successfully')]");

    //contructor
    public HomeLoginPage(WebDriver driver){
        this.driver=driver;
    }
    //metodo
    public String getMensajeExito(){
        return driver.findElement(txtMensajeExito).getText();
    }
}
