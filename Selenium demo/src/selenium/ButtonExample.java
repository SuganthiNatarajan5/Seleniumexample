package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\sugannat\\Desktop\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement getPositionButton=driver.findElement(By.id("position"));
		Point xypoint=getPositionButton.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		System.out.println("x point is" +xValue+ "yValue is"+yValue);
		
		WebElement getColorButton=driver.findElement(By.id("color"));
		String color=getColorButton.getCssValue("background-color");
		System.out.println("Button color is: "+color);
		
		WebElement sizeButton=driver.findElement(By.id("size"));
		int height=sizeButton.getSize().getHeight();
		int width=sizeButton.getSize().getWidth();
		System.out.println("height is "+height+"width is "+width);
		
		WebElement homeButton=driver.findElement(By.id("Home"));
		homeButton.click();
		
		
	}

}
