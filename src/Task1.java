import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Aidina\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://spicejet.com");
		
	}
}
