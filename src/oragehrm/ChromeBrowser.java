package oragehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {
        ChromeBrowser ch = new ChromeBrowser();
        ch.chromebrowser();

    }
    public void chromebrowser(){
        String bseeUrl ="https://opensource-demo.orangehrmlive.com";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(bseeUrl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
