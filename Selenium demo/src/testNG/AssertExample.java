package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample {
	
	String name="Agni";
	Boolean value=true;
	@Test
	public void checkEqual() {
		Assert.assertEquals(name, "agni");
		Assert.assertTrue(value);
	}

}
