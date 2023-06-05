package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private WebDriver driver;
    //  Contact Information
    private By firts_namep= By.name("firstName");
    private By last_namep= By.xpath("//input[contains(@name,'lastName')]");
    private By phonep= By.name("phone");
    private By emailp= By.id("userName");
    //  Mailing Information
    private By Addressp= By.name("address1");
    private By cityp= By.xpath("address1");
    private By provinciap= By.name("state");
    private By postal_codep= By.name("postalCode");
    //Select countryp= new Select(driver.findElement(By.name("country")));
    //User Information
    private By user_name= By.id("email");
    private By password= By.name("password");
    private By confirm_password= By.name("confirmPassword");
    private By btn_enviar=By.name("submit");



    //Constructor
    public RegisterPage(WebDriver driver){
        this.driver=driver;
    }

    public void contactInformacion(String firts_name, String last_name, String phone, String email){
    driver.findElement(firts_namep).sendKeys(firts_name);
    driver.findElement(last_namep).sendKeys(last_name);
    driver.findElement(phonep).sendKeys(phone);
    driver.findElement(emailp).sendKeys(email);
    }

    public  void mailingInformation(String Address, String city, String provincia, String postal_code){
        driver.findElement(Addressp).sendKeys(Address);
        driver.findElement(cityp).sendKeys(city);
        driver.findElement(provinciap).sendKeys(provincia);
        driver.findElement(postal_codep).sendKeys(postal_code);
       // countryp.selectByVisibleText("BERMUDA");
    }

    public void userInformation(String name, String pass, String conf_pass){
        driver.findElement(user_name).sendKeys(name);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirm_password).sendKeys(conf_pass);
    }

    public HomeRegisterPage clickRegisterbtn(){
    driver.findElement(btn_enviar).click();
    return new HomeRegisterPage(driver);
    }
}
