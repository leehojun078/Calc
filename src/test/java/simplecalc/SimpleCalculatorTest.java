package simplecalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {

	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.add(10, 20);
		assertEquals(30,calc.getResult());
		}
	@Test
	public void testsub() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.sub(10, 20);
		assertEquals(-10,calc.getResult());
		}
	@Test
	public void testmulti() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.multi(10, 20);
		assertEquals(200,calc.getResult());
		}
	
	

}
