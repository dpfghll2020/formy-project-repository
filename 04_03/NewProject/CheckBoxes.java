import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkBox1 = driver.findElement(By.cssSelector("input[id='checkbox-1']"));
        checkBox1.click();
        Thread.sleep(3000);
        /* Click again to uncheck the checkbox */
        checkBox1.click();

        WebElement checkBox2 = driver.findElement(By.cssSelector("input[id='checkbox-2']"));
        checkBox2.click();
        Thread.sleep(3000);
        checkBox2.click();

        WebElement checkBox3 = driver.findElement(By.cssSelector("input[id='checkbox-3']"));
        checkBox3.click();
        Thread.sleep(3000);
        checkBox3.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
