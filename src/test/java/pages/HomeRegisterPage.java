package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class HomeRegisterPage {
    private WebDriver driver;
    private By txtsmsexitoso= By.xpath("(//font[contains(@face,'Arial, Helvetica, sans-serif')])[3]");

    public HomeRegisterPage(WebDriver driver){
        this.driver=driver;
    }
    public String registrationSuccessful(){
        return driver.findElement(txtsmsexitoso).getText();
    }
}
