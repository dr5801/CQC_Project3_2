import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Drew Rife and Jordan Long
 *
 * Tests the functionality of MinusInputVerifier
 */
public class TestMinusInputVerifier 
{
	/**
	 * test a valid input (a minus sign)
	 */
	@Test
	public void testValidInput()
	{
		MinusInputVerifier minusVerifier = new MinusInputVerifier();
		assertTrue(minusVerifier.meetsCriteria('-'));
	}
	
	/**
	 * test invalid input as a decimal point
	 */
	@Test
	public void testInvalidInputAsDecimal()
	{
		MinusInputVerifier minusVerifier = new MinusInputVerifier();
		assertFalse(minusVerifier.meetsCriteria('.'));
	}
	
	/**
	 * tests invalid input as a digit
	 */
	@Test
	public void testInvalidInputAsDigit()
	{
		MinusInputVerifier minusVerifier = new MinusInputVerifier();
		assertFalse(minusVerifier.meetsCriteria('1'));
	}
	
	/**
	 * tests invalid input as a plus sign
	 */
	@Test
	public void testInvalidInputAsPlusSign()
	{
		MinusInputVerifier minusVerifier = new MinusInputVerifier();
		assertFalse(minusVerifier.meetsCriteria('+'));
	}
	
	/**
	 * test invalid input as a character
	 */
	@Test
	public void testInvalidInputAsCharacter()
	{
		MinusInputVerifier minusVerifier = new MinusInputVerifier();
		assertFalse(minusVerifier.meetsCriteria('a'));
	}
}
