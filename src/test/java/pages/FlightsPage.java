package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightsPage {
    private WebDriver driver;
    private By radioOne=By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]");
    private By ServiceClass= By.xpath("//input[contains(@value,'First')]");
    private By btnsiguiente= By.name("findFlights");
    private By spassagers= By.name("passCount");
    private By sdepartament= By.name("fromPort");
    private By sOn= By.name("fromMonth");
    private By sOn2= By.name("fromDay");
    private By sairline= By.name("airline");


    public FlightsPage(WebDriver driver) {
        this.driver=driver;
    }
    //Flight Details
    //click en Type= one way
    public void clickTypeOneWay() throws InterruptedException {
        driver.findElement(radioOne).click();
        Thread.sleep(2000);
    }
    //Preferences
    //Selecciona Service Class= Firts class
    public void clickServiceClass_Firtsclass() throws InterruptedException {
        driver.findElement(ServiceClass).click();
        Thread.sleep(2000);
    }
    //selecciona pasajero
    public void selectDropdownList_Passagers() throws InterruptedException {
        WebElement myElement= driver.findElement(spassagers);
        Select passCoun= new Select(myElement);
        passCoun.selectByVisibleText("2 ");
        Thread.sleep(2000);
    }
    //selecciona departamento
    public void selectDropdownList_departament() throws InterruptedException {
        WebElement myElement2= driver.findElement(sdepartament);
        Select fromP = new Select(myElement2);
        fromP.selectByVisibleText("London ");
        Thread.sleep(2000);
    }
    //selecciona On1
    public void selectDropdownList_On() throws InterruptedException {
        WebElement myElement3= driver.findElement(sOn);
        Select sson= new Select(myElement3);
        sson.selectByVisibleText("December ");
        Thread.sleep(1000);
    }
    //selecciona On2
    public void selectDropdownList_On2() throws InterruptedException {
        WebElement myElement4= driver.findElement(sOn2);
        Select sson1= new Select(myElement4);
        sson1.selectByValue("12");
        Thread.sleep(1000);
    }
    public void selectDroptownList_airline() throws InterruptedException {
        WebElement myElement5= driver.findElement(sairline);
        Select sson2= new Select(myElement5);
        sson2.selectByVisibleText("Blue Skies Airlines");
        Thread.sleep(1000);
    }
    public HomeFlightsPage clickHomeFlightsPage(){
        driver.findElement(btnsiguiente).click();
        return new HomeFlightsPage(driver);
    }

}
