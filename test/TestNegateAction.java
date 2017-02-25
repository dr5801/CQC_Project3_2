import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Drew Rife and Jordan Long
 * 
 * Tests the functionality of NegateAction class
 */
public class TestNegateAction 
{
	/**
	 * tests the minus sign for negate action
	 */
	@Test
	public void testNegateActionMinusSign()
	{
		Action negateAction = new NegateAction();
		InterimResult interimResult = new InterimResult(.1, 1, 10);
		
		assertEquals(.1, interimResult.getP(), 0.0001);
		assertEquals(1, interimResult.getS());        
		assertEquals(10, interimResult.getV(), 0.0001);
		
		interimResult = negateAction.execute(interimResult, '-');
		
		assertEquals(.1, interimResult.getP(), 0.0001);
		assertEquals(-1, interimResult.getS());
		assertEquals(10, interimResult.getV(), 0.0001);
	}
}
