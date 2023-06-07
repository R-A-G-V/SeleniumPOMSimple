package tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeRegisterPage;
import pages.RegisterPage;

public class RegisterTest extends BaseTests {

    @Test(priority = 1, description = "Registro de usuario")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Crear un usuario con pass y user")
    @Story("prueba 3")
    @TmsLink("SKTH-2609")
    @Owner("Rodrigo Gomez")
    public void registerExitoso() {
        RegisterPage register = basePage.clickbtnregistro();
        register.userInformation("hola", "hola", "hola");
        HomeRegisterPage homeregister = register.clickRegisterbtn();
        Assert.assertEquals("Thank you for registering. You may now sign-in using the user name and password you've just entered.", homeregister.registrationSuccessful());
    }

}
