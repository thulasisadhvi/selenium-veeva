import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {
    public static void main(String[]args) throws InterruptedException {

        ChromeDriver driver=new ChromeDriver();
        driver.get("https://maya.adityauniversity.in/");
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
        driver.quit();
    }
}