
/*
test case-1
validate whether https://www.gst.gov.in/
has title="Goods & Services Tax (GST) | Home"
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String [] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.gst.gov.in/");

        String act_title= driver.getTitle();

        if(act_title.equals("Goods & Services Tax (GST) | Home")){
            System.out.print("test case passed");
        }
        else{
            System.out.print("test case failed");
        }

        driver.quit();


    }
}
