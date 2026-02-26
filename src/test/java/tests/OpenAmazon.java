package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenAmazon {
	@Test
    public void searchMobile() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.quit();
        System.out.println("Checking CI Trigger");
	}
}
