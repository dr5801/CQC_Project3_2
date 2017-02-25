import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Drew Rife and Jordan Long
 *
 * Tests the functionality of the ContinuingIntegerAction class
 */
public class TestContinuingIntegerAction 
{
	/**
	 * Tests a non zero input
	 */
	@Test
	public void testNonZeroInput()
	{
		Action continuingIntegerAction = new ContinuingIntegerAction();
		InterimResult interimResult = new InterimResult(0, -1, 11);
		
		assertEquals(0, interimResult.getP(), 0.0001);
		assertEquals(-1, interimResult.getS());
		assertEquals(11, interimResult.getV(), 0.0001);
		
		interimResult = continuingIntegerAction.execute(interimResult, '5');
		
		assertEquals(0, interimResult.getP(), 0.0001);
		assertEquals(-1, interimResult.getS());       
		assertEquals(115, interimResult.getV(), 0.0001);
	}
	
	/**
	 * tests a zero as input
	 */
	@Test
	public void testZeroAsInput()
	{
		Action continuingIntegerAction = new ContinuingIntegerAction();
		InterimResult interimResult = new InterimResult(0, -1, 11);
		
		assertEquals(0, interimResult.getP(), 0.0001);
		assertEquals(-1, interimResult.getS());
		assertEquals(11, interimResult.getV(), 0.0001);
		
		interimResult = continuingIntegerAction.execute(interimResult, '0');
		
		assertEquals(0, interimResult.getP(), 0.0001);
		assertEquals(-1, interimResult.getS());
		assertEquals(110, interimResult.getV(), 0.0001);
	}
}
