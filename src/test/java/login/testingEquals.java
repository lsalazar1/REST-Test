package login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testingEquals {
	
	@Test
	void equalsFour() {
		int x = 2 , y = 3;
		
		Assert.assertEquals(x+y, 5);
	}
	
}
