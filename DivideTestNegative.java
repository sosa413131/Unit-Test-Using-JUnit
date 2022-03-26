package testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class DivideTestNegative {
	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		
//		divisor cannot be zero
		assertThrows( "divide by zero error", ArithmeticException.class, () -> test.divide(20,0));

	}


}
