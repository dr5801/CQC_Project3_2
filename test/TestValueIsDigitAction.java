import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Drew Rife and Jordan Long
 *
 * Tests the functionality of  ValueIsDigitAction class
 */
public class TestValueIsDigitAction 
{
	/**
	 * Tests the execute method
	 */
	@Test
	public void testExecuteMethod()
	{
		Action valueIsDigitAction = new ValueIsDigitAction();
		InterimResult interimResult = new InterimResult(0, 1, 0);
		
		assertEquals(0, interimResult.getP(), 0.0001);
		assertEquals(1, interimResult.getS());
		assertEquals(0, interimResult.getV(), 0.0001);
		
		interimResult = valueIsDigitAction.execute(interimResult, '8');
		
		assertEquals(0, interimResult.getP(), 0.0001);
		assertEquals(1, interimResult.getS());
		assertEquals(8, interimResult.getV(), 0.0001);
	}
}
