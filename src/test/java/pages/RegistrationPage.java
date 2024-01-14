package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class RegistrationPage extends BrowserDriver {

    public static String registration_heading_xpath = "/html/body/center/h1";
    public static String firstname_xpath = "//*[@id=\"firstname\"]";
    public static String lastname_xpath = "//*[@id=\"lastname\"]";
    public static String emailid_xpath= "//*[@id=\"emailId\"]";
    public static String contactnumber_xpath =" //*[@id=\"contactNumber\"]";
    public static String username_xpath = "//*[@id=\"usr\"]";
    public static String password_xpath = "//*[@id=\"pwd\"]";

    public static String submit_xpath = "//*[@id=\"first_form\"]/div/div[2]/center/input";
    public static String userregistration_success = "/html/body/center[1]/h1";


    public static String visiblity_registrationheading() throws InterruptedException {
        Thread.sleep(2000);
        String getRegistration =  driver.findElement(By.xpath(registration_heading_xpath)).getText();
        return getRegistration;
    }

    public static void sendkeys_firstname()
    {
        driver.findElement(By.xpath(firstname_xpath)).sendKeys("sa");
    }

    public static void sendkeys_lastname()
    {
        driver.findElement(By.xpath(lastname_xpath)).sendKeys("sa");
    }

    public static void sendkeys_contactnumber(){
        driver.findElement(By.xpath(contactnumber_xpath)).sendKeys("123443");
    }

    public static void sendkeys_emailid(){
        driver.findElement(By.xpath(emailid_xpath)).sendKeys("sa.sa@gmail.com");
    }

    public static void sendkeys_username(){
        driver.findElement(By.xpath(username_xpath)).sendKeys("sa.sa@gmail.com");
    }

    public static void sendkeys_password(){
        driver.findElement(By.xpath(password_xpath)).sendKeys("password");
    }

    public static void click_submit(){
        driver.findElement(By.xpath(submit_xpath)).click();
    }

    public static String visiblity_registrationsuccess() throws InterruptedException {
        Thread.sleep(2000);
        String getRegistration =  driver.findElement(By.xpath(userregistration_success)).getText();
        return getRegistration;
    }
}