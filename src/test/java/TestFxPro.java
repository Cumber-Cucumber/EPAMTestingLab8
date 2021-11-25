import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TestFxPro {
    @Test
    public void main() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://edge.fxpro.com/");

        Thread.sleep(3000);
        WebElement searchInput = driver.findElement(By.cssSelector("#container > div > div > div > form > div > input:nth-child(4)"));
        searchInput.sendKeys("Wanjawaluj111@gmail.com");
        searchInput = driver.findElement(By.cssSelector("#container > div > div > div > form > div > input:nth-child(5)"));
        searchInput.sendKeys("sP22j8pQ_h$hyGy");
        Thread.sleep(2000);
        searchInput = driver.findElement(By.cssSelector("#container > div > div > div > form > div > button"));
        searchInput.click();
        Thread.sleep(3000);
        searchInput = driver.findElement(By.cssSelector("#app > div:nth-child(2) > div > div > div > div.account-select-dialog > div.accounts-to-select-list.desktop-view > div > div.scrollable > div:nth-child(2)"));
        searchInput.click();
        Thread.sleep(3000);
        searchInput = driver.findElement(By.cssSelector("#app > div.sidebar > section.sidebar__trailing > i.font-icon.icon_settings"));
        searchInput.click();
        Thread.sleep(2000);
        searchInput = driver.findElement(By.cssSelector("#app > div.workspace-area > div:nth-child(3) > div > div > div > div:nth-child(2) > div > div > div > div > div > div:nth-child(1)"));
        searchInput.click();
        Thread.sleep(2000);
        searchInput = driver.findElement(By.cssSelector("#app > div.workspace-area > div:nth-child(3) > div:nth-child(2) > div > div > div:nth-child(2) > div > div > div > div > div > div.scrollable > div:nth-child(1)"));
        searchInput.click();
        Thread.sleep(2000);

        searchInput = driver.findElement(By.cssSelector("#app > div.workspace-area > div:nth-child(3) > div > div > div > div:nth-child(2) > div > div > div > div > div > div:nth-child(1)"));
        searchInput.click();
        Thread.sleep(2000);
        searchInput = driver.findElement(By.cssSelector("#app > div.workspace-area > div:nth-child(3) > div:nth-child(2) > div > div > div:nth-child(2) > div > div > div > div > div > div.scrollable > div:nth-child(3)"));
        searchInput.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
