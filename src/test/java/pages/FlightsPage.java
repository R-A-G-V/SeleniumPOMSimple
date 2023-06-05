package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class FlightsPage {
    private WebDriver driver;
    private By radioOne=By.xpath("//input[contains(@value,'oneway')]");
    private By ServiceClass= By.xpath("//input[contains(@value,'First')]");
    private By btnsiguiente= By.name("findFlights");
    private By dropdowList_passa= By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select/option[3]");

    public FlightsPage(WebDriver driver) {
        this.driver=driver;
    }
    //Flight Details
    //click en Type= one way
    public void clickTypeOneWay() throws InterruptedException {
        driver.findElement(radioOne).click();
        Thread.sleep(3000);
    }
    //Preferences
    //Selecciona Service Class= Firts class
    public void clickServiceClass_Firtsclass() throws InterruptedException {
        driver.findElement(ServiceClass).click();
        Thread.sleep(3000);
    }
    //selecciona pasajero
    public void selectDropdownList_Passagers() throws InterruptedException {
        driver.findElement(dropdowList_passa).click();
        Thread.sleep(3000);
    }

    public void clickHomeFlightsPage(){
        driver.findElement(btnsiguiente).click();
    }

}
