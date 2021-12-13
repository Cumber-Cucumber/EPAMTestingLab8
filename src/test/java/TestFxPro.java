import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
        String timeBeforeChange = "";
        String timeAfterChange = "";

        WebElement searchInput = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#container > div > div > div > form > div > input:nth-child(4)")));
        searchInput.sendKeys("Wanjawaluj111@gmail.com");
        searchInput = driver.findElement(By.cssSelector("#container > div > div > div > form > div > input:nth-child(5)"));
        searchInput.sendKeys("sP22j8pQ_h$hyGy");
        searchInput = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#container > div > div > div > form > div > button")));
        searchInput.click();
        searchInput = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div:nth-child(2) > div > div > div > div.account-select-dialog > div.accounts-to-select-list.desktop-view > div > div.scrollable > div:nth-child(2)")));
        searchInput.click();
        searchInput = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div.sidebar > section.sidebar__trailing > i.font-icon.icon_settings")));
        searchInput.click();

        timeBeforeChange = driver.findElement(By.cssSelector("#app > div.workspace-area > div.workspace > div > div.layout-cell.horizontal > div:nth-child(3) > div.window.window-visible-overflow > div.tile.chart-tile.good.tile-window.widget-container > div > svg > g.axis.vertical > text:nth-child(7)")).getText();

        searchInput = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div.workspace-area > div:nth-child(3) > div > div > div > div:nth-child(2) > div > div > div > div > div > div:nth-child(1)")));
        searchInput.click();
        searchInput = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div.workspace-area > div:nth-child(3) > div:nth-child(2) > div > div > div:nth-child(2) > div > div > div > div > div > div.scrollable > div:nth-child(1)")));
        searchInput.click();

        timeAfterChange = driver.findElement(By.cssSelector("#app > div.workspace-area > div.workspace > div > div.layout-cell.horizontal > div:nth-child(3) > div.window.window-visible-overflow > div.tile.chart-tile.good.tile-window.widget-container > div > svg > g.axis.vertical > text:nth-child(7)")).getText();

        searchInput = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div.workspace-area > div:nth-child(3) > div > div > div > div:nth-child(2) > div > div > div > div > div > div:nth-child(1)")));
        searchInput.click();
        searchInput = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div.workspace-area > div:nth-child(3) > div:nth-child(2) > div > div > div:nth-child(2) > div > div > div > div > div > div.scrollable > div:nth-child(3)")));
        searchInput.click();

        Assert.assertNotEquals(timeBeforeChange, timeAfterChange);

        Thread.sleep(1000);
        driver.quit();
    }
}
