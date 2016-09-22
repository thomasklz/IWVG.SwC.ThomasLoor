package IWVG.SwC.ThomasLoor.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	
	private Fraction fraction;

    @Before
    public void before() {
        fraction = new Fraction(2, 4);
    }

	@Test
	public void testFractionIntInt() {
		assertEquals(2, fraction.getNumerator());
		assertEquals(4, fraction.getDenominator());
	}

	@Test
	public void testFraction() {
		fraction = new Fraction();
		assertEquals(1, fraction.getNumerator());
		assertEquals(1, fraction.getDenominator());
	}

	@Test
	public void testDecimal(){
		assertEquals(0.5, fraction.decimal(), 10e-5);
	}

}
