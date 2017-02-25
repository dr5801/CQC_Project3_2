import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Drew Rife and Jordan Long
 *
 * tests the functionality of the StartFraciton class
 */
public class TestStartFraction 
{
	/**
	 * tests the execute method
	 */
	@Test
	public void testExecute()
	{
		Action startFraction = new StartFraction();
		InterimResult interimResult = new InterimResult(0, 1, 0);
		
		assertEquals(0, interimResult.getP(), 0.0001);
		assertEquals(1, interimResult.getS());
		assertEquals(0, interimResult.getV(), 0.0001);
		
		interimResult = startFraction.execute(interimResult, '.');
		
		assertEquals(0.1, interimResult.getP(), 0.0001);
		assertEquals(1, interimResult.getS());
		assertEquals(0, interimResult.getV(), 0.0001);
	}
}
