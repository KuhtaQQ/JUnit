package by.academy.jUint.homework;

import org.junit.Assert;
import org.junit.Test;

public class MathTest1 extends Assert {
	@Test
	public void testSqrt() {
		assertTrue(Math.sqrt(1) == 1);
		assertTrue(Math.sqrt(4) == 2);
		assertTrue(Math.sqrt(9) == 3);
		assertTrue(Math.sqrt(16) == 4);
		assertTrue(Math.sqrt(25) == 5);
	}

}
