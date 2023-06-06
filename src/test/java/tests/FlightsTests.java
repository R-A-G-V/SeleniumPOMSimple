package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FlightsPage;
import pages.HomeFlightsPage;

public class FlightsTests extends BaseTests {
    @Test(priority = 4, description = "Completar campos requeridos")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Seleccionar las listas y completar los campos")
    @Step("Completado correctamente")
    public void TestFlights() throws InterruptedException {
        FlightsPage flightsPage= basePage.clickFlightsPage();
        flightsPage.clickTypeOneWay();
        flightsPage.selectDropdownList_Passagers();
        flightsPage.selectDropdownList_departament();
        flightsPage.selectDropdownList_On();
        flightsPage.selectDropdownList_On2();
        flightsPage.clickServiceClass_Firtsclass();
        flightsPage.selectDroptownList_airline();
        HomeFlightsPage homeFlightsPage=flightsPage.clickHomeFlightsPage();
        Assert.assertEquals("After flight finder - No Seats Avaialble  ",homeFlightsPage.mensajeExitosoFlights());
    }
}
