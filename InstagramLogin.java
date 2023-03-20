import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class InstagramLogin {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        WebElement username=driver.findElement(By.name("username"));
        WebElement password=driver.findElement(By.name("password"));
        WebElement login=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button"));
        username.sendKeys("soft_test_");
        password.sendKeys("abc@123");
        login.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//*[contains(text(),'Not Now')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Not Now')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Follow')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Follow')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Follow')]")).click();
    }
}

