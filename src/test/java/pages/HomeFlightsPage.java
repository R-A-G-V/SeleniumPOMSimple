package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeFlightsPage {
    private WebDriver driver;
    private By txtMensajeExitosoFlights= By.xpath("//font[@size='4'][contains(.,'After flight finder - No Seats Avaialble')]");
    public HomeFlightsPage(WebDriver driver) {
    this.driver=driver;
    }
    public String mensajeExitosoFlights(){
        return driver.findElement(txtMensajeExitosoFlights).getText();
    }

}
