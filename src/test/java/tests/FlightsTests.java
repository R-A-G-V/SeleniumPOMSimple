package tests;

import org.testng.annotations.Test;
import pages.FlightsPage;
import pages.LoginPage;

public class FlightsTests extends Base {
    @Test
    public void TestFlights() throws InterruptedException {
        FlightsPage flightsPage=homePage.clickFlightsPage();
        flightsPage.clickTypeOneWay();
        flightsPage.clickServiceClass_Firtsclass();
        flightsPage.selectDropdownList_Passagers();
        flightsPage.clickHomeFlightsPage();
    }
}
