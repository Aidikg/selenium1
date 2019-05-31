import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Aidina\\Documents\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");

		WebElement el=driver.findElement(By.id("a-popover-root"));
		
	}
}
