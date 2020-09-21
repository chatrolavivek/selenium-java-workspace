package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class DynamicTableTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println(columns.size());

		for (int i = 2; i <= rows.size(); i++) {
			for (int j = 1; j <= columns.size(); j++) {
				System.out.printf("%-30s", driver
						.findElement(By.xpath("//table[@id='customers']//tr[" + i + "]/td[" + j + "]")).getText());
			}
			System.out.println();
		}

		/*
		 * List<WebElement> htmlTable =
		 * driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
		 * 
		 * for(int i = 0; i < htmlTable.size(); i++) {
		 * System.out.println(htmlTable.get(i).getText()); }
		 */

		/*
		 * int rows =
		 * driver.findElements(By.xpath("//table[@id='customers']//tr[position()>1]")).
		 * size(); int columns =
		 * driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td")).size();
		 * 
		 * WebElement[][] htmlTable = new WebElement[rows][columns];
		 * 
		 * System.out.printf("%-29s %-29s %-29s%n", "Company", "Contact", "Country");
		 * 
		 * for (int i = 0; i < htmlTable.length; i++) { for (int j = 0; j <
		 * htmlTable[i].length; j++) { htmlTable[i][j] =
		 * driver.findElement(By.xpath("// table[@id='customers']//tr[" + (i + 2) + "]
		 * /td[" + (j + 1) + "]")); } }
		 * 
		 * for (int i = 0; i < htmlTable.length; i++) { for (int j = 0; j <
		 * htmlTable[i].length; j++) {
		 * System.out.printf("%-30s",htmlTable[i][j].getText()); } System.out.println();
		 * }
		 */

	}
}
