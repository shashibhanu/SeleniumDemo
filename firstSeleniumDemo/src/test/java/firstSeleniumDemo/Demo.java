package firstSeleniumDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		
        // Set up ChromeDriver using WebDriverManager
        //WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        // Create a ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Perform actions with the driver
        driver.get("https://google.com");

        // Close the WebDriver
        driver.close();
    }
}
