package calculator;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest
{
	@SuppressWarnings("deprecation")
	@Test
	public void square_root_test()
	{
		assertEquals(5.0, calculator.square_root(25));
	}
	
	@Test
	public void factorial_test()
	{
		assertEquals(120, calculator.factorial(5));
	}
}