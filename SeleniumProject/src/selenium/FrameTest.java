package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class FrameTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");

		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if (sortable.size() > 0) {
			System.out.println("\"Sortable\"" + " PRESENT");
		} else {
			System.out.println("\"Sortable\"" + " NOT PRESENT");
		}

		List<WebElement> draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		if (draggable.size() > 0) {
			System.out.println("\"Draggable\"" + " PRESENT");
		} else {
			System.out.println("\"Draggable\"" + " NOT PRESENT");
		}

		System.out.println(
				"..............................................After Switching to frame........................");

		// to switch to frame from main HTML page

		driver.switchTo().frame(0);

		// driver.switchTo().frame("demo-frame") //String option work with name and id
		// attributes only
		// driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		// WebElement location

		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if (sortable.size() > 0) {
			System.out.println("\"Sortable\"" + " PRESENT");
		} else {
			System.out.println("\"Sortable\"" + " NOT PRESENT");
		}

		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		if (draggable.size() > 0) {
			System.out.println("\"Draggable\"" + " PRESENT");
		} else {
			System.out.println("\"Draggable\"" + " NOT PRESENT");
		}

		System.out.println(
				"........................................Switching back to Main HTML Page....................................");

		// to switch back to default page
		driver.switchTo().defaultContent();

		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if (sortable.size() > 0) {
			System.out.println("\"Sortable\"" + " PRESENT");
		} else {
			System.out.println("\"Sortable\"" + " NOT PRESENT");
		}

		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		if (draggable.size() > 0) {
			System.out.println("\"Draggable\"" + " PRESENT");
		} else {
			System.out.println("\"Draggable\"" + " NOT PRESENT");
		}

		// driver.switchTo().parentFrame(); //to go back to parent frame from child
		// frame
	}

}
