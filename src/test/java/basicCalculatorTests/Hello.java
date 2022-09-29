package basicCalculatorTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Hello {


        private static WebDriver driver;


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
        }

        @AfterClass
        public void afterClasss() throws InterruptedException {
            Thread.sleep(4000);
            driver.quit();
        }

    public static void main(String[] args) throws InterruptedException {
        CalculatorTestUtility.getResults(driver,"1","2", "Add" );

        double x = CalculatorTestUtility.getResults(driver,"1","2", "Add" );

        //System.out.println(basicCalculatorTests.CalculatorTestUtility.getResults(driver,"1","2", "Add" ));
        System.out.println(x);

    }


}
