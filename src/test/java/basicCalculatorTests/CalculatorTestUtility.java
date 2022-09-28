package basicCalculatorTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.DecimalFormat;
import java.time.Duration;

public class CalculatorTestUtility {


    public static double getResults(WebDriver driver, String firstNumb, String secondNumb, String operation) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement firstNumbField = driver.findElement(By.id("number1Field"));
        firstNumbField.sendKeys(firstNumb);

        WebElement secondNumbField = driver.findElement(By.id("number2Field"));
        secondNumbField.sendKeys(secondNumb);

        WebElement selectOperation = driver.findElement((By.id("selectOperationDropdown")));
        selectOperation.click();

        Select select = new Select(selectOperation);
        select.selectByVisibleText(operation);
        Thread.sleep(5000);
        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();


        WebElement result = driver.findElement(By.id("numberAnswerField"));
        System.out.println(result.getAttribute("value"));
      /*  DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(result.getAttribute("value")));
*/
        return Double.parseDouble(result.getAttribute("value"));

    }


}
