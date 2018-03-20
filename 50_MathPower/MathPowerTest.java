import org.junit.*;
import static org.junit.Assert.*;

public class MathPowerTest{

	MathPower mp;

	public MathPowerTest(){
		mp = new MathPower();
	}
	
	@Test
	public void functionalityTest() {
		assertEquals("Returned value doesnt match", Math.pow(2.1000, 3.0), mp.myPow(2.1000, 3), 0.0);
	}

	@Test
	public void negativePowerTest() {
		assertEquals("Returned value doesnt match" + mp.myPow(1.0E+30, 4), Math.pow(1.0E+30, 4.0), mp.myPow(1.0E+30, 4), 0.000000000003E+120);
	}

	@Test
	public void recursiveFunctionalityTest() {
		assertEquals("Returned value doesnt match", Math.pow(2.1000, 3.0), mp.myPower(2.1000, 3), 0.0);
	}

	@Test
	public void recursiveNegativePowerTest() {
		assertEquals("Returned value doesnt match", Math.pow(2.0, -4.0), mp.myPower(2.0, -4), 0.0);
	}
}