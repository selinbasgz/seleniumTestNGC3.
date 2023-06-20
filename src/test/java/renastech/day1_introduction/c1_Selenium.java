package renastech.day1_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class c1_Selenium {
    public static void main(String[] args) {
        System.out.println("Hello world");//My maven still works like a normal java

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        // navigate to facebook on google chrome
        String facebookURL = "https://www.facebook.com/";
        // .get method opens a link
        driver.get(facebookURL);
    }
}
