package basicCalculatorTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AnotherWayBasicCalculatorAddTest {

    private WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void setupTest() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterClass
    public void afterClasss() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

    @Test
    public void testAdd1Plus1Equals2() throws InterruptedException {

        double expectedResult = 1;

        double actualResult = CalculatorTestUtility.getResults(driver,"0","1", "Add");
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test0Plus1() throws InterruptedException {

        double expectedResult = 1;

        double actualResult = CalculatorTestUtility.getResults(driver,"0","1", "Add");
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAddNegative1Plus1Equals0() throws InterruptedException {

        double expectedResult = 1;

        double actualResult = CalculatorTestUtility.getResults(driver,"0","1", "Add");
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAddNegative1PlusNegative1EqualsNegative2() throws InterruptedException {

        double expectedResult = 1;

        double actualResult = CalculatorTestUtility.getResults(driver,"0","1", "Add");
        Assert.assertEquals(actualResult, expectedResult);
    }



}
