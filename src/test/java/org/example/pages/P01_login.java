package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepDefs.Hooks.driver;

public class P01_login {

    public WebElement enter_your_name(String name) {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        return null;
    }

    public WebElement enter_your_pass(String pass) {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        return null;
    }

    public WebElement click_signIn() {
        driver.findElement(By.name("login-button")).click();
        return null;
    }

    public boolean validate_login() {
        boolean result = false;
        if (driver.getCurrentUrl().equalsIgnoreCase("https://www.saucedemo.com/inventory.html")) {
            result = true;
        }
        return result;
    }
}
