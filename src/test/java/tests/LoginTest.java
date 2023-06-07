package tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeLoginPage;
import pages.LoginPage;

public class LoginTest extends BaseTests {


    @Test(priority = 2, description = "Ingresar con usuario correcto")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Ingresar al sistema con el usuario recien creado")
    @Story("Login")
    @TmsLink("SKTH-2607")
    @Owner("Rodrigo Gomez")
    public void TestLoginExitoso(){
        LoginPage loginPage = basePage.clickInicio();
        loginPage.iniciarSesion("test","test");
        //verificacion
        HomeLoginPage homeLoginPage=loginPage.clickhomeloginpage();
        Assert.assertEquals("Login Successfully", homeLoginPage.getMensajeExito());
    }

    @Test(priority = 3, description = "Ingresar con usuario incorrecto")
    @Severity(SeverityLevel.CRITICAL)
    @Description("CNo debe de poder ingresar al sistema con el usuario incorrecto")
    @Step("No se pudo ingresar al sistema")
    @Story("Login fallido")
    @TmsLink("SKTH-2608")
    @Owner("Rodrigo Gomez")
    public void TestLoginFallido(){
        LoginPage loginPage = basePage.clickInicio();
        loginPage.iniciarSesion("tesqt","test");
        //verificacion
        Assert.assertEquals("Enter your userName and password correct",loginPage.getMensajeError());
    }

}
