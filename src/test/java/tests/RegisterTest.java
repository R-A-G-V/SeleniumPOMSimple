package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeRegisterPage;
import pages.RegisterPage;

public class RegisterTest extends BaseTests {

    @Test(priority = 1, description = "Registro de usuario")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Crear un usuario con pass y user")
    @Step("Registro de usuario")
    public void registerExitoso() {
        RegisterPage register = basePage.clickbtnregistro();
        register.userInformation("hola", "hola", "hola");
        HomeRegisterPage homeregister = register.clickRegisterbtn();
        Assert.assertEquals("Thank you for registering. You may now sign-in using the user name and password you've just entered.", homeregister.registrationSuccessful());
    }

}
