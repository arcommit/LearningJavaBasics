package selenium;

import org.openqa.selenium.By;
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
            EnterLoginDetails(driver,"standard_user","secret_sauce");
            verifyLogin(driver);

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

    public static void EnterLoginDetails(WebDriver logindriver, String username, String password) throws InterruptedException {
        logindriver.findElement(By.xpath("//*[@data-test='username']")).sendKeys(username);
        Thread.sleep(10000);
        logindriver.findElement(By.xpath("//*[@data-test='password']")).sendKeys(password);
        Thread.sleep(10000);
        logindriver.findElement(By.xpath("//*[@data-test=\"login-button\"]")).click();
        Thread.sleep(10000);

    }

    public static void verifyLogin(WebDriver verifydriver) throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("Is cart visible - " + verifydriver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).isDisplayed());

    }
}
