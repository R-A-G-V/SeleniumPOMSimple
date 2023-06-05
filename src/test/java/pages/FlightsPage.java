package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightsPage {
    private WebDriver driver;
    private By radioOne=By.name("tripType");
    private By SpassCount=By.name("passCount");
    private By DepartingFrom=By.name("fromPort");
    private By On= By.name("fromMonth");
    private By ArrivingIn= By.name("toPort");
    private By Returning= By.name("toMonth");
    private By Returning2=By.name("toDay");
    private By Airline=By.name("Airline");
    private By btnsiguiente= By.name("findFlights");

    Select passengers= new Select(driver.findElement(SpassCount));

    public FlightsPage(WebDriver driver) {
        this.driver=driver;
    }

}
