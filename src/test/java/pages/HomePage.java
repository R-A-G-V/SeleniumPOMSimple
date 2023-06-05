package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    public RegisterPage clickbtnregistro(){
    clickLink("REGISTER");
    return new RegisterPage(driver);
    }
    public LoginPage clickInicio(){
        clickLink("Home");
        return new LoginPage(driver);
    }
    public FlightsPage clickFlightsPage(){
        clickLink("Flights");
        return new FlightsPage(driver);
    }
}
