import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Drew Rife and Jordan Long
 *
 * Tests the functionality of DigitInputVerifier
 */
public class TestDigitInputVerifier 
{
	/**
	 * tests valid input (a digit)
	 */
	@Test
	public void testValidInput()
	{
		DigitInputVerifier digitVerifier = new DigitInputVerifier();
		assertTrue(digitVerifier.meetsCriteria('9'));
	}
	
	/**
	 * tests invalid input(a decimal point)
	 */
	@Test
	public void testInvalidInputAsDecimal()
	{
		DigitInputVerifier digitVerifier = new DigitInputVerifier();
		assertFalse(digitVerifier.meetsCriteria('.'));
	}
	
	/**
	 * tests invalid input (a character)
	 */
	@Test
	public void testInvalidInputAsCharacter()
	{
		DigitInputVerifier digitVerifier = new DigitInputVerifier();
		assertFalse(digitVerifier.meetsCriteria('a'));
	}
}
