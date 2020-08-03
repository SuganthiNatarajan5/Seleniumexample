package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	
	@Test @Parameters("Name")
	public void printName(String Name) {
		System.out.println("name is" + Name);
	}

}
