package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.example.stepDefs.Hooks.driver;

public class P02_login {

    public WebElement enter_name(String name) {
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        return null;
    }

    public WebElement enter_pass(String pass) {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        return null;
    }

    public WebElement click_signIn_btn() {
        driver.findElement(By.name("login-button")).click();
        return null;
    }

    public WebElement validate_message() {
        Assert.assertTrue(driver.findElement(
                By.xpath
                        ("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).isDisplayed());

        return null;
    }


}
