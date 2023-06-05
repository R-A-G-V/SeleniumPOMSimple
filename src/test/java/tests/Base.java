package tests;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.io.File;
import java.io.IOException;

public class Base {
    private WebDriver driver;
    String PATH_DRIVER="C:\\Users\\rodrigo.gomez\\Documents\\Testingqa\\SeleniumPOMSimple\\src\\test\\resources\\driver\\chromedriver.exe";
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",PATH_DRIVER);
        driver=new ChromeDriver();
        goHome();
        homePage= new HomePage(driver);
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    @AfterClass
    public void takeScreenshot(){
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);

        try{
            Files.move(screenshot,
                    new File("C:\\Users\\rodrigo.gomez\\Documents\\Testingqa\\SeleniumPOMSimple\\src\\test\\resources\\screanshot\\test.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
