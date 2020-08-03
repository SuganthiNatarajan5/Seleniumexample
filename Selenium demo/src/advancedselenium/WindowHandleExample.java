package advancedselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\sugannat\\Desktop\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldWindow=driver.getWindowHandle();
		WebElement firstButton=driver.findElement(By.id("home"));
		firstButton.click();
		
		Set<String> handle=driver.getWindowHandles();
		for (String newWindow : handle) {
			driver.switchTo().window(newWindow);
			
		}
		WebElement editBox=driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img"));
		editBox.click();
		driver.close();
		driver.switchTo().window(oldWindow);
		
		WebElement openMultiple=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		openMultiple.click();
		int numberOfWindows=driver.getWindowHandles().size();
		System.out.println(numberOfWindows);
		
		WebElement dontCloseMe=driver.findElement(By.id("color"));
		dontCloseMe.click();
		Set<String> newWindow=driver.getWindowHandles();
		for (String allWindows : newWindow) {
			if (!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
				
			}
			
		}
		
		
	}

}
