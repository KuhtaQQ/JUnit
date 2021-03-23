package by.academy.jUint.homework;



import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.jUint.Calculator;

@RunWith(Parameterized.class)
public class SumTest extends Assert {
	public double x;
    public double y;
    public double z;

    public SumTest(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
    public static Iterable<Object[]> dataTest() {
    	return Arrays.asList(new Object[][]{{30, 3, 6}, {72, 9, 2}, {48, 7, 2.2}});    }

    @Test
    public void parametersTest() {
    	assertEquals(z, Calculator.getDivide(x, y), 0.001);        
    }
}


