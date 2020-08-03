package testNG;

import org.testng.annotations.Test;

public class SampleTestCase {
	
	@Test
	public void firstCase()
	{
		System.out.println("first");
	}
	/*
	 * @Test(priority=1) public void secondCase() { System.out.println("second"); }
	 * 
	 * @Test(dependsOnMethods = "secondCase") public void eightCase() {
	 * System.out.println("third"); }
	 */
}
