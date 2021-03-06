import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Drew Rife and Jordan Long
 * 
 * tests the functionality of ContinuingFractionActing class
 */
public class TestContinuingFractionAction
{
	/**
	 * tests a non-zero input
	 */
	@Test
	public void testNonZeroInput()
	{
		Action continuingFractionAction = new ContinuingFractionAction();
		InterimResult interimResult = new InterimResult(0.01, 1, 1);
		
		assertEquals(0.01, interimResult.getP(), 0.0001);
		assertEquals(1, interimResult.getS());
		assertEquals(1, interimResult.getV(), 0.0001);
		
		interimResult = continuingFractionAction.execute(interimResult, '3');
		
		assertEquals(0.001, interimResult.getP(), 0.0001);
		assertEquals(1, interimResult.getS());
		assertEquals(1.03, interimResult.getV(), 0.0001);
	}
	
	/**
	 * tests zero input
	 */
	@Test
	public void testZeroAsInput()
	{
		Action continuingFractionAction = new ContinuingFractionAction();
		InterimResult interimResult = new InterimResult(0.01, 1, 1);
		
		assertEquals(0.01, interimResult.getP(), 0.0001);
		assertEquals(1, interimResult.getS());
		assertEquals(1, interimResult.getV(), 0.0001);
		
		interimResult = continuingFractionAction.execute(interimResult, '0');
		
		assertEquals(0.001, interimResult.getP(), 0.0001);
		assertEquals(1, interimResult.getS());
		assertEquals(1, interimResult.getV(), 0.0001);
		assertEquals(1, interimResult.getV(), 0.0001);
	}
}
