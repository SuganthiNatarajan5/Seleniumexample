package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\sugannat\\Desktop\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement selectDropdown =driver.findElement(By.id("dropdown1"));
		Select select=new Select(selectDropdown);
		select.selectByIndex(1);
		
		select.selectByValue("3");
		
		List<WebElement>listOfOptions=select.getOptions();
		int size=listOfOptions.size();
		System.out.println("number of list is"+size);
		
		selectDropdown.sendKeys("selenium");
		
		WebElement multiSelect=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]//select"));
		Select multiselectBox=new Select(multiSelect);
		multiselectBox.selectByIndex(2);
		multiselectBox.selectByIndex(3);
	
		
		
	}

}
