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

import java.text.DecimalFormat;
import java.time.Duration;

public class BasicCalculatorDivideTest {
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
    public void test10DividedBy3Equals3_33 () {

        double expectedResult = 3.33;


        WebElement firstNumbField = driver.findElement(By.id("number1Field"));

        firstNumbField.sendKeys("10");

        WebElement secondNumbField = driver.findElement(By.id("number2Field"));
        secondNumbField.sendKeys("3");

        WebElement selectOperation = driver.findElement((By.id("selectOperationDropdown")));
        selectOperation.click();

        Select select = new Select(selectOperation);
        select.selectByVisibleText("Divide");


        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();

        WebElement result = driver.findElement(By.id("numberAnswerField"));
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
    //    double actualResult = Double.parseDouble(decimalFormat.format((result.getAttribute("value"))));
        double preActualResult = Double.parseDouble((result.getAttribute("value")));
        double actualResult = Double.parseDouble(decimalFormat.format(preActualResult));

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void test10DividedBy2Equals5 () {

        double expectedResult = 5;


        WebElement firstNumbField = driver.findElement(By.id("number1Field"));

        firstNumbField.sendKeys("10");

        WebElement secondNumbField = driver.findElement(By.id("number2Field"));
        secondNumbField.sendKeys("2");

        WebElement selectOperation = driver.findElement((By.id("selectOperationDropdown")));
        selectOperation.click();

        Select select = new Select(selectOperation);
        select.selectByVisibleText("Divide");


        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();

        WebElement result = driver.findElement(By.id("numberAnswerField"));
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        //    double actualResult = Double.parseDouble(decimalFormat.format((result.getAttribute("value"))));
        double preActualResult = Double.parseDouble((result.getAttribute("value")));
        double actualResult = Double.parseDouble(decimalFormat.format(preActualResult));

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void test10DividedByNegative2EqualsNegative5 () {

        double expectedResult = -5;


        WebElement firstNumbField = driver.findElement(By.id("number1Field"));

        firstNumbField.sendKeys("10");

        WebElement secondNumbField = driver.findElement(By.id("number2Field"));
        secondNumbField.sendKeys("-2");

        WebElement selectOperation = driver.findElement((By.id("selectOperationDropdown")));
        selectOperation.click();

        Select select = new Select(selectOperation);
        select.selectByVisibleText("Divide");


        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();

        WebElement result = driver.findElement(By.id("numberAnswerField"));
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        //    double actualResult = Double.parseDouble(decimalFormat.format((result.getAttribute("value"))));
        double preActualResult = Double.parseDouble((result.getAttribute("value")));
        double actualResult = Double.parseDouble(decimalFormat.format(preActualResult));

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testNegative10DividedByNegative2Equals5 () {

        double expectedResult = 5;


        WebElement firstNumbField = driver.findElement(By.id("number1Field"));

        firstNumbField.sendKeys("-10");

        WebElement secondNumbField = driver.findElement(By.id("number2Field"));
        secondNumbField.sendKeys("-2");

        WebElement selectOperation = driver.findElement((By.id("selectOperationDropdown")));
        selectOperation.click();

        Select select = new Select(selectOperation);
        select.selectByVisibleText("Divide");


        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();

        WebElement result = driver.findElement(By.id("numberAnswerField"));
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        //    double actualResult = Double.parseDouble(decimalFormat.format((result.getAttribute("value"))));
        double preActualResult = Double.parseDouble((result.getAttribute("value")));
        double actualResult = Double.parseDouble(decimalFormat.format(preActualResult));

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void test10DividedBy1Equals10 () {

        double expectedResult = 10;


        WebElement firstNumbField = driver.findElement(By.id("number1Field"));

        firstNumbField.sendKeys("10");

        WebElement secondNumbField = driver.findElement(By.id("number2Field"));
        secondNumbField.sendKeys("1");

        WebElement selectOperation = driver.findElement((By.id("selectOperationDropdown")));
        selectOperation.click();

        Select select = new Select(selectOperation);
        select.selectByVisibleText("Divide");


        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();

        WebElement result = driver.findElement(By.id("numberAnswerField"));
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        //    double actualResult = Double.parseDouble(decimalFormat.format((result.getAttribute("value"))));
        double preActualResult = Double.parseDouble((result.getAttribute("value")));
        double actualResult = Double.parseDouble(decimalFormat.format(preActualResult));

        Assert.assertEquals(actualResult, expectedResult);

    }



}
