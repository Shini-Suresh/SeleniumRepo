import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/selenium/delete_customer.php");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("TEST");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Alert al=driver.switchTo().alert();
        System.out.println(al.getText());
        al.accept();
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
}
