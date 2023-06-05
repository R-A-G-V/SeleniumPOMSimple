package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeLoginPage;
import pages.LoginPage;

public class LoginTest extends Base{

    @org.testng.annotations.Test
    public void TestLoginExitoso(){
        LoginPage loginPage = homePage.clickInicio();
        loginPage.iniciarSesion("test","test");
        //verificacion
        HomeLoginPage homeLoginPage=loginPage.clickhomeloginpage();
        Assert.assertEquals("Login Successfully", homeLoginPage.getMensajeExito());
    }

    @Test
    public void TestLoginFallido(){
        LoginPage loginPage = homePage.clickInicio();
        loginPage.iniciarSesion("tesqt","test");
        //verificacion
        Assert.assertEquals("Enter your userName and password correct",loginPage.getMensajeError());
    }

}
