package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class firstSeleniumTestExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","C:\\Dev\\webdrivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        String url = "https://www.saucedemo.com/";

        try{
            OpenWebPage(driver, url);
//            driver.get("https://www.google.com");
            System.out.println("Title = " +driver.getTitle());
//            System.out.println(driver.getPageSource());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            Thread.sleep(10000);

        } catch (Exception e) {
            System.out.println("Exception occurred" +e);
        }
        finally {
            driver.quit();
        }



    }


    public static void OpenWebPage(WebDriver shalini, String url){
        shalini.get(url);
        shalini.manage().window().maximize();
    }
}
