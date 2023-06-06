package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeLoginPage;
import pages.LoginPage;

public class LoginTest extends BaseTests {


    @Test(priority = 2, description = "Ingresar con usuario correcto")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Ingresar al sistema con el usuario recien creado")
    @Step("Ingreso exitoso")
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
    public void TestLoginFallido(){
        LoginPage loginPage = basePage.clickInicio();
        loginPage.iniciarSesion("tesqt","test");
        //verificacion
        Assert.assertEquals("Enter your userName and password correct",loginPage.getMensajeError());
    }

}
