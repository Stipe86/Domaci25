package basicCalculatorTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicCalculatorSubstractionTest {

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

  /*  @BeforeMethod
        public void clearFields() {
        WebElement firstNumbField = driver.findElement(By.id("number1Field"));
        WebElement secondNumbField = driver.findElement(By.id("number2Field"));
        firstNumbField.clear();
        secondNumbField.clear();
    }*/

    @AfterClass
    public void afterClasss() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

    @Test
    public void testSubstract1Minus1Equals0 () {

        double expectedResult = 0;


        WebElement firstNumbField = driver.findElement(By.id("number1Field"));

        firstNumbField.sendKeys("1");

        WebElement secondNumbField = driver.findElement(By.id("number2Field"));
        secondNumbField.sendKeys("1");

        WebElement selectOperation = driver.findElement((By.id("selectOperationDropdown")));
        selectOperation.click();

        Select select = new Select(selectOperation);
        select.selectByVisibleText("Subtract");


        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();

        WebElement result = driver.findElement(By.id("numberAnswerField"));
        double actualResult = Double.parseDouble((result.getAttribute("value")));
        Assert.assertEquals(actualResult, expectedResult);

    }


    @Test
    public void testSubstract1Minus2EqualsNegative1 () {

        double expectedResult = -1;


        WebElement firstNumbField = driver.findElement(By.id("number1Field"));

        firstNumbField.sendKeys("1");

        WebElement secondNumbField = driver.findElement(By.id("number2Field"));
        secondNumbField.sendKeys("2");

        WebElement selectOperation = driver.findElement((By.id("selectOperationDropdown")));
        selectOperation.click();

        Select select = new Select(selectOperation);
        select.selectByVisibleText("Subtract");


        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();

        WebElement result = driver.findElement(By.id("numberAnswerField"));
        double actualResult = Double.parseDouble((result.getAttribute("value")));
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testSubstractNegative1Minus1EqualsNegative2 () {

        double expectedResult = -2;


        WebElement firstNumbField = driver.findElement(By.id("number1Field"));

        firstNumbField.sendKeys("-1");

        WebElement secondNumbField = driver.findElement(By.id("number2Field"));
        secondNumbField.sendKeys("1");

        WebElement selectOperation = driver.findElement((By.id("selectOperationDropdown")));
        selectOperation.click();

        Select select = new Select(selectOperation);
        select.selectByVisibleText("Subtract");


        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();

        WebElement result = driver.findElement(By.id("numberAnswerField"));
        double actualResult = Double.parseDouble((result.getAttribute("value")));
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testSubstractNegative1MinusNegative1Equals0 () {

        double expectedResult = 0;


        WebElement firstNumbField = driver.findElement(By.id("number1Field"));

        firstNumbField.sendKeys("-1");

        WebElement secondNumbField = driver.findElement(By.id("number2Field"));
        secondNumbField.sendKeys("-1");

        WebElement selectOperation = driver.findElement((By.id("selectOperationDropdown")));
        selectOperation.click();

        Select select = new Select(selectOperation);
        select.selectByVisibleText("Subtract");


        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();

        WebElement result = driver.findElement(By.id("numberAnswerField"));
        double actualResult = Double.parseDouble((result.getAttribute("value")));
        Assert.assertEquals(actualResult, expectedResult);

    }







}


