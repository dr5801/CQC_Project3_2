import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * @author Drew Rife and Jordan Long
 *
 * Tests the functionality fof PlusInputVerifier class
 */
public class TestPlusInputVerifier 
{
	/**
	 * Tests valid input by inputting a plus sign
	 */
	@Test
	public void testValidInputAsPlusSign()
	{
		PlusInputVerifier plusVerifier = new PlusInputVerifier();
		assertTrue(plusVerifier.meetsCriteria('+'));
	}
	
	/**
	 * Tests invalid input as minus sign
	 */
	@Test
	public void testInvalidInputAsMinusSign()
	{
		PlusInputVerifier plusVerifier = new PlusInputVerifier();
		assertFalse(plusVerifier.meetsCriteria('-'));
	}
	
	/**
	 * tests invalid input as a period
	 */
	@Test
	public void testValidInputAsPeriod()
	{
		PlusInputVerifier plusVerifier = new PlusInputVerifier();
		assertFalse(plusVerifier.meetsCriteria('.'));
	}
	
	/**
	 * tests invalid input as digit
	 */
	@Test
	public void testInvalidInputAsDigit()
	{
		PlusInputVerifier plusVerifier = new PlusInputVerifier();
		assertFalse(plusVerifier.meetsCriteria('1'));
	}
	
	/**
	 * tests invalid input as letter
	 */
	@Test
	public void testInvalidInputAsLetter()
	{
		PlusInputVerifier plusVerifier = new PlusInputVerifier();
		assertFalse(plusVerifier.meetsCriteria('a'));
	}
}
