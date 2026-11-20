import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class webelements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);

        WebElement signin= driver.findElement(By.name("roll_no"));
        signin.sendKeys("23A91A4414");
        Thread.sleep(3000);

        WebElement pass= driver.findElement(By.name("password"));
        pass.sendKeys("Sadhvi@2006");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
        Thread.sleep(5000);

        System.out.println("successfully completed");
        driver.quit();

    }
}
