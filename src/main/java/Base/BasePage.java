package Base;

import Pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BasePage {

    public WebDriver driver;
    public Login loginPage;

    @BeforeMethod
    public void setup(){

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\sebas\\Documents\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://twitter.com/i/flow/login");
        loginPage = new Login();

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
