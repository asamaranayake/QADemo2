import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class QADemoUITest {

    WebDriver driver;
    @BeforeClass
    public void setup(){
        System.out.println("Before Class >>>>>>");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://faoschwarz.com/");

    }

    @Test
    public void testOne(){
        WebElement searchButtonElement = driver.findElement(By.xpath("//a//*[name()='svg' and @class=\"icon icon-search\"]"));
        searchButtonElement.click();
        WebElement searchInputElement =  driver.findElement(By.name("q"));
        searchInputElement.sendKeys("car");

    }

    @AfterClass
    public void tearDown(){
        //driver.quit();
    }






}
