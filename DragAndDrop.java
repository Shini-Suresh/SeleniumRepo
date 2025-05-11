import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
    public static void main(String[] args)
    {
        ChromeOptions options=new ChromeOptions();
        //options.addArguments("headless");
        WebDriver driver=new ChromeDriver(options);
        driver.get("http://jqueryui.com/droppable/#default");
        driver.manage().window().maximize();
        WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frame);
        WebElement source= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target= driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions act = new Actions(driver);
        act.dragAndDrop(source,target).build().perform();
        //act.dragAndDropBy(source,167,167).build().perform();

    }
}
