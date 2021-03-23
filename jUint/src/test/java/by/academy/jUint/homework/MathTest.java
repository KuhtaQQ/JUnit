package by.academy.jUint.homework;


import org.junit.Assert;
import org.junit.Test;

public class MathTest extends Assert {
	@Test
	public void mathtestPow() {
	assertTrue(Math.pow(2, 1) == 2);
	assertTrue(Math.pow(2, 2) == 4);
	assertTrue(Math.pow(2, 3) == 8);
	assertTrue(Math.pow(2, 4) == 16);
	assertTrue(Math.pow(2, 5) == 32);
	}
}