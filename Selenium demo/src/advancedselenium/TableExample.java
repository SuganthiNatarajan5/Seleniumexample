package advancedselenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\sugannat\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		
		List<WebElement> column=driver.findElements(By.tagName("th"));
		int count=column.size();
		System.out.println("no of cloumns"+count);
		
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int count1=rows.size();
		System.out.println("np of rows"+count1);
		
		
		
	}

}
