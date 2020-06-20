import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("John");
        Thread.sleep(2000);

        driver.findElement(By.id("last-name")).sendKeys("Doe");
        Thread.sleep(2000);

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
        Thread.sleep(2000);

        driver.findElement(By.id("radio-button-1")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("checkbox-1")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("option[value='4']")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("datepicker")).sendKeys("05/28/2019");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));

        String alertText = alert.getText();

        assertEquals("The form was successfully submitted!", alertText);

        Thread.sleep(2000);
        driver.quit();
    }
}
