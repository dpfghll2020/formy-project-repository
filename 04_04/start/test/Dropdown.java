import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenuButton.click();
        Thread.sleep(2000);

        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();
        Thread.sleep(2000);

        driver.get("https://formy-project.herokuapp.com/dropdown");
        Thread.sleep(2000);
        dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenuButton.click();
        Thread.sleep(2000);

        WebElement dropdownMenuItemNew = driver.findElement(By.cssSelector("a[href='/form']"));
        dropdownMenuItemNew.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
