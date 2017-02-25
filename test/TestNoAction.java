import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Drew Rife and Jordan Long
 *
 * tests the functionality of the NoActino class
 */
public class TestNoAction 
{
	/**
	 * Tests NoAction as plus sign from start state is only NoAction criteria
	 */
	@Test
	public void testNoActionWithPlusSignInput()
	{
		Action noAction = new NoAction();
		InterimResult interimResult = new InterimResult(0, 1, 0);
		
		/* NoAction just returns the InterimResult passed in without changing values so it should equal */
		assertEquals(interimResult, noAction.execute(interimResult, '+'));
	}
}
