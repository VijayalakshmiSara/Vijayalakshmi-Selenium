import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragaandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver4.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drag.html");
		WebElement from = driver.findElement(By.id("draggable"));
		System.out.println("Added");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(from, 135 , 40);

	}

}
