import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {
    public static void main(String[]args) throws InterruptedException {

        ChromeDriver driver=new ChromeDriver();
        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);

        JavascriptExecutor scroll=(JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,900)");

        WebElement rollNo = driver.findElement(By.name("roll_no"));
        rollNo.click();
        rollNo.sendKeys("23A91A4414");
        Thread.sleep(5000);

        WebElement pass = driver.findElement(By.name("password"));
        pass.click();
        pass.sendKeys("Sadhvi@2006");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();

        Thread.sleep(5000);

        driver.quit();
    }
}
