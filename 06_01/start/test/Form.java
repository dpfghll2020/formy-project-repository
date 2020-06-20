import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys( "Dan");
        Thread.sleep(3000);

        driver.findElement(By.id("last-name")).sendKeys("Folts");
        Thread.sleep(3000);

        driver.findElement(By.id("job-title")).sendKeys("Quality Assurance Engineer");
        Thread.sleep(3000);

        /* Radio button: Highest Level of Education = Graduate */
        driver.findElement(By.id("radio-button-3")).click();
        Thread.sleep(3000);

        /* Checkbox: Sex = Male */
        driver.findElement(By.id("checkbox-1")).click();
        Thread.sleep(3000);

        /* Years of experience dropdown = 10+ */
        driver.findElement(By.cssSelector("option[value='4']")).click();
        Thread.sleep(3000);

        /* Date field */
        driver.findElement(By.id("datepicker")).sendKeys("06/24/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        /* click the Submit button */
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
