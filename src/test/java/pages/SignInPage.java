package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class SignInPage extends BrowserDriver {

    public static String username_text_xpath ="//*[@id=\"usr\"]";
    public static String password_text_xpath ="//*[@id=\"pwd\"]";
    public static String login_btn_xpath ="//*[@id=\"second_form\"]/input";
    public static String registration_btn_xpath = "//*[@id=\"NewRegistration\"]";

    public static boolean visibility_username_text_path() throws InterruptedException {
        Thread.sleep(2000);
        boolean getRegistration = driver.findElement(By.xpath(username_text_xpath)).isDisplayed();
        return getRegistration;
    }

    public static boolean visibility_password_text_path() throws InterruptedException {
        Thread.sleep(2000);
        boolean getRegistration = driver.findElement(By.xpath(password_text_xpath)).isDisplayed();
        return getRegistration;
    }

    public static boolean visibility_login_button() throws InterruptedException {
        Thread.sleep(2000);
        boolean getRegistration = driver.findElement(By.xpath(login_btn_xpath)).isDisplayed();
        return getRegistration;
    }

    public static boolean visibility_newuser_button() throws InterruptedException {
        Thread.sleep(2000);
        boolean getRegistration = driver.findElement(By.xpath(registration_btn_xpath)).isDisplayed();
        return getRegistration;
    }

    public static void sendkeys_username()
    {
        driver.findElement(By.xpath(username_text_xpath)).sendKeys("sa");
    }

    public static void sendkeys_password()
    {
        driver.findElement(By.xpath(password_text_xpath)).sendKeys("sa");
    }

    public static void click_login_btn()
    {
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }

    public static void click_newregistration_btn()
    {
        driver.findElement(By.xpath(registration_btn_xpath)).click();
    }
}