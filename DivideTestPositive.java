package testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DivideTestPositive {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(16,4);
		
//		16/4 is equal to 4.0. Note the divide 
//		function returns a double
//		the third argument in assertEquals 
//		is the delta such that 
//		if Math.abs(arg1 - arg2) > delta 
//		assertEquals will return false
		assertEquals(4.0, output,0);
	}

}
