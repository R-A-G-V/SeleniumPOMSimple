package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeRegisterPage;
import pages.RegisterPage;

public class RegisterTest extends Base{

    @Test
    public void registerExitoso() {
        RegisterPage register = homePage.clickbtnregistro();
        register.userInformation("hola", "hola", "hola");
        HomeRegisterPage homeregister = register.clickRegisterbtn();
        Assert.assertEquals("Thank you for registering. You may now sign-in using the user name and password you've just entered.", homeregister.registrationSuccessful());
    }

}
