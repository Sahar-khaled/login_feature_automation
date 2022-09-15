package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {

    // define before and after annotation for your driver
    public static WebDriver driver = null;

    @Before
    public static void openBrowser() {



        ChromeOptions options = new ChromeOptions();
          options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
//        options.setBinary("C:\\Program Files\\Google\\Chrome Beta\\Application\\chrome.exe");

        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriverr.exe\\";
        System.setProperty("webdriver.chrome.driver", chromePath);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
