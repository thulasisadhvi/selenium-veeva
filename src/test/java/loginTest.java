import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {
 public static void main(String[]args) throws InterruptedException {

     ChromeDriver driver=new ChromeDriver();
     driver.get("https://maya.adityauniversity.in/");
     //driver.manage().window().maximize();
     driver.manage().window().fullscreen();
     Thread.sleep(5000);
     driver.quit();
 }
}
